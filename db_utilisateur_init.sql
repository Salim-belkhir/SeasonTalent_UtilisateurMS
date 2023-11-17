-- Création des tables pour le microservice Utilisateur

--- Suppression des tables si elles existent déjà

DROP TABLE IF EXISTS justificatif;
DROP TABLE IF EXISTS typeJustificatif;
DROP TABLE IF EXISTS utilisateur;
DROP TABLE IF EXISTS abonnement;
DROP TABLE IF EXISTS typeAbonnement;




CREATE TABLE typeAbonnement (
    idTypeAbonnement SERIAL PRIMARY KEY,
    nomAbonnement varchar(255),
    descr varchar(255)
);

CREATE TABLE abonnement (
    idAbonnement SERIAL PRIMARY KEY,
    duree VARCHAR(255),
    idTypeAbonnement INT,
    FOREIGN KEY (idTypeAbonnement) REFERENCES typeAbonnement(idTypeAbonnement)
);

CREATE TABLE utilisateur (
    idUtilisateur SERIAL PRIMARY KEY,
    siret varchar(255),
    nom varchar(255),
    prenom varchar(255),
    photoProfil varchar(255),
    mail varchar(255),
    telephone varchar(10),
    isBanned BOOLEAN,
    isDeleted BOOLEAN,
    idAbonnement INT,
    FOREIGN KEY (idAbonnement) REFERENCES abonnement(idAbonnement)
);

CREATE TABLE typeJustificatif (
    idTypeJustificatif SERIAL PRIMARY KEY,
    label varchar(255),
    consignes varchar(255)
);

CREATE TABLE justificatif (
    idDoc SERIAL PRIMARY KEY,
    lien varchar(255),
    estValide BOOLEAN,
    idTypeJustificatif INT,
    idUtilisateur INT,
    FOREIGN KEY (idTypeJustificatif) REFERENCES typeJustificatif(idTypeJustificatif),
    FOREIGN KEY (idUtilisateur) REFERENCES utilisateur(idUtilisateur)
);

-- Insertion de données dans les tables


INSERT INTO typeAbonnement (nomAbonnement, descr)
VALUES
    ('Free', 'Accès à un nombre limité de candidats avec juste nom, prénom & photo'),
    ('Silver', 'Accès à un nombre limité de candidats avec en plus le téléphone et email'),
    ('Gold', 'Accès à un nombre illimité de candidats avec les mêmes informations'),
    ('Platinium', 'Accès à un accès en plus au chat (et visio) et server-push les offres d''emploi');

INSERT INTO abonnement (duree, idTypeAbonnement)
VALUES
    ('12 mois', 1),
    ('3 mois', 2),
    ('9 mois', 4);

INSERT INTO utilisateur (siret, nom, prenom, photoProfil, mail, telephone, isBanned, isDeleted, idAbonnement)
VALUES
    ('567890123', 'Admin', 'Bob', 'bob.png', 'bob@example.com', '0603030303', FALSE, FALSE, 3),
    ('123456789', 'JohnDoe', 'John', 'john.png', 'john@example.com', '0601010101', FALSE, FALSE, 1),
    ('987654321', 'JaneDoe', 'Jane', 'jane.png', 'jane@example.com', '0602020202', FALSE, FALSE, 2);

INSERT INTO typeJustificatif (label, consignes)
VALUES
    ('Carte d''identité', 'Copie recto-verso, format pdf'),
    ('Justificatif B', 'Consignes pour justificatif B'),
    ('Justificatif C', 'Consignes pour justificatif C');

INSERT INTO justificatif (lien, estValide, idTypeJustificatif, idUtilisateur)
VALUES
    ('cni.pdf', TRUE, 1, 2),
    ('lien2.pdf', TRUE, 2, 2),
    ('lien3.pdf', FALSE, 3, 3);