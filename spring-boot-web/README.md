# Spring Boot Web Service

Web service RESTful completo com Spring Boot, demonstrando boas práticas de desenvolvimento de APIs.

## Tecnologias

- Spring Boot 2.7.14
- Spring Data JPA
- H2 Database (em memória)
- Hibernate

## Executar

```bash
mvn spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

## Endpoints REST

### Listar todos os usuários
```
GET http://localhost:8080/usuarios
```

### Buscar usuário por ID
```
GET http://localhost:8080/usuarios/{id}
```

### Criar novo usuário
```
POST http://localhost:8080/usuarios
Content-Type: application/json

{
  "nome": "João Silva",
  "email": "joao@email.com",
  "telefone": "11999999999"
}
```

### Atualizar usuário
```
PUT http://localhost:8080/usuarios/{id}
Content-Type: application/json

{
  "nome": "João Silva Updated",
  "email": "joao.updated@email.com",
  "telefone": "11888888888"
}
```

### Deletar usuário
```
DELETE http://localhost:8080/usuarios/{id}
```

## H2 Console

Acesse o console do banco de dados H2 em: `http://localhost:8080/h2-console`

Configurações de conexão:
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (deixe em branco)

## Estrutura

- `entities/` - Entidades JPA
- `repositories/` - Interfaces Spring Data JPA
- `controllers/` - Controllers REST
