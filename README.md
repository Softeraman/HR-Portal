<div align="center">

  <img src="https://capsule-render.vercel.app/api?type=waving&height=180&color=0:0F172A,50:2563EB,100:22C55E&text=HR%20Management%20Portal&fontColor=FFFFFF&fontSize=42&fontAlignY=36&animation=fadeIn" alt="HR Management Portal Banner" />

  <br />

  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=22&duration=2600&pause=900&color=2563EB&center=true&vCenter=true&width=780&lines=Full-Stack+HR+Management+System;Employee+Records+%7C+Leave+Workflow+%7C+Dashboard+Analytics;Built+with+Angular%2C+Spring+Boot%2C+JPA+and+OracleDB" alt="Typing animation" />

  <br />
  <br />

  <a href="https://angular.dev/">
    <img src="https://img.shields.io/badge/Angular-22-DD0031?style=for-the-badge&logo=angular&logoColor=white" alt="Angular" />
  </a>
  <a href="https://spring.io/projects/spring-boot">
    <img src="https://img.shields.io/badge/Spring%20Boot-3.3-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot" />
  </a>
  <a href="https://www.oracle.com/database/">
    <img src="https://img.shields.io/badge/OracleDB-Database-F80000?style=for-the-badge&logo=oracle&logoColor=white" alt="OracleDB" />
  </a>
  <a href="https://www.chartjs.org/">
    <img src="https://img.shields.io/badge/Chart.js-Analytics-FF6384?style=for-the-badge&logo=chartdotjs&logoColor=white" alt="Chart.js" />
  </a>

  <br />
  <br />

  <b>A modern HR operations portal that goes beyond simple employee CRUD by adding role-based workflows, leave approvals, and workforce analytics.</b>

</div>

---

## About The Project

**HR Management Portal** is a full-stack web application built to help HR teams manage employee records, leave requests, approvals, and workforce insights from one place.

Most basic HR portals only store employee data. This project solves a more practical workflow problem:

- HR users can manage employees and view organization-level data.
- Employees can apply for leave and track their leave status.
- HR can approve or reject leave requests.
- The dashboard shows workforce and leave insights using charts.
- The backend exposes REST APIs and stores data using JPA with OracleDB.

This makes the project closer to a real HR operations tool instead of a simple CRUD application.

---

## Key Features

<table>
  <tr>
    <td><b>Role-Based Flow</b></td>
    <td>Separate HR and Employee views so each user sees only the features relevant to their role.</td>
  </tr>
  <tr>
    <td><b>Employee Management</b></td>
    <td>Add, update, view, and delete employee records with form validation.</td>
  </tr>
  <tr>
    <td><b>Leave Workflow</b></td>
    <td>Employees can apply for leave while HR can approve or reject requests.</td>
  </tr>
  <tr>
    <td><b>Dashboard Analytics</b></td>
    <td>Chart.js dashboards show department-wise employee counts and leave tracking.</td>
  </tr>
  <tr>
    <td><b>REST API Backend</b></td>
    <td>Spring Boot APIs connect the Angular frontend with persistent database storage.</td>
  </tr>
  <tr>
    <td><b>Database Integration</b></td>
    <td>Uses Spring Data JPA and OracleDB for structured HR data management.</td>
  </tr>
</table>

---

## Tech Stack

### Frontend

