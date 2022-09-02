//https://es.stackoverflow.com/questions/4300/expresiones-regulares-para-contrase%C3%B1a-en-base-a-una-politica
const validacionContrasena = /^(?=\w*\d)(?=\w*[a-z])\S{8,16}$/;
//https://regexr.com/3e48o
const validacionCorreo = /^[^@]+@[^@]+\.[a-zA-Z]{2,}$/;

function validarContrasena(contrasena){
    return validacionContrasena.test(contrasena);
}

function validarCorreo(correo){   
    return validacionCorreo.test(correo);
}