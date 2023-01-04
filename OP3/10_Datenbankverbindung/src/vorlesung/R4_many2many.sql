CREATE DATABASE IF NOT EXISTS R4;
USE R4;

# =======================================================================
#                             n:m - Beziehung
#            Umgesetzt mit einer Zwischen-/Hilfstabelle
# =======================================================================
DROP VIEW IF EXISTS EMPLOYEE_PROJECT_VIEW;
DROP VIEW IF EXISTS PROJECT_EMPLOYEE_VIEW;
DROP TABLE IF EXISTS EMPLOYEE_PROJECT;
DROP TABLE IF EXISTS EMPLOYEE;
DROP TABLE IF EXISTS PROJECT;
-- =============================================================
CREATE TABLE EMPLOYEE
(
  ID           INT         PRIMARY KEY,
  VORNAME      VARCHAR(50) NOT NULL,
  NACHNAME     VARCHAR(50) NOT NULL
);

INSERT INTO EMPLOYEE (ID, VORNAME, NACHNAME)
      VALUES (1, 'Peter', 'Schmidt'),
             (2, 'Hans', 'Meyer'),
             (3, 'Thomas', 'Heine'),
             (4, 'Stefan', 'Straubinger'),
             (5, 'Klaudius', 'Weidenberg');

CREATE TABLE PROJECT
(
  ID     INT          PRIMARY KEY ,
  NAME   VARCHAR(50)  NOT NULL,
  START  DATE DEFAULT CURDATE()
);

INSERT INTO PROJECT VALUES (500, 'Qatar Airways', DEFAULT),
                           (510, 'Siemens Sonnernschirme MED', '2022-11-25'),
                           (520, 'EuroCopter NAV', '2017-06-14'),
                           (530, 'Panavia', '2019-04-29');
# =======================================================
# Aufbau der n:m - Beziehung durch folgende Hilfstabelle
# =======================================================
CREATE TABLE EMPLOYEE_PROJECT
(
  EMPLOYEE_ID  INT REFERENCES EMPLOYEE (ID),
  PROJECT_ID   INT REFERENCES PROJECT (ID),
  PRIMARY KEY (EMPLOYEE_ID, PROJECT_ID)
);
# =======================================================
INSERT INTO EMPLOYEE_PROJECT
  VALUES (1, 510),(2, 510),(2, 520),(4, 520), (5, 520);
# =======================================================
# EMPLOYEE
SELECT * FROM EMPLOYEE;
# PROJECT
SELECT * FROM PROJECT;
# EMPLOYEE_PROJECT
SELECT * FROM EMPLOYEE_PROJECT;

#==============================================================
#     Liste aller Projekte mit zugerhörigen Mitarbeitern
#==============================================================
SELECT EMPLOYEE.ID AS EMPLOYEE_ID, VORNAME, NACHNAME,
       PROJECT.ID AS PROJECT_ID , NAME, START
  FROM EMPLOYEE
    LEFT JOIN EMPLOYEE_PROJECT ON EMPLOYEE.ID = EMPLOYEE_PROJECT.EMPLOYEE_ID
    LEFT JOIN PROJECT ON EMPLOYEE_PROJECT.PROJECT_ID = PROJECT.ID
  ORDER BY EMPLOYEE_ID, PROJECT_ID;
# =======================
#   View erstellen
# =======================
CREATE VIEW EMPLOYEE_PROJECT_VIEW AS
  SELECT EMPLOYEE.ID AS EMPLOYEE_ID, VORNAME, NACHNAME,
         PROJECT.ID AS PROJECT_ID , NAME, START
  FROM EMPLOYEE
         LEFT JOIN EMPLOYEE_PROJECT ON EMPLOYEE.ID = EMPLOYEE_PROJECT.EMPLOYEE_ID
         LEFT JOIN PROJECT ON EMPLOYEE_PROJECT.PROJECT_ID = PROJECT.ID
  ORDER BY EMPLOYEE_ID, PROJECT_ID;
#==============================================================
#     Liste aller Projekte mit zugerhörigen Mitarbeitern
#==============================================================
SELECT PROJECT.ID AS PROJECT_ID , NAME, START,
       EMPLOYEE.ID AS EMPLOYEE_ID, VORNAME, NACHNAME
FROM EMPLOYEE
       RIGHT JOIN EMPLOYEE_PROJECT ON EMPLOYEE.ID = EMPLOYEE_PROJECT.EMPLOYEE_ID
       RIGHT JOIN PROJECT ON EMPLOYEE_PROJECT.PROJECT_ID = PROJECT.ID
ORDER BY PROJECT_ID, EMPLOYEE_ID;
# =======================
#   View erstellen
# =======================
CREATE VIEW PROJECT_EMPLOYEE_VIEW AS
  SELECT PROJECT.ID AS PROJECT_ID , NAME, START,
         EMPLOYEE.ID AS EMPLOYEE_ID, VORNAME, NACHNAME
  FROM EMPLOYEE
         RIGHT JOIN EMPLOYEE_PROJECT ON EMPLOYEE.ID = EMPLOYEE_PROJECT.EMPLOYEE_ID
         RIGHT JOIN PROJECT ON EMPLOYEE_PROJECT.PROJECT_ID = PROJECT.ID
  ORDER BY PROJECT_ID, EMPLOYEE_ID;





