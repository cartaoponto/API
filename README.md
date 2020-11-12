# API
<h1>Cartão Ponto - API</h1>
<pre>
Rodar o script abaixo para criar as tabelas e popular o banco:
CREATE TABLE cartaoponto.usuario(
	ID_USUARIO INT NOT NULL AUTO_INCREMENT PRIMARY KEY
    , NOME_USUARIO VARCHAR(200) NOT NULL
    , CD_SENHA VARCHAR(255) NOT NULL
    , CD_GRUPO INT NULL
    , FL_ATIVO BIT NOT NULL DEFAULT 1
	, DH_INSERT DATETIME DEFAULT CURRENT_TIMESTAMP
    , DH_UPDATE DATETIME NULL
);

CREATE TABLE cartaoponto.grupo(
	ID_GRUPO INT NOT NULL AUTO_INCREMENT PRIMARY KEY
    , NM_GRUPO VARCHAR(200) NOT NULL
    , FL_ATIVO BIT NOT NULL DEFAULT 1
    , DH_INSERT DATETIME DEFAULT CURRENT_TIMESTAMP
    , DH_UPDATE DATETIME NULL
);

INSERT INTO cartaoponto.usuario(NOME_USUARIO, CD_SENHA, CD_GRUPO, FL_ATIVO)
VALUES
('Nicolas', '123456', 1, 1)
, ('Joao', '123456', 2, 1)
, ('Maria', '123456', 3, 0);

Rota de usuários:
Lista todos usuários - http://localhost:8090/usuarios
Lista um usuário específico - http://localhost:8090/usuarios/1
</pre>
