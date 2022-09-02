function registrar(){
    const correo = document.getElementById('regCorreo').value
    const contrasena = document.getElementById('regContrasena').value
    const repContrasena = document.getElementById('repContrasena').value
    const terminosAceptados = document.getElementById("registerCheck").checked;
    if(!validarCorreo(correo)){
        alert("correo invalido");
        return;
    }
    if(!validarContrasena(contrasena)){
        alert("contraseña insegura");
        return;
    }
    if(contrasena !== repContrasena){
        alert("las contraseñas deben ser iguales");
        return;
    }
    if(!terminosAceptados){
        alert("Debes aceptar los terminos y condiciones para continuar");
        return;
    }
    localStorage.setItem(correo,contrasena);
    alert("Registro Existoso!");
    window.location.href = 'login.html';
}

let x = () => {
    window.addEventListener('load', () => {
        const nombreElement = document.getElementById('regNombre');
        const usuarioElement = document.getElementById('regUsuario');
        const correoElement = document.getElementById('regCorreo');
        const contrasenaElement = document.getElementById('regContrasena');
        const repContrasenaElement = document.getElementById('repContrasena');
        const enviarBtn = document.getElementById('enviarBtn');
        let correoIsValid = false;
        let contrasenaIsValid = false;
        let repContrasenaIsValid = false;
        let nombreIsValid = false;
        let usuarioIsValid = false;
        
        nombreElement.addEventListener('blur', (event) => {
            const nombre = nombreElement.value;
            nombreElement.classList.remove('is-invalid');
            nombreElement.classList.remove('is-valid');
            if (!nombre || nombre.length === 0) {
                nombreElement.classList.add('is-invalid');
                nombreIsValid = false;
            }else {
                nombreElement.classList.add('is-valid');
                nombreIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !contrasenaIsValid || !repContrasenaIsValid || !nombreIsValid || !usuarioIsValid; 
        });
        usuarioElement.addEventListener('blur', (event) => {
            const usuario = usuarioElement.value;
            usuarioElement.classList.remove('is-invalid');
            usuarioElement.classList.remove('is-valid');
            if (!usuario || usuario.length === 0 ||usuario.indexOf(" ") !== -1) {
                usuarioElement.classList.add('is-invalid');
                usuarioIsValid = false;
            }else {
                usuarioElement.classList.add('is-valid');
                usuarioIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !contrasenaIsValid || !repContrasenaIsValid || !nombreIsValid || !usuarioIsValid; 
        });
        correoElement.addEventListener('blur', (event) => {
            const correo = correoElement.value;
            correoElement.classList.remove('is-invalid');
            correoElement.classList.remove('is-valid');
            if (validarCorreo(correo) === false) {
                correoElement.classList.add('is-invalid');
                correoIsValid = false;
            }else {
                correoElement.classList.add('is-valid');
                correoIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !contrasenaIsValid || !repContrasenaIsValid || !nombreIsValid || !usuarioIsValid; 
        });
        contrasenaElement.addEventListener('blur', (event) => {
            const contrasena = contrasenaElement.value;
            contrasenaElement.classList.remove('is-invalid')
            contrasenaElement.classList.remove('is-valid')
            if (validarContrasena(contrasena) === false) {
                contrasenaElement.classList.add('is-invalid');
                contrasenaIsValid = false;
            }else {
                contrasenaElement.classList.add('is-valid');
                contrasenaIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !contrasenaIsValid || !repContrasenaIsValid || !nombreIsValid || !usuarioIsValid;
        });
        repContrasenaElement.addEventListener('blur', (event) => {
            const contrasena = contrasenaElement.value;
            const repContrasena = repContrasenaElement.value;
            repContrasenaElement.classList.remove('is-invalid')
            repContrasenaElement.classList.remove('is-valid')
            if (!validarContrasena(repContrasena) || contrasena !== repContrasena) {
                repContrasenaElement.classList.add('is-invalid');
                repContrasenaIsValid = false;
            }else {
                repContrasenaElement.classList.add('is-valid');
                repContrasenaIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !contrasenaIsValid || !repContrasenaIsValid || !nombreIsValid || !usuarioIsValid;
        });
    });
}

x();