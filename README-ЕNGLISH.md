# 📚 Student Management System

## 📌 Overview

This project represents a **console-based student management system** developed in Java.
The system simulates basic functionality of a university information system for managing students, programs, disciplines, and grades.

The application supports working with files, executing commands through a command-line interface, and maintaining student academic records.

---

## ⚙️ Features

### 📂 File Operations

* `open <file>` – opens a file and loads data into memory
* `close` – closes the currently opened file
* `save` – saves changes to the current file
* `saveas <file>` – saves data to a new file

### 🛠 General Commands

* `help` – displays all supported commands
* `exit` – exits the application

---

### 🎓 Student Management

* `enroll <fn> <program> <group> <name>` – enrolls a new student
* `advance <fn>` – moves a student to the next year
* `change <fn> <program> <group>` – changes student program/group
* `graduate <fn>` – graduates a student
* `interrupt <fn>` – interrupts a student
* `resume <fn>` – resumes a student

---

### 📖 Academic Operations

* `enrollin <fn> <discipline>` – enrolls a student in a discipline
* `addgrade <fn> <discipline> <grade>` – adds a grade for a discipline

---

### 📊 Reports and Information

* `print <fn>` – prints student information
* `printall <program> <year>` – prints all students in a program/year
* `protocol <discipline>` – shows students enrolled in a discipline
* `report <fn>` – generates academic report for a student


---

## 🧩 Core Models

* **Student** – stores student data (faculty number, name, program, year, group, status)
* **Discipline** – represents a subject in a program
* **EnrolledDiscipline** – links a student with a discipline and grade
* **StudentStatus** – (ENROLLED, INTERRUPTED, GRADUATED)
* **DisciplineType** – (MANDATORY, ELECTIVE)

---

## 📌 Requirements

* Java (JDK 8 or higher)
* Console environment

---

## 📝 Notes

* The system validates operations (e.g. cannot advance without passing required disciplines)
* Student state is tracked throughout their lifecycle
* Designed with modular architecture for easier extension

---
## 👨‍💻 Author
Betina Andonova 
Student 3rd year – Discipline OOP-1   
Technical University Of Varna
