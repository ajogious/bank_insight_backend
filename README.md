# 🏦 Bank Insight – Backend

A lightweight RESTful API built with **Spring Boot** and **MySQL** that allows searching for customer records by **BVN** or **Phone Number**.

---

## 📦 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

## 🔧 Features

- Search customer by BVN or Phone Number
- RESTful API structure
- CORS enabled for frontend access
- Easily expandable for additional banking features

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/ajogious/bank_insight_backend.git
cd bank_insight_backend
2. Configure Database
Create a MySQL database, e.g., bank_insight_db, and update your application.properties file:

properties:
spring.datasource.url=jdbc:mysql://localhost:3306/bank_insight_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
3. Run the Application
From your IDE or with Maven:
./mvnw spring-boot:run
Or:
mvn spring-boot:run
The API will be available at http://localhost:8080

🧪 Endpoints
🔍 Search Customer
GET /customer/search

Query Parameters:
Param	Type	Required	Description
bvn	String	Optional	Search by BVN (11 digits)
phone	String	Optional	Search by Phone Number

Example:
GET http://localhost:8080/customer/search?bvn=12345678901
GET http://localhost:8080/customer/search?phone=08012345678

Success Response:
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "otherName": "A.",
  "gender": "Male",
  "dateOfBirth": "1990-05-20",
  "email": "john@example.com",
  "bvn": "12345678901",
  "phoneNumber": "08012345678",
  "address": "Lagos, Nigeria",
  "accountType": "Savings",
  "status": "Active",
  "balance": 14500.75
}

Error Response:
Customer not found

🧱 Project Structure:
src/
├── main/
│   ├── java/
│   │   └── com/ajogious/bank_insight_backend/
│   │       ├── Customer.java
│   │       ├── CustomerRepository.java
│   │       ├── CustomerService.java
│   │       └── CustomerController.java
│   └── resources/
│       └── application.properties
⚙️ Sample MySQL Table Structure:
CREATE TABLE customer (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  other_name VARCHAR(100),
  gender VARCHAR(10),
  date_of_birth DATE,
  email VARCHAR(100),
  bvn VARCHAR(11) UNIQUE,
  phone_number VARCHAR(15) UNIQUE,
  address TEXT,
  account_type VARCHAR(20),
  status VARCHAR(10),
  balance DECIMAL(15,2)
);
🧑‍💻 Author
Built with 💻 by Abdulmumuni Ajoge Adavize

📄 License
MIT — Feel free to use and expand.

---
```
