# Java Completo - Spring Boot, MySQL e MongoDB

**Curso Completo de Java** - Prof. Nelio Alves

Repositório com exemplos práticos cobrindo todos os conceitos fundamentais de Java e desenvolvimento de aplicações empresariais.

## 📚 O que você aprenderá

✅ **Dominar Programação Orientada a Objetos e linguagem Java**
- Fundamentos da linguagem Java
- Conceitos de OOP: encapsulamento, herança, polimorfismo, abstração
- Classes, interfaces e composição

✅ **Adquirir a base sólida teórica e prática para ser um desenvolvedor Java de sucesso**
- Boas práticas de programação
- Padrões de projeto
- Estruturas de dados e algoritmos

✅ **Aplicar o conhecimento de orientação a objetos na construção de soluções para problemas reais**
- Desenvolvimento de sistemas completos
- Modelagem de domínio
- Resolução de problemas práticos

✅ **Desenvolver aplicações para desktop com interface gráfica**
- JavaFX para interfaces modernas
- Componentes e eventos
- Layouts e formulários

✅ **Construir web services usando Spring Boot e boas práticas**
- APIs RESTful
- Arquitetura em camadas
- Injeção de dependências
- Spring Data JPA

✅ **Acessar banco de dados relacionais com comandos SQL (JDBC) e também com ORM (JPA/Hibernate)**
- JDBC direto com MySQL
- JPA e Hibernate
- Mapeamento objeto-relacional
- Transações e persistência

✅ **Acessar banco de dados NoSQL**
- MongoDB
- Operações CRUD
- Documentos e coleções

## 🏗️ Estrutura do Projeto

Este é um projeto Maven multi-módulo organizado da seguinte forma:

```
java-completo-parent/
├── java-oo-fundamentals/     # Fundamentos de OO em Java
├── javafx-gui/                # Aplicações Desktop com JavaFX
├── spring-boot-web/           # Web Services REST com Spring Boot
├── jdbc-mysql/                # Acesso a dados com JDBC
├── jpa-hibernate/             # ORM com JPA e Hibernate
└── mongodb-nosql/             # Banco de dados NoSQL com MongoDB
```

### 📦 Módulos

#### 1. java-oo-fundamentals
Demonstra os conceitos fundamentais de Programação Orientada a Objetos:
- Classes e objetos
- Encapsulamento
- Herança e polimorfismo
- Classes abstratas

**Exemplos:**
- `Produto.java` - Classe básica com encapsulamento
- `Conta.java` - Classe abstrata
- `ContaPoupanca.java` e `ContaEmpresa.java` - Herança

#### 2. javafx-gui
Aplicação desktop com interface gráfica usando JavaFX.

**Funcionalidades:**
- Formulário de cadastro de produtos
- Componentes visuais (TextField, Button, Label)
- Eventos e interação com usuário

**Executar:**
```bash
cd javafx-gui
mvn javafx:run
```

#### 3. spring-boot-web
Web service RESTful completo com Spring Boot.

**Tecnologias:**
- Spring Boot
- Spring Data JPA
- H2 Database (em memória)
- REST API

**Endpoints:**
- `GET /usuarios` - Lista todos os usuários
- `GET /usuarios/{id}` - Busca usuário por ID
- `POST /usuarios` - Cria novo usuário
- `PUT /usuarios/{id}` - Atualiza usuário
- `DELETE /usuarios/{id}` - Remove usuário

**Executar:**
```bash
cd spring-boot-web
mvn spring-boot:run
```

Acesse: `http://localhost:8080/usuarios`
Console H2: `http://localhost:8080/h2-console`

#### 4. jdbc-mysql
Demonstra acesso direto ao banco de dados usando JDBC.

**Conceitos:**
- Conexão com MySQL
- Execução de queries SQL
- PreparedStatement
- Transações

**Configuração:**
Edite o arquivo `db.properties` com suas credenciais MySQL.

#### 5. jpa-hibernate
ORM (Object-Relational Mapping) com JPA e Hibernate.

**Conceitos:**
- EntityManager
- Mapeamento de entidades
- Relacionamentos
- JPQL
- Configuração via `persistence.xml`

**Configuração:**
Configure a conexão MySQL em `persistence.xml`

#### 6. mongodb-nosql
Acesso a banco de dados NoSQL com MongoDB.

**Conceitos:**
- Documentos e coleções
- CRUD operations
- MongoDB Driver para Java

**Pré-requisitos:**
MongoDB instalado e rodando em `localhost:27017`

## 🚀 Como usar este repositório

### Pré-requisitos

- Java 11 ou superior
- Maven 3.6+
- MySQL 8.0+ (para módulos jdbc-mysql e jpa-hibernate)
- MongoDB 4.0+ (para módulo mongodb-nosql)

### Compilar todo o projeto

```bash
mvn clean install
```

### Compilar um módulo específico

```bash
cd [nome-do-modulo]
mvn clean compile
```

### Executar testes

```bash
mvn test
```

## 📖 Recursos adicionais

- [Documentação oficial Java](https://docs.oracle.com/en/java/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [JavaFX Documentation](https://openjfx.io/)
- [Hibernate Documentation](https://hibernate.org/orm/documentation/)
- [MongoDB Java Driver](https://mongodb.github.io/mongo-java-driver/)

## 👨‍🏫 Sobre o curso

Baseado no curso **"Java COMPLETO Programação Orientada a Objetos + Projetos"** do Professor Nelio Alves.

## 📝 Licença

Este projeto é para fins educacionais.
