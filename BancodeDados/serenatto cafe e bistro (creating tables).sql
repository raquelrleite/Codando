CREATE DATABASE Serenatto
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_unicode_ci;
USE Serenatto;

create table Produtos (
	Id int primary key,
	Nome varchar(255),
	Descricao varchar(255),
	Preco decimal(10,2),
	Categoria varchar(50)
);

create table Clientes (
	Id int primary key,
	Nome varchar(255),
	Telefone varchar(20),
	Email varchar(100) default 'Sem email',
	Endereco varchar(255)
);

create table Pedidos (
	Id int primary key,
	Id_Cliente int,
	DataHoraPedido DATETIME,
	Satus varchar(50),
	foreign key (Id_Cliente) REFERENCES Clientes(Id) on delete cascade
);

create table ItensPedido (
	Id_Pedido int,
	Id_Produto int,
	Quantidade integer,
	PrecoUnitario decimal (10,2),
    primary key (Id_Pedido, Id_Produto),
    foreign key (Id_Pedido) REFERENCES Pedidos(Id) on delete cascade,
    foreign key (Id_Produto) REFERENCES Produtos(Id) on delete cascade
);

create table Colaboradores (
	Id int primary key,
	Nome varchar(255) NOT NULL,
	Cargo varchar(100),
	DataContratacao DATE,
	Telefone Varchar(20),
	Email Varchar(100),
    Rua Varchar(100) NOT null,
    Bairro Varchar(100) NOT NULL,
    Cidade Varchar(100) NOT NULL,
    Estado char(2) NOT NULL,
    Cep Varchar(8) NOT NULL
);

create table Fornecedores (
	Id int primary key,
	Nome varchar(255) NOT NULL,
	Contato varchar(100) NOT NULL,
	Telefone Varchar(20),
	Email Varchar(100),
    Rua Varchar(100) NOT null,
    Bairro Varchar(100) NOT NULL,
    Cidade Varchar(100) NOT NULL,
    Estado char(2) NOT NULL,
    Cep Varchar(8) NOT NULL
);