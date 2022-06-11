# DigitalArt_Java_JDBC
* **Alejandro Chitiva Castillo**
* **Sebastian Castillo Chaves**
* **María Alejandra Angarita Barrantes**

* Crear un usuario artista o comprador. Para poder autenticarse en la tienda, todos los usuarios deben tener un correo electrónico y una contraseña. Adicionalmente, deben tener un nombre y una cantidad inicial de FCoins igual a 0.0. FALTA QUE LOS DATOS QUE SE INGRESAN EN EL FORM SE PERSISTAN EN LA BASE DE DATOS DEPENDIENDO EL ROL.

* Autenticar usuario. Utilizando el correo electrónico y la contraseña, el usuario podrá autenticarse en la tienda. Dependiendo de su rol deberá ser dirigido a una interfaz diferente.

* Crear una colección. Si es un usuario artista, se le debe permitir crear una nueva colección la cual tendrá un nombre, una descripción y una categoría. Tenga en cuenta que una colección pertenece solo a un artista. 

* Crear piezas de arte. Una vez creada la colección, al artista se le debe permitir crear piezas de arte digital las cuales tendrán los atributos de título, precio dado en FCoins y una imágen. Tenga en cuenta que el creador de la pieza, el artista, debe ser su primer propietario.

* Recargar cuenta. Si es un usuario comprador, se le debe permitir recargar su wallet con FCoins.

* Ver piezas. Si es un usuario comprador, podrá ver la lista de piezas disponibles con todos sus atributos, incluyendo el nombre, imágen, propietario, precio, colección y si está disponible para la venta.FALTA LIMITARLO SÓLO AL COMPRADOR

* Comprar pieza. A partir de la lista de piezas, un comprador podrá comprar una pieza de arte que esté disponible para la venta. Para realizar la compra, el comprador debe tener la cantidad requerida de FCoins. Una vez que se realiza la compra, se debe registrar el ingreso y salida de FCoins de las wallets del vendedor y del comprador, según corresponda. 

* Habilitar/deshabilitar para la venta. El propietario de una pieza, sea artista o comprador, podrá habilitar o deshabilitar en cualquier momento la posibilidad de que otro comprador adquiera la pieza de arte.

* Cambiar precio. El propietario de una pieza, sea artista o comprador, podrá cambiar en cualquier momento el valor de la pieza de arte. PROBABLEMENTE LO HAGA

* Dar like. Cualquier usuario comprador podrá dar like a la pieza de arte de su interés. Tenga en cuenta que un usuario puede dar solo un like a una pieza. PROBABLEMENTE LO HAGA


