# ReverseUsingSpringBoot

A simple Spring Boot application that provides a REST API to reverse a string.

## 🛠️ Features

- Java 21 with Spring Boot 3.5.3
- REST endpoint to reverse any input string
- Live reload support using Spring DevTools
- Clean Maven-based project structure

## 📁 Project Structure
ReverseUsingSpringBoot/
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── String/
│ └── Reverse/
│ └── ReverseApplication.java
├── pom.xml
└── README.md

## 🚀 Running the Project

### Prerequisites

- Java 21+
- Maven 3.8+
- Git

### Run with Maven

```bash
mvn spring-boot:run
Add a REST controller like:

java
Copy code
@GetMapping("/reverse")
public String reverse(@RequestParam String input) {
    return new StringBuilder(input).reverse().toString();
}
Then call:

pgsql
Copy code
GET /reverse?input=hello
Response: olleh
Note: This functionality can be added to make it a fully interactive API.

🧾 Technologies Used
Spring Boot 3.5.3

Java 21

Maven

Lombok (optional)

Spring DevTools

📦 Packaging
To build a JAR file:

bash
Copy code
mvn clean package
Then run:

bash
Copy code
java -jar target/Reverse-0.0.1-SNAPSHOT.jar
🧑‍💻 Author
Anurag Dahiya
GitHub: anuragdahiya12

📄 License
This project is open source and available under the MIT License.

yaml
Copy code

---

### ✅ Next Step

1. Save this as a `README.md` file in the root of your project.
2. Then push it to GitHub:

```bash
git add README.md
git commit -m "Add README.md"
git push
