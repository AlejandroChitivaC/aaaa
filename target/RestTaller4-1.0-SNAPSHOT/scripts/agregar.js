let formulario = document.getElementById("formulario");
/*
Recuerda hacer el fetch con la URI de REST
 */
const url = "https://db-alejandro.herokuapp.com/obrasarte/";

formulario.addEventListener("submit", async (esc) => {
  esc.preventDefault();
  //capturando los datos del html y los voy a enviar a mi data.json
  let nombre = document.getElementById("name").value;
  let descr = document.getElementById("descripcion").value;
  // let foto = document.getElementById("foto").value;
  let id = document.getElementById("id").value;
  let coleccion = document.getElementById("coleccion").value;

  // atraves de una promesa url donde se van a guardar esos datos
  await fetch(url, {
    method: "POST",
    body: JSON.stringify({
      nombre: nombre,
      descripcion: descr,
      // imagen: foto,
      id: id,
      coleccion: coleccion,
      likes: 0,
    }),
    headers: {
      "Content-Type": "application/json; charset=UTF-8",
    },
  });

  Swal.fire({
    title: "Obra de arte añadida correctamente!",
    text: "Se ha añadido una obra de arte a la colección de" + coleccion,
    icon: "success",
  })
  
  window.location = "../web/social.html";
});
