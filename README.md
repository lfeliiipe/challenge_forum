<div align=center>
<img width="100%" align=center src="https://github.com/user-attachments/assets/adcdfe73-2642-4110-9108-fd21b6b6864b">  
</div>


# Fórum Hub Challenge

Aplicação Spring Boot Web de uma API REST com autenticação via JWT. 

A aplicação permite o CRUD de tópicos de um fórum.

Há rotas de:

* GET: Lista vários tópicos
* POST: Adiciona um tópico novo
* PUT: Atualiza um tópico já exitente
* DELETE: Apaga um tópico existente
* GET: Lista um tópico específico com mais detalhes

## Bibliotecas/Dependências utilizadas

* Lombok
* Validation
* JPA
* MySQL
* Flyway
* Security
* Auth0 JWT
* SpringDoc

## URLs de Documentação

Uma maneira de testar os endpoints da aplicação sem a necessidade de utilizar aplicativos como Postman, ou Insomnia é utilizando as urls de documentação a seguir:

* server:port/context-path/v3/api-docs                (Documentação em JSON)
* server:port/context-path/swagger-ui/index.html      (Documentação em HTML. Imagem abaixo.)
* Exemplo: localhost:8080/swagger-ui/index.html

<img width="100%" align=center src="https://github.com/user-attachments/assets/42ff58bd-3671-4dc5-8375-80ecd6693fc5">
