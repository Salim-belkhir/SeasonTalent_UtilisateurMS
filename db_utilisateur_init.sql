-- Création des tables pour le microservice Utilisateur

--- Suppression des tables si elles existent déjà

DROP TABLE IF EXISTS justificatif;
DROP TABLE IF EXISTS type_justificatif;
DROP TABLE IF EXISTS utilisateur;
DROP TABLE IF EXISTS abonnement;
DROP TABLE IF EXISTS type_abonnement;
DROP TABLE IF EXISTS user_role;


CREATE TABLE user_role (
    id_role SERIAL PRIMARY KEY,
    label varchar(255)
);

CREATE TABLE type_abonnement (
    id_type_abonnement SERIAL PRIMARY KEY,
    nom_abonnement varchar(255),
    descr varchar(255)
);

CREATE TABLE abonnement (
    id_abonnement SERIAL PRIMARY KEY,
    duree VARCHAR(255),
    id_type_abonnement INT,
    FOREIGN KEY (id_type_abonnement) REFERENCES type_abonnement(id_type_abonnement)
);

CREATE TABLE utilisateur (
    id_utilisateur SERIAL PRIMARY KEY,
    siret varchar(255),
    nom_utilisateur varchar(255),
    prenom varchar(255),
    photo_profil varchar(255),
    mail varchar(255),
    mot_de_passe varchar(255),
    telephone varchar(10),
    is_banned BOOLEAN,
    is_deleted BOOLEAN,
    id_role INT,
    id_abonnement INT,
    FOREIGN KEY (id_role) REFERENCES user_role(id_role),
    FOREIGN KEY (id_abonnement) REFERENCES abonnement(id_abonnement)
);

CREATE TABLE type_justificatif (
    id_type_justificatif SERIAL PRIMARY KEY,
    label varchar(255),
    consignes varchar(255)
);

CREATE TABLE justificatif (
    id_doc SERIAL PRIMARY KEY,
    lien varchar(255),
    est_valide BOOLEAN,
    id_type_justificatif INT,
    id_utilisateur INT,
    FOREIGN KEY (id_type_justificatif) REFERENCES type_justificatif(id_type_justificatif),
    FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id_utilisateur)
);

-- Insertion de données dans les tables

INSERT INTO user_role (label)
VALUES
    ('Admin'),
    ('Recruteur');

INSERT INTO type_abonnement (nom_abonnement, descr)
VALUES
    ('Free', 'Accès à un nombre limité de candidats avec juste nom, prénom & photo'),
    ('Silver', 'Accès à un nombre limité de candidats avec en plus le téléphone et email'),
    ('Gold', 'Accès à un nombre illimité de candidats avec les mêmes informations'),
    ('Platinium', 'Accès à un accès en plus au chat (et visio) et server-push les offres d''emploi');

INSERT INTO abonnement (duree, id_type_abonnement)
VALUES
    ('12 mois', 1),
    ('3 mois', 2),
    ('9 mois', 4);

INSERT INTO utilisateur (siret, nom_utilisateur, prenom, photo_profil, mail, mot_de_passe, telephone, is_banned, is_deleted, id_role, id_abonnement)
VALUES
    ('567890123', 'Admin', 'Bob', 'bob.png', 'bob@example.com', 'admin', '0603030303', FALSE, FALSE, 1, 3),
    ('123456789', 'JohnDoe', 'John', 'john.png', 'john@example.com', 'motdepasse123', '0601010101', FALSE, FALSE, 2, 1),
    ('987654321', 'JaneDoe', 'Jane', 'jane.png', 'jane@example.com', 'motdepasse456', '0602020202', FALSE, FALSE, 2, 2);

INSERT INTO type_justificatif (label, consignes)
VALUES
    ('Carte d''identité', 'Copie recto-verso, format pdf'),
    ('Justificatif B', 'Consignes pour justificatif B'),
    ('Justificatif C', 'Consignes pour justificatif C');

INSERT INTO justificatif (lien, est_valide, id_type_justificatif, id_utilisateur)
VALUES
    ('cni.pdf', TRUE, 1, 2),
    ('lien2.pdf', TRUE, 2, 2),
    ('lien3.pdf', FALSE, 3, 3);