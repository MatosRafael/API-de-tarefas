# 🧾 todo-api

Uma API simples e direta para gerenciamento de tarefas, desenvolvida com **Spring Boot**.  
Permite criar, listar, atualizar e deletar tarefas, armazenando informações como título, descrição, data e status de conclusão.

---

## ⚙️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.5.6**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Validation (Jakarta Validation)**
- **Spring Boot DevTools** *(opcional, para hot reload durante o desenvolvimento)*

---

## 📦 Endpoints Principais

| Método | Endpoint            | Descrição                            |
|---------|--------------------|--------------------------------------|
| **GET**    | `/api/todos`         | Lista todas as tarefas registradas. |
| **GET**    | `/api/todos/{id}`    | Retorna uma tarefa específica.      |
| **POST**   | `/api/todos`         | Cria uma nova tarefa.               |
| **PUT**    | `/api/todos/{id}`    | Atualiza uma tarefa existente.      |
| **DELETE** | `/api/todos/{id}`    | Exclui uma tarefa pelo ID.          |

## 🌐 Endpoints principais

Todos os endpoints estão sob o caminho base:

| Método | Endpoint               | Descrição                        |
|---------|------------------------|----------------------------------|
| `GET`   | `/api/todos`           | Retorna todas as tarefas         |
| `GET`   | `/api/todos/{id}`      | Retorna uma tarefa específica    |
| `POST`  | `/api/todos`           | Cadastra uma nova tarefa         |
| `PUT`   | `/api/todos/{id}`      | Atualiza uma tarefa existente    |
| `DELETE`| `/api/todos/{id}`      | Remove uma tarefa                |

---

## ⚠️ Tratamento de exceções

A aplicação possui um sistema de tratamento global de erros, implementado nas classes:

- `GlobalExceptionHandler` — intercepta exceções e retorna respostas amigáveis em JSON  
- `ResourceNotFoundException` — lançada quando uma tarefa não é encontrada  

Essas classes garantem que a API retorne mensagens consistentes e códigos HTTP adequados, como **404 (Not Found)** e **400 (Bad Request)**.

---

## 🧩 Exemplo de Objeto JSON
<img width="527" height="223" alt="image" src="https://github.com/user-attachments/assets/80513552-d1e7-4c08-b5f7-a63a92da15a9" />

## 🛠️ Como rodar o projeto localmente

### Pré-requisitos
- **Java 17+**
- **Maven** ou **Gradle** (dependendo do seu setup)
- **IDE** de sua preferência (IntelliJ, VS Code, Eclipse, etc.)

### Passos para executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/MatosRafael/todo-api.git


##Acesse a pasta do projeto:

cd API-de-tarefas


##Execute o projeto:

./mvnw spring-boot:run


##ou, caso use Gradle:

./gradlew bootRun


##Acesse a API:

http://localhost:8080/api/todos


#Banco de dados H2

Durante a execução, a aplicação utiliza o banco de dados em memória H2.

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:todosdb

Usuário: sa

Senha: (em branco)

##📄 Licença

Este projeto é de uso livre.
Sinta-se à vontade para estudar, modificar e utilizar como base para seus próprios projetos.


