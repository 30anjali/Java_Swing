# Java Swing Projects

This repository contains multiple Java Swing projects for learning and practice.

## Projects

- [# Java Swing Login System](java-swing-login-system) 

A simple desktop **Login Authentication System** built using **Java Swing** and **MySQL**.  
Validates user credentials and opens a dashboard on successful login.

---

## ⚡ Features
- User login with username & password
- Dashboard after successful login
- Logout functionality
- Database authentication via JDBC

---

## ▶️ Flow
```text
Start LoginFrame
      |
Enter Username & Password
      |
 Validate in DB
   |       |
Invalid   Valid
  |        |
 Show     Open
 Error   Dashboard
      |
   Logout → Return to Login
