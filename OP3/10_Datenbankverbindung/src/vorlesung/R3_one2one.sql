CREATE DATABASE IF NOT EXISTS R3;
USE R3;
# =======================================================================
#                            1:1 - Beziehung
# =======================================================================
DROP TABLE IF EXISTS PERSONAL_AUSWEIS;
DROP TABLE IF EXISTS PERSON;
-- =============================================================
CREATE TABLE PERSON
(
  ID           INT         PRIMARY KEY,
  VORNAME      VARCHAR(50) NOT NULL,
  NACHNAME     VARCHAR(50) NOT NULL,
  GEBURTSDATUM DATE
);

INSERT INTO PERSON (ID, VORNAME, NACHNAME, GEBURTSDATUM) VALUES (1, 'Peter', 'Schmidt', '2002-01-15');
INSERT INTO PERSON (ID, VORNAME, NACHNAME, GEBURTSDATUM) VALUES (2, 'Hans', 'Meyer', '1995-03-20');
INSERT INTO PERSON (ID, VORNAME, NACHNAME)               VALUES (3, 'Thomas', 'Heine');
# =======================================================================
#                            1:1 - Beziehung
#            wie 1:n + UNIQUE Constraint auf der FK-Spalte
# =======================================================================

CREATE TABLE PERSONAL_AUSWEIS
(
  ID          INT          PRIMARY KEY ,
  NUMMER      VARCHAR(50)  NOT NULL,
  AUSGESTELLT DATE,
  GÜLTIG      DATE,
  PERSON_ID   INT          UNIQUE REFERENCES PERSON (ID)
);

INSERT INTO PERSONAL_AUSWEIS VALUES (500, 'S458AB452', '2021-02-15', '2031-02-14', 1),
                                    (510, 'P581UR943', '2018-04-29', '2028-04-28', 2),
                                    (520, 'S458AB452', '2025-11-03', '2035-11-02', 3);

SELECT * FROM PERSON;
SELECT * FROM PERSONAL_AUSWEIS;
