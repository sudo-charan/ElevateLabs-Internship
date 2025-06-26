# 📚 Library Management System (Java OOP)

A simple console-based Library Management System developed in Java using Object-Oriented Programming (OOP) principles. It allows basic functionalities like viewing, issuing, and returning books.

---

## 🚀 Features

- View available and issued books
- Issue a book (if available)
- Return a book (if already issued)
- Uses core Java OOP concepts: classes, objects, encapsulation

---

## 🛠️ Technologies Used

- Java (JDK)
- VS Code or IntelliJ
- Terminal / Command Prompt

---

## 🗂️ Class Structure

- `Book.java` – Represents a book object.
- `User.java` – Represents a library user (currently a placeholder).
- `Library.java` – Manages the book collection and core operations.
- `Main.java` – Handles user interaction and runs the application.

---

## 💻 How to Run

Open terminal inside the project folder and run:

```bash
javac *.java
java Main

```

## 🖥️ Sample Output

```bash
PS D:\ElevateLabs-Internship\Task3-LibraryManagementSystem> javac *.java
PS D:\ElevateLabs-Internship\Task3-LibraryManagementSystem> java Main
Book added: The Alchemist
Book added: 1984
Book added: Clean Code

--- Library Menu ---
1. View Books
2. Issue Book
3. Return Book
4. Exit
Enter choice: 1

📚 Library Books:
- The Alchemist by Paulo Coelho [Available]
- 1984 by George Orwell [Available]
- Clean Code by Robert C. Martin [Available]

--- Library Menu ---
1. View Books
2. Issue Book
3. Return Book
4. Exit
Enter choice: 2
Enter book title to issue: 1984
📦 Book issued: 1984

--- Library Menu ---
1. View Books
2. Issue Book
3. Return Book
4. Exit
Enter choice: 2
Enter book title to issue: 1984
❌ Book not available or already issued.

--- Library Menu ---
1. View Books
2. Issue Book
3. Return Book
4. Exit
Enter choice: 3
Enter book title to return: 1984
📥 Book returned: 1984

--- Library Menu ---
1. View Books
2. Issue Book
3. Return Book
4. Exit
Enter choice: 4
👋 Exiting Library System.
```

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.