---Cadastrar os dados do usuário.

	INSERT INTO T_USUARIO (nm_usuario, ds_email, dt_nascimento, senha, nmr_celular ,cpf_usuario)
VALUES ('Maria Joaquina da Silva', 'maria_joaq@gmail.com', TO_DATE('27/10/1995','DD/MM/YYYY'), 'maria1027', 11965578443, '39675434802');
	
	INSERT INTO T_USUARIO (nm_usuario, ds_email, dt_nascimento, senha, nmr_celular ,cpf_usuario)
VALUES ('Jõao de Almeida', 'joao@gmail.com', TO_DATE('24/01/1970','DD/MM/YYYY'), 'joao0124', 11965367843, '39679548802');
	
	INSERT INTO T_USUARIO (nm_usuario, ds_email, dt_nascimento, senha, nmr_celular ,cpf_usuario)
VALUES ('Luiz Eduardo Campos', 'luizinho_bonitinho@gmail.com', TO_DATE('24/03/1983','DD/MM/YYYY'), 'senhasecreta0324', 21987765449, '24335678901')

--- Alterar todos os dados do usuário, utilizando seu código como referência
UPDATE T_USUARIO
SET NM_USUARIO = 'Maria Joaquina Santos', DS_EMAIL = 'm_joaquina@gmail.com', DT_NASCIMENTO = TO_DATE('26/10/1995','DD/MM/YYYY'), SENHA= 'majo1027', NMR_CELULAR = 11975459221, CPF_USUARIO = '39675434803'
WHERE ID_USUARIO = 1


---Cadastrar os dados da conta do usuário

INSERT INTO T_CONTA (ID_USUARIO, NMR_BANCO, NMR_AGENCIA, NMR_CONTA, NM_BANCO, DS_CONTA, TP_CONTA, OBJ_CONTA)
VALUES (1, '260', '001', '10123456-7', 'NUBANK', 'Conta Corrente', 'Bancária', 'Receber Salário')

INSERT INTO T_CONTA (ID_USUARIO, DS_CONTA, TP_CONTA, OBJ_CONTA)
VALUES (2, 'Poupança de colchão', 'Carteira', 'Comprar um celular')


---Cadastrar as receitas do usuário.
INSERT INTO T_RECEITA (ds_receita, vlr_receita, dt_receita, tp_receita, vlr_total_receita, id_usuario)
VALUES ('Salário', 4000, TO_DATE('05/10/2022','DD/MM/YYYY'), 'FIXA', 4000, 1)

INSERT INTO T_RECEITA (ds_receita, vlr_receita, dt_receita, tp_receita, vlr_total_receita, id_usuario)
VALUES ('Aluguel', 2500, TO_DATE('10/10/2022','DD/MM/YYYY'), 'FIXA', 2500, 2);

INSERT INTO T_RECEITA (ds_receita, vlr_receita, dt_receita, tp_receita, vlr_total_receita, id_usuario)
VALUES ('VENDAS', 200, TO_DATE('13/10/2022','DD/MM/YYYY'), 'VARIÁVEL', 200, 3)


---Alterar todos os dados das receitas do usuário, utilizando o código como referência.
UPDATE T_RECEITA
SET DS_RECEITA= 'VENDA DE CALÇA', VLR_RECEITA = 250, DT_RECEITA= TO_DATE('11/10/2022','DD/MM/YYYY'), TP_RECEITA= 'INESPERADA'
WHERE ID_RECEITA = 6

---Cadastrar as despesas do usuário

INSERT INTO T_DESPESA (DS_DESPESA, VLR_DESPESA, DT_DESPESA, TP_DESPESA, ID_USUARIO)
VALUES ('FINANCIAMENTO CASA', 3750.80, TO_DATE('06/10/2022','DD/MM/YYYY'), 'FIXA', 1)

