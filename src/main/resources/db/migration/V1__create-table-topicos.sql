create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensagem varchar(255) not null,
    criacao datetime not null,
    topico_ativo tinyint not null,
    autor varchar(100) not null unique,
    curso varchar(100) not null,

    primary key(id)

);