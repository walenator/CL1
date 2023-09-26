-- -------------------------------------- --
-- Base de datos :cibertec2023
-- Autor : Jose Quintana 
-- Fecha : 25 - Septiembre -2023
-- ----------------------------------------- --

use cibertec2023;

drop table if exists Empleado;

create table Empleado(
	IdEmpleado int not null,
    Apellidos varchar(50) not null,
    Nombres varchar(50) not null,
    Edad smallint not null,
	check (Edad >= 18),
	sexo char(1) not null,
    salario int not null,
	check (salario >= 1500 <=2500)
);

insert into Empleado
values('1','Torres','Jose','22','M','1500'),
('2','Garcia','Maria','21','F','1750'),
('3','Flores','Juan','22','M','1850'),
('4','Casas','Ana','23','F','2000');

select * from Empleado;

