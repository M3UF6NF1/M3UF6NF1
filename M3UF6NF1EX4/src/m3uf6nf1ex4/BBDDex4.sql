CREATE TABLE estudiant
(
nom varchar(15),
dni varchar(9) PRIMARY KEY,
adreça varchar(30)
);

CREATE TABLE professor
(
nom varchar(15),
dni varchar(9) PRIMARY KEY,
departament varchar(20)
);

CREATE TABLE assignatura
(
nom varchar(30) PRIMARY KEY,
credits int,
descipció varchar(50),
dni_professor varchar(9),
FOREIGN KEY (dni_professor) 
        REFERENCES professor(dni)
);

CREATE TABLE estudiantAssignatura
(
nom varchar(30),
dni varchar(9),
departament varchar(20),
PRIMARY KEY(nom, dni),
FOREIGN KEY (nom) 
        REFERENCES assignatura(nom),
FOREIGN KEY (dni) 
        REFERENCES estudiant(dni)
);

INSERT INTO professor values
('Anna','12345677','Informatic');
INSERT INTO professor values
('Maria','12345677M','Angles'),
('Toni','12345677T','Castella'),
('Pep','12345677P','Catala');

Insert into assignatura values
('Catala', 6, 'LlenguaCatalana', '12345677'),
('Catala2', 6, 'FilologiaCatalana', '12345677'),
('Angles', 6, 'LlenguaAnglesa', '12345677P');
