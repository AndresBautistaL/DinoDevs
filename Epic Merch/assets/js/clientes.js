const btnToggle = document.querySelector(".toggle-btn");
btnToggle.addEventListener('click', function(){
    document.getElementById('sidebar-container').classList.toggle('active');
});