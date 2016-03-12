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
deprtament varchar(20)
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
deprtament varchar(20),
PRIMARY KEY(nom, dni),
FOREIGN KEY (nom) 
        REFERENCES assignatura(nom),
FOREIGN KEY (dni) 
        REFERENCES estudiant(dni)
);
