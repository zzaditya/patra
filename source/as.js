function handleLogin() {

    const userField = document.getElementById('username').value;
    const passField = document.getElementById('password').value;
    const errorText = document.getElementById('error-message');

    const validUser = "nimi";
    const validPass = "2802";

    if (userField === validUser && passField === validPass) {

        // Hide login box
        document.getElementById('login-box').style.display = 'none';

        // Show welcome box
        document.getElementById('welcome-box').style.display = 'block';

        // Show welcome message
        document.getElementById('display-name').innerText =
            "Welcome back, " + userField + "!";

        // Clear error message
        errorText.innerText = "";

    } else {
        errorText.innerText = "Invalid username or password!";
    }
}