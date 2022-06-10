/*Inserts into Usuario Table*/



/*Compradores*/
INSERT INTO Usuario(email, password, username, role)
VALUES ('paquito3000@gmail.com', 'paco2330', 'Paquito3000', 'Comprador');
INSERT INTO Usuario(email, password, username, role)
VALUES ('kevinsgp@gmail.com', 'kevin300', 'Kevin_Gp', 'Comprador');
INSERT INTO Usuario(email, password, username, role)
VALUES ('valelacocacola@gmail.com', 'cocacola', 'ValeCocacola', 'Comprador');
INSERT INTO Usuario(email, password, username, role)
VALUES ('natasha@gmail.com', 'laprombioclinica', 'Natasha3000', 'Comprador');
INSERT INTO Usuario(email, password, username, role)
VALUES ('alejandra@gmail.com', 'unpasoalavez', 'AlejandraEnf', 'Comprador');

/*Artistas*/

INSERT INTO Usuario(email, password, username, role)
VALUES ('alejandrochc@gmail.com', 'alejandro222', 'AlejandroChC', 'Artista');
INSERT INTO Usuario(email, password, username, role)
VALUES ('fabiancpeña@profe.com', 'prog2', 'ElProfe_:v', 'Artista');
INSERT INTO Usuario(email, password, username, role)
VALUES ('sebastiancastillo@yahoo.com', 'sebastiancas', 'Scastillo', 'Artista');
INSERT INTO Usuario(email, password, username, role)
VALUES ('mariaangarita@gmail.com', 'mariab', 'mariaa_ab', 'Artista');


/*Inserts into Artista table*/


INSERT INTO Artista(email, password, id_artista, username)
VALUES ('alejandrochc@gmail.com', 'alejandro222', 01, 'AlejandroChC');
INSERT INTO Artista(email, password, id_artista, username)
VALUES ('fabiancpeña@profe.com', 'prog2', 02, 'ElProfe_:v');
INSERT INTO Artista(email, password, id_artista, username)
VALUES ('sebastiancastillo@yahoo.com', 'sebastiancas', 03, 'Scastillo');
INSERT INTO Artista(email, password, id_artista, username)
VALUES ('mariaangarita@gmail.com', 'mariab', 04, 'mariaa_ab');

/*Insert into Comprador table*/


INSERT INTO Comprador(email, password,fcoins,id_comprador)
VALUES ('paquito3000@gmail.com','paco2330',1100,01);
INSERT INTO Comprador(email, password,fcoins,id_comprador)
VALUES ('kevinsgp@gmail.com','kevin300',1200,02);
INSERT INTO Comprador(email, password,fcoins,id_comprador)
VALUES ('valelacocacola@gmail.com','cocacola',1400,03);
INSERT INTO Comprador(email, password,fcoins,id_comprador)
VALUES ('natasha@gmail.com','laprombioclinica',1500,04);
INSERT INTO Comprador(email, password,fcoins,id_comprador)
VALUES ('alejandra@gmail.com','unpasoalavez',1600,05);

/*Insert into Obra table*/


INSERT INTO Obra(id_obra, id_artista, title, price)
VALUES (1, 01, 'NFT de AlejandroChC', 1600);
INSERT INTO Obra(id_obra, id_artista, title, price)
VALUES (2, 02, 'La obra del profe', 2600);
INSERT INTO Obra(id_obra, id_artista, title, price)
VALUES (3, 03, 'NFT de Scastillo', 1700);
INSERT INTO Obra(id_obra, id_artista, title, price)
VALUES (4, 04, 'NFT de mariaa_ab', 4110);

INSERT INTO Likes(id_likes, id_obra, id_comprador)
VALUES (1, 1, 1);
INSERT INTO Likes(id_likes, id_obra, id_comprador)
VALUES (2, 2, 2);
INSERT INTO Likes(id_likes, id_obra, id_comprador)
VALUES (3, 3, 3);
INSERT INTO Likes(id_likes, id_obra, id_comprador)
VALUES (4, 4, 4);


INSERT INTO Coleccion(id_coleccion, id_artista, nombre_coleccion)
VALUES (1,01,'Arquitectura');
INSERT INTO Coleccion(id_coleccion, id_artista, nombre_coleccion)
VALUES (2,01,'Pintura');
INSERT INTO Coleccion(id_coleccion, id_artista, nombre_coleccion)
VALUES (3,01,'NFTs');
INSERT INTO Coleccion(id_coleccion, id_artista, nombre_coleccion)
VALUES (4,01,'Arte');
INSERT INTO Coleccion(id_coleccion, id_artista, nombre_coleccion)
VALUES (5,01,'Música');
INSERT INTO Coleccion(id_coleccion, id_artista, nombre_coleccion)
VALUES (6,01,'Deportes');
INSERT INTO Coleccion(id_coleccion, id_artista, nombre_coleccion)
VALUES (7,01,'Utilidades');















