let carrito = JSON.parse(localStorage.getItem('carrito')) || {};
const botonesAgregar = document.getElementsByClassName("aniadirButton");
const items = document.getElementById('items')
const templateCarrito = document.getElementById('template-carrito').content;
const fragment = document.createDocumentFragment();

const btnVaciar = document.getElementById('vaciar-carrito');
btnVaciar.addEventListener('click', ()=>{
	carrito = {}
	pintarCarrito()
});

HTMLCollection.prototype.forEach = Array.prototype.forEach;

botonesAgregar.forEach((element) => {
    element.addEventListener('click', (evento) => {
        const cardItem = evento.target.parentElement.parentElement.parentElement;
        const itemName = cardItem.querySelector('h2').textContent;
        const itemPrice = cardItem.querySelector('span').textContent; 
        const itemImage = cardItem.querySelector('img').getAttribute("src");
        console.log(itemName, itemPrice);
        let cantidad = 1;
        if(carrito[itemName]){
            cantidad = carrito[itemName].cantidad + 1;
        }
        carrito[itemName] = {
            name: itemName,
            price: itemPrice,
            cantidad: cantidad,
            imagen: itemImage
        };
        localStorage.setItem('carrito', JSON.stringify(carrito));
        pintarCarrito();
    });  
});

const pintarCarrito = ()=> {
	
	items.innerHTML = ''
	Object.values(carrito).forEach(producto => {
		templateCarrito.querySelector('th').firstElementChild.src = producto.imagen;
		templateCarrito.querySelectorAll('td')[0].textContent = producto.name;
		templateCarrito.querySelectorAll('td')[1].textContent = producto.cantidad
		//templateCarrito.querySelector('span').textContent = producto.cantidad * producto.precio
		const clone = templateCarrito.cloneNode(true);
        fragment.appendChild(clone);
	})

	items.appendChild(fragment);

	localStorage.setItem('carrito', JSON.stringify(carrito));

}
pintarCarrito();


const btnToggle = document.querySelector(".toggle-btn");
btnToggle.addEventListener('click', function(){
    document.getElementById('sidebar-container').classList.toggle('active');
});