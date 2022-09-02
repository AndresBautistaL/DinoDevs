const d=document,
$table = d.querySelector(".crud-table"),
$form = d.querySelector(".crud-form"),
$title = d.querySelector(".crud-title"),
$template = d.getElementById("crud-template").content,
$fragment = d.createDocumentFragment();

const ajax = (options) => {
    let {url, method, success, error, data} = options;
    const xhr = new XMLHttpRequest();

    xhr.addEventListener("readystatechange", e =>{
        if(xhr.readyState !== 4) return;

        if(xhr.status >= 200 && xhr.status < 300){
            let json = JSON.parse(xhr.responseText);
            success(json);
        } else {
            let message = xhr.statusText || "Ocurrió un error";
            error(`Error ${xhr.status}: ${message}`);
        }
    });

    xhr.open(method || "GET", url);
    xhr.setRequestHeader("Content-type", "application/json; charset=utf-8");
    xhr.send(JSON.stringify(data));
}

const getAll = () => {
    ajax({
        url:"http://localhost:3000/clientes",
        success: (res) => {
            console.log(res);

            res.forEach(el => {
                $template.querySelector(".nombre").textContent = el.nombre;
                $template.querySelector(".apellido").textContent = el.apellido;
                $template.querySelector(".codigoDeCiudad").textContent = el.codigoDeCiudad;
                $template.querySelector(".editar").dataset.id = el.id;
                $template.querySelector(".editar").dataset.nombre = el.nombre;
                $template.querySelector(".editar").dataset.apellido = el.apellido;
                $template.querySelector(".editar").dataset.codigoDeCiudad = el.codigoDeCiudad;
                $template.querySelector(".eliminar").dataset.id = el.id;

                let $clone = d.importNode($template, true);
                $fragment.appendChild($clone);
            });

            $table.querySelector("tbody").appendChild($fragment);

        },
            error: (err) => {
            console.log(err);
            $table.insertAdjacentHTML("afterend", `<p><b>${err}</b></p>`);
        }
    })
}

d.addEventListener("DOMContentLoaded", getAll);

d.addEventListener("submit", e => {

if (e.target === $form){
    e.preventDefault();

if (!e.target.id.value){
    //Create POST
    ajax({
        url:"http://localhost:3000/clientes",
        method: "POST",
        success: (res) => location.reload(),
        err: (err) => $form.insertAdjacentHTML("afterend", `<p><b>${err}</b></p>`),
        data: {
            nombre: e.target.nombre.value,
            apellido: e.target.apellido.value,
            codigoDeCiudad: e.target.codigoDeCiudad.value
        
        }
    });
}else{
    //Update PUT
    ajax({
        url:`http://localhost:3000/clientes/${e.target.id.value}`,
        method: "PUT",
        success: (res) => location.reload(),
        err: (err) => $form.insertAdjacentHTML("afterend", `<p><b>${err}</b></p>`),
        data: {
            nombre: e.target.nombre.value,
            apellido: e.target.apellido.value,
            codigoDeCiudad: e.target.codigoDeCiudad.value
        
        }
    });
}
}

});
d.addEventListener("click", e =>{
    if(e.target.matches(".editar")){
        $title.textContent = "Editar Cliente";
        $form.nombre.value = e.target.dataset.nombre;
        $form.apellido.value = e.target.dataset.apellido;
        $form.codigoDeCiudad.value = e.target.dataset.codigoDeCiudad;
        $form.id.value = e.target.dataset.id;
    }

    if(e.target.matches(".eliminar")){
        let isDelete = confirm(`¿Seguro que quieres eliminar el id ${e.target.dataset.id}?`);

        if(isDelete){
                //Delete - Delete
    ajax({
        url:`http://localhost:3000/clientes/${e.target.dataset.id}`,
        method: "DELETE",
        success: (res) => location.reload(),
        err: (err) => alert(err)
    });
        }
    }
})