![Angular](https://img.shields.io/badge/Angular-22-DD0031?style=flat-square&logo=angular&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-6-3178C6?style=flat-square&logo=typescript&logoColor=white)
![RxJS](https://img.shields.io/badge/RxJS-7.8-B7178C?style=flat-square&logo=reactivex&logoColor=white)
![Chart.js](https://img.shields.io/badge/Chart.js-4.5-FF6384?style=flat-square&logo=chartdotjs&logoColor=white)

### Backend

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Java](https://img.shields.io/badge/Java-21-007396?style=flat-square&logo=openjdk&logoColor=white)
![JPA](https://img.shields.io/badge/Spring%20Data%20JPA-ORM-6DB33F?style=flat-square&logo=spring&logoColor=white)
![OracleDB](https://img.shields.io/badge/OracleDB-Database-F80000?style=flat-square&logo=oracle&logoColor=white)

### Tools

![Git](https://img.shields.io/badge/Git-Version%20Control-F05032?style=flat-square&logo=git&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![npm](https://img.shields.io/badge/npm-Package%20Manager-CB3837?style=flat-square&logo=npm&logoColor=white)

---

## What Makes It Different

This project is not only an employee list application. It connects multiple HR workflows together:

1. **Employee data management**
   HR can maintain employee profiles with role, department, designation, salary, and contact data.

2. **Leave request lifecycle**
   Employees can apply for leave, and HR can approve or reject requests through a structured workflow.

3. **Role-based visibility**
   HR can view all leave requests, while employees only see their own leave records.

4. **Operational dashboard**
   Department-wise employee counts and leave charts help HR understand workforce distribution quickly.

5. **Full-stack architecture**
   Angular handles the user interface, Spring Boot manages APIs, and OracleDB stores structured HR data.

---

## Project Architecture

```text
HR-management/
├── HR-management/                  # Angular frontend
│   ├── src/app/core/                # Layout and auth services
│   ├── src/app/features/            # Dashboard, employees, leaves, auth pages
│   ├── src/app/pages/               # Apply leave page
│   └── src/app/services/            # API services
│
└── hr-management-backend/
    └── hrportal/                    # Spring Boot backend
        ├── src/main/java/
        │   └── com/hrmanagement/backend/
        │       ├── controller/      # REST controllers
        │       ├── entity/          # JPA entities
        │       ├── repository/      # Data repositories
        │       └── config/          # CORS and data loading
        └── src/main/resources/      # Application config
```

---

## Core Modules

### Authentication

- User registration
- Login flow
- Logged-in user stored locally
- Role-based navigation for HR and employees

### Employee Management

- Add employee
- Update employee
- Delete employee
- View employee records
- Validate name, email, department, password, designation, and salary fields

### Leave Management

- Apply for leave
- Track leave status
- HR approval and rejection flow
- Employee-specific leave visibility

### Dashboard

- Total employee count
- Department-wise employee chart
- Leave allowed, taken, and remaining chart
- Chart.js data labels and visual reports

---

## API Endpoints

### User And Employee APIs

| Method | Endpoint | Purpose |
|---|---|---|
| `GET` | `/users` | Get all users/employees |
| `POST` | `/users` | Add a new user/employee |
| `PUT` | `/users/{id}` | Update user/employee details |
| `DELETE` | `/users/{id}` | Delete a user/employee |

Alternative supported routes:

```text
/api/users
/api/employees
```

### Leave APIs

| Method | Endpoint | Purpose |
|---|---|---|
| `GET` | `/leaves` | Get leave requests |
| `POST` | `/leaves` | Apply for leave |
| `PUT` | `/leaves/{id}` | Update leave status |
| `DELETE` | `/leaves/{id}` | Delete leave request |

Alternative supported route:

```text
/api/leaves
```

---

## Screenshots

Add your screenshots inside a folder named `screenshots` and update these paths.

<table>
  <tr>
    <td align="center"><b>Dashboard</b></td>
    <td align="center"><b>Employee Management</b></td>
  </tr>
  <tr>
    <td><img src="screenshots/dashboard.png" alt="Dashboard Screenshot" width="420" /></td>
    <td><img src="screenshots/employees.png" alt="Employee Management Screenshot" width="420" /></td>
  </tr>
  <tr>
    <td align="center"><b>Leave Workflow</b></td>
    <td align="center"><b>Login</b></td>
  </tr>
  <tr>
    <td><img src="screenshots/leaves.png" alt="Leave Workflow Screenshot" width="420" /></td>
    <td><img src="screenshots/login.png" alt="Login Screenshot" width="420" /></td>
  </tr>
</table>

---

## Getting Started

Follow these steps to run the project locally.

### Prerequisites

Install the following:

- Node.js and npm
- Angular CLI
- Java 21
- Maven
- Oracle Database or Oracle XE

Install Angular CLI if needed:

```bash
npm install -g @angular/cli
```

---

## Backend Setup

Go to the backend folder:

```bash
cd hr-management-backend/hrportal
```

Update database settings in:

```text
src/main/resources/application.properties
```

Use your own OracleDB username and password:

```properties
server.port=8080

spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/XEPDB1
spring.datasource.username=YOUR_ORACLE_USERNAME
spring.datasource.password=YOUR_ORACLE_PASSWORD
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
```

Run the backend:

```bash
mvn spring-boot:run
```

Backend will start on:

```text
http://localhost:8080
```

---

## Frontend Setup

Go to the Angular folder:

```bash
cd HR-management
```

Install dependencies:

```bash
npm install
```

Run the frontend:

```bash
ng serve
```

Frontend will start on:

```text
http://localhost:4200
```

---

## Resume Highlights

This project demonstrates:

- Full-stack web application development
- Angular component architecture
- TypeScript and reactive forms
- REST API integration
- Spring Boot backend development
- JPA-based database operations
- OracleDB integration
- Dashboard analytics using Chart.js
- Role-based HR and employee workflows

---

## Future Improvements

- Add JWT-based authentication
- Add password encryption with Spring Security
- Add leave balance calculation based on leave dates
- Add admin-level reports and export to CSV
- Add search, filter, and pagination for employees
- Add deployment with Docker

---

## Author

<div align="center">

  <b>Aman Sharma</b>

  <br />
  <br />

  <a href="https://github.com/Softeraman">
    <img src="https://img.shields.io/badge/GitHub-Softeraman-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" />
  </a>
  <a href="https://www.linkedin.com/in/aman-sharma-8ab247239">
    <img src="https://img.shields.io/badge/LinkedIn-Aman%20Sharma-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn" />
  </a>

</div>

---

<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&height=120&section=footer&color=0:22C55E,50:2563EB,100:0F172A" alt="Footer Wave" />
</div>
