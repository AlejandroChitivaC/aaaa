/*
Recuerda hacer el fetch con la URL de REST
 */
//url donde están alojadas las imagenes y en la cual se añaden los nuevos NFT'S
const url = " https://db-alejandro.herokuapp.com/obrasarte/";
let campo = document.querySelector("#socialcard");
let profilePicture = document.getElementById("pimg");
// se trae la info del .json
//contador likes
let contador = 0;
let msg = "Solo puedes dar un like por obra de arte";
function contar() {
  document.getElementById("btnlikes").innerHTML = contador++;
  if ((contador = 1)) {
    alert(msg);
  }
}

const getData = async () => {
  const resp = await fetch(url);
  console.log(resp);

  const data = await resp.json();
  data.forEach((card) => {
    const { nombre, imagen, precio, likes, coleccion, descripcion } = card;
    campo.innerHTML += ` 
        <div class="card">
                <img src="${imagen}" alt="">
                <p style="color:blue; font-weight:bold">${"@" + nombre}</p>
                <p>${precio}</p>
                <p>${"Colección: " + coleccion}</p>
                <p>${descripcion}</p>
                <button id="btncomprar" style="border-radius:50px;width: 80px;height: 60px;margin-left: 150px;" class="btn btn-primary">Comprar</button>         
                <button id="btnlikes" class="btn btn-primary" style="border-radius:50px;width: 80px;height: 60px;margin-left: 150px;" onclick="contar()">${likes} Like</button>
            </div> 
        `;
  });
};

window.addEventListener("DOMContentLoaded", getData);


// Trae la imagen desde el sessionStorage

let data = sessionStorage.getItem("newUser");
let userData = JSON.parse(data);

if (userData.rol === "Comprador") {
  profilePicture.innerHTML = `<div>
  <a href="../web/perfil.html"><img style="margin-left:100px" class="profile-pic" src=${userData.imagen} alt="userPicture"/></a>
  <h5 style="color:white;font-weight:normal">${userData.name}</h5>
  </div>`;
} else {
}

console.log(userData.imagen);
console.log(profilePicture);
