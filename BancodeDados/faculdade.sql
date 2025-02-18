create database faculdade
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_unicode_ci;

USE faculdade;

create table aluno (
IdAluno int NOT NULL,
Matricula varchar(10) NOT NULL,
Nome varchar(50) NOT NULL,
Primary key (IdAluno)
) default charset = utf8mb4;

create table curso (
IdCurso int NOT NULL,
Nome varchar(50) NOT NULL,
primary key (IdCurso)
) default charset = utf8mb4;

create table AlunoCurso (
IdAluno int NOT NULL,
IdCurso int NOT NULL,
AnoEntrada int NOT NULL,
FOREIGN KEY (IdAluno) references Aluno(IdAluno),
foreign key (IdCurso) references Curso(IdCurso)
) default charset = utf8mb4;

create table grade (
IdGrade int NOT NULL,
IdCurso int NOT NULL,
Ano int NOT NULL, 
CargaHorariaTotal int NOT NULL,
primary key (IdGrade),
foreign key (IdCurso) references Curso(IdCurso)
) default charset = utf8mb4;

create table Disciplina (
IdDisciplina int NOT NULL,
Nome varchar(50) NOT NULL,
CargaHoraria int NOT NULL,
primary key (IdDisciplina)
) default charset = utf8mb4;

create table Historico (
IdAluno int NOT NULL,
IdDisciplina int NOT NULL,
Nota float NOT NULL,
DataHistorico date NOT NULL,
Foreign key (IdAluno) references Aluno(IdAluno),
Foreign key (IdDisciplina) references Disciplina(IdDisciplina)
) default charset = utf8mb4;

create table GradeDisciplina (
IdGrade int NOT NULL,
IdDisciplina int NOT NULL,
foreign key (IdGrade) references Grade(IdGrade),
foreign key (IdDisciplina) references Disciplina(IdDisciplina)
) default charset = utf8mb4;