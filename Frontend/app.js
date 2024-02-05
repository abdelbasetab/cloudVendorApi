const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const container = document.querySelector(".container");
const submit_btn_sign_in = document.querySelector("#submit_btn_sign_in");
const submit_btn_sign_up = document.querySelector("#submit_btn_sign_up");
const url_login = "http://localhost:8090/api/auth";
sign_up_btn.addEventListener("click", () => {
  container.classList.add("sign-up-mode");
});

sign_in_btn.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});

submit_btn_sign_in.addEventListener("click", (e) =>{
  e.preventDefault();
  var username = document.getElementById("username").value;
  var password = document.getElementById("password").value;
  if (!username || !password) {
    document.getElementById("errorMessage").innerHTML = "All Field are requierd";
    return;
  }
  fetch(url_login + "/signin", {
    method: "POST",
    headers: {
      accept: "application/json",
      "Content-type": "application/json",
    },
    body: JSON.stringify({username: username, password: password}),
  })
      .then(authResponse => {
        console.log("authResponse: ", authResponse);
        if (authResponse.status === 200) {

          return authResponse.json();
        }
        else if (authResponse.status === 401) {
          errorMessage.textcontent = "Accès non autrorisé";
        }
        else if (authResponse.status === 404) {
          errorMessage.textcontent = "Utilisateur non trouvé";
        } else {
          errorMessage.textcontent = `Error: ${authResponse.status}`;
        }
      })
      .then(userData => {
        console.log("userData: ", userData);
        if (userData) {
          window.localStorage.setItem("userData", JSON.stringify(userData));
          window.location.replace = "admin.html";
        }
      })
      .catch(error => console.error(error));
});


submit_btn_sign_up.addEventListener("click", (e) =>{
  e.preventDefault();
  var firstName = document.getElementById("firstname").value;
  var lastName = document.getElementById("lastname").value;
  var email = document.getElementById("email").value;
  var password = document.getElementById("password_signUp").value;

  if (!firstName || !lastName || !password || !email) {
    document.getElementById("errorMessage").innerHTML = "All Field are requierd";
    return;
  }
  fetch(url_login  + "/signup", {
    method: "POST",
   // mode: 'cors',
    headers: {
      accept: "application/json",
      "Content-type": "application/json",
    },
    body: JSON.stringify({firstName: firstName, lastName: lastName,email: email,
      password: password}),
  })
      .then(authResponse => {
        console.log("authResponse: ", authResponse);
        if (authResponse.status === 200) {

          return authResponse.json();
        }
        else if (authResponse.status === 401) {
          errorMessage.textcontent = "Accès non autrorisé";
        }
        else if (authResponse.status === 404) {
          errorMessage.textcontent = "Utilisateur non trouvé";
        } else {
          errorMessage.textcontent = `Error: ${authResponse.status}`;
        }
      })
      .then(userData => {
        console.log("userData: ", userData);
        if (userData) {
          window.localStorage.setItem("userData", JSON.stringify(userData));
          window.location.replace = "admin.html";
        }
      })
      .catch(error => console.error(error));
});