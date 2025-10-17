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


