# 💻 Desafio Vaga Dev Back-End Júnior — Itaú

Este projeto é uma API REST desenvolvida como parte de um desafio técnico para uma vaga de desenvolvedor Back-End Júnior no Itaú.

---

## ⚙️ Dependências

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Apache Maven](https://maven.apache.org/)
- [Make (opcional)](https://www.gnu.org/software/make/) — para facilitar a execução via terminal

---

## ▶️ Como Rodar o Projeto

Certifique-se de que o Java e o Maven estão instalados e configurados corretamente.

```bash
make mvn-run
```

Ou, se preferir, rode manualmente:
```bash
./mvnw spring-boot:run
```

---

## 🔌 Endpoints Suportados
### 📤 POST /transacao
Registra uma nova transação.

Exemplo:
```bash
curl -X POST http://localhost:8080/transacao \
  -H "Content-Type: application/json" \
  -d '{"valor": 202.09, "dataHora": "2025-05-01T01:02:04.777-03:00"}'
```
##
### ❌ DELETE /transacao
Remove todas as transações.

Exemplo:
```bash
curl -X DELETE http://localhost:8080/transacao
```
##
### 📊 GET /estatistica
Retorna estatísticas com base nas transações registradas.

Exemplo:
```bash
curl -X GET http://localhost:8080/estatistica
```

---

## 📁 Estrutura do Projeto
```css
src/
 └── main/
     ├── java/com/spring/itau/desafio/springboot/
        ├── SpringbootApplication.java
        ├── model
            └── Transaction.java
        ├── dto
            ├── TransactionRequest.java
            └── StatisticsResponse.java
        ├── service
            └── TransactionService.java
        └── controller
            ├── TransactionController.java
            └── StatisticsController.java
     └── resources/
```

---

## 🧑‍💻 Autor
Pedro Henrique Klein
### [Pedrinhonitz](https://github.com/Pedrinhonitz)