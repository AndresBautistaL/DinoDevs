
function Numeros(string){//Solo numeros
    var out = '';
    var filtro = '1234567890';//Caracteres validos
	
    //Recorrer el texto y verificar si el caracter se encuentra en la lista de validos 
    for (var i=0; i<string.length; i++)
       if (filtro.indexOf(string.charAt(i)) != -1) 
             //Se añaden a la salida los caracteres validos
	     out += string.charAt(i);
	
    //Retornar valor filtrado
    return out;
} 

/* Validacion formulario */
/* Traer inputs del formulario */
console.log("Añadir Productos prueba");

function recibirInformacion(){
    
    console.log("Prueba de funcion");
    const nombre = document.getElementById("Nombre").value;
    const colores = document.getElementById("Colores").value;
    const descripcion = document.getElementById("Descripcion").value;
    const tallas = document.getElementById("Tallas").value;
    const cantidad = document.getElementById("Cantidad").value;
    const precio = document.getElementById("Precio").value;

    console.log(nombre, colores, descripcion, tallas, cantidad, precio);

}

/* const boton = d.getElementsByClassName(".btn");

boton.addEventListener("click", function () {
  

}*/

