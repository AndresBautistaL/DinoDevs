const correo = document.getElementById('correo').value;

let x = () => {
    window.addEventListener('load', () => {

        const correoElement = document.getElementById('correo');
        const enviarBtn = document.getElementById('enviarBtn');

        let correoIsValid = false;

        correoElement.addEventListener('blur', (event) => {
            const correo = correoElement.value;
            correoElement.classList.remove('is-invalid');
            correoElement.classList.remove('is-valid');
            if (validarCorreo(correo) === false) {
                correoElement.classList.add('is-invalid');
                correoIsValid = false;
            } else {
                correoElement.classList.add('is-valid');
                correoIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !nombreIsValid || !asuntoIsValid || !mensajeIsValid;
        });

    })
}
function mensajeEnviado() {
    if (enviarBtn.disabled = true) {
        alert("¡Pronto recibirás tu cupón de descuento!")
    }
}

x();