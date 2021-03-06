# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cadastra_livro (
  id                        bigint,
  nome                      varchar(255),
  codigo                    varchar(255))
;

create table cadastra_usuario (
  id                        bigint,
  nome                      varchar(255),
  email                     varchar(255))
;

create table votacao_model (
  id                        bigint)
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists cadastra_livro;

drop table if exists cadastra_usuario;

drop table if exists votacao_model;

SET REFERENTIAL_INTEGRITY TRUE;

