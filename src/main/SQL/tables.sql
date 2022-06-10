CREATE TABLE Usuario
(
    email    VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    username VARCHAR NOT NULL,
    role     VARCHAR NOT NULL,
    PRIMARY KEY (email)
);
CREATE TABLE Artista
(
    email      VARCHAR NOT NULL,
    password   VARCHAR NOT NULL,
    id_artista SERIAL  NOT NULL,
    username   VARCHAR NOT NULL,
    PRIMARY KEY (id_artista),
    FOREIGN KEY (email)
        REFERENCES Usuario (email)
);
CREATE TABLE Comprador
(
    email        VARCHAR NOT NULL,
    password     VARCHAR NOT NULL,
    fcoins       INT     NOT NULL,
    id_comprador SERIAL  NOT NULL,
    PRIMARY KEY (id_comprador),
    FOREIGN KEY (email)
        REFERENCES Usuario (email)

);
CREATE TABLE Obra
(
    id_obra    SERIAL PRIMARY KEY NOT NULL,
    id_artista SERIAL             NOT NULL,
    title      VARCHAR            NOT NULL,
    price      INT                NOT NULL,
    FOREIGN KEY (id_artista)
        REFERENCES Artista (id_artista)
);
CREATE TABLE Likes
(
    id_likes     SERIAL NOT NULL,
    id_obra      SERIAL NOT NULL,
    id_comprador SERIAL NOT NULL,
    PRIMARY KEY (id_likes),
    FOREIGN KEY (id_comprador)
        REFERENCES Comprador (id_comprador),
    FOREIGN KEY (id_obra)
        REFERENCES Obra (id_obra)
);
CREATE TABLE Coleccion
(
    id_coleccion     SERIAL  NOT NULL,
    id_artista       SERIAL  NOT NULL,
    nombre_coleccion VARCHAR NOT NULL,
    FOREIGN KEY (id_artista)
        REFERENCES Artista (id_artista),
    PRIMARY KEY (id_coleccion)
)