INSERT INTO T_DESPESA (DS_DESPESA, VLR_DESPESA, DT_DESPESA, TP_DESPESA, ID_USUARIO)
VALUES ('SHOW', 580, TO_DATE('10/10/2022','DD/MM/YYYY'), 'LAZER', 1);

INSERT INTO T_DESPESA (DS_DESPESA, VLR_DESPESA, DT_DESPESA, TP_DESPESA, ID_USUARIO)
VALUES ('JANTAR', 150, TO_DATE('13/10/2022','DD/MM/YYYY'), 'ALIMENTAÇÃO', 1);

INSERT INTO T_DESPESA (DS_DESPESA, VLR_DESPESA, DT_DESPESA, TP_DESPESA, ID_USUARIO)
VALUES ('LIVRO', 30, TO_DATE('14/10/2022','DD/MM/YYYY'), 'LAZER', 1);

INSERT INTO T_DESPESA (DS_DESPESA, VLR_DESPESA, DT_DESPESA, TP_DESPESA, ID_USUARIO)
VALUES ('ALMOÇO', 50, TO_DATE('01/10/2022','DD/MM/YYYY'), 'VARIAVEL', 2)

INSERT INTO T_DESPESA (DS_DESPESA, VLR_DESPESA, DT_DESPESA, TP_DESPESA, ID_USUARIO)
VALUES ('CALÇADO', 400, TO_DATE('25/09/2022','DD/MM/YYYY'), 'VARIAVEL', 3)

---Alterar todos os dados das despesas do usuário, utilizando o código como referência
UPDATE T_DESPESA
SET DS_DESPESA= 'CALÇADO ALL STAR', VLR_DESPESA = 260, DT_DESPESA= TO_DATE('10/10/2022','DD/MM/YYYY'), TP_DESPESA= 'VESTUÁRIO'
WHERE ID_DESPESA = 3


---Cadastrar os dados para investimentos.
INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO)
VALUES ('POUPANÇA', 18000, TO_DATE('12/10/2022','DD/MM/YYYY'), 1)

INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO, DT_VENCIMENTO)
VALUES ('RENDA FIXA', 80000, TO_DATE('05/06/2010','DD/MM/YYYY'), 2, TO_DATE('05/06/2025'))

INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO, DT_VENCIMENTO)
VALUES ('TESOURO DIRETO', 36000, TO_DATE('05/12/2018','DD/MM/YYYY'), 2, TO_DATE('05/12/2022'))

INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO, DT_VENCIMENTO)
VALUES ('TESOURO DIRETO', 14000, TO_DATE('30/12/2018','DD/MM/YYYY'), 2, TO_DATE('05/12/2022'));

INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO)
VALUES ('POUPANÇA', 1000, TO_DATE('12/04/2020','DD/MM/YYYY'), 1) 

INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO)
VALUES ('POUPANÇA', 1000, TO_DATE('12/04/2020','DD/MM/YYYY'), 2);

INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO, DT_VENCIMENTO)
VALUES ('TESOURO DIRETO', 14000, TO_DATE('30/01/2022','DD/MM/YYYY'), 1, TO_DATE('05/12/2025'));

---Alterar todos os dados para investimentos do usuário, utilizando o código como referência
UPDATE T_INVESTIMENTO
SET DS_INVESTIMENTO= 'POUPANÇA LUCAS', VLR_INVESTIMENTO= 19000, DT_VENCIMENTO= TO_DATE('13/10/2022','DD/MM/YYYY')
WHERE ID_INVESTIMENTO= 1


---Consultar os dados de um usuário (filtrar a partir do seu código)

SELECT *
FROM T_USUARIO, T_DESPESA
WHERE ID_USUARIO = 1


---Consultar os dados de um único registro de despesa de um  usuário (filtrar a partir do código do usuário e do código da despesa).

SELECT 
T_USUARIO.ID_USUARIO USUARIO,
T_USUARIO.NM_USUARIO,
T_DESPESA.DS_DESPESA DESPESA,
T_DESPESA.VLR_DESPESA VALOR,
T_DESPESA.DT_DESPESA DATA

FROM T_DESPESA
INNER JOIN T_USUARIO ON T_USUARIO.ID_USUARIO = T_DESPESA.ID_USUARIO
WHERE T_USUARIO.ID_USUARIO = 1 AND ID_DESPESA = 1


Consultar os dados de todos os registros de despesas de um  usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código).


SELECT 
T_USUARIO.ID_USUARIO USUARIO,
T_USUARIO.NM_USUARIO NOME,
T_DESPESA.DS_DESPESA DESPESA,
T_DESPESA.VLR_DESPESA VALOR,
T_DESPESA.DT_DESPESA DATA

FROM T_DESPESA
INNER JOIN T_USUARIO ON T_USUARIO.ID_USUARIO = T_DESPESA.ID_USUARIO
WHERE T_DESPESA.ID_USUARIO = 1
ORDER BY DATA DESC


---Consultar os dados de um único registro de investimento de um  usuário (filtrar a partir do código do usuário e do código de investimento.


SELECT 
T_USUARIO.ID_USUARIO USUARIO,
T_USUARIO.NM_USUARIO NOME,
T_INVESTIMENTO.DS_INVESTIMENTO INVESTIMENTO,
T_INVESTIMENTO.VLR_INVESTIMENTO VALOR,
T_INVESTIMENTO.DS_INVESTIMENTO DATA

FROM T_INVESTIMENTO
INNER JOIN T_USUARIO ON T_USUARIO.ID_USUARIO = T_INVESTIMENTO.ID_USUARIO
WHERE T_INVESTIMENTO.ID_USUARIO = 1 AND T_USUARIO.ID_USUARIO =1




---Consultar os dados de todos os registros de investimentos de um  usuário, ordenando-os dos registros mais recentes para os mais antigos.

SELECT 
T_USUARIO.ID_USUARIO USUARIO,
T_USUARIO.NM_USUARIO NOME,
T_INVESTIMENTO.DS_INVESTIMENTO INVESTIMENTO,
T_INVESTIMENTO.VLR_INVESTIMENTO VALOR,
T_INVESTIMENTO.DT_INVESTIMENTO DATA,
T_INVESTIMENTO.DT_VENCIMENTO VENCIMENTO


FROM T_INVESTIMENTO
INNER JOIN T_USUARIO ON T_USUARIO.ID_USUARIO = T_INVESTIMENTO.ID_USUARIO
WHERE T_INVESTIMENTO.ID_USUARIO = 1 
ORDER BY DATA ASC 


---Consultar os dados básicos de um usuário, o último investimento registrado e a última despesa registrada 


SELECT 
U.ID_USUARIO ID_USUARIO,
U.NM_USUARIO NOME,
U.DT_NASCIMENTO DT_NASCIMENTO,
T_INVESTIMENTO.DT_INVESTIMENTO ULTIMO_INVESTIMENTO,
T_DESPESA.DT_DESPESA ULTIMA_DESPESA 

FROM T_USUARIO U
INNER JOIN T_INVESTIMENTO ON U.ID_USUARIO = T_INVESTIMENTO.ID_USUARIO
INNER JOIN T_DESPESA ON U.ID_USUARIO = T_DESPESA.ID_USUARIO
WHERE U.ID_USUARIO = 1 
AND T_DESPESA.ID_DESPESA = (
    SELECT ID_DESPESA FROM (SELECT ID_DESPESA FROM T_DESPESA WHERE ID_USUARIO = U.ID_USUARIO ORDER BY DT_DESPESA DESC) WHERE ROWNUM  = 1
)
AND T_INVESTIMENTO.ID_INVESTIMENTO = (
    SELECT ID_INVESTIMENTO FROM (SELECT ID_INVESTIMENTO FROM T_INVESTIMENTO WHERE ID_USUARIO = U.ID_USUARIO ORDER BY DT_INVESTIMENTO DESC) WHERE ROWNUM  = 1
)


