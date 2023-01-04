# DROP DATABASE IF EXISTS ShopDB;
# CREATE DATABASE ShopDB;
# USE ShopDB;
# ========================================================
DROP TABLE IF EXISTS Abrechnung_Produkt;
DROP TABLE IF EXISTS Abrechnung;
DROP TABLE IF EXISTS Kunde;
DROP TABLE IF EXISTS Produkt;
DROP TABLE IF EXISTS Hersteller;
DROP TABLE IF EXISTS Spedition;

# ========================================================
CREATE TABLE Kunde
(
  ID INT(11) AUTO_INCREMENT,
  Vorname VARCHAR(255),
  Nachname VARCHAR(255) NOT NULL,
  Email VARCHAR(255) NOT NULL,
  PRIMARY KEY (ID)
);
INSERT INTO Kunde (ID, Vorname, Nachname, Email) VALUES
(1, 'Elli', 'Rot', 'rot@xyz.de'),
(2, 'Vera', 'Deise', 'deise@xyz.de'),
(3, 'Witali', 'Myrnow', 'myr@xyz.de'),
(4, 'Rita', 'Myrnow', 'myr@xyz.de'),
(5, 'Eva', 'Hahn', 'ehahn@xyz.de'),
(6, 'Gala', 'Nieda', 'gala@xyz.de'),    # Hat nie die Website von 'ShopDB' besucht => KEINE Abrechnung_ID
(7, 'Peter', 'Kaufnix', 'nix@xyz.de');  # Einmal die Website besucht (=> 1 Abrechnung_ID) aber nichts gekauft  


CREATE TABLE Abrechnung 
(
  ID INT(11) AUTO_INCREMENT,
  Kunde_ID INT(11) /*NOT NULL*/,
  Datum DATE NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY(Kunde_ID) REFERENCES Kunde(ID)
);

INSERT INTO Abrechnung (ID, Kunde_ID, Datum) VALUES
(1, 1, '2021-05-05'),
(2, 3, '2021-10-07'),
(3, 2, '2021-10-11'),
(4, 3, '2021-10-16'),
(5, 5, '2021-10-25'),
(6, 4, '2021-11-03'),
(7, 3, '2021-11-05'),
(8, 2, '2021-11-09'),
(9, 1, '2021-11-17'),
(10,7, '2022-02-14');


CREATE TABLE Spedition 
(
  ID   INT(11) AUTO_INCREMENT,
  Name VARCHAR(255) NOT NULL,
  PRIMARY KEY (ID)
);
INSERT INTO Spedition(ID, Name)VALUES
(1, 'Speedvan GmbH'),
(2, 'RocketLogistic AG'),
(3, 'Turbo Transport'),
(4, 'Parktnur'),    # arbeitet mit Hersteller 'Ladenhut AG' zusammen, von dem aber noch nie etwas bestellt wurde
(5, 'Kriegtnix'),   # arbeitet mit Hersteller 'Hatnix 1992' zusammen, von dem 'ShopDB' aber nichts anbietet
(6, 'Ganzal Lein'); # arbeitet mit keinem Hersteller zusammen


CREATE TABLE Hersteller
(
  ID INT(11) AUTO_INCREMENT,
  Spedition_ID INT(11) UNIQUE ,
  Name VARCHAR(255) NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY(Spedition_ID) REFERENCES Spedition(ID)
);

INSERT INTO Hersteller(ID, Spedition_ID, Name)VALUES
(1, 2, 'Contrabit'),
(2, 1, 'AntiByte'),
(3, 3, 'UltraBug'),
(4, 5, 'Hatnix 1992'),
(5, 4, 'Ladenhut AG'),
(6, NULL, 'Siemens');


CREATE TABLE Produkt 
(
  ID INT(11) AUTO_INCREMENT,
  Hersteller_ID INT(11) NOT NULL,
  Name VARCHAR(255) NOT NULL,
  Euro_Preis FLOAT(11,2) NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY(Hersteller_ID) REFERENCES Hersteller(ID)
);

INSERT INTO Produkt (ID, Hersteller_ID, Name, EURO_preis)VALUES
(1, 2, 'tool 2.0', 15.98),
(2, 2, 'tool 3.1', 22.75),
(3, 1, 'solver 1000', 31.69),
(4, 1, 'solver premium', 45.05),
(5, 3, 'Do IT edition 1', 98.00),
(6, 5, 'TroppoCaro', 1000.00),
(7, 2, 'Lenovo PC Gaming Center 4', 1000.00);

CREATE TABLE Abrechnung_Produkt
(
  Abrechnung_ID INT(11) NOT NULL,
  Produkt_ID INT(11) NOT NULL,
  Menge INTEGER DEFAULT 1,
  FOREIGN KEY (Abrechnung_ID) REFERENCES Abrechnung(ID),
  FOREIGN KEY (Produkt_ID) REFERENCES Produkt(ID),
  PRIMARY KEY (Abrechnung_ID, Produkt_ID)
);

INSERT INTO Abrechnung_Produkt (Abrechnung_ID, Produkt_ID, Menge) VALUES
(1, 2, 1),
(1, 4, 2),
(1, 5, 1),
(2, 3, 1),
(2, 5, 1),
(3, 1, 3),
(3, 5, 1),
(4, 2, 1),
(4, 3, 1),
(5, 1, 1),
(5, 2, 1),
(6, 3, 1),
(6, 2, 1),
(6, 5, 1),
(7, 2, 1),
(8, 3, 1),
(9, 1, 1);


