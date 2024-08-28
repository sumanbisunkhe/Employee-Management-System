
# Employee Management System

This Java project demonstrates an Employee Management System using Object-Oriented Programming (OOP) concepts. The system allows a small company to manage its employees' information, including name, age, department, and salary. It also handles managers who have an additional bonus attribute.

## Features

- **Employee Class**
  - Stores basic employee details: name, age, department, and salary.
  - Includes methods to:
    - Get and set each attribute.
    - Raise the employee's salary by a specified percentage.
    - Display employee information in a readable format.

- **Manager Class**
  - Inherits from the `Employee` class and includes an additional bonus attribute.
  - Contains methods to:
    - Calculate the total salary (base salary + bonus).
    - Override the display method to include bonus information.

## Project Structure

```plaintext
src/
├── Employee.java
├── Manager.java
└── EmployeeTest.java
```


## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/sumanbisunkhe/Employee-Management-System.git
   ```

2. Navigate to the project directory:
   ```bash
   cd employee-management-system
   ```

3. Compile the Java files:
   ```bash
   javac src/*.java
   ```

4. Run the `EmployeeTest` class:
   ```bash
   java src.EmployeeTest
   ```

## Example Output

```plaintext
=== Employee and Manager Information Before Salary Raise ===
------------------------------------------------------------
Employee Details:
Employee Information:
Name: Suman
Age: 20
Department: IT
Salary: 20000.0
------------------------------------------------------------
Manager Details:
Employee Information:
Name: John
Age: 40
Department: HR
Salary: 50000.0
Bonus: 15000.0
Total Salary (including bonus): 65000.0
============================================================

=== Employee and Manager Information After Salary Raise ===
-----------------------------------------------------------
Employee Details:
Employee Information:
Name: Suman
Age: 20
Department: IT
Salary: 22000.0
-----------------------------------------------------------
Manager Details:
Employee Information:
Name: John
Age: 40
Department: HR
Salary: 55000.0
Bonus: 15000.0
Total Salary (including bonus): 70000.0
===========================================================
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Author

- **Suman Bisunkhe** - [GitHub Profile](https://github.com/sumanbisunkhe)
