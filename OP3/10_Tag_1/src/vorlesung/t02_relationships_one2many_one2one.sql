-- =============================================================
DROP TABLE IF EXISTS KFZ;   -- KFZ hat ein FK zu PERSON
DROP TABLE IF EXISTS PERSON;
-- =============================================================
CREATE TABLE PERSON
(
  ID       INT         PRIMARY KEY,
  VORNAME  VARCHAR(50) NOT NULL,
  NACHNAME VARCHAR(50) NOT NULL
);

INSERT INTO PERSON (ID, VORNAME, NACHNAME) VALUES (1, 'Peter', 'Schmidt');
INSERT INTO PERSON (ID, VORNAME, NACHNAME) VALUES (2, 'Hans', 'Meyer');
INSERT INTO PERSON (ID, VORNAME, NACHNAME) VALUES (3, 'Thomas', 'Heine');
# =======================================================================
#                            1:n - Beziehung
# Umsetzung durch neue Spalte mit FK-Constraint auf der N-Seite
# =======================================================================

CREATE TABLE KFZ
(
  ID          INT          PRIMARY KEY ,
  HERSTELLER  VARCHAR(50)  NOT NULL,
  MODELL      VARCHAR(50)  NOT NULL,
  BAUJAHR     DATE         DEFAULT CURDATE() /* 2023-01-02 (ISO)*/,
  PERSON_ID   INT          REFERENCES PERSON (ID)
                           /* NOT NULL => Beziehung ist obligatorisch*/
#   CONSTRAINT PERSON_ID_FK FOREIGN KEY (PERSON_ID) REFERENCES PERSON (ID)
);

# ALTER TABLE KFZ ADD CONSTRAINT PERSON_ID_FK
#   FOREIGN KEY (PERSON_ID) REFERENCES PERSON (ID);
# ALTER TABLE KFZ DROP CONSTRAINT PERSON_ID_FK;

INSERT INTO KFZ (ID, HERSTELLER, MODELL, PERSON_ID)          VALUES (500, 'Volkswagen', 'Golf 8',1);
INSERT INTO KFZ (ID, HERSTELLER, MODELL, BAUJAHR, PERSON_ID) VALUES (510, 'FIAT', 'Panda', '2015-04-20',1);
INSERT INTO KFZ (ID, HERSTELLER, MODELL, BAUJAHR, PERSON_ID) VALUES (520, 'Mercedes', 'S600', '2018-11-08',2);
INSERT INTO KFZ (ID, HERSTELLER, MODELL) VALUES (530, 'BMW', '720i');
INSERT INTO KFZ (ID, HERSTELLER, MODELL) VALUES (540, 'Peugoet', '540');
-- =======================================================================

SELECT * FROM KFZ;
SELECT * FROM PERSON;

# SHOW CREATE TABLE KFZ;
# =======================================================================
#                            1:1 - Beziehung
# wie 1:n + UNIQUE Constraint auf der FK-Spalte
# =======================================================================

CREATE TABLE KFZ
(
  ID          INT          PRIMARY KEY ,
  HERSTELLER  VARCHAR(50)  NOT NULL,
  MODELL      VARCHAR(50)  NOT NULL,
  BAUJAHR     DATE         DEFAULT CURDATE() /* 2023-01-02 (ISO)*/,
  PERSON_ID   INT          REFERENCES PERSON (ID)
                           UNIQUE # 1:1
);