
const correo = document.getElementById('correo').value;
const nombre = document.getElementById('nombre').value;
const asunto = document.getElementById('asunto').value;
const mensaje = document.getElementById('mensaje').value;


let x = () => {
    window.addEventListener('load', () => {

        const correoElement = document.getElementById('correo');
        const nombreElement = document.getElementById('nombre');
        const asuntoElement = document.getElementById('asunto');
        const mensajeElement = document.getElementById('mensaje');
        const enviarBtn = document.getElementById('enviarBtn');

        let correoIsValid = false;
        let nombreIsValid = false;
        let asuntoIsValid = false;
        let mensajeIsValid = false;


        nombreElement.addEventListener('blur', (event) => {
            console.log("nombre Element");
            const nombreE = nombreElement.value;
            nombreElement.classList.remove('is-invalid');
            nombreElement.classList.remove('is-valid');
            if (!nombreE || nombreE.length === 0) {
                nombreElement.classList.add('is-invalid');
                nombreIsValid = false;
            } else {
                nombreElement.classList.add('is-valid');
                nombreIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !nombreIsValid || !asuntoIsValid || !mensajeIsValid;
        });

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

        asuntoElement.addEventListener('blur', (event) => {
            const asuntoE = asuntoElement.value;
            asuntoElement.classList.remove('is-invalid');
            asuntoElement.classList.remove('is-valid');
            if (!asuntoE || asuntoE.length === 0) {
                asuntoElement.classList.add('is-invalid');
                asuntoIsValid = false;
            } else {
                asuntoElement.classList.add('is-valid');
                asuntoIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !nombreIsValid || !asuntoIsValid || !mensajeIsValid;
        });

        mensajeElement.addEventListener('blur', (event) => {
            const mensajeE = mensajeElement.value;
            mensajeElement.classList.remove('is-invalid');
            mensajeElement.classList.remove('is-valid');
            if (!mensajeE || mensajeE.length === 0) {
                mensajeElement.classList.add('is-invalid');
                mensajeIsValid = false;
            } else {
                mensajeElement.classList.add('is-valid');
                mensajeIsValid = true;
            }
            enviarBtn.disabled = !correoIsValid || !nombreIsValid || !asuntoIsValid || !mensajeIsValid;
        });

    })
}
function mensajeEnviado() {
    if (enviarBtn.disabled = true) {
        alert("Tu mensaje ha sido enviado")
    }
}

x();