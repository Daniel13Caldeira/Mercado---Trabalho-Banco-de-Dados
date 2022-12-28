CREATE table if not exists endereco(
	id serial primary key,
	uf varchar(2) not null,
	cidade varchar(50) not null,
	bairro varchar(50) not null,
	rua varchar(50) not null,
	numero varchar(10) not null,
	cep varchar(8) not null
);

create table if not exists pessoa(
	cpf varchar(11) primary key,
	nome varchar(50) not null,
	senha varchar(20) not null,
	endereco integer,
	FOREIGN KEY (endereco) REFERENCES public.endereco (id)
);

CREATE table if not exists cliente(
	cpf varchar(11) primary key,
	conta real not null default 0,
	FOREIGN KEY (cpf) REFERENCES public.pessoa (cpf)
);

CREATE table if not exists fornecedor(
	cnpj varchar(13) primary key,
	nome varchar(50) not null
);

CREATE table if not exists funcionario(
	id serial primary key,
	cpf varchar(11) unique not null,
	cargo varchar(11),
	FOREIGN KEY (cpf) REFERENCES public.pessoa (cpf)
);

create table if not exists entregador(
	placaVeiculo varchar(7) unique not null,
	id integer primary key,
	FOREIGN KEY (id) REFERENCES public.funcionario (id)
);

create table if not exists produto(
	id serial primary key,
	fornecedor varchar(13) not null,
	preco real not null,
	nome varchar(50) not null,
	FOREIGN KEY (fornecedor) REFERENCES public.fornecedor (cnpj)
);

create table if not exists vestuario(
	id integer primary key,
	tamanho varchar(5),
	FOREIGN KEY (id) REFERENCES public.produto (id)
);

create table if not exists remedio(
	id integer primary key,
	precisaReceita bool not null,
	validade varchar(10) not null,
	FOREIGN KEY (id) REFERENCES public.produto (id)
);

create table if not exists produtoPerecivel(
	id integer primary key,
	validade varchar(10) not null,
	FOREIGN KEY (id) REFERENCES public.produto (id)
);

create table if not exists produtoOutro(
	id integer primary key,
	FOREIGN KEY (id) REFERENCES public.produto (id)
);

create table if not exists receita(
	id serial primary key,
	cliente varchar(11) not null,
	remedio integer not null,
	quantidade integer not null,
	FOREIGN KEY (cliente) REFERENCES public.cliente (cpf),
	FOREIGN KEY (remedio) REFERENCES public.remedio (id)
);

create table if not exists carrinho(
	cliente varchar(11) not null,
	produto integer not null,
	quantidade real not null,
	FOREIGN KEY (cliente) REFERENCES public.cliente (cpf),
	FOREIGN KEY (produto) REFERENCES public.produto (id),
	CONSTRAINT PK_carrinho PRIMARY KEY (cliente, produto)
);

create table if not exists pedido(
	id serial primary key,
	cliente varchar(11) not null,
	FOREIGN KEY (cliente) REFERENCES public.cliente (cpf)
);

create table if not exists pedidoDelivery(
	id integer primary key,
	entregador integer not null,
	FOREIGN KEY (id) REFERENCES public.pedido (id),
	FOREIGN KEY (entregador) REFERENCES public.entregador (id)
);

create table if not exists pedidoRetirar(
	id integer primary key,
	FOREIGN KEY (id) REFERENCES public.pedido (id)
);

create table if not exists pedidoProduto(
	id integer primary key,
	produto integer not null,
	quantidade real not null,
	FOREIGN KEY (id) REFERENCES public.pedido (id),
	FOREIGN KEY (produto) REFERENCES public.produto (id)
);