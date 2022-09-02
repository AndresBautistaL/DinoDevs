const formularioContacto = document.getElementById("formularioContacto");
const input = document.querySelectorAll('#formularioContacto input')

const validaciones={
    Nombre: "hdlahs",
    Email: /^[^@]+@[^@]+\.[a-zA-Z]{2,}$/,

}

formularioContacto.addEventListener("submit", (e)=>{
alert("Correo enviado");
e.preventDefault();
});
