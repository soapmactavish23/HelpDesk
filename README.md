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

## User Request

### Path 
`/api/user`
### Method
`POST`
### Request body
    {
	  "id": "string",
	  "email": "string",
	  "password": "string",
	  "profile": "ROLE_ADMIN"
	}
	
### Response
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

### Path 
`/api/user`
### Method 
`PUT`
### Request body
    {
	  "id": "string",
	  "email": "string",
	  "password": "string",
	  "profile": "ROLE_ADMIN"
	}
	
### Response:
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

### Path 
`/api/user/{page}/{count}`
### Method 
`GET`
### Response
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
	
### Path 
`/api/user/{id}`
### Method 
`GET`
### Response
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

### Ticket Request

### Path
`/api/ticket`
### Method
`POST`
### Request Body
	{
	  "id": "string",
	  "user": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "date": "2021-12-05T01:22:30.528Z",
	  "title": "string",
	  "number": 0,
	  "status": "New",
	  "priority": "High",
	  "assignedUser": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "description": "string",
	  "image": "string",
	  "changes": [
	    {
	      "id": "string",
	      "userChange": {
		"id": "string",
		"email": "string",
		"password": "string",
		"profile": "ROLE_ADMIN"
	      },
	      "dataChangeStatus": "2021-12-05T01:22:30.528Z",
	      "status": "New"
	    }
	  ]
	}
### Response
	{
	  "data": {
	    "id": "string",
	    "user": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "date": "2021-12-05T01:22:30.561Z",
	    "title": "string",
	    "number": 0,
	    "status": "New",
	    "priority": "High",
	    "assignedUser": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "description": "string",
	    "image": "string",
	    "changes": [
	      {
		"id": "string",
		"userChange": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"dataChangeStatus": "2021-12-05T01:22:30.561Z",
		"status": "New"
	      }
	    ]
	  },
	  "errors": [
	    "string"
	  ]
	}
	
### Path
`/api/ticket`
### Method
`PUT`
### Request Body
	{
	  "id": "string",
	  "user": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "date": "2021-12-05T01:22:30.528Z",
	  "title": "string",
	  "number": 0,
	  "status": "New",
	  "priority": "High",
	  "assignedUser": {
	    "id": "string",
	    "email": "string",
	    "password": "string",
	    "profile": "ROLE_ADMIN"
	  },
	  "description": "string",
	  "image": "string",
	  "changes": [
	    {
	      "id": "string",
	      "userChange": {
		"id": "string",
		"email": "string",
		"password": "string",
		"profile": "ROLE_ADMIN"
	      },
	      "dataChangeStatus": "2021-12-05T01:22:30.528Z",
	      "status": "New"
	    }
	  ]
	}
### Response
	{
	  "data": {
	    "id": "string",
	    "user": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "date": "2021-12-05T01:22:30.561Z",
	    "title": "string",
	    "number": 0,
	    "status": "New",
	    "priority": "High",
	    "assignedUser": {
	      "id": "string",
	      "email": "string",
	      "password": "string",
	      "profile": "ROLE_ADMIN"
	    },
	    "description": "string",
	    "image": "string",
	    "changes": [
	      {
		"id": "string",
		"userChange": {
		  "id": "string",
		  "email": "string",
		  "password": "string",
		  "profile": "ROLE_ADMIN"
		},
		"dataChangeStatus": "2021-12-05T01:22:30.561Z",
		"status": "New"
	      }
	    ]
	  },
	  "errors": [
	    "string"
	  ]
	}
