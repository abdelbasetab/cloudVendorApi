const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const container = document.querySelector(".container");
//const submit_btn = document.querySelector("#submit_btn");
const url_login = "http://localhost:8090/api/auth/signin";
sign_up_btn.addEventListener("click", () => {
  container.classList.add("sign-up-mode");
});

sign_in_btn.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});

//submit_btn.addEventListener("click", submitForm());

// submit todo
function submitForm() {
  // Get values from input fields
  var username = document.getElementById("username").value;
  var password = document.getElementById("password").value;

  // Create a data object with the values
  var data = {
    username: username,
    password: password,
  };

  // Make a fetch request to your server (replace 'your-api-endpoint' with the actual endpoint)
  fetch(url_login, {
    method: "GET", // or 'GET' depending on your server-side setup
    mode: "no-cors",
    //  headers: {
    //  "Content-Type": "application/json",
    // },
    //body: JSON.stringify(data),
  })
    .then((response) => console.log(response))
    .then((responseData) => {
      // Handle the response from the server
      console.log("Server response:", responseData);
    })
    .catch((error) => {
      console.error("Error:", error);
    });

  // Prevent the form from submitting (since we are handling it with JavaScript)
  return false;
  /** 
  console.log("username password");
  var username = document.getElementById("username").value;
  var password = document.getElementById("password").value;

  console.log(username + " " + password);

  // Create a new XMLHttpRequest object
   var xhr = new XMLHttpRequest();

  // Configure it: POST-request for the login endpoint
  xhr.open("GET", url_login, true);

  xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

  xhr.send(formData);
  // Set up a function to handle the response
  xhr.onload = function () {

    if (xhr.status === 200) {
      // Successful response, handle it accordingly
      var response = JSON.parse(xhr.responseText);

      // Check your response and perform actions
      if (response.success) {
        // Redirect to a new page or perform any other action
        window.location.href = "/";
      } else {
        // Display an error message
        document.getElementById("error").style.display = "block";
      }
    }
    */
}

// Set up a function to handle network errors
/* xhr.onerror = function () {
    // Handle the error
    console.error("Request failed");
  };

  // Prepare the data to be sent
/**  var formData =
    "username=" +
    encodeURIComponent(username) +
    "&password=" +
    encodeURIComponent(password);

  // Send the request
  xhr.send(formData);
}*/
