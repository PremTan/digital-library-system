# Digital Library Book Management System

## Overview
This is a simple **Digital Library Book Management System** developed in Java. The system allows librarians to **add, update, search, and remove books** while maintaining their availability status.

## Features
- **Add a Book**: Enter Book ID, Title, Author, Genre, and Availability status.
- **View All Books**: Display a list of all books with details.
- **Search Book by ID or Title**: Find a book using its ID or title.
- **Update Book Details**: Modify book details, including availability status.
- **Delete a Book**: Remove a book from the catalog.
- **Exit System**: Close the program.

## Prerequisites
Ensure you have the following installed on your system:
- **Java Development Kit (JDK) 8 or later**
- **A text editor or IDE** (e.g., VS Code, IntelliJ IDEA, Eclipse)

## How to Run the Project
1. **Clone the Repository**
   ```sh
   git clone <repository-link>
   cd digital-library
   ```

2. **Compile the Code**
   ```sh
   javac DigitalLibrary.java
   ```

3. **Run the Program**
   ```sh
   java DigitalLibrary
   ```

4. **Follow On-Screen Instructions**
   - Choose an option from the menu (1-6).
   - Enter required details as prompted.

## Constraints
- **Book ID should be unique.**
- **Title and Author should be non-empty.**
- **Availability status must be 'Available' or 'Checked Out'.**

## Challenges & Improvements
### **Challenges Faced:**
- Ensuring unique Book IDs and proper validation of input fields.
- Handling edge cases like updating non-existent books.

### **Future Enhancements:**
- **Persistent Storage**: Store books in a file or database.
- **GUI Version**: Implement a graphical user interface.
- **User Authentication**: Add roles for admin and users.

