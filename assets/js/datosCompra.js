
function Card(event, el) {//Validar nombre	
    //Obteniendo posicion del cursor 
    var val = el.value;//Valor de la caja de texto
    var pos = val.slice(0, el.selectionStart).length;

    var out = '';//Salida
    var filtro = '1234567890';
    var v = 0;//Contador de caracteres validos

    //Filtar solo los numeros
    for (var i = 0; i < val.length; i++) {
        if (filtro.indexOf(val.charAt(i)) != -1) {
            v++;
            out += val.charAt(i);
            //Agregando un espacio cada 4 caracteres
            if ((v == 4) || (v == 8) || (v == 12))
                out += ' ';
        }
    }
    //Reemplazando el valor
    el.value = out;

    //En caso de modificar un numero reposicionar el cursor
    if (event.keyCode == 8) {//Tecla borrar precionada
        el.selectionStart = pos;
        el.selectionEnd = pos;
    }
}

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

let x = () => {
        window.addEventListener('load', () => {
            const nombreElement = document.getElementById("nombre");
            const apellidoElement = document.getElementById("apellido");
            const calleNumElement = document.getElementById("calleynum");
            const coloniaElement = document.getElementById("colonia");
            const localidadElement = document.getElementById("localidad");
            const estadoElement = document.getElementById("estado");
            const paisElement = document.getElementById("pais");
            const codigoPostalElement = document.getElementById("codigopostal");
            const telefonoElement = document.getElementById("telefono");
            const referenciaElement= document.getElementById("referencias");
            const nomTitularElement = document.getElementById("nombreTitular");
            const numTarjetaElement = document.getElementById("numTarjeta");
            const cvvElement = document.getElementById("cvv");
            const vencimientoElement = document.getElementById("fechaVencimiento");

            let nombreIsValid = false;
            let apellidoIsValid = false;
            let calleNumIsValid = false;
            let coloniaIsValid = false;
            let localidadIsValid = false;
            let estadoIsValid = false;
            let paisIsValid = false;
            let codigoPostalIsValid = false;
            let telefonoIsValid = false;
            let referenciaIsValid= false;
            let nomTitularIsValid = false;
            let numTarjetaIsValid = false;
            let cvvIsValid= false;
            let vencimientoIsValid = false;


            nombreElement.addEventListener('blur', (event) => {
                const nombre = nombreElement.value;
                nombreElement.classList.remove('is-invalid');
                nombreElement.classList.remove('is-valid');
                if (!nombre || nombre.length === 0) {
                    nombreElement.classList.add('is-invalid');
                    nombreIsValid = false;
                } else {
                    nombreElement.classList.add('is-valid');
                    nombreIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            apellidoElement.addEventListener('blur', (event) => {
                const apellido = apellidoElement.value;
                apellidoElement.classList.remove('is-invalid');
                apellidoElement.classList.remove('is-valid');
                if (!apellido || apellido.length === 0) {
                    apellidoElement.classList.add('is-invalid');
                    apellidoIsValid = false;
                } else {
                    apellidoElement.classList.add('is-valid');
                    apellidoIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            calleNumElement.addEventListener('blur', (event) => {
                const calleNum = calleNumElement.value;
                calleNumElement.classList.remove('is-invalid');
                calleNumElement.classList.remove('is-valid');
                if (!calleNum || calleNum.length === 0) {
                    calleNumElement.classList.add('is-invalid');
                    calleNumIsValid = false;
                } else {
                    calleNumElement.classList.add('is-valid');
                    calleNumIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            coloniaElement.addEventListener('blur', (event) => {
                const colonia = coloniaElement.value;
                coloniaElement.classList.remove('is-invalid');
                coloniaElement.classList.remove('is-valid');
                if (!colonia || colonia.length === 0) {
                    coloniaElement.classList.add('is-invalid');
                    coloniaIsValid = false;
                } else {
                    coloniaElement.classList.add('is-valid');
                    coloniaIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            localidadElement.addEventListener('blur', (event) => {
                const localidad = localidadElement.value;
                localidadElement.classList.remove('is-invalid');
                localidadElement.classList.remove('is-valid');
                if (!localidad || localidad.length === 0) {
                    localidadElement.classList.add('is-invalid');
                    localidadIsValid = false;
                } else {
                    localidadElement.classList.add('is-valid');
                    localidadIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            estadoElement.addEventListener('blur', (event) => {
                const estado = estadoElement.value;
                estadoElement.classList.remove('is-invalid');
                estadoElement.classList.remove('is-valid');
                if (!estado || estado.length === 0 || estado.length > 50) {
                    estadoElement.classList.add('is-invalid');
                    estadoIsValid = false;
                } else {
                    estadoElement.classList.add('is-valid');
                    estadoIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            paisElement.addEventListener('blur', (event) => {
                const pais = paisElement.value;
                paisElement.classList.remove('is-invalid');
                paisElement.classList.remove('is-valid');
                if (!pais || pais.length === 0) {
                    paisElement.classList.add('is-invalid');
                    paisIsValid = false;
                } else {
                    paisElement.classList.add('is-valid');
                    paisIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            codigoPostalElement.addEventListener('blur', (event) => {
                const codigoPostal = codigoPostalElement.value;
                codigoPostalElement.classList.remove('is-invalid');
                codigoPostalElement.classList.remove('is-valid');
                if (!codigoPostal || codigoPostal.length === 0 || codigoPostal.length <=4 || codigoPostal.length >=7) {
                    codigoPostalElement.classList.add('is-invalid');
                    codigoPostalIsValid = false;
                } else {
                    codigoPostalElement.classList.add('is-valid');
                    codigoPostalIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            telefonoElement.addEventListener('blur', (event) => {
                const telefono = telefonoElement.value;
                telefonoElement.classList.remove('is-invalid');
                telefonoElement.classList.remove('is-valid');
                if (!telefono || telefono.length === 0 || telefono.length <= 9 || telefono.length >=11) {
                    telefonoElement.classList.add('is-invalid');
                    telefonoIsValid = false;
                } else {
                    telefonoElement.classList.add('is-valid');
                    telefonoIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            referenciaElement.addEventListener('blur', (event) => {
                const referencia = referenciaElement.value;
                referenciaElement.classList.remove('is-invalid');
                referenciaElement.classList.remove('is-valid');
                if (!referencia || referencia.length === 0 || referencia.length > 500) {
                    referenciaElement.classList.add('is-invalid');
                    referenciaIsValid = false;
                } else {
                    referenciaElement.classList.add('is-valid');
                    referenciaIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !referenciaIsValid || !vencimientoIsValid;
            });

            nomTitularElement.addEventListener('blur', (event) => {
                const nomTitular = nomTitularElement.value;
                nomTitularElement.classList.remove('is-invalid');
                nomTitularElement.classList.remove('is-valid');
                if (!nomTitular || nomTitular.length === 0) {
                    nomTitularElement.classList.add('is-invalid');
                    nomTitularIsValid = false;
                } else {
                    nomTitularElement.classList.add('is-valid');
                    nomTitularIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            numTarjetaElement.addEventListener('blur', (event) => {
                const numTarjeta = numTarjetaElement.value;
                numTarjetaElement.classList.remove('is-invalid');
                numTarjetaElement.classList.remove('is-valid');
                if (!numTarjeta || numTarjeta.length === 0 || numTarjeta.length <= 18) {
                    numTarjetaElement.classList.add('is-invalid');
                    numTarjetaIsValid = false;
                } else {
                    numTarjetaElement.classList.add('is-valid');
                    numTarjetaIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            vencimientoElement.addEventListener('blur', (event) => {
                console.log("event cvv",event.target);
                const vencimiento = vencimientoElement.value;
                vencimientoElement.classList.remove('is-invalid');
                vencimientoElement.classList.remove('is-valid');
                if (!vencimiento || vencimiento.length === 0 || vencimiento.length <= 4) {
                    vencimientoElement.classList.add('is-invalid');
                    vencimientoIsValid = false;
                } else {
                    vencimientoElement.classList.add('is-valid');
                    vencimientoIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
            });

            cvvElement.addEventListener('blur', (event) => {
                const cvv = cvvElement.value;
                cvvElement.classList.remove('is-invalid');
                cvvElement.classList.remove('is-valid');
                if (!cvv || cvv.length === 0 || cvv.length<=2) {
                    cvvElement.classList.add('is-invalid');
                    cvvIsValid = false;
                } else {
                    cvvElement.classList.add('is-valid');
                    cvvIsValid = true;
                }
                enviarBtn.disabled = !nombreIsValid || !apellidoIsValid || !calleNumIsValid || !coloniaIsValid || !localidadIsValid  || !estadoIsValid || !paisIsValid || !codigoPostalIsValid || !telefonoIsValid || !nomTitularIsValid || !numTarjetaIsValid || !cvvIsValid || !vencimientoIsValid || !referenciaIsValid ;
                console.log("enviarBtn",enviarBtn.disabled);
            });


        });
}

function compraEnviada() {
    if (enviarBtn.disabled = true) {
        alert("Tu compra esta siendo procesada. En breve te enviaremos un correo con los detalles de tu pedido")
    }
}

x();