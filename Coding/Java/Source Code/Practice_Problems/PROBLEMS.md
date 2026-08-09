# Java Programming Mastery — 150 Problem Question Bank

> **Goal:** Become genuinely confident in Core Java by solving 150 progressively difficult programming problems.
>
> **Scope:** Core Java only — no Spring, Hibernate, Android, Jakarta EE, or other frameworks.
>
> **Progression:** Beginner → Problem Solving → Arrays → Strings → OOP → Collections → Exceptions → File I/O → Generics → Java 8+ → Multithreading → Advanced Core Java → Projects

---

# 📚 Table of Contents

1. [Java Fundamentals](#1-java-fundamentals)
2. [Conditions and Decision Making](#2-conditions-and-decision-making)
3. [Loops and Number Problems](#3-loops-and-number-problems)
4. [Patterns](#4-patterns)
5. [Arrays](#5-arrays)
6. [2D Arrays and Matrices](#6-2d-arrays-and-matrices)
7. [Strings](#7-strings)
8. [Methods and Recursion](#8-methods-and-recursion)
9. [OOP Fundamentals](#9-oop-fundamentals)
10. [Advanced OOP](#10-advanced-oop)
11. [Collections Framework](#11-collections-framework)
12. [Exception Handling](#12-exception-handling)
13. [File Handling and Serialization](#13-file-handling-and-serialization)
14. [Generics, Enums and Comparable](#14-generics-enums-and-comparable)
15. [Java 8+ Features](#15-java-8-features)
16. [Multithreading and Concurrency](#16-multithreading-and-concurrency)
17. [Advanced Core Java Projects](#17-advanced-core-java-projects)

---

# 1. Java Fundamentals

## 1. Hello World

Write a Java program that prints:

* Your name
* Age
* College
* Branch
* Career goal

### Practice

* Create the program using `main()`.
* Print each value on a separate line.

### Input

No input.

### Output

Display your information.

### Focus

`class`, `main()`, `System.out.println()`.

---

## 2. Basic Calculator

Take two numbers from the user and perform:

* Addition
* Subtraction
* Multiplication
* Division
* Modulus

### Input

Two numbers.

### Output

Display the result of every operation.

### Things to consider

* Integer vs floating-point division.
* Division by zero.

---

## 3. Swap Two Numbers

Write a program to swap two numbers.

Solve it in three ways:

1. Using a third variable.
2. Using arithmetic operators.
3. Using XOR.

### Focus

Variables, operators, primitive data types.

---

## 4. Area and Perimeter Calculator

Calculate area and perimeter of:

* Circle
* Rectangle
* Square
* Triangle

### Focus

`double`, mathematical formulas, methods.

---

## 5. Temperature Converter

Create a program that converts:

* Celsius → Fahrenheit
* Fahrenheit → Celsius
* Celsius → Kelvin
* Kelvin → Celsius

### Focus

Arithmetic operations and type casting.

---

## 6. Simple Interest Calculator

Take:

* Principal
* Rate
* Time

Calculate simple interest and total amount.

---

## 7. Compound Interest Calculator

Take:

* Principal
* Rate
* Time
* Number of times interest is compounded

Calculate compound interest.

### Focus

`Math.pow()` and floating-point calculations.

---

## 8. Convert Seconds

Take total seconds and convert them into:

```text
Hours
Minutes
Seconds
```

Example:

```text
Input: 3665

Output:
1 Hour
1 Minute
5 Seconds
```

---

## 9. Convert Days

Take a number of days and convert it approximately into:

```text
Years
Months
Weeks
Days
```

Clearly define the assumptions used.

---

## 10. Character Information

Take a character and determine:

* ASCII/Unicode value
* Whether it is uppercase
* Whether it is lowercase
* Whether it is a digit
* Whether it is a special character

---

# 2. Conditions and Decision Making

## 11. Even or Odd

Determine whether a number is even or odd.

---

## 12. Positive, Negative or Zero

Determine whether a number is:

* Positive
* Negative
* Zero

---

## 13. Largest of Two Numbers

Find the largest of two numbers.

Solve using:

* `if-else`
* Ternary operator

---

## 14. Largest of Three Numbers

Find the largest of three numbers.

Handle equal values correctly.

---

## 15. Smallest of Three Numbers

Find the smallest of three numbers.

---

## 16. Leap Year

Determine whether a year is a leap year.

Test edge cases such as:

```text
1900
2000
2024
2025
```

---

## 17. Voting Eligibility

Take age as input and determine whether the person is eligible to vote.

---

## 18. Grade Calculator

Take marks for multiple subjects and calculate:

* Total
* Average
* Percentage
* Grade

Define your own grading rules.

---

## 19. Electricity Bill Calculator

Calculate electricity bill using slab-based pricing.

Example:

```text
0–100 units
101–200 units
201–500 units
500+ units
```

---

## 20. Menu-Driven Calculator

Create a calculator using `switch`.

Menu:

```text
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus
6. Exit
```

---

# 3. Loops and Number Problems

## 21. Print Numbers

Print numbers from:

```text
1 to N
```

---

## 22. Print Even Numbers

Print all even numbers between 1 and N.

---

## 23. Print Odd Numbers

Print all odd numbers between 1 and N.

---

## 24. Sum of N Natural Numbers

Calculate:

```text
1 + 2 + 3 + ... + N
```

---

## 25. Multiplication Table

Print the multiplication table of a given number.

---

## 26. Factorial

Calculate factorial using a loop.

Then solve it using recursion.

---

## 27. Power of a Number

Calculate:

```text
base^exponent
```

without using `Math.pow()`.

---

## 28. Count Digits

Count the number of digits in an integer.

---

## 29. Reverse a Number

Reverse an integer.

Example:

```text
Input: 12345
Output: 54321
```

---

## 30. Sum of Digits

Calculate the sum of digits.

Example:

```text
Input: 12345
Output: 15
```

---

## 31. Product of Digits

Calculate the product of all digits.

---

## 32. Palindrome Number

Determine whether a number is a palindrome.

Example:

```text
121 → Palindrome
123 → Not Palindrome
```

---

## 33. Armstrong Number

Check whether a number is an Armstrong number.

Test:

```text
153
370
9474
```

---

## 34. Prime Number

Determine whether a number is prime.

Optimize the solution using:

```text
sqrt(n)
```

---

## 35. Prime Numbers in Range

Print all prime numbers between two numbers.

---

## 36. Fibonacci Series

Print the first N Fibonacci numbers.

---

## 37. Nth Fibonacci Number

Find the Nth Fibonacci number.

Solve using:

* Iteration
* Recursion

---

## 38. GCD

Find the GCD of two numbers.

Implement:

* Brute force approach
* Euclidean algorithm

---

## 39. LCM

Find the LCM of two numbers.

---

## 40. Perfect Number

Determine whether a number is a perfect number.

Example:

```text
6 = 1 + 2 + 3
```

---

## 41. Strong Number

Determine whether a number is a Strong number.

Example:

```text
145 = 1! + 4! + 5!
```

---

## 42. Automorphic Number

Check whether the square of a number ends with the number itself.

Example:

```text
25² = 625
```

---

## 43. Harshad Number

Check whether a number is divisible by the sum of its digits.

---

## 44. Decimal to Binary

Convert a decimal number to binary without using built-in conversion methods.

---

## 45. Binary to Decimal

Convert a binary number to decimal.

---

# 4. Patterns

## 46. Right Triangle Star Pattern

Print:

```text
*
**
***
****
*****
```

---

## 47. Inverted Triangle

Print:

```text
*****
****
***
**
*
```

---

## 48. Pyramid Pattern

Print:

```text
    *
   ***
  *****
 *******
*********
```

---

## 49. Inverted Pyramid

Print an inverted pyramid.

---

## 50. Diamond Pattern

Create a complete diamond using stars.

---

## 51. Number Triangle

Print:

```text
1
12
123
1234
12345
```

---

## 52. Repeated Number Triangle

Print:

```text
1
22
333
4444
55555
```

---

## 53. Floyd's Triangle

Print Floyd's triangle.

Example:

```text
1
2 3
4 5 6
7 8 9 10
```

---

## 54. Pascal's Triangle

Generate Pascal's triangle.

---

## 55. Hollow Rectangle

Print:

```text
*****
*   *
*   *
*****
```

---

# 5. Arrays

## 56. Array Sum and Average

Calculate the sum and average of all array elements.

---

## 57. Largest Array Element

Find the largest element.

---

## 58. Smallest Array Element

Find the smallest element.

---

## 59. Reverse an Array

Reverse an array without creating another array.

---

## 60. Copy an Array

Copy one array into another.

Solve using:

* Loop
* `Arrays.copyOf()`

---

## 61. Count Even and Odd Elements

Count how many elements are:

* Even
* Odd

---

## 62. Positive and Negative Elements

Count positive, negative and zero elements.

---

## 63. Second Largest Element

Find the second largest element.

Do not simply sort the entire array.

---

## 64. Second Smallest Element

Find the second smallest element.

Handle duplicate values.

---

## 65. Linear Search

Search for an element using linear search.

Return its index.

---

## 66. Binary Search

Implement binary search manually.

Do not use `Arrays.binarySearch()`.

---

## 67. Bubble Sort

Implement Bubble Sort manually.

---

## 68. Selection Sort

Implement Selection Sort manually.

---

## 69. Insertion Sort

Implement Insertion Sort manually.

---

## 70. Remove Duplicates

Remove duplicate elements from an integer array.

Solve using:

1. Array only
2. `HashSet`

Compare both approaches.

---

## 71. Frequency of Array Elements

Given an array:

```text
[1, 2, 2, 3, 3, 3]
```

Output:

```text
1 → 1
2 → 2
3 → 3
```

---

## 72. Missing Number

Given numbers from `1` to `N` with one number missing, find the missing number.

---

## 73. Duplicate Number

Find a duplicate element in an array.

---

## 74. Move Zeros to End

Input:

```text
[0, 1, 0, 3, 12]
```

Output:

```text
[1, 3, 12, 0, 0]
```

---

## 75. Rotate Array

Rotate an array:

* Left by K positions
* Right by K positions

---

# 6. 2D Arrays and Matrices

## 76. Matrix Input and Output

Create a program to input and display a matrix.

---

## 77. Matrix Addition

Add two matrices.

---

## 78. Matrix Subtraction

Subtract two matrices.

---

## 79. Matrix Multiplication

Multiply two matrices.

---

## 80. Matrix Transpose

Find the transpose of a matrix.

---

## 81. Matrix Diagonal Sum

Calculate:

* Main diagonal sum
* Secondary diagonal sum

---

## 82. Identity Matrix

Check whether a matrix is an identity matrix.

---

## 83. Symmetric Matrix

Check whether a matrix is symmetric.

---

## 84. Search in Matrix

Search for an element in a 2D matrix.

---

## 85. Spiral Matrix

Print a matrix in spiral order.

Example:

```text
1  2  3
4  5  6
7  8  9
```

Output:

```text
1 2 3 6 9 8 7 4 5
```

---

# 7. Strings

## 86. Reverse a String

Reverse a string.

Solve using:

* Loop
* `StringBuilder`

---

## 87. String Palindrome

Check whether a string is a palindrome.

---

## 88. Count Vowels and Consonants

Count:

* Vowels
* Consonants
* Digits
* Spaces
* Special characters

---

## 89. Count Words

Count the number of words in a sentence.

Handle multiple spaces correctly.

---

## 90. Character Frequency

Count the frequency of every character.

---

## 91. Duplicate Characters

Find duplicate characters in a string.

---

## 92. Remove Duplicate Characters

Remove duplicate characters while preserving their first occurrence.

---

## 93. Anagram Checker

Check whether two strings are anagrams.

Example:

```text
listen
silent
```

---

## 94. First Non-Repeating Character

Find the first character that occurs only once.

---

## 95. First Repeating Character

Find the first character that occurs more than once.

---

## 96. String Rotation

Check whether one string is a rotation of another.

Example:

```text
ABCD
CDAB
```

---

## 97. Longest Word

Find the longest word in a sentence.

---

## 98. Remove Spaces

Remove all spaces from a string.

Then solve it while preserving spaces inside quoted text as an advanced variation.

---

## 99. String Compression

Convert:

```text
aaabbcccc
```

into:

```text
a3b2c4
```

---

## 100. Custom String Utility

Create a utility class:

```java
StringUtils
```

Implement methods:

```java
reverse()
isPalindrome()
countVowels()
countWords()
removeDuplicates()
isAnagram()
```

Avoid unnecessary built-in shortcuts.

---

# 8. Methods and Recursion

## 101. Method-Based Calculator

Create separate methods for:

```java
add()
subtract()
multiply()
divide()
modulus()
```

---

## 102. Recursive Factorial

Implement factorial recursively.

---

## 103. Recursive Fibonacci

Implement Fibonacci recursively.

---

## 104. Recursive Sum of Digits

Calculate the sum of digits recursively.

---

## 105. Recursive Reverse String

Reverse a string using recursion.

---

## 106. Recursive Power

Calculate `x^n` using recursion.

---

## 107. Recursive GCD

Implement Euclidean GCD recursively.

---

## 108. Tower of Hanoi

Solve Tower of Hanoi using recursion.

Print every move.

---

# 9. OOP Fundamentals

## 109. Student Class

Create:

```java
class Student
```

Fields:

```text
id
name
age
marks
```

Implement:

* Constructor
* Getters
* Setters
* `displayStudent()`

---

## 110. Bank Account

Create:

```java
class BankAccount
```

Methods:

```java
deposit()
withdraw()
checkBalance()
```

Add validation for invalid transactions.

---

## 111. Employee Class

Create an employee class containing:

```text
id
name
salary
department
```

Implement:

```java
calculateAnnualSalary()
displayEmployee()
```

---

## 112. Rectangle Class

Create a `Rectangle` class with:

```java
area()
perimeter()
```

Use encapsulation.

---

## 113. Constructor Overloading

Create a class with multiple constructors.

Example:

```java
Student()
Student(String name)
Student(String name, int age)
Student(String name, int age, double marks)
```

---

## 114. Method Overloading

Create overloaded methods:

```java
add(int, int)
add(double, double)
add(int, int, int)
```

---

## 115. Inheritance

Create:

```text
Person
   ↓
Employee
   ↓
Manager
```

Demonstrate inherited properties and methods.

---

## 116. Method Overriding

Create:

```text
Animal
 ├── Dog
 └── Cat
```

Override:

```java
sound()
```

---

## 117. Abstract Class

Create:

```java
abstract class Shape
```

with:

```java
abstract double area();
```

Implement:

```text
Circle
Rectangle
Triangle
```

---

## 118. Interface

Create:

```java
interface Payment
```

Implement:

```text
CreditCardPayment
UPIPayment
CashPayment
```

---

# 10. Advanced OOP

## 119. Library Management System

Create:

```text
Book
Student
Librarian
Library
```

Features:

* Add book
* Remove book
* Search book
* Issue book
* Return book

Use proper OOP design.

---

## 120. Banking System

Create:

```text
Account
SavingsAccount
CurrentAccount
Customer
Bank
```

Implement:

* Deposit
* Withdraw
* Transfer
* Balance
* Account creation

Demonstrate polymorphism.

---

## 121. Employee Payroll System

Create:

```text
Employee
FullTimeEmployee
PartTimeEmployee
ContractEmployee
```

Calculate salaries differently using overriding.

---

## 122. Shopping Cart

Create:

```text
Product
CartItem
ShoppingCart
Customer
```

Implement:

* Add product
* Remove product
* Update quantity
* Calculate total

---

## 123. Vehicle Management System

Create:

```text
Vehicle
 ├── Car
 ├── Bike
 └── Truck
```

Override:

```java
calculateMileage()
calculateRent()
```

---

## 124. Hospital Management System

Create:

```text
Patient
Doctor
Appointment
Hospital
```

Implement appointment booking and cancellation.

---

## 125. Parking Lot System

Create:

```text
Vehicle
Car
Bike
ParkingSpot
ParkingLot
Ticket
```

Implement:

* Vehicle entry
* Spot assignment
* Vehicle exit
* Fee calculation

---

## 126. ATM Simulation

Implement:

```text
Login
Check Balance
Deposit
Withdraw
Transfer
Transaction History
Logout
```

Use OOP and exception handling.

---

# 11. Collections Framework

## 127. ArrayList Student Management

Use:

```java
ArrayList<Student>
```

Implement:

* Add
* Delete
* Search
* Update
* Display

---

## 128. HashMap Contact Book

Use:

```java
HashMap<String, Contact>
```

Implement:

* Add contact
* Delete contact
* Search contact
* Update contact

---

## 129. HashSet Duplicate Removal

Remove duplicates from a collection using `HashSet`.

Then solve the same problem without using `Set`.

---

## 130. PriorityQueue Task Manager

Create:

```text
Task
name
priority
deadline
```

Use `PriorityQueue` to process tasks by priority.

---

## 131. Stack-Based Bracket Checker

Check whether:

```text
{[()]}
```

is balanced.

Use `Deque`.

---

## 132. Word Frequency Counter

Read a paragraph and count each word using:

```java
HashMap<String, Integer>
```

---

## 133. Sort Objects Using Comparator

Create a list of employees and sort by:

1. Salary
2. Name
3. Age

Use `Comparator`.

---

## 134. Comparable Student Sorting

Make `Student` implement:

```java
Comparable<Student>
```

Sort students by marks.

---

# 12. Exception Handling

## 135. Basic Exception Handling

Create a calculator that safely handles:

* Division by zero
* Invalid input
* Overflow-related issues where applicable

---

## 136. Custom Banking Exceptions

Create:

```java
InsufficientBalanceException
InvalidAmountException
AccountNotFoundException
```

Use them in your banking system.

---

## 137. Custom Age Validation Exception

Create:

```java
InvalidAgeException
```

Throw it when an invalid age is supplied.

---

## 138. Login Exception System

Create custom exceptions:

```text
InvalidUsernameException
InvalidPasswordException
AccountLockedException
```

Lock the account after multiple failed attempts.

---

# 13. File Handling and Serialization

## 139. Student File Management

Store student records in a file.

Implement:

```text
Add
View
Search
Update
Delete
```

Use Java file I/O.

---

## 140. Log File Analyzer

Read a log file and count:

```text
INFO
WARNING
ERROR
```

Display the total number of each.

---

## 141. Serialization and Deserialization

Create:

```java
class Student implements Serializable
```

Serialize students into a file.

Then deserialize them.

---

## 142. Object-Based Employee Database

Store multiple employee objects using serialization.

Implement:

* Add
* Search
* Update
* Delete
* Display

---

# 14. Generics, Enums and Comparable

## 143. Generic Repository

Create:

```java
class Repository<T>
```

Implement:

```java
add(T obj)
remove(T obj)
find(...)
getAll()
```

Test it with:

```text
Student
Employee
Product
```

---

## 144. Generic Pair

Create:

```java
class Pair<K, V>
```

Use it for:

```text
ID → Student
Name → Salary
Product → Price
```

---

## 145. Generic Stack

Create:

```java
class MyStack<T>
```

Implement:

```java
push()
pop()
peek()
isEmpty()
size()
```

Do not use Java's built-in Stack internally.

---

## 146. Enum-Based Application

Create an enum:

```java
OrderStatus
```

with:

```text
PENDING
CONFIRMED
SHIPPED
DELIVERED
CANCELLED
```

Create an order system using this enum.

---

# 15. Java 8+ Features

## 147. Lambda-Based Calculator

Create a functional interface:

```java
@FunctionalInterface
interface Calculator
```

Use lambda expressions for:

```text
Addition
Subtraction
Multiplication
Division
```

---

## 148. Stream-Based Employee Analyzer

Create a list of employees and use Streams to:

* Find employees earning above a salary
* Find highest salary
* Find lowest salary
* Calculate average salary
* Group employees by department
* Sort employees
* Count employees

Use:

```java
filter()
map()
sorted()
collect()
groupingBy()
count()
max()
min()
average()
```

---

# 16. Multithreading and Concurrency

## 149. Multithreaded Bank Simulation

Create multiple threads performing:

```text
Deposit
Withdraw
Transfer
```

on shared bank accounts.

First implement an unsafe version.

Then fix race conditions using:

```java
synchronized
```

Finally experiment with:

```java
Lock
```

Understand why synchronization is necessary.

---

# 17. Advanced Core Java Projects

## 150. Complete Console-Based E-Commerce System

Build a complete Core Java application.

### Users

```text
User
Customer
Admin
```

### Product System

```text
Product
Category
Inventory
```

### Shopping System

```text
Cart
CartItem
Order
OrderItem
```

### Payment System

```text
Payment
CreditCardPayment
UPIPayment
CashPayment
```

### Repository Layer

```text
ProductRepository
UserRepository
OrderRepository
```

### Customer Features

```text
Register
Login
Logout

Browse Products
Search Products
Filter Products

Add to Cart
Remove from Cart
Update Quantity

Place Order
Cancel Order

Make Payment

View Order History
```

### Admin Features

```text
Admin Login

Add Product
Remove Product
Update Product
View Products

View Customers
View Orders

Update Order Status
```

### Persistence

Store application data using files.

Use:

```text
File I/O
Serialization
```

### Core Java Concepts to Apply

Your final project should demonstrate as many of these as possible:

```text
Classes
Objects
Constructors
Encapsulation
Inheritance
Polymorphism
Abstraction
Interfaces
Method Overloading
Method Overriding
Enums
Collections
Generics
Comparable
Comparator
Exception Handling
Custom Exceptions
File I/O
Serialization
Lambda Expressions
Streams
Optional
Multithreading
Synchronization
```

### Restrictions

Do **not** use:

```text
Spring
Spring Boot
Hibernate
JPA
Android
Jakarta EE
Any external framework
```

Initially, also avoid a database.

Use files for persistence.

---

# 🧪 How to Solve Every Problem

For every problem, follow this process.

## Step 1 — Understand

Before coding, write down:

```text
What is the input?
What is the output?
What are the constraints?
What edge cases exist?
What Java concepts are required?
```

---

## Step 2 — Solve Without Looking at the Solution

Give yourself a fixed amount of time.

Recommended:

| Difficulty |      Time |
| ---------- | --------: |
| Easy       | 15–30 min |
| Medium     | 30–60 min |
| Hard       | 1–2 hours |
| Project    |  1–7 days |

---

## Step 3 — Test Your Program

Do not test only the normal case.

Test:

```text
Minimum input
Maximum input
Zero
Negative values
Empty input
Duplicate values
Invalid input
Boundary cases
```

---

## Step 4 — Refactor

After the program works, ask:

* Can I make the code cleaner?
* Can I remove duplicated code?
* Should this logic be a method?
* Should this data belong to a class?
* Can I improve variable names?
* Can I improve time complexity?
* Can I improve memory usage?

---

## Step 5 — Rebuild From Memory

Delete your implementation.

Try to recreate it without looking at your previous code.

This is one of the most important steps for building programming confidence.

---

# 🔥 Difficulty Milestones

| Problems | Expected Ability                        |
| -------: | --------------------------------------- |
|     1–20 | Basic Java syntax                       |
|    21–45 | Conditions, loops and number logic      |
|    46–55 | Nested loops and patterns               |
|    56–75 | Arrays and basic algorithms             |
|    76–85 | Matrix manipulation                     |
|   86–100 | String manipulation                     |
|  101–108 | Methods and recursion                   |
|  109–118 | OOP fundamentals                        |
|  119–126 | Real-world OOP                          |
|  127–134 | Collections                             |
|  135–138 | Exception handling                      |
|  139–142 | File handling                           |
|  143–146 | Generics and advanced language features |
|  147–148 | Functional programming / Streams        |
|      149 | Multithreading                          |
|      150 | Complete Core Java project              |

---

# ✅ Mastery Checklist

Don't mark a problem complete simply because you saw the solution.

Use:

```text
[ ] I understood the problem
[ ] I designed the solution myself
[ ] I wrote the code myself
[ ] My code compiles
[ ] My code passes normal test cases
[ ] I tested edge cases
[ ] I can explain every line
[ ] I can rewrite it without looking
[ ] I can modify the program
[ ] I understand the Java concepts used
```

A problem is **truly completed** only when you can check all of these.

---

# 🏆 Final Java Confidence Test

After completing all 150 problems, close your notes and attempt these from scratch:

1. Student Management System
2. Library Management System
3. Banking System
4. ATM
5. Parking Lot
6. Shopping Cart
7. Employee Payroll System
8. Hospital Management System
9. File-Based Contact Manager
10. Console-Based E-Commerce System

You should be able to decide independently:

```text
What classes do I need?
What fields should each class contain?
What methods should each class contain?
Where should inheritance be used?
Where should interfaces be used?
Where should composition be used?
Which collection should I use?
Where should exceptions be handled?
How should data be persisted?
How should objects interact?
```

If you can build these without following a tutorial step-by-step, you are no longer just **learning Java syntax** — you are actually **programming in Java**.

---

# 🎯 Recommended Learning Order

```text
Java Syntax
     ↓
Conditions
     ↓
Loops
     ↓
Numbers
     ↓
Patterns
     ↓
Arrays
     ↓
Matrices
     ↓
Strings
     ↓
Methods
     ↓
Recursion
     ↓
Classes & Objects
     ↓
Encapsulation
     ↓
Constructors
     ↓
Inheritance
     ↓
Polymorphism
     ↓
Abstraction
     ↓
Interfaces
     ↓
Collections
     ↓
Exceptions
     ↓
File I/O
     ↓
Serialization
     ↓
Generics
     ↓
Comparable / Comparator
     ↓
Lambda
     ↓
Streams
     ↓
Multithreading
     ↓
Synchronization
     ↓
Real-World Projects
```

# 🚀 Rule

**Do not rush through all 150.**

The objective is not:

> "I solved 150 questions."

The objective is:

> **"Give me a Java problem I haven't seen before, and I can break it down, design the classes/logic, write the code, debug it, test it, and explain why it works."**

That is the level of confidence this question bank is designed to build.
