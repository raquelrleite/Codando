CREATE DATABASE aviao
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_unicode_ci;

USE aviao;

create table Voo (
IDVoo int auto_increment,
NumeroAviao int NOT NULL,
CidadeOrigem varchar(50) NOT NULL,
CidadeDestino varchar(50) NOT NULL,
DataVoo date,
HoraVoo time,
primary key (IDVoo)
) DEFAULT CHARSET = utf8mb4;

create table Assento (
IdAssento int auto_increment,
Qtd_Assento int,
primary key (IdAssento)
) DEFAULT CHARSET = utf8mb4;

create table Passageiro (
CPF varchar(11),
Nome varchar(50) NOT NULL,
Telefone varchar(11),
Email varchar(100),
Rua varchar(100),
Numero int,
Complemento varchar(50),
Bairro varchar(50),
CEP varchar(8),
Cidade VARCHAR(50),
Estado VARCHAR(2),
primary key (CPF)
) DEFAULT CHARSET = utf8mb4;

create table Dependente (
Nome varchar(50),
DataNascimento date,
CPF_Passageiro varchar(11),
FOREIGN KEY (CPF_Passageiro) REFERENCES Passageiro(CPF)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE Reserva (
    DataReserva DATE,
    HoraReserva TIME,
    IDVoo INT,
    CPF_Passageiro varchar(11),
    FOREIGN KEY (IDVoo) REFERENCES Voo(IDVoo),
    FOREIGN KEY (CPF_Passageiro) REFERENCES Passageiro(CPF)
    ) DEFAULT CHARSET = utf8mb4;

INSERT INTO passageiro VALUES
('47938780839', 'Raquel Rodrigues Leite', '11983865877', 'raquelrleite@outlook.com', 'Rua Alberto Flores', '36', 'Casa 1', 'Vila Nhocuné', '035558000', 'São Paulo', 'SP');

select * from passageiro;
