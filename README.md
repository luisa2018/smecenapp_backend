
# SMECEN - Backend API

SMECEN is an educational backend project designed to help users plan, control, and optimize their AWS costs.  
This REST API is built with **Spring Boot** and uses **Maven** for dependency management.

---

## 🚀 Technologies Used

- Java 17+
- Spring Boot 3.4.4
- Maven
- Spring Web
- Spring Data JPA
- H2 Database (for dev)
- (Optional: MySQL, PostgreSQL)

---

## 📦 Project Structure

```
src/
 └── main/
     ├── java/
     │   └── com/smecen/
     │       ├── controller/
     │       ├── service/
     │       ├── repository/
     │       └── model/
     │       └── implement/        
     └── resources/
         ├── application.properties
         └── static/
```

---

## 🔧 Getting Started

### Clone the repo

```bash
git clone https://github.com/luisa2018/smecenapp_backend.git
cd smecen-backend
```

### Run the project (from IntelliJ or terminal)

```bash
./mvnw spring-boot:run
```

Or run the main class:
```
SmecenappBackendApplication.java
```

---

## 🧪 API Testing

Once running, test with:
```
GET http://localhost:8080/api/prueba
```

Use Postman or curl to validate endpoints.

---

## 🧠 Git Flow Strategy

This project uses the **GitFlow branching model**:
- `main`: production-ready code
- `develop`: integration branch
- `feature/*`: new features
- `release/*`: pre-release branches
- `hotfix/*`: urgent fixes to production

---

## 📌 Author

👩‍💻 Created by [Luisa Fernanda Rojas Rodriguez]  
📫 Contact: [luisa.fero@hotmail.com]

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).
