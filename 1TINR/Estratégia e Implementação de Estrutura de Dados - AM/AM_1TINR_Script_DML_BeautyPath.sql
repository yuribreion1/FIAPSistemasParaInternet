-- Limpeza das tabelas

DELETE RM79935.AGENDAMENTO;
DELETE RM79935.AGENDAMENTO_SERVICO;
DELETE RM79935.CATALOGO;
DELETE RM79935.CLIENTE;
DELETE RM79935.ENDERECO;
DELETE RM79935.PROFISSIONAL;
DELETE RM79935.SERVICO;

---------------------------- 
--    Script de carga     --
---------------------------- 

-- Tabela catalogo

insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'unha');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'unha decorada');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'massagem');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'depilação');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'corte feminino');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'corte masculino');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'coloração');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'escola');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'progressiva');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'terapia capilar');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'dia da noiva');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'spa para pés');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'spa capilar');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'auriculoterapia');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'barbearia');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'pedicure');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'cilios tintura');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'sombrancelhas');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'sombrancelhas design');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'sombrancelhas henna');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'maquiagem');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'cauterização');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'chapinha');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'corte franja');
insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL,'coloração sem amonia');

-- Tabela cliente

insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'ALESSANDRA ALVES CARVALHO',234214,'ALESS@FIAP.COM.BR','@ALESSA');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'CLEIDE QUEIROZ SILVA',234214,'CLEID@FIAP.COM.BR','@CLEIDE');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'CLEONICE BENTO',234214,'CLEON@FIAP.COM.BR','@CLEONI');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'DARCI MELO DA SILVA',234214,'DARCI@FIAP.COM.BR','@DARCI ');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'ELENIR ARCANJO DOS SANTOS',234214,'ELENI@FIAP.COM.BR','@ELENIR');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'ELIS REGINA DE SOUZA',234214,'ELIS @FIAP.COM.BR','@ELIS R');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'ELISANGELA SILVEIRA PEREIRA',234214,'ELISA@FIAP.COM.BR','@ELISAN');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'FERNANDA DOS ANJOS VERA',234214,'FERNA@FIAP.COM.BR','@FERNAN');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'GISLENE DE SOUZA MOURA',234214,'GISLE@FIAP.COM.BR','@GISLEN');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'JUCELAINE MARINHO DOS SANTOS ',234214,'JUCEL@FIAP.COM.BR','@JUCELA');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'LIDIANE LIMA DOS SANTOS',234214,'LIDIA@FIAP.COM.BR','@LIDIAN');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'LIDIONOR GUTIERRI SANTOS ',234214,'LIDIO@FIAP.COM.BR','@LIDION');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'LIZANDRA ROBERTA ',234214,'LIZAN@FIAP.COM.BR','@LIZAND');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'MARIA ELIANE CONCEIÇÃO VIEIRA',234214,'MARIA@FIAP.COM.BR','@MARIA ');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'MARIA EVA NUNES DE OLIVEIRA',234214,'MARIA@FIAP.COM.BR','@MARIA ');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'MARIA JOSENILDA DA CONCEIÇÃO',234214,'MARIA@FIAP.COM.BR','@MARIA ');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'MARINETE ROCHA SAMPAIO',234214,'MARIN@FIAP.COM.BR','@MARINE');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'PATRICIA LIMA SARAIVA ',234214,'PATRI@FIAP.COM.BR','@PATRIC');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'REGINA OLIVEIRA DOS SANTOS',234214,'REGIN@FIAP.COM.BR','@REGINA');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'ROSANA LOPES',234214,'ROSAN@FIAP.COM.BR','@ROSANA');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'RUTE DE SOUZA BAMBIL PEREIRA ',234214,'RUTE @FIAP.COM.BR','@RUTE D');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'SHIRLEI DE OLIVEIRA',234214,'SHIRL@FIAP.COM.BR','@SHIRLE');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'SUELY RODRIGUES DE MELO',234214,'SUELY@FIAP.COM.BR','@SUELY ');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'TANIA CRISTINA BARRIOS BUENO',234214,'TANIA@FIAP.COM.BR','@TANIA ');
insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, 'VANIA PEREIRA DOS SANTOS',234214,'VANIA@FIAP.COM.BR','@VANIA ');

-- Tabela endereço

insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AVENIDA JORGE TEIXEIRA, 3909 CENTRO','Alta Floresta DOeste','78956-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA PORTO VELHO, 1340 CENTRO (ALTOS DA FARMÁCIA BURITIS 2)','Alto Alegre dos Parecis','78931-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AVENIDA CONDOR, 2588','Alto Paraíso','78948-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AVENIDA MARECHAL CÂNDIDO RONDON, S/N.','Alvorada DOeste','78965-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'PRAÇA DOS PIONEIROS','Ariquemes','78944-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AV. BRASIL, 2237 - CENTRO. ANEXO AO PRÉDIO DA SEMSAU','Buritis','78949-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA CAPITÃO SILVIO GONÇALVES DE FARIAS, 4529(PRÉDIO DA BIBLIOTECA MUNICIPAL)','Cabixi','78950-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA: 13 DE FEVEREIRO, 1947 SETOR 4','Cacaulândia','78959-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA: MANAUS, S/N (PRÉDIO DA S. DA AGRICULTURA)','Cacoal','78970-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AV LAGO AZUL.1376','Campo Novo de Rondônia','68533-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA CORONEL TANCREDO 670','Candeias do Jamari','68380-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AV . DOMINGOS PERIM, 234, ED. DEOLINDO PERIM, S/304-CENTRO','Castanheiras','29375-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA ELIZEU DIVINO, 165 -1º ANDAR ','Cerejeiras','29800-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,' AV. 10 DE ABRIL, S/N- CENTRO ','Chupinguaia','29730-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA PICHARA BRANDÃO SYLI, 154','Colorado do Oeste','29750-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'R. DR, IVAN LUIS BARCELOS, S/N ','Corumbiara','29780-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AV. PRESIDENTE VARGAS, 157','Costa Marques','29680-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'LADEIRA VIRGÍLIO LAMBERT ','Cujubim','29650-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA AUGUSTA G. GARDELOTO, 118 CAMARA MUNICIPAL','Espigão DOeste','14350-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AVENIDA NOVE DE JULHO, 298 -  CENTRO CULTURAL – CENTRO','Governador Jorge Teixeira','14300-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'AVENIDA CORIPHEU DE AZEVEDO MARQUES, 996 – ESPLANADA – CENTRO CULTURAL','Guajará-Mirim','14340-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA BARÃO DO RIO BRANCO, 238 - CENTRO','Itapuã do Oeste','14240-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA ARTUR LOPES OLIVEIRA, 567 - RIACHUELO','Jaru','14260-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA FLORIANO PEIXOTO, 1918 - CENTRO','Ji-Paraná','14390-000','RO');
insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL,'RUA SAMPAIO MOREIRA, 782 - CENTRO','Machadinho DOeste','13825 000','RO');

-- Tabela serviço

INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (1,5,100,'unha',1);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (2,6,101,'unha decorada',2);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (3,7,102,'massagem',3);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (4,8,103,'depilação',4);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (5,9,104,'corte feminino',5);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (6,10,105,'corte masculino',6);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (7,11,106,'coloração',7);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (8,12,107,'escola',8);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (9,13,108,'progressiva',9);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (10,14,109,'terapia capilar',10);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (11,15,110,'dia da noiva',11);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (12,16,111,'spa para pés',12);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (13,17,112,'spa capilar',13);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (14,18,113,'auriculoterapia',14);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (15,19,114,'barbearia',15);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (16,20,115,'pedicure',16);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (17,21,116,'cilios tintura',17);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (18,22,117,'sombrancelhas',18);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (19,23,118,'sombrancelhas design',19);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (20,24,119,'sombrancelhas henna',20);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (21,25,120,'maquiagem',21);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (22,26,121,'cauterização',22);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (23,27,122,'chapinha',23);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (24,28,123,'corte franja',24);
INSERT INTO RM79935.SERVICO(COD_SRV, QNT_SRV, VALOR_SRV, DESC_SRV, COD_CAT) VALUES (25,29,124,'coloração sem amonia',25);

-- Tabela profissional

insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'RENATO DE SOUZA','923457822','RA-4234','@RENAT','@RENAT1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'PAULO FERNANDO','923457822','RA-234','@PAULO','@PAULO1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'ERICA MATOS','923457822','RA-8768','@ERICA','@ERICA1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'FABIOLA DE PAULA','923457822','RA-543534','@FABIO','@FABIO1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'BARBARA BOA MORTE','923457822','RA-8768','@BARBA','@BARBA1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'GIOVANA OLIVEIRA','923457822','RA-8768','@GIOVA','@GIOVA1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'PASCOAL DOS ANJO','923457822','RA-8768','@PASCO','@PASCO1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'ANTONIETA DA MATA','923457822','RA-8768','@ANTON','@ANTON1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'MARCELO PAES','923457822','RA-8768','@MARCE','@MARCE1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'MARA REGINA','923457822','RA-8768','@MARA ','@MARA 1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'EDMILSON DOS SANTOS FELIZ','923457822','RA-73463','@EDMIL','@EDMIL1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'RICARDO DA SILVA PEDROSO','923745823','RA-65463','@RICAR','@RICAR1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'RAFAEL PENA','872836492','RA-34523','@RAFAE','@RAFAE1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'BRUNA SERVANTES','238496298','RA-2341','@BRUNA','@BRUNA1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'ANDRE MOTA RIBEIRO','78236978','RA-5345','@ANDRE','@ANDRE1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'CAROLINA DA PAZ','86759760','RA-9585','@CAROL','@CAROL1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'GABRIEL REGINO DE SOUZA','523845794','RA-59435','@GABRI','@GABRI1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'ALBERTO ROBERTO','52374965','RA-5492','@ALBER','@ALBER1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'MARIA DE OLIVEIRA SANTOS','589374053','RA-O34U','@MARIA','@MARIA1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'ROBERIO ESTRELA','12374861','RA-23424','@ROBER','@ROBER1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'PABLO JAVIER LEMOS','2348623','RA-68594','@PABLO','@PABLO1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'LUCIANO AUGUSTO ','658975092','RA-43248','@LUCIA','@LUCIA1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'FABIO ABBUD SANTOS','67575675','RA-R234','@FABIO','@FABIO1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'MARCELA RENATA DA MOTA','52345234','RA-45634','@MARCE','@MARCE1');
insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, 'HUMBERTO LASANHA','786786776','RA-89423','@HUMBE','@HUMBE1');

-- Tabela agendamento

INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (1,'20181001','1500',1,1,'PROXIMO AO POSTO IPIRANGA',1);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (2,'20181002','1501',2,2,'PROXIMO AO POSTO IPIRANGA',2);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (3,'20181003','1502',3,3,'PROXIMO AO POSTO IPIRANGA',3);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (4,'20181004','1503',4,4,'PROXIMO AO POSTO IPIRANGA',4);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (5,'20181005','1504',5,5,'PROXIMO AO POSTO IPIRANGA',5);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (6,'20181006','1505',6,6,'PROXIMO AO POSTO IPIRANGA',6);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (7,'20181007','1506',7,7,'PROXIMO AO POSTO IPIRANGA',7);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (8,'20181008','1507',8,8,'PROXIMO AO POSTO IPIRANGA',8);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (9,'20181009','1508',9,9,'PROXIMO AO POSTO IPIRANGA',9);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (10,'20181010','1509',10,10,'PROXIMO AO POSTO IPIRANGA',10);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (11,'20181011','1510',11,11,'PROXIMO AO POSTO IPIRANGA',11);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (12,'20181012','1511',12,12,'PROXIMO AO POSTO IPIRANGA',12);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (13,'20181013','1512',13,13,'PROXIMO AO POSTO IPIRANGA',13);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (14,'20181014','1513',14,14,'PROXIMO AO POSTO IPIRANGA',14);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (15,'20181015','1514',15,15,'PROXIMO AO POSTO IPIRANGA',15);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (16,'20181016','1515',16,16,'PROXIMO AO POSTO IPIRANGA',16);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (17,'20181017','1516',17,17,'PROXIMO AO POSTO IPIRANGA',17);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (18,'20181018','1517',18,18,'PROXIMO AO POSTO IPIRANGA',18);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (19,'20181019','1518',19,19,'PROXIMO AO POSTO IPIRANGA',19);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (20,'20181020','1519',20,20,'PROXIMO AO POSTO IPIRANGA',20);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (21,'20181021','1520',21,21,'PROXIMO AO POSTO IPIRANGA',21);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (22,'20181022','1521',22,22,'PROXIMO AO POSTO IPIRANGA',22);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (23,'20181023','1522',23,23,'PROXIMO AO POSTO IPIRANGA',23);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (24,'20181024','1523',24,24,'PROXIMO AO POSTO IPIRANGA',24);
INSERT INTO RM79935.AGENDAMENTO(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) VALUES (25,'20181025','1524',25,25,'PROXIMO AO POSTO IPIRANGA',25);

-- Tabela Agendamento/Servico

INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (1,1,1,1);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (2,2,2,2);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (3,3,3,3);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (4,4,4,4);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (5,5,5,5);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (6,6,6,6);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (7,7,7,7);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (8,8,8,8);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (9,9,9,9);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (10,10,10,10);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (11,11,11,11);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (12,12,12,12);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (13,13,13,13);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (14,14,14,14);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (15,15,15,15);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (16,16,16,16);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (17,17,17,17);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (18,18,18,18);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (19,19,19,19);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (20,20,20,20);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (21,21,21,21);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (22,22,22,22);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (23,23,23,23);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (24,24,24,24);
INSERT INTO RM79935.AGENDAMENTO_SERVICO(COD_SRV, COD_CAT, COD_AGD, COD_CLI) VALUES (25,25,25,25);

COMMIT;