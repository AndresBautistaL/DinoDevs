function login(){
    const adminMail = 'admin@admin.com';
    const adminPass = '1234';
    let username = document.getElementById('loginName').value
    let pass = document.getElementById('loginPassword').value
    console.log(username);
    console.log(pass);
    if(adminMail !== username || adminPass !== pass){
        alert('Usuario o contraseña incorrectas');
    }else{   
        window.location.href = 'clientes.html';
    }

}