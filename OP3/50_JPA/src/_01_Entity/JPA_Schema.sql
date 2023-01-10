CREATE DATABASE IF NOT EXISTS JPA_DB;
USE JPA_DB;
-- =============================================================
DROP TABLE IF EXISTS PERSON;
-- =============================================================
CREATE TABLE PERSON (
                        ID       INT          PRIMARY KEY AUTO_INCREMENT,
                        VORNAME  VARCHAR(50) NOT NULL ,
                        NACHNAME VARCHAR(50) NOT NULL
);


INSERT INTO PERSON (ID, VORNAME, NACHNAME) VALUES (1, 'Peter', 'Schmidt');
INSERT INTO PERSON (ID, VORNAME, NACHNAME) VALUES (2, 'Hans', 'Meyer');
INSERT INTO PERSON (ID, VORNAME, NACHNAME) VALUES (3, 'Thomas', 'Lehmann');


-- PERSON
SELECT * FROM PERSON;