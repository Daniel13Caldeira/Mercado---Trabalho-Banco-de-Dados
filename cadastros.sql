/*cadastro cliente com endereço*/
INSERT INTO public.endereco
	(uf, cidade, bairro, rua, numero, cep)
	VALUES (?, ?, ?, ?, ?, ?);
INSERT INTO public.pessoa
	(cpf, nome, senha, endereco)
	VALUES (?,?,?,?);
INSERT INTO public.cliente
	(cpf)
	VALUES (?);

/*cadastro cliente SEM endereço*/
INSERT INTO public.pessoa
	(cpf, nome, senha)
	VALUES (?,?,?);
INSERT INTO public.cliente
	(cpf)
	VALUES (?);
	
/*cadastro funcionario/gerente com endereço*/
INSERT INTO public.endereco
	(uf, cidade, bairro, rua, numero, cep)
	VALUES (?, ?, ?, ?, ?, ?);
INSERT INTO public.pessoa
	(cpf, nome, senha, endereco)
	VALUES (?,?,?,?);
INSERT INTO public.funcionario
	(cpf, cargo)
	VALUES (?,?);

/*cadastro funcionario/gerente sem endereço*/
INSERT INTO public.pessoa
	(cpf, nome, senha)
	VALUES (?,?,?);
INSERT INTO public.funcionario
	(cpf, cargo)
	VALUES (?,?);
	
/*cadastro entregador com endereço*/
INSERT INTO public.endereco
	(uf, cidade, bairro, rua, numero, cep)
	VALUES (?, ?, ?, ?, ?, ?);
INSERT INTO public.pessoa
	(cpf, nome, senha, endereco)
	VALUES (?,?,?,?);
INSERT INTO public.funcionario
	(cpf, cargo)
	VALUES (?,?);
INSERT INTO public.entregador
	(placaveiculo, id)
	VALUES (?,?);

/*cadastro entregador sem endereço*/
INSERT INTO public.pessoa
	(cpf, nome, senha)
	VALUES (?,?,?);
INSERT INTO public.funcionario
	(cpf, cargo)
	VALUES (?,?);
INSERT INTO public.entregador
	(placaveiculo, id)
	VALUES (?,?);
	
/*cadastro fornecedor*/
INSERT INTO public.fornecedor
	(cnpj, nome)
	VALUES (?,?);
	
/*cadastro produto outros*/
INSERT INTO public.produto
	(fornecedor,preco,nome)
	VALUES (?,?,?);
INSERT INTO public.produtooutro
	(id)
	VALUES (?);
	
/*cadastro produto perecível*/
INSERT INTO public.produto
	(fornecedor,preco,nome)
	VALUES (?,?,?);
INSERT INTO public.produtoperecivel
	(id, validade)
	VALUES (?,?);
	
/*cadastro remedio*/
INSERT INTO public.produto
	(fornecedor,preco,nome)
	VALUES (?,?,?);
INSERT INTO public.remedio
	(id, precisareceita, validade)
	VALUES (?,?,?);

/*cadastro vestuario*/
INSERT INTO public.produto
	(fornecedor,preco,nome)
	VALUES (?,?,?);
INSERT INTO public.vestuario
	(id, tamanho)
	VALUES (?,?);
	
/*cadastro receita*/
INSERT INTO public.receita
	(cliente,remedio,quantidade)
	VALUES (?,?,?);