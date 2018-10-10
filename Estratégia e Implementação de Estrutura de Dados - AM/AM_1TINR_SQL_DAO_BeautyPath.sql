/* Colocar todas as colunas na instrução do select */

-- Agendamento

insert into rm79935.agendamento(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) values (SEQ_AGENDAMENTO.NEXTVAL, ?, ?, ?, ?, ?, ? );

-- Catalogo

insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL, ?);
delete from rm79935.catalogo where COD_CAT = ?;
SELECT COD_CAT, DESC_CAT FROM RM79935.CATALOGO;

-- Cliente

insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, ?, ?, ?, ?);
delete from rm79935.cliente where COD_CLI = ?;
SELECT COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI FROM RM79935.CLIENTE;

-- Endereço

insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL, ?, ?, ?, ?);
delete from rm79935.endereco where COD_END = ?;
SELECT COD_END, LOGRADOURO, CIDADE, CEP, ESTADO FROM RM79935.ENDERECO;

-- Profissional

insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, ?, ?, ?, ?, ? );
delete from rm79935.profissional where COD_PROF = ?;
SELECT COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF FROM RM79935.PROFISSIONAL;