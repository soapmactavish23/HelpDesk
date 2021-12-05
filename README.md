<h1 align="center">
   <img src="prints/logo.png" width="400">
</h1>

<h4 align="center"> 
	🚧 Help Desk - Back-End 🚀 Concluido...  🚧
</h4>

## ✅ Funções

- [x] Criar Usuário
- [x] Atualizar Usuário
- [x] Deletar Usuário
- [x] Listar Usuário
- [x] Criar Ticket
- [x] Atualizar Ticket
- [x] Deletar Ticket
- [x] Listar Todos Ticket
- [x] Buscar Ticket por id
- [x] Listar por parametros
- [x] Mudar Status
- [x] Listar Summary

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" heigth="20" width="20"/> [Spring Boot](https://spring.io/projects/spring-boot)
- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" heigth="20" width="20"/> [Java](https://www.java.com/pt-BR)
- <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mongodb/mongodb-original.svg" heigth="20" width="20"/> [MongoDB](https://www.mongodb.com)

## 🖥️ Plataforma adotada

  - WEB

## Request

### User Request

`POST /api/user`
	
	Request body
    {
	  "id": "string",
	  "email": "string",
	  "password": "string",
	  "profile": "ROLE_ADMIN"
	}
	
	Response: CODE 200
	{
	  "data": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "errors": [
	    "string"
	  ]
	}
	
`PUT /api/user`
	
	Request body
    {
	  "id": "string",
	  "email": "string",
	  "password": "string",
	  "profile": "ROLE_ADMIN"
	}
	
	Response: CODE 200
	{
	  "data": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "errors": [
	    "string"
	  ]
	}

`GET /api/user/{page}/{count}`
	
	Response: CODE 200
	{
	  "data": {
	    "totalPages": 0,
	    "totalElements": 0,
	    "sort": {
	      "sorted": true,
	      "unsorted": true
	    },
	    "pageable": {
	      "sort": {
		"sorted": true,
		"unsorted": true
	      },
	      "pageNumber": 0,
	      "pageSize": 0,
	      "paged": true,
	      "unpaged": true,
	      "offset": 0
	    },
	    "first": true,
	    "numberOfElements": 0,
	    "last": true,
	    "size": 0,
	    "content": [
	      {
		"id": "string",
		"email": "string",
		"password": "string",
		"profile": "ROLE_ADMIN"
	      }
	    ],
	    "number": 0
	  },
	  "errors": [
	    "string"
	  ]
	}
	
`GET /api/user/{id}`
	
	Response: CODE 200
	{
	  "data": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "errors": [
	    "string"
	  ]
	}
	
`DELETE /api/user/{id}`
	
	Response: CODE 200
	{
	  "data": "string",
	  "errors": [
	    "string"
	  ]
	}
