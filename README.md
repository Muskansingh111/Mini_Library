# 📚 Mini Library Management System

This is a backend project developed using **Spring Boot**, designed to simulate the core operations of a library — managing books, borrowers, and their borrowing records.

It helps demonstrate your ability to build a full-fledged REST API with proper validation, database interaction using JPA, and features like filtering, relationship mapping, and transaction management.

---

## 🧾 Project Overview

Imagine a small library where users (called **borrowers**) can:
- **Add new books** to the system.
- **Borrow available books.**
- **Return borrowed books.**
- **Track who borrowed which book and when.**

This system manages all of that and ensures that:
- A book can’t be borrowed twice until it’s returned.
- You can query for available books only.
- Borrowing history is maintained per borrower.

This is a great demonstration of **real-world backend logic** in a modular, scalable, and testable format.

---

## 🧠 What You'll Learn from This Project

✅ **Spring Boot Fundamentals** – Setting up REST endpoints, using annotations like `@RestController`, `@Service`, `@Repository`.

✅ **JPA & Database Relations** – Managing `@OneToMany`, `@ManyToOne` relationships between:
- Books and borrow records
- Borrowers and borrow records

✅ **DTOs & Validation** – Using `@Valid`, `@NotNull` for clean API input.

✅ **Custom Business Logic** – Ensuring a book can’t be borrowed unless returned.

✅ **Swagger API Docs** – Automatic API documentation with OpenAPI integration.

✅ **PostgreSQL** – Real database usage instead of in-memory test DB.

✅ **Maven** – Project build, dependency management.

---

## 📦 Core Entities

1. **Book**
   - `id`, `title`, `author`, `available`
   - One book can be borrowed multiple times (historically), but only one borrower at a time.

2. **Borrower**
   - `id`, `name`
   - Can borrow multiple books.

3. **BorrowRecord**
   - Links a book and a borrower with a borrow date and return status.

---

## 🔧 Project Structure

```
├── controller/
│   ├── BookController.java
│   ├── BorrowerController.java
│   └── BorrowRecordController.java
├── model/
│   ├── Book.java
│   ├── Borrower.java
│   └── BorrowRecord.java
├── repository/
│   ├── BookRepository.java
│   ├── BorrowerRepository.java
│   └── BorrowRecordRepository.java
├── service/
│   ├── BookService.java
│   ├── BorrowerService.java
│   └── BorrowRecordService.java
└── MiniLibraryApplication.java
```

---

## 🗂 How It Works – Simple Use Case

1. Admin adds a few books and registers borrowers.
2. A borrower requests to borrow a book using `/borrow`.
3. If available, the book is assigned and marked unavailable.
4. Borrower returns it via `/return`, making the book available again.
5. Borrow history can be tracked for audit or analytics.

------END------
