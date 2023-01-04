/*
 * Copyright (c) 2023.
 * 4.1.2023
 * Salah Lejmi
 */
CREATE DATABASE IF NOT EXISTS R2;
USE R2;
# =======================================================================
#               Personen und zugehörige Fahrzeuge abfragen
# =======================================================================
# PERSON/KFZ
SELECT PERSON.ID AS PERSON_ID, VORNAME, NACHNAME,
       KFZ.ID AS KFZ_ID, HERSTELLER, MODELL
FROM PERSON LEFT JOIN KFZ ON PERSON.ID = KFZ.PERSON_ID;

DROP VIEW IF EXISTS PERSON_KFZ_VIEW;
CREATE VIEW PERSON_KFZ_VIEW AS
SELECT PERSON.ID AS PERSON_ID, VORNAME, NACHNAME,
       KFZ.ID AS KFZ_ID, HERSTELLER, MODELL
FROM PERSON LEFT JOIN KFZ ON PERSON.ID = KFZ.PERSON_ID
ORDER BY PERSON_ID;

#PERSON_KFZ
SELECT * FROM PERSON_KFZ_VIEW;