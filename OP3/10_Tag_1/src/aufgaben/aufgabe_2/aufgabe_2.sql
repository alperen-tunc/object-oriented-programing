drop database if exists uni_verwaltung;
create database uni_verwaltung;

use uni_verwaltung;

drop table if exists Zimmer;
create table Zimmer
(
    zimmerNummer int primary key,
    telefonnummer int
);

drop table if exists Kurs;
create table Kurs
(
    kursNummer varchar(45) primary key,
    kursName VARCHAR(45)
);

drop table if exists Students;
create table Students
(
    studentsID int primary key,
    vorname varchar(45),
    nachname varchar(45),
    geburtsdatum date,
    zimmerNummer int,
    foreign key (zimmerNummer) references Zimmer(zimmerNummer)
);

drop table if exists kursbelegung;
create table kursbelegung
(
    studentsID int,
    kursNummer varchar(45),
    semester varchar(45),
    note int,
    foreign key (studentsID) references students(studentsID),
    foreign key (kursNummer) references kurs(kursNummer)
);

insert into Zimmer (zimmerNummer, telefonnummer)
values (12, 12345678),
       (13, 098765);
select * from zimmer;

insert into Kurs(kursNummer, kursName)
values ('Mat122', 'Zählen bis 10'),
       ('Phy120', 'Grundlagen der Schwerkraft'),
       ('Wiw330', 'Geldausgeben ganz leicht'),
       ('Mat130', 'Rechnen mit Fingern'),
       ('Phy230', 'Schweben für Anfänger'),
       ('Mat120', 'Zählen bis 3');
select * from Kurs;

insert into students (studentsID, nachname, vorname, geburtsdatum, zimmerNummer)
values (3215, 'Jonas', 'Mike', '1991.02.23', 12),
       (3456, 'Klaus', 'Schmidt', '1990-03-05', 13),
       (4576, 'Paul', 'Neider', '1989-07-17', 12),
       (1111, 'Lisa', 'Müller', '1990-12-01', 13);
