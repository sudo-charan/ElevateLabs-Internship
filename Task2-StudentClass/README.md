# 🎓 Student Management System (Java Console)

A simple **console-based application** for managing student records using **Java**.  
It demonstrates **basic CRUD operations** (Create, Read, Update, Delete) with `ArrayList` and `Scanner`.

---

## ✅ Features

- **Add Student** — Add a new student with ID, name, and internal marks.
- **View Students** — Display the list of all students.
- **Update Student** — Update an existing student’s name and marks by ID.
- **Delete Student** — Delete a student record by ID.
- **Menu-driven** — Runs in a loop until you choose to exit.

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Terminal / Command Prompt
- Any text editor or IDE (VS Code, IntelliJ, Eclipse)


---

## 💻 How to Run

1. Save your code as `StudentManager.java`.
2. Open terminal in the project folder.
3. Compile the program:
   ```bash
   javac StudentManager.java

   java StudentManager
   ```

---

## Sample Output
```bash
--- Student Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter ID: 001
Enter Name: charan
Enter Internal Marks: 95
Student added successfully.

--- Student Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 2

List of Students:
ID: 1, Name: charan, Internal Marks: 95

--- Student Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 3
Enter Student ID to update: 001
Enter new name: charan naik
Enter new internal marks: 85
Student updated.

--- Student Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 4
Enter Student ID to delete: 001
Student deleted.

--- Student Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 5
Exiting...
```

## 🤝 Contributing
Pull requests are welcome.
For major changes, please open an issue first to discuss what you would like to change.