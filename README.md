# 🧪 OrangeHRM Automation Testing Framework (CI/CD Enabled)

## 📌 Project Overview

This project is a **full-fledged Automation Testing Framework** for the **OrangeHRM Demo Application**, built using **Java + Selenium + Maven**, and integrated with **CI/CD using Jenkins on AWS EC2**.

It automates end-to-end testing workflows, generates reports, and sends automated email notifications after execution.

---

## 🎯 Key Highlights

✔ End-to-end UI automation using Selenium
✔ CI/CD pipeline with Jenkins (hosted on AWS EC2)
✔ GitHub Webhook integration for auto build trigger
✔ Automated email notifications with reports
✔ Extent Report generation for test results
✔ Java 21 compatible framework
✔ Scalable and maintainable design using POM

---

## 🧰 Tech Stack

* **Language:** Java 21
* **Automation Tool:** Selenium WebDriver
* **Build Tool:** Maven
* **Test Framework:** TestNG
* **Design Pattern:** Page Object Model (POM)
* **CI/CD Tool:** Jenkins
* **Cloud Platform:** AWS EC2
* **Version Control:** Git & GitHub
* **Reporting:** Extent Reports

---

## 🏗️ Framework Architecture

The framework is designed using:

✔ Page Object Model (POM)
✔ Base test setup and reusable utilities
✔ Separation of test logic and page actions
✔ Modular and scalable structure
✔ Clean and maintainable code practices

--

## 🔄 CI/CD Workflow

```
GitHub Push
   ↓
Webhook Trigger
   ↓
Jenkins (AWS EC2)
   ↓
Maven Build (Java 21)
   ↓
Selenium Test Execution
   ↓
Extent Report Generation
   ↓
Email Notification 📩
```

---

## 📂 Project Structure

```
HRM-Automation-Testing
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base
│   │   │   ├── pages
│   │   │   └── utilities
│   │   └── resources
│   │
│   └── test
│       └── java
│           └── tests
│
├── test-output (Extent Reports)
├── pom.xml
├── README.md
└── .gitignore
```

---

## 🚀 Automated Test Scenarios

* Login functionality
* Dashboard validation
* Employee management (Add/Edit/Delete)
* Leave module workflows
* Logout functionality

---

## 📊 Reporting

* Extent HTML Reports generated after execution
* Reports archived in Jenkins
* Direct report access via Jenkins artifacts
* Email notifications include report link

---

## 📧 Email Notification Feature

* Automated emails triggered after build completion
* Includes:

  * Job name
  * Build number
  * Status (Pass/Fail)
  * Report link
* Configured using Jenkins Extended Email Plugin

---

## ▶️ How to Run Locally

### 1️⃣ Clone Repository

```
git clone https://github.com/your-username/hrm-automation-testing.git
```

### 2️⃣ Open in IntelliJ / Eclipse

### 3️⃣ Install Dependencies

Maven will auto-download dependencies.

### 4️⃣ Run Tests

```
mvn clean test
```

---

## ☁️ Jenkins Setup (AWS)

* Jenkins installed on AWS EC2 (Ubuntu)
* Java 21 configured on server
* GitHub Webhook configured for auto-trigger
* SMTP configured for Gmail notifications
* Build artifacts archived

---

## 🔥 Key Achievements

✔ Successfully integrated Selenium with Jenkins CI/CD
✔ Implemented webhook-based automation trigger
✔ Configured cloud-based execution on AWS
✔ Automated reporting and email notifications
✔ Ensured Java version compatibility (Java 21)

---

## 📈 Future Enhancements

* Data-driven testing (Excel / JSON)
* Parallel execution (TestNG)
* Cross-browser testing (Grid / Cloud)
* Docker integration
* API automation integration
* GitHub Actions pipeline

---

## 👨‍💻 Author

**Sayan Giri**
QA Automation Engineer (Java + Selenium)

📫 Email: [sayangiri007@gmail.com](mailto:sayangiri007@gmail.com)

---

## ⭐ Why This Project Stands Out

This project demonstrates:

✔ Real-world automation framework design
✔ CI/CD implementation with cloud deployment
✔ End-to-end automation lifecycle
✔ Industry-standard testing practices
✔ Strong DevOps + QA integration

---
