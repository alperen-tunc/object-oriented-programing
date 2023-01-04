use r3;

select * from person left join personal_ausweis pa on person.ID = pa.PERSON_ID;

drop view if exists personViewWithAusweisdaten;

create view personViewWithAusweisdaten as
    select person.ID, person.VORNAME, person.NACHNAME, person.GEBURTSDATUM, personal_ausweis.NUMMER, personal_ausweis.GÜLTIG
    from person left join personal_ausweis on person.ID = personal_ausweis.PERSON_ID
    order by person.ID, personal_ausweis.NUMMER ;

select * from personViewWithAusweisdaten;




