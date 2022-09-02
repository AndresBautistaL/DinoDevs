
function login(mock = false){
    const usuarios = {
        "ruti-neni@dinodevs.com": "H0lamund0",
        "avellana07@dinodevs.com": "CatCosm0",
        "dash@dinodevs.com" : "c0ntR4zen@",
        "aquiles@dinodevs.com" : "Bl4nch3",
        "pato.juan@dinodevs.com" : "CuacCuac#",
        "grandioso@dinodevs.com" : "Oso1Oso1"

    }

    const usuario = document.getElementById('correo').value
    const contrasena = document.getElementById('contrasena').value
    const correoIncorrecto = document.getElementById("correoIncorrecto");

    correoIncorrecto.hidden = true;
    
    if(!validarCorreo(usuario)){
        correoIncorrecto.hidden = false;
        return;
    }
    
    if(localStorage[usuario] !== contrasena && usuarios[usuario] != contrasena){
        alert('Usuario o contraseña incorrectas');
    } else {   
        window.location.href = 'clientes.html';
    }

}