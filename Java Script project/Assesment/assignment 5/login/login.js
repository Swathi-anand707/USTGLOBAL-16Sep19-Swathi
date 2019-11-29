function enableDisable(){
    let userName = document.getElementById('userName').value;
    let password = document.getElementById('password').value;
    let login = document.getElementById('login');

    if(userName.length > 5 && password.length > 6){
        login.disabled = false;
    }else{
        login.disabled = true;

    }

}
