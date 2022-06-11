var foto = document.getElementById("foto-file");
var cloud_url = "https://api.cloudinary.com/v1_1/dilwbkj5s/upload";

var cloud_upload = "cl2yqfni";
let pic = "";
let regform = document.getElementById("regform");
const formData = new FormData(regform);

foto.addEventListener("change", function (e) {
  let file = e.target.files[0];
  let formData = new FormData();
  formData.append("file", file);
  formData.append("upload_preset", cloud_upload);

  axios({
    url: cloud_url,
    method: "POST",
    headers: {
      "Content-Type": "application/x-www-form-urlencoded",
    },
    data: formData,
  })
    .then(function (response) {
      console.log(response);
      console.log(response.data.secure_url);
      return (pic = response.data.secure_url);
    })
    .catch(function (error) {
      console.log(error);
    });
});

function getData() {
  let data = {
    name: document.getElementById("name").value,
    username: document.getElementById("username").value,
    email: document.getElementById("email").value,
    password: document.getElementById("password").value,
    rpassword: document.getElementById("rpass").value,
    imagen: pic,
    rol: document.getElementById("roleinput").value,
    fcoins: document.getElementById("Fcoins").value,
  };

  if (data.name === "" || data.username === "" || data.email === "" || data.password === "" || data.rpassword === "" || data.imagen === ""||data.rol==="") {
    Swal.fire({
      icon: "error",
      title: "Oops...",
      text: "Todos los campos son requeridos",
    });
  } else {

    // fetch(`../api/users/register`, {
    //   method: "POST",
    //   body: JSON.stringify(data),
    //   headers: { "Content-Type": "application/x-www-form-urlencoded" },
    //     })
    //   .then((resp) => console.log(resp))
    //   .catch((error) => console.log(error));

    sessionStorage.setItem("newUser", JSON.stringify(data));

    let rol = data.rol;
    window.location = `../web/index${rol}.html`;
  }
}
