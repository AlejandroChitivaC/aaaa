/*
Recuerda hacer el fetch con la URI de REST
 */
document.addEventListener("DOMContentLoaded", function(e) {

  var formulario = document.getElementById('formulario');
  formulario.onsubmit = function(e) {
    e.preventDefault();
    var formData = new FormData(this);
    var jsonData = {};
    for (var [k, v] of formData) {
      jsonData[k] = v;
    }
   let data= console.log(jsonData); 
   data.json();
  }

});