# 💸 Expense Tracker API

A simple RESTful Expense Tracker backend built with **Spring Boot** as a personal learning project.

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Web (REST)
- Spring Data (JPA / MongoDB — based on project setup)

---

## 📁 Project Structure

```
com.PPiyush005.Expense_Tracker
├── Controller
│   └── ExpenseController.java
├── Entity
│   └── Expense.java
├── Service
│   └── ExpenseService.java
└── dto
    └── CategoryExpenseResponse.java
```

---

## 🚀 API Endpoints

Base URL: `/expenses`

| Method   | Endpoint                     | Description                          |
|----------|------------------------------|--------------------------------------|
| `POST`   | `/expenses`                  | Add a new expense                    |
| `GET`    | `/expenses`                  | Get all expenses                     |
| `PUT`    | `/expenses/{id}`             | Update an expense by ID              |
| `DELETE` | `/expenses/{id}`             | Delete an expense by ID              |
| `GET`    | `/expenses/category/{category}` | Get total expense by category     |
| `GET`    | `/expenses/total`            | Get the overall total of all expenses|

---

## 📝 Sample Request — Add Expense

```json
POST /expenses
Content-Type: application/json

{
  "title": "Groceries",
  "amount": 500.0,
  "category": "Food"
}
```

---

## ▶️ Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/PPiyush005/Expense-Tracker.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Expense-Tracker
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

The server will start at `http://localhost:8080`.

---

## 🎯 Purpose

This is a **learning project** built to practice:
- Building REST APIs with Spring Boot
- Structuring a Spring project (Controller / Service / Entity / DTO)
- Performing CRUD operations
- Aggregating data (totals by category)

---

## 📌 Future Improvements

- [ ] Add authentication (Spring Security / JWT)
- [ ] Connect to a database (MySQL / MongoDB)
- [ ] Add date filtering for expenses
- [ ] Build a frontend (React / Angular)

---

## 👤 Author

**PPiyush005** — learning and building one project at a time.
