insert into Persona (id, codiceFiscale, nome, cognome, eta, regione, sesso) values (1, 'AAA', 'Mario', 'Rossi', 18, 'Basilicata', 'Maschio');

insert into Associazione (id, codice, nome, anno) values (1, '012A', 'Avis pz', 1990);

insert into Iscrizione (id, "data", associazione_id , persona_id) values (1, '01-01-2022', 1, 1);

insert into hibernate_sequences (sequence_name, sequence_next_hi_value) values ('Persona', 1);
insert into hibernate_sequences (sequence_name, sequence_next_hi_value) values ('Associazione', 1);
insert into hibernate_sequences (sequence_name, sequence_next_hi_value) values ('Iscrizione', 1);
