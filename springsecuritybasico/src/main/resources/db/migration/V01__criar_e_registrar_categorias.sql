CREATE TABLE categoria (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (nome) values ('LAZER');
INSERT INTO categoria (nome) values ('ALIMENTACAO');
INSERT INTO categoria (nome) values ('SUPERMERCADO');
INSERT INTO categoria (nome) values ('FARMACIA');
INSERT INTO categoria (nome) values ('OUTROS');
INSERT INTO categoria (nome) values ('COMBUSTIVEL CARRO');
INSERT INTO categoria (nome) values ('COMBUSTIVEL MOTO');