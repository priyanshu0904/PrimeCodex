# Java Mastery — Comprehensive Practice & Problem Bank

> **Goal:** Build genuine Core Java mastery through progressively difficult practice, combining the supplied Java practice exercises with an expanded set of original problems. The source material covers Java fundamentals, variables/input, operators, loops, methods, arrays, OOP, collections, exceptions, file handling, generics, Java 8+ features, streams, and multithreading; the original 150-question bank also provides a progression through these areas.  

**Total:** 160 questions
**Scope:** Core Java → Advanced Core Java → Interview → Real-World Development
**Solutions:** Not included

---

# 📚 Table of Contents

1. [Java Fundamentals, Variables & Input](#1-java-fundamentals-variables--input)
2. [Operators & Decision Making](#2-operators--decision-making)
3. [Loops & Number Problems](#3-loops--number-problems)
4. [Patterns](#4-patterns)
5. [Methods & Recursion](#5-methods--recursion)
6. [Arrays & Searching](#6-arrays--searching)
7. [Sorting & Array Problem Solving](#7-sorting--array-problem-solving)
8. [2D Arrays & Matrices](#8-2d-arrays--matrices)
9. [Strings & String Processing](#9-strings--string-processing)
10. [Classes, Objects & Encapsulation](#10-classes-objects--encapsulation)
11. [Inheritance, Polymorphism & Abstraction](#11-inheritance-polymorphism--abstraction)
12. [Collections Framework](#12-collections-framework)
13. [Exceptions, File I/O & Serialization](#13-exceptions-file-io--serialization)
14. [Generics, Enums, Comparable & Comparator](#14-generics-enums-comparable--comparator)
15. [Lambda, Functional Programming, Optional & Streams](#15-lambda-functional-programming-optional--streams)
16. [Multithreading & Concurrency](#16-multithreading--concurrency)
17. [Advanced Core Java & Interview Problems](#17-advanced-core-java--interview-problems)
18. [Real-World Projects](#18-real-world-projects)
19. [Mastery Tests](#19-mastery-tests)
20. [Mastery Checklist](#20-mastery-checklist)

---

# 1. Java Fundamentals, Variables & Input

## 1. Personal Information Program

**Difficulty:** 🟢 Easy

### Problem

Create a Java program that displays your personal information.

### Requirements

* Display name.
* Display age.
* Display college.
* Display branch.
* Display career goal.
* Print each item on a separate line.

### Input

No input.

### Output

Display the requested information.

### Example

**Output:**

```text
Name: Priyanshu
Age: 22
College: Gaya College of Engineering
Branch: Computer Science
Career Goal: Software Engineer
```

### Constraints

* Use a `main()` method.
* Use console output.

### Edge Cases

* None.

### Concepts Practiced

* Class
* `main()`
* `System.out.println()`

### What to Pay Attention To

* Java program structure.
* Correct `main()` signature.

### Things to Think About

* What is the JVM looking for when a program starts?

### Common Mistakes

* Incorrect `main()` signature.
* Missing semicolons.

---

## 2. Welcome Program

**Difficulty:** 🟢 Easy

### Problem

Read a person's name and display a personalized welcome message.

### Requirements

* Read the name from the console.
* Print `Welcome NAME to Java`.

### Input

```text
Priyanshu
```

### Output

```text
Welcome Priyanshu to Java
```

### Constraints

* Use `Scanner`.

### Edge Cases

* Name contains spaces.
* Empty input.

### Concepts Practiced

* `Scanner`
* `String`
* Console input

### What to Pay Attention To

* Difference between token-based and line-based input.

### Things to Think About

* When should `next()` and `nextLine()` be used?

### Common Mistakes

* Mixing `nextInt()` and `nextLine()` incorrectly.

---

## 3. Basic Calculator

**Difficulty:** 🟢 Easy

### Problem

Read two numbers and perform addition, subtraction, multiplication, division, and modulus.

### Requirements

* Display every operation.
* Handle division by zero.

### Input

```text
20 6
```

### Output

```text
Addition: 26
Subtraction: 14
Multiplication: 120
Division: 3
Modulus: 2
```

### Constraints

* Support integer input.

### Edge Cases

* Zero divisor.
* Negative numbers.
* Equal numbers.

### Concepts Practiced

* Arithmetic operators
* Input
* Conditional logic

### What to Pay Attention To

* Integer division versus floating-point division.

### Things to Think About

* What changes if both operands are `double`?

### Common Mistakes

* Integer division when decimal output is expected.
* Division by zero.

---

## 4. Floating-Point Calculator

**Difficulty:** 🟢 Easy

### Problem

Create a calculator specifically for two floating-point numbers.

### Requirements

* Perform `+`, `-`, `*`, `/`.
* Display results with reasonable precision.

### Input

```text
12.5 2.5
```

### Output

```text
15.0
10.0
31.25
5.0
```

### Constraints

* Use `double`.

### Edge Cases

* Very small values.
* Negative values.
* Zero.

### Concepts Practiced

* `double`
* Arithmetic
* Numeric precision

### What to Pay Attention To

* Floating-point representation.

### Things to Think About

* Why might `0.1 + 0.2` not exactly equal `0.3`?

### Common Mistakes

* Assuming floating-point numbers are exact.

---

## 5. Swap Two Numbers

**Difficulty:** 🟢 Easy

### Problem

Swap two integers.

### Requirements

Implement three versions:

1. Using a temporary variable.
2. Using arithmetic.
3. Using XOR.

### Input

```text
10 20
```

### Output

```text
Before: 10 20
After: 20 10
```

### Constraints

* Compare the approaches.

### Edge Cases

* Equal values.
* Negative values.
* Integer overflow in arithmetic approach.

### Concepts Practiced

* Variables
* Arithmetic
* Bitwise XOR

### What to Pay Attention To

* The XOR approach has practical limitations.

### Things to Think About

* Which approach would you actually use in production?

### Common Mistakes

* Arithmetic overflow.
* Incorrect XOR sequence.

---

## 6. Type Conversion Demonstrator

**Difficulty:** 🟢 Easy

### Problem

Create a program demonstrating widening and narrowing conversions.

### Requirements

Demonstrate conversions involving:

* `byte`
* `short`
* `int`
* `long`
* `float`
* `double`
* `char`

### Input

No fixed input.

### Output

Display the original and converted values.

### Constraints

* Include at least one explicit cast.

### Edge Cases

* Narrowing a large value.
* Decimal-to-integer conversion.

### Concepts Practiced

* Primitive types
* Casting
* Type conversion

### What to Pay Attention To

* Information loss during narrowing.

### Things to Think About

* Why can `int` become `double` automatically but not vice versa?

### Common Mistakes

* Assuming narrowing is always safe.

---

## 7. Escape Sequence Printer

**Difficulty:** 🟢 Easy

### Problem

Print a formatted message containing tabs, quotation marks, backslashes, and new lines.

### Requirements

Use Java escape sequences.

### Input

No input.

### Output

Create a readable multi-line output.

### Constraints

* Use escape sequences rather than separate print statements where appropriate.

### Edge Cases

* Quotes inside strings.
* Backslash characters.

### Concepts Practiced

* Strings
* Escape sequences

### What to Pay Attention To

* Escaping characters correctly.

### Things to Think About

* Which characters require escaping?

### Common Mistakes

* Incorrect backslash usage.

---

## 8. Shape Calculator

**Difficulty:** 🟢 Easy

### Problem

Calculate area and perimeter/circumference for a circle, rectangle, square, and triangle.

### Requirements

* Accept required dimensions.
* Display area.
* Display perimeter where applicable.

### Input

Shape-specific dimensions.

### Output

Calculated values.

### Constraints

* Use `double`.

### Edge Cases

* Zero dimensions.
* Negative dimensions.

### Concepts Practiced

* Arithmetic
* Methods
* `Math.PI`

### What to Pay Attention To

* Validate dimensions.

### Things to Think About

* Where should validation occur?

### Common Mistakes

* Incorrect triangle formula.

---

## 9. Temperature Converter

**Difficulty:** 🟢 Easy

### Problem

Build a temperature converter.

### Requirements

Support:

* Celsius → Fahrenheit
* Fahrenheit → Celsius
* Celsius → Kelvin
* Kelvin → Celsius

### Input

Temperature and conversion choice.

### Output

Converted temperature.

### Constraints

* Reject physically invalid Kelvin values.

### Edge Cases

* Absolute zero.
* Negative Celsius.
* Decimal values.

### Concepts Practiced

* Arithmetic
* `switch`
* Validation

### What to Pay Attention To

* Unit consistency.

### Things to Think About

* What is the valid range for Kelvin?

### Common Mistakes

* Integer division.
* Incorrect conversion formula.

---

## 10. Time Converter

**Difficulty:** 🟢 Easy

### Problem

Convert total seconds into hours, minutes, and seconds.

### Requirements

Use:

```text
Input: 3665
```

### Output

```text
1 Hour
1 Minute
5 Seconds
```

### Constraints

* Input must be non-negative.

### Edge Cases

* `0`.
* Exactly one hour.
* Exactly one minute.

### Concepts Practiced

* Integer division
* Modulus

### What to Pay Attention To

* Remainder calculation.

### Things to Think About

* How would you extend this to days?

### Common Mistakes

* Incorrect modulus calculations.

---

# 🧠 Checkpoint

Before continuing, make sure you can:

* Create and run a Java program without an IDE.
* Read primitive and string input.
* Use primitive data types correctly.
* Explain widening and narrowing conversion.
* Perform basic arithmetic without looking at syntax.
* Identify integer versus floating-point division.

---

# 2. Operators & Decision Making

## 11. Even or Odd

**Difficulty:** 🟢 Easy

### Problem

Determine whether an integer is even or odd.

### Requirements

* Read an integer.
* Display the classification.

### Input

```text
17
```

### Output

```text
Odd
```

### Constraints

* Handle negative integers.

### Edge Cases

* `0`.
* Negative even number.

### Concepts Practiced

* `%`
* `if-else`

### What to Pay Attention To

* Zero is even.

### Things to Think About

* Can this be solved using bitwise operations?

### Common Mistakes

* Incorrect handling of negative numbers.

---

## 12. Positive, Negative or Zero

**Difficulty:** 🟢 Easy

### Problem

Classify a number.

### Requirements

Return exactly one of:

```text
Positive
Negative
Zero
```

### Input

```text
-7
```

### Output

```text
Negative
```

### Constraints

* Support integer values.

### Edge Cases

* Zero.
* Minimum integer.

### Concepts Practiced

* Relational operators
* Conditional statements

### What to Pay Attention To

* Conditions should be mutually exclusive.

### Things to Think About

* Could a nested condition make this less readable?

### Common Mistakes

* Overlapping conditions.

---

## 13. Largest of Two Numbers

**Difficulty:** 🟢 Easy

### Problem

Find the largest of two numbers.

### Requirements

Implement using:

* `if-else`
* Ternary operator

### Input

```text
10 25
```

### Output

```text
25
```

### Edge Cases

* Equal numbers.
* Negative numbers.

### Concepts Practiced

* Conditional expressions
* Ternary operator

### What to Pay Attention To

* Equal values.

### Things to Think About

* When does ternary improve readability?

### Common Mistakes

* Incorrect comparison operator.

---

## 14. Largest of Three Numbers

**Difficulty:** 🟢 Easy

### Problem

Find the largest among three integers.

### Requirements

Handle equal values correctly.

### Input

```text
10 30 20
```

### Output

```text
30
```

### Edge Cases

* All equal.
* Two equal maximum values.
* All negative.

### Concepts Practiced

* `if-else`
* Logical operators

### What to Pay Attention To

* Avoid unnecessary nested conditions.

### Things to Think About

* Could `Math.max()` simplify the solution?

### Common Mistakes

* Missing equality cases.

---

## 15. Leap Year Validator

**Difficulty:** 🟢 Easy

### Problem

Determine whether a year is a leap year.

### Requirements

Test:

```text
1900
2000
2024
2025
```

### Input

An integer year.

### Output

```text
Leap Year
```

or

```text
Not a Leap Year
```

### Constraints

Use the Gregorian leap-year rules.

### Edge Cases

* Century years.
* Year divisible by 400.

### Concepts Practiced

* Logical operators
* Nested conditions

### What to Pay Attention To

* `1900` and `2000` behave differently.

### Things to Think About

* Can the condition be expressed clearly in one boolean expression?

### Common Mistakes

* Checking only divisibility by four.

---

## 16. Grade Calculator

**Difficulty:** 🟢 Easy

### Problem

Read marks for multiple subjects and calculate total, average, percentage, and grade.

### Requirements

Define grades such as:

```text
A >= 90
B >= 75
C >= 60
D >= 30
F < 30
```

### Input

Subject marks.

### Output

Display all calculated values.

### Constraints

* Validate marks between `0` and `100`.

### Edge Cases

* `0`.
* `100`.
* Invalid marks.

### Concepts Practiced

* Arithmetic
* Conditions
* Validation

### What to Pay Attention To

* Grade boundary conditions.

### Things to Think About

* How would you support any number of subjects?

### Common Mistakes

* Incorrect average calculation.

---

## 17. Age Group Classifier

**Difficulty:** 🟢 Easy

### Problem

Classify a person as child, teenager, adult, or senior.

### Requirements

Define clear boundaries.

### Input

Age.

### Output

Age group.

### Constraints

* Reject negative age.

### Edge Cases

* Boundary values.
* Very large age.

### Concepts Practiced

* Conditions
* Validation

### What to Pay Attention To

* Define ambiguous boundaries explicitly.

### Things to Think About

* Should age `60` be adult or senior?

### Common Mistakes

* Overlapping ranges.

---

## 18. Electricity Bill Calculator

**Difficulty:** 🟡 Medium

### Problem

Calculate an electricity bill using progressive slabs.

### Requirements

Use slabs such as:

```text
0–100
101–200
201–500
500+
```

### Input

Number of units.

### Output

Total bill.

### Constraints

* Define a rate for every slab.

### Edge Cases

* `0`.
* Exactly `100`.
* Exactly `200`.
* Exactly `500`.

### Concepts Practiced

* Conditional logic
* Arithmetic

### What to Pay Attention To

* Progressive versus flat slab pricing.

### Things to Think About

* Is the rate applied to all units or only units inside a slab?

### Common Mistakes

* Applying the highest slab rate to every unit.

---

## 19. Menu-Driven Calculator

**Difficulty:** 🟡 Medium

### Problem

Create a calculator using `switch`.

### Requirements

Menu:

```text
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus
6. Exit
```

### Input

Repeated menu choices and operands.

### Output

Operation results.

### Constraints

* Continue until Exit.
* Handle invalid choices.

### Edge Cases

* Division by zero.
* Invalid menu choice.

### Concepts Practiced

* `switch`
* Loops
* Input validation

### What to Pay Attention To

* Program state across repeated operations.

### Things to Think About

* How can each operation be moved into a method?

### Common Mistakes

* Missing `break`.
* Infinite loop.

---

## 20. Bitwise Operator Demonstrator

**Difficulty:** 🟡 Medium

### Problem

Given two integers, demonstrate:

* `&`
* `|`
* `^`
* `~`
* `<<`
* `>>`

### Input

```text
12 5
```

### Output

Display each result.

### Constraints

* Explain the binary representation alongside the result.

### Edge Cases

* Negative integers.
* Zero.

### Concepts Practiced

* Bitwise operators
* Binary representation

### What to Pay Attention To

* Logical operators and bitwise operators are different.

### Things to Think About

* Why does `^` not mean exponentiation in Java?

### Common Mistakes

* Confusing `&&` with `&`.
* Confusing `||` with `|`.

---

# 🧠 Checkpoint

You should now be able to:

* Build conditional programs without copying syntax.
* Use `switch`.
* Explain operator precedence.
* Explain short-circuit evaluation.
* Use bitwise operators for simple integer operations.
* Handle boundary conditions.

---

# 3. Loops & Number Problems

## 21. Print Numbers from 1 to N

**Difficulty:** 🟢 Easy

### Problem

Print every integer from `1` through `N`.

### Requirements

Use a loop.

### Input

```text
5
```

### Output

```text
1 2 3 4 5
```

### Edge Cases

* `N = 0`.
* Negative input.

### Concepts Practiced

* `for`
* Loop boundaries

### What to Pay Attention To

* Start and end conditions.

### Common Mistakes

* Off-by-one errors.

---

## 22. Print Even Numbers

**Difficulty:** 🟢 Easy

### Problem

Print all even numbers between `1` and `N`.

### Requirements

Use a loop.

### Input

```text
10
```

### Output

```text
2 4 6 8 10
```

### Edge Cases

* `N < 2`.

### Concepts Practiced

* Loops
* Modulus

### What to Pay Attention To

* Avoid unnecessary checks where possible.

### Common Mistakes

* Including odd values.

---

## 23. Sum of Natural Numbers

**Difficulty:** 🟢 Easy

### Problem

Calculate:

```text
1 + 2 + 3 + ... + N
```

### Input

```text
10
```

### Output

```text
55
```

### Constraints

* Consider integer overflow.

### Edge Cases

* `N = 0`.

### Concepts Practiced

* Accumulators
* Loops

### What to Pay Attention To

* Accumulator initialization.

### Things to Think About

* Can you solve it without iteration?

### Common Mistakes

* Incorrect initial sum.

---

## 24. Sum of Odd Numbers

**Difficulty:** 🟢 Easy

### Problem

Calculate the sum of all odd numbers from `1` to `N`.

### Input

```text
10
```

### Output

```text
25
```

### Concepts Practiced

* Loops
* Conditions

### Edge Cases

* `N = 0`.
* `N = 1`.

### What to Pay Attention To

* Odd-number detection.

### Common Mistakes

* Including even numbers.

---

## 25. Multiplication Table

**Difficulty:** 🟢 Easy

### Problem

Print the multiplication table of a given number.

### Input

```text
7
```

### Output

```text
7 x 1 = 7
...
7 x 10 = 70
```

### Constraints

* Print exactly ten rows.

### Edge Cases

* Zero.
* Negative number.

### Concepts Practiced

* Loops
* Arithmetic

### What to Pay Attention To

* Loop boundaries.

### Common Mistakes

* Incorrect multiplier range.

---

## 26. Factorial

**Difficulty:** 🟢 Easy

### Problem

Calculate `n!`.

### Requirements

Implement:

1. Iteratively.
2. Recursively.

### Input

```text
5
```

### Output

```text
120
```

### Edge Cases

* `0!`.
* Negative input.
* Overflow.

### Concepts Practiced

* Loops
* Recursion
* Methods

### What to Pay Attention To

* Base case in recursion.

### Things to Think About

* Which version scales better?

### Common Mistakes

* Missing `0! = 1`.

---

## 27. Power Without Math.pow()

**Difficulty:** 🟢 Easy

### Problem

Calculate `base^exponent` without `Math.pow()`.

### Input

```text
2 5
```

### Output

```text
32
```

### Constraints

* Start with non-negative integer exponent.

### Edge Cases

* Exponent `0`.
* Base `0`.
* Negative base.

### Concepts Practiced

* Loops
* Multiplication

### What to Pay Attention To

* Identity value.

### Things to Think About

* How could exponentiation be optimized?

### Common Mistakes

* Incorrect initialization.

---

## 28. Count Digits

**Difficulty:** 🟢 Easy

### Problem

Count the number of digits in an integer.

### Input

```text
12345
```

### Output

```text
5
```

### Edge Cases

* `0`.
* Negative values.

### Concepts Practiced

* `%`
* `/`
* Loops

### What to Pay Attention To

* Special handling for zero.

### Common Mistakes

* Returning zero digits for input zero.

---

## 29. Reverse a Number

**Difficulty:** 🟢 Easy

### Problem

Reverse an integer.

### Input

```text
12345
```

### Output

```text
54321
```

### Edge Cases

* Trailing zeros.
* Negative number.
* Zero.

### Concepts Practiced

* Modulus
* Integer division

### What to Pay Attention To

* Sign handling.

### Common Mistakes

* Losing the negative sign.

---

## 30. Sum and Product of Digits

**Difficulty:** 🟢 Easy

### Problem

Calculate both the sum and product of all digits.

### Input

```text
1234
```

### Output

```text
Sum: 10
Product: 24
```

### Edge Cases

* Number containing zero.
* Single digit.

### Concepts Practiced

* Digit extraction
* Accumulators

### What to Pay Attention To

* Product must start from `1`.

### Common Mistakes

* Initializing product to zero.

---

## 31. Palindrome Number

**Difficulty:** 🟢 Easy

### Problem

Determine whether a number reads the same forwards and backwards.

### Input

```text
121
```

### Output

```text
Palindrome
```

### Edge Cases

* Negative numbers.
* Zero.
* Trailing zeros.

### Concepts Practiced

* Number reversal
* Comparison

### What to Pay Attention To

* Define whether negative palindromes count.

### Common Mistakes

* Ignoring sign.

---

## 32. Armstrong Number

**Difficulty:** 🟡 Medium

### Problem

Determine whether a number is an Armstrong number.

### Requirements

Test:

```text
153
370
9474
```

### Input

An integer.

### Output

```text
Armstrong
```

or

```text
Not Armstrong
```

### Edge Cases

* Single-digit values.
* Large values.

### Concepts Practiced

* Digit extraction
* Powers
* Loops

### What to Pay Attention To

* Number of digits determines the exponent.

### Common Mistakes

* Always using power `3`.

---

## 33. Prime Number Checker

**Difficulty:** 🟡 Medium

### Problem

Determine whether a number is prime.

### Requirements

Optimize the solution using divisors only up to `sqrt(n)`.

### Input

```text
97
```

### Output

```text
Prime
```

### Edge Cases

* `0`.
* `1`.
* `2`.
* Negative values.

### Concepts Practiced

* Loops
* Mathematical optimization

### What to Pay Attention To

* `1` is not prime.

### Things to Think About

* Why is checking up to `sqrt(n)` sufficient?

### Common Mistakes

* Treating `1` as prime.

---

## 34. Prime Numbers in Range

**Difficulty:** 🟡 Medium

### Problem

Print all prime numbers between two bounds.

### Input

```text
10 30
```

### Output

```text
11 13 17 19 23 29
```

### Constraints

* Use an efficient primality test.

### Edge Cases

* Reversed bounds.
* No primes in range.

### Concepts Practiced

* Nested loops
* Helper methods

### What to Pay Attention To

* Reuse the prime-checking method.

### Common Mistakes

* Repeating inefficient logic unnecessarily.

---

## 35. Fibonacci Series

**Difficulty:** 🟢 Easy

### Problem

Print the first `N` Fibonacci numbers.

### Input

```text
8
```

### Output

```text
0 1 1 2 3 5 8 13
```

### Edge Cases

* `N = 0`.
* `N = 1`.

### Concepts Practiced

* Iteration
* Variables

### What to Pay Attention To

* Updating the previous two values in the correct order.

### Common Mistakes

* Overwriting a required value too early.

---

## 36. Nth Fibonacci Number

**Difficulty:** 🟡 Medium

### Problem

Find the Nth Fibonacci number.

### Requirements

Compare:

* Iteration
* Recursion

### Input

```text
10
```

### Output

```text
55
```

### Constraints

* Discuss performance.

### Edge Cases

* `0`.
* Large `N`.

### Concepts Practiced

* Recursion
* Complexity

### What to Pay Attention To

* Naive recursion grows exponentially.

### Things to Think About

* How could memoization improve it?

### Common Mistakes

* Using naive recursion for large values.

---

## 37. GCD

**Difficulty:** 🟡 Medium

### Problem

Find the GCD of two integers.

### Requirements

Implement:

1. Brute force.
2. Euclidean algorithm.

### Input

```text
48 18
```

### Output

```text
6
```

### Edge Cases

* One number is zero.
* Equal numbers.
* Negative values.

### Concepts Practiced

* Algorithms
* Modulus

### What to Pay Attention To

* Normalize negative inputs.

### Things to Think About

* Why is Euclid's algorithm faster?

### Common Mistakes

* Infinite loops in remainder logic.

---

## 38. LCM

**Difficulty:** 🟡 Medium

### Problem

Find the least common multiple of two integers.

### Input

```text
12 18
```

### Output

```text
36
```

### Constraints

* Avoid unnecessary brute force when possible.

### Edge Cases

* Zero.
* Negative values.

### Concepts Practiced

* GCD
* Arithmetic

### What to Pay Attention To

* Potential integer overflow.

### Common Mistakes

* Incorrect handling of zero.

---

## 39. Perfect Number

**Difficulty:** 🟡 Medium

### Problem

Determine whether a number equals the sum of its proper divisors.

### Input

```text
28
```

### Output

```text
Perfect Number
```

### Concepts Practiced

* Divisors
* Loops

### Edge Cases

* `1`.
* Prime number.
* Large input.

### What to Pay Attention To

* Do not include the number itself.

### Common Mistakes

* Including `n` in the divisor sum.

---

## 40. Strong Number

**Difficulty:** 🟡 Medium

### Problem

Determine whether a number equals the sum of the factorials of its digits.

### Input

```text
145
```

### Output

```text
Strong Number
```

### Concepts Practiced

* Factorial
* Digit extraction

### Edge Cases

* Single-digit values.
* Zero.

### What to Pay Attention To

* Reuse a factorial method.

### Common Mistakes

* Incorrect factorial initialization.

---

## 41. Automorphic Number

**Difficulty:** 🟡 Medium

### Problem

Check whether the square of a number ends with the original number.

### Input

```text
25
```

### Output

```text
Automorphic
```

### Concepts Practiced

* Powers
* Digit logic

### What to Pay Attention To

* Number of digits matters.

### Common Mistakes

* Comparing complete square equality.

---

## 42. Harshad Number

**Difficulty:** 🟡 Medium

### Problem

Determine whether a number is divisible by the sum of its digits.

### Input

```text
18
```

### Output

```text
Harshad Number
```

### Edge Cases

* Zero.
* Negative values.

### Concepts Practiced

* Digit extraction
* Modulus

### What to Pay Attention To

* Avoid division by zero.

### Common Mistakes

* Incorrect digit sum.

---

## 43. Decimal to Binary

**Difficulty:** 🟡 Medium

### Problem

Convert a decimal integer to binary without built-in conversion methods.

### Input

```text
13
```

### Output

```text
1101
```

### Edge Cases

* Zero.
* Negative numbers.

### Concepts Practiced

* Division
* Modulus
* Number systems

### What to Pay Attention To

* Binary digits are obtained in reverse order.

### Common Mistakes

* Printing remainders in the wrong direction.

---

## 44. Binary to Decimal

**Difficulty:** 🟡 Medium

### Problem

Convert a binary number into decimal.

### Input

```text
1101
```

### Output

```text
13
```

### Constraints

* Validate binary digits.

### Edge Cases

* `0`.
* Invalid digit such as `2`.

### Concepts Practiced

* Number systems
* Positional representation

### What to Pay Attention To

* Powers of two.

### Common Mistakes

* Accepting invalid binary input.

---

## 45. Number Property Analyzer

**Difficulty:** 🟡 Medium

### Problem

Create one program that analyzes a number and reports:

* Even/odd
* Positive/negative/zero
* Prime/not prime
* Palindrome/not palindrome
* Armstrong/not Armstrong
* Digit count
* Digit sum

### Input

An integer.

### Output

A complete report.

### Constraints

* Use separate methods for each property.

### Edge Cases

* Zero.
* Negative numbers.
* Large values.

### Concepts Practiced

* Methods
* Loops
* Conditions
* Reusability

### What to Pay Attention To

* Avoid duplicating logic.

### Things to Think About

* How can the program remain maintainable as more properties are added?

### Common Mistakes

* Putting the entire program inside `main()`.

---

# 4. Patterns

## 46. Right Triangle Star Pattern

**Difficulty:** 🟢 Easy

### Problem

Print:

```text
*
**
***
****
*****
```

### Requirements

* Accept number of rows.

### Input

```text
5
```

### Output

```text
*
**
***
****
*****
```

### Concepts Practiced

* Nested loops

### What to Pay Attention To

* Relationship between row number and stars.

### Common Mistakes

* Incorrect inner-loop limit.

---

## 47. Inverted Triangle

**Difficulty:** 🟢 Easy

### Problem

Print an inverted triangle.

### Input

```text
5
```

### Output

```text
*****
****
***
**
*
```

### Concepts Practiced

* Nested loops

### Edge Cases

* One row.

### What to Pay Attention To

* Decreasing inner-loop count.

### Common Mistakes

* Starting at zero.

---

## 48. Pyramid Pattern

**Difficulty:** 🟡 Medium

### Problem

Print a centered star pyramid.

### Input

```text
4
```

### Output

```text
   *
  ***
 *****
*******
```

### Concepts Practiced

* Nested loops
* Spaces
* Pattern reasoning

### What to Pay Attention To

* Number of leading spaces.

### Common Mistakes

* Incorrect alignment.

---

## 49. Inverted Pyramid

**Difficulty:** 🟡 Medium

### Problem

Print a centered inverted pyramid.

### Requirements

* Accept number of rows.
* Maintain symmetry.

### Concepts Practiced

* Nested loops
* Spaces

### Edge Cases

* One row.

### What to Pay Attention To

* Both spaces and stars change.

### Common Mistakes

* Wrong star count.

---

## 50. Diamond Pattern

**Difficulty:** 🟡 Medium

### Problem

Print a complete diamond.

### Input

```text
4
```

### Output

```text
   *
  ***
 *****
*******
 *****
  ***
   *
```

### Concepts Practiced

* Nested loops
* Pattern decomposition

### What to Pay Attention To

* Split the problem into two pyramids.

### Things to Think About

* Can you create reusable methods for each half?

### Common Mistakes

* Incorrect symmetry.

---

## 51. Number Triangle

**Difficulty:** 🟢 Easy

### Problem

Print:

```text
1
12
123
1234
12345
```

### Concepts Practiced

* Nested loops

### What to Pay Attention To

* Inner loop starts at `1`.

### Common Mistakes

* Printing row number repeatedly.

---

## 52. Repeated Number Triangle

**Difficulty:** 🟢 Easy

### Problem

Print:

```text
1
22
333
4444
55555
```

### Concepts Practiced

* Nested loops

### What to Pay Attention To

* Current row determines printed value.

### Common Mistakes

* Printing column number.

---

## 53. Floyd's Triangle

**Difficulty:** 🟡 Medium

### Problem

Generate Floyd's triangle.

### Input

```text
4
```

### Output

```text
1
2 3
4 5 6
7 8 9 10
```

### Concepts Practiced

* Nested loops
* Running counter

### What to Pay Attention To

* Counter persists across rows.

### Common Mistakes

* Resetting counter every row.

---

## 54. Pascal's Triangle

**Difficulty:** 🟠 Hard

### Problem

Generate the first `N` rows of Pascal's triangle.

### Input

```text
5
```

### Output

```text
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
```

### Constraints

* Avoid hardcoding values.

### Edge Cases

* One row.
* Large row count.

### Concepts Practiced

* Nested loops
* Combinatorial reasoning

### What to Pay Attention To

* Each internal value depends on the previous row.

### Things to Think About

* How can you avoid recalculating factorials repeatedly?

### Common Mistakes

* Incorrect edge values.

---

## 55. Hollow Rectangle

**Difficulty:** 🟡 Medium

### Problem

Print a hollow rectangle.

### Input

```text
4 6
```

### Output

```text
******
*    *
*    *
******
```

### Concepts Practiced

* Nested loops
* Conditions

### What to Pay Attention To

* Border detection.

### Common Mistakes

* Filling the interior.

---

# 🧠 Checkpoint

Before continuing, make sure you can:

* Use nested loops naturally.
* Translate a visual pattern into row/column logic.
* Explain why each loop has its particular boundary.
* Solve simple number problems using helper methods.
* Recognize when recursion is appropriate.

---

# 5. Methods & Recursion

## 56. Method-Based Calculator

**Difficulty:** 🟢 Easy

### Problem

Refactor a calculator so each operation is implemented as a separate method.

### Requirements

Create methods for:

* Addition
* Subtraction
* Multiplication
* Division
* Modulus

### Input

Two numbers and an operation.

### Output

Operation result.

### Edge Cases

* Division by zero.
* Invalid operation.

### Concepts Practiced

* Methods
* Parameters
* Return values

### What to Pay Attention To

* Keep methods focused.

### Common Mistakes

* Printing inside every calculation method instead of returning values.

---

## 57. Maximum of Variable Arguments

**Difficulty:** 🟡 Medium

### Problem

Create a method that accepts any number of integers using varargs and returns the maximum.

### Input

```text
10 5 22 7 14
```

### Output

```text
22
```

### Edge Cases

* No arguments.
* One argument.
* Negative values.

### Concepts Practiced

* Varargs
* Methods

### What to Pay Attention To

* Empty input behavior.

### Common Mistakes

* Assuming at least one argument without documenting it.

---

## 58. Recursive Sum

**Difficulty:** 🟡 Medium

### Problem

Calculate the sum from `1` to `N` recursively.

### Input

```text
5
```

### Output

```text
15
```

### Concepts Practiced

* Recursion
* Base cases

### What to Pay Attention To

* Every recursive call must progress toward termination.

### Common Mistakes

* Missing base case.

---

## 59. Recursive Digit Sum

**Difficulty:** 🟡 Medium

### Problem

Calculate the sum of digits recursively.

### Input

```text
12345
```

### Output

```text
15
```

### Edge Cases

* Zero.
* Negative values.

### Concepts Practiced

* Recursion
* Modulus

### What to Pay Attention To

* Reducing the number each call.

### Common Mistakes

* Recursive call receives unchanged input.

---

## 60. Recursive String Reversal

**Difficulty:** 🟡 Medium

### Problem

Reverse a string using recursion.

### Input

```text
Java
```

### Output

```text
avaJ
```

### Edge Cases

* Empty string.
* One character.

### Concepts Practiced

* Recursion
* Strings

### What to Pay Attention To

* Base case.

### Common Mistakes

* Creating unnecessary objects at every recursive step.

---

# 6. Arrays & Searching

## 61. Array Sum and Average

**Difficulty:** 🟢 Easy

### Problem

Find the sum and average of all elements in an integer array.

### Input

```text
[10, 20, 30, 40]
```

### Output

```text
Sum: 100
Average: 25.0
```

### Edge Cases

* Empty array.
* Negative values.

### Concepts Practiced

* Arrays
* Loops
* Aggregation

### What to Pay Attention To

* Average should not accidentally use integer division.

### Common Mistakes

* Division by zero for empty arrays.

---

## 62. Maximum and Minimum Element

**Difficulty:** 🟢 Easy

### Problem

Find the minimum and maximum array elements.

### Input

```text
[8, 3, 15, 2, 9]
```

### Output

```text
Minimum: 2
Maximum: 15
```

### Edge Cases

* One element.
* All equal.
* All negative.

### Concepts Practiced

* Traversal
* Comparison

### What to Pay Attention To

* Correct initialization.

### Common Mistakes

* Initializing maximum to zero.

---

## 63. Count Occurrences

**Difficulty:** 🟢 Easy

### Problem

Count how many times a target appears in an array.

### Input

```text
Array: [2, 4, 2, 7, 2]
Target: 2
```

### Output

```text
3
```

### Edge Cases

* Target absent.
* Empty array.

### Concepts Practiced

* Array traversal

### What to Pay Attention To

* Count only exact matches.

### Common Mistakes

* Returning the index instead of frequency.

---

## 64. Check Sorted Array

**Difficulty:** 🟢 Easy

### Problem

Determine whether an array is sorted in ascending order.

### Input

```text
[1, 2, 2, 4, 7]
```

### Output

```text
Sorted
```

### Edge Cases

* Empty array.
* One element.
* Duplicate values.

### Concepts Practiced

* Adjacent comparison

### What to Pay Attention To

* Decide whether equal values are allowed.

### Common Mistakes

* Comparing non-adjacent values unnecessarily.

---

## 65. Reverse Array In Place

**Difficulty:** 🟢 Easy

### Problem

Reverse an array without creating another array.

### Input

```text
[1, 2, 3, 4, 5]
```

### Output

```text
[5, 4, 3, 2, 1]
```

### Concepts Practiced

* Two pointers
* Swapping

### What to Pay Attention To

* Stop at the middle.

### Common Mistakes

* Swapping elements twice.

---

## 66. Copy an Array

**Difficulty:** 🟢 Easy

### Problem

Copy an array using:

1. A loop.
2. `Arrays.copyOf()`.

### Requirements

Compare both implementations.

### Edge Cases

* Empty array.

### Concepts Practiced

* Arrays API
* References

### What to Pay Attention To

* A copied array should not unintentionally alias the original.

### Things to Think About

* What is the difference between copying an array and assigning its reference?

### Common Mistakes

* Using `arr2 = arr1` and calling it a copy.

---

## 67. Count Positive, Negative, Zero, Even and Odd

**Difficulty:** 🟡 Medium

### Problem

Analyze an integer array and count elements belonging to multiple categories.

### Input

```text
[-2, -1, 0, 1, 2, 3]
```

### Output

```text
Positive: 3
Negative: 2
Zero: 1
Even: 3
Odd: 3
```

### Concepts Practiced

* Array traversal
* Multiple conditions

### What to Pay Attention To

* Categories can overlap.

### Common Mistakes

* Treating positive/negative and even/odd as mutually exclusive.

---

## 68. Second Largest Element

**Difficulty:** 🟡 Medium

### Problem

Find the second-largest distinct element without sorting the entire array.

### Input

```text
[10, 5, 20, 8, 20]
```

### Output

```text
10
```

### Edge Cases

* Fewer than two distinct values.
* Negative numbers.

### Concepts Practiced

* Single-pass algorithms
* Tracking variables

### What to Pay Attention To

* Distinctness.

### Things to Think About

* What should happen when all values are equal?

### Common Mistakes

* Returning duplicate maximum as second largest.

---

## 69. Second Smallest Element

**Difficulty:** 🟡 Medium

### Problem

Find the second-smallest distinct element.

### Input

```text
[5, 2, 8, 2, 10]
```

### Output

```text
5
```

### Concepts Practiced

* Array traversal

### What to Pay Attention To

* Duplicate minimum values.

### Common Mistakes

* Treating the second occurrence of minimum as second smallest.

---

## 70. Linear Search

**Difficulty:** 🟢 Easy

### Problem

Search for a target and return its index.

### Input

```text
Array: [5, 8, 2, 9]
Target: 2
```

### Output

```text
Index: 2
```

### Edge Cases

* Target absent.
* Duplicate target.

### Concepts Practiced

* Traversal
* Searching

### What to Pay Attention To

* Decide whether to return first or last occurrence.

### Common Mistakes

* Returning `0` when target is absent.

---

## 71. Binary Search

**Difficulty:** 🟡 Medium

### Problem

Implement binary search manually.

### Requirements

* Input must be sorted.
* Do not use `Arrays.binarySearch()`.

### Input

```text
[2, 4, 6, 8, 10, 12]
Target: 10
```

### Output

```text
4
```

### Edge Cases

* Empty array.
* Target absent.
* One-element array.

### Concepts Practiced

* Divide and conquer
* Searching
* Complexity

### What to Pay Attention To

* Update the search boundaries correctly.

### Things to Think About

* Why is binary search `O(log n)`?

### Common Mistakes

* Infinite loop.
* Incorrect midpoint handling.

---

## 72. Remove Specific Array Element

**Difficulty:** 🟡 Medium

### Problem

Create a new array with all occurrences of a specified value removed.

### Input

```text
[1, 2, 3, 2, 4]
Target: 2
```

### Output

```text
[1, 3, 4]
```

### Concepts Practiced

* Arrays
* Dynamic sizing

### What to Pay Attention To

* Result size must match actual number of retained elements.

### Common Mistakes

* Leaving unwanted default zeros.

---

## 73. Merge Two Sorted Arrays

**Difficulty:** 🟡 Medium

### Problem

Merge two sorted arrays into one sorted array.

### Input

```text
A = [1, 4, 7]
B = [2, 3, 8]
```

### Output

```text
[1, 2, 3, 4, 7, 8]
```

### Constraints

* Preserve sorting.
* Avoid sorting the final result.

### Concepts Practiced

* Two pointers
* Array traversal

### What to Pay Attention To

* Remaining elements after one array is exhausted.

### Common Mistakes

* Forgetting remaining elements.

---

# 7. Sorting & Array Problem Solving

## 74. Bubble Sort

**Difficulty:** 🟢 Easy

### Problem

Implement Bubble Sort manually.

### Requirements

* Sort ascending.
* Add an optimization to stop early when no swaps occur.

### Input

```text
[5, 1, 4, 2, 8]
```

### Output

```text
[1, 2, 4, 5, 8]
```

### Concepts Practiced

* Nested loops
* Sorting
* Optimization

### What to Pay Attention To

* Already-sorted arrays.

### Common Mistakes

* Incorrect inner-loop boundary.

---

## 75. Selection Sort

**Difficulty:** 🟡 Medium

### Problem

Implement Selection Sort manually.

### Requirements

* Sort ascending.
* Count the number of swaps.

### Concepts Practiced

* Sorting
* Selection logic

### What to Pay Attention To

* Find the minimum remaining element.

### Common Mistakes

* Swapping with the wrong index.

---

## 76. Insertion Sort

**Difficulty:** 🟡 Medium

### Problem

Implement Insertion Sort.

### Requirements

* Sort ascending.
* Test already-sorted and reverse-sorted arrays.

### Concepts Practiced

* Sorting
* Shifting

### What to Pay Attention To

* The current element must be inserted into the sorted prefix.

### Common Mistakes

* Losing the value being inserted.

---

## 77. Remove Duplicates — Array Approach

**Difficulty:** 🟡 Medium

### Problem

Remove duplicates from an integer array without using a collection.

### Input

```text
[1, 2, 2, 3, 1, 4]
```

### Output

```text
[1, 2, 3, 4]
```

### Concepts Practiced

* Arrays
* Nested traversal

### What to Pay Attention To

* Preserve first occurrence order.

### Common Mistakes

* Removing the wrong occurrence.

---

## 78. Remove Duplicates — HashSet Approach

**Difficulty:** 🟡 Medium

### Problem

Solve the duplicate-removal problem using `HashSet`.

### Requirements

Compare it with the array-only solution.

### Concepts Practiced

* `HashSet`
* Collections
* Complexity

### What to Pay Attention To

* Ordering behavior of `HashSet`.

### Things to Think About

* When would `LinkedHashSet` be more appropriate?

### Common Mistakes

* Assuming `HashSet` preserves insertion order.

---

## 79. Frequency of Array Elements

**Difficulty:** 🟡 Medium

### Problem

Count the frequency of every unique array value.

### Input

```text
[1, 2, 2, 3, 3, 3]
```

### Output

```text
1 -> 1
2 -> 2
3 -> 3
```

### Concepts Practiced

* `Map`
* Frequency counting

### What to Pay Attention To

* Map keys represent unique values.

### Common Mistakes

* Resetting counts.

---

## 80. Missing Number

**Difficulty:** 🟡 Medium

### Problem

Given numbers from `1` to `N` with one missing value, find the missing number.

### Input

```text
[1, 2, 3, 5, 6]
N = 6
```

### Output

```text
4
```

### Requirements

Try:

1. Sum-based solution.
2. XOR-based solution.

### Concepts Practiced

* Arrays
* Arithmetic
* Bitwise XOR

### What to Pay Attention To

* Integer overflow.

### Things to Think About

* Why does XOR avoid overflow?

### Common Mistakes

* Incorrect expected range.

---

## 81. Find Duplicate Number

**Difficulty:** 🟠 Hard

### Problem

Find a duplicate value in an array containing values from a constrained range.

### Requirements

Explore more than one approach.

### Input

```text
[1, 3, 4, 2, 2]
```

### Output

```text
2
```

### Constraints

* Prefer solutions that do not require sorting.

### Concepts Practiced

* Arrays
* Hashing
* Algorithmic reasoning

### What to Pay Attention To

* Clarify whether modifying the array is allowed.

### Common Mistakes

* Assuming every duplicate problem has the same constraints.

---

## 82. Move Zeros to the End

**Difficulty:** 🟡 Medium

### Problem

Move all zeros to the end while preserving the order of non-zero elements.

### Input

```text
[0, 1, 0, 3, 12]
```

### Output

```text
[1, 3, 12, 0, 0]
```

### Constraints

* Prefer an in-place solution.

### Edge Cases

* All zeros.
* No zeros.

### Concepts Practiced

* Two pointers
* In-place modification

### What to Pay Attention To

* Stability of non-zero elements.

### Common Mistakes

* Sorting the array.

---

## 83. Rotate Array

**Difficulty:** 🟠 Hard

### Problem

Rotate an array left and right by `K` positions.

### Input

```text
[1, 2, 3, 4, 5]
K = 2
```

### Output

```text
Left:  [3, 4, 5, 1, 2]
Right: [4, 5, 1, 2, 3]
```

### Constraints

* Handle `K > n`.
* Prefer an in-place approach.

### Edge Cases

* `K = 0`.
* `K = n`.
* Empty array.

### Concepts Practiced

* Arrays
* Modulus
* Reversal technique

### What to Pay Attention To

* Normalize `K`.

### Common Mistakes

* Performing unnecessary rotations.

---

# 8. 2D Arrays & Matrices

## 84. Matrix Input and Display

**Difficulty:** 🟢 Easy

### Problem

Read and display a rectangular matrix.

### Requirements

* Support arbitrary rows and columns.

### Input

```text
2 3
1 2 3
4 5 6
```

### Output

```text
1 2 3
4 5 6
```

### Concepts Practiced

* 2D arrays
* Nested loops

### What to Pay Attention To

* Matrix dimensions.

### Common Mistakes

* Swapping row and column loops.

---

## 85. Matrix Addition

**Difficulty:** 🟢 Easy

### Problem

Add two matrices of equal dimensions.

### Input

```text
A = [1 2
     3 4]

B = [5 6
     7 8]
```

### Output

```text
6 8
10 12
```

### Edge Cases

* Different dimensions.

### Concepts Practiced

* 2D arrays
* Nested loops

### What to Pay Attention To

* Dimensions must match.

### Common Mistakes

* Accessing invalid indexes.

---

## 86. Matrix Subtraction

**Difficulty:** 🟢 Easy

### Problem

Subtract one matrix from another.

### Requirements

Validate equal dimensions.

### Concepts Practiced

* 2D arrays
* Validation

### What to Pay Attention To

* Operand order.

### Common Mistakes

* Reversing subtraction.

---

## 87. Matrix Multiplication

**Difficulty:** 🟠 Hard

### Problem

Multiply two matrices.

### Requirements

Validate compatible dimensions.

### Input

Two matrices.

### Output

Product matrix.

### Constraints

For `A(m × n)` and `B(n × p)`, result must be `m × p`.

### Edge Cases

* Incompatible dimensions.
* One-row matrices.

### Concepts Practiced

* Nested loops
* Matrix algebra

### What to Pay Attention To

* Three nested loops.

### Common Mistakes

* Incorrect inner-loop dimension.

---

## 88. Matrix Transpose

**Difficulty:** 🟢 Easy

### Problem

Find the transpose of a matrix.

### Input

```text
1 2 3
4 5 6
```

### Output

```text
1 4
2 5
3 6
```

### Concepts Practiced

* 2D arrays
* Dimensions

### What to Pay Attention To

* Rectangular matrices.

### Common Mistakes

* Assuming matrices are always square.

---

## 89. Diagonal Sums

**Difficulty:** 🟡 Medium

### Problem

Calculate main and secondary diagonal sums.

### Requirements

* Support square matrices.

### Input

```text
1 2 3
4 5 6
7 8 9
```

### Output

```text
Main: 15
Secondary: 15
```

### Edge Cases

* `1 × 1`.
* Odd-sized matrix.

### Concepts Practiced

* Index relationships

### What to Pay Attention To

* Center element may belong to both diagonals.

### Common Mistakes

* Double-counting when calculating a combined diagonal sum.

---

## 90. Identity Matrix Checker

**Difficulty:** 🟡 Medium

### Problem

Determine whether a square matrix is an identity matrix.

### Requirements

* Diagonal elements must be `1`.
* All other elements must be `0`.

### Concepts Practiced

* Matrix traversal
* Conditions

### What to Pay Attention To

* Check every cell.

### Common Mistakes

* Checking only the diagonal.

---

## 91. Symmetric Matrix Checker

**Difficulty:** 🟡 Medium

### Problem

Determine whether a square matrix equals its transpose.

### Concepts Practiced

* Matrix traversal
* Symmetry

### What to Pay Attention To

* Compare `matrix[i][j]` with `matrix[j][i]`.

### Common Mistakes

* Checking only one row.

---

## 92. Spiral Matrix Traversal

**Difficulty:** 🟠 Hard

### Problem

Print a matrix in spiral order.

### Input

```text
1 2 3
4 5 6
7 8 9
```

### Output

```text
1 2 3 6 9 8 7 4 5
```

### Constraints

* Support rectangular matrices.

### Edge Cases

* One row.
* One column.
* Rectangular matrix.

### Concepts Practiced

* Boundary tracking
* Matrix traversal

### What to Pay Attention To

* Update top, bottom, left, and right boundaries.

### Common Mistakes

* Printing a row or column twice.

---

## 93. Matrix Search

**Difficulty:** 🟡 Medium

### Problem

Search for an element in a 2D array and return its coordinates.

### Input

```text
Matrix:
1 2 3
4 5 6

Target: 5
```

### Output

```text
Row: 1
Column: 1
```

### Edge Cases

* Duplicate target.
* Target absent.

### Concepts Practiced

* Nested traversal

### What to Pay Attention To

* Zero-based indexing.

### Common Mistakes

* Reporting one-based coordinates accidentally.

---

# 9. Strings & String Processing

## 94. Reverse a String

**Difficulty:** 🟢 Easy

### Problem

Reverse a string.

### Requirements

Implement using:

1. Loop.
2. `StringBuilder`.

### Input

```text
Java
```

### Output

```text
avaJ
```

### Concepts Practiced

* `String`
* `StringBuilder`

### What to Pay Attention To

* Strings are immutable.

### Common Mistakes

* Assuming `reverse()` modifies the original `String`.

---

## 95. String Palindrome

**Difficulty:** 🟢 Easy

### Problem

Determine whether a string is a palindrome.

### Input

```text
madam
```

### Output

```text
Palindrome
```

### Edge Cases

* Empty string.
* Mixed case.
* Spaces.

### Concepts Practiced

* Strings
* Character comparison

### What to Pay Attention To

* Decide whether comparison is case-sensitive.

### Common Mistakes

* Ignoring the specification.

---

## 96. Character Classification

**Difficulty:** 🟢 Easy

### Problem

Count vowels, consonants, digits, spaces, and special characters.

### Input

```text
Java 17!
```

### Output

```text
Vowels: 2
Consonants: 2
Digits: 2
Spaces: 1
Special: 1
```

### Concepts Practiced

* `char`
* Character classification

### What to Pay Attention To

* Uppercase and lowercase letters.

### Common Mistakes

* Counting digits as consonants.

---

## 97. Count Words

**Difficulty:** 🟢 Easy

### Problem

Count words in a sentence.

### Input

```text
Java   is   powerful
```

### Output

```text
3
```

### Constraints

* Multiple spaces must be handled correctly.

### Edge Cases

* Empty string.
* Leading/trailing spaces.

### Concepts Practiced

* Strings
* Splitting
* Whitespace handling

### What to Pay Attention To

* Do not count empty tokens.

### Common Mistakes

* Using a simple `" "` split.

---

## 98. Character Frequency

**Difficulty:** 🟡 Medium

### Problem

Count the frequency of every character.

### Input

```text
banana
```

### Output

```text
b -> 1
a -> 3
n -> 2
```

### Concepts Practiced

* `Map`
* Character traversal

### What to Pay Attention To

* Decide whether spaces are counted.

### Common Mistakes

* Losing insertion order when ordered output is required.

---

## 99. Duplicate Characters

**Difficulty:** 🟡 Medium

### Problem

Find all duplicate characters.

### Input

```text
programming
```

### Output

Display every character occurring more than once.

### Concepts Practiced

* Maps
* Sets

### Edge Cases

* No duplicates.
* Repeated whitespace.

### What to Pay Attention To

* Output each duplicate only once.

### Common Mistakes

* Printing the same duplicate multiple times.

---

## 100. Remove Duplicate Characters

**Difficulty:** 🟡 Medium

### Problem

Remove duplicate characters while preserving the first occurrence.

### Input

```text
programming
```

### Output

```text
progamin
```

### Concepts Practiced

* `Set`
* String building

### What to Pay Attention To

* Preserve original order.

### Common Mistakes

* Using an unordered structure when order matters.

---

## 101. Anagram Checker

**Difficulty:** 🟡 Medium

### Problem

Determine whether two strings are anagrams.

### Input

```text
listen
silent
```

### Output

```text
Anagrams
```

### Constraints

* Decide how spaces and case should be handled.

### Edge Cases

* Different lengths.
* Empty strings.

### Concepts Practiced

* Sorting
* Frequency counting

### What to Pay Attention To

* Normalize input consistently.

### Common Mistakes

* Comparing strings with `==`.

---

## 102. First Non-Repeating Character

**Difficulty:** 🟡 Medium

### Problem

Find the first character that occurs exactly once.

### Input

```text
swiss
```

### Output

```text
w
```

### Concepts Practiced

* Frequency maps
* Ordered traversal

### What to Pay Attention To

* "First" means original string order.

### Common Mistakes

* Returning an arbitrary unique character.

---

## 103. First Repeating Character

**Difficulty:** 🟡 Medium

### Problem

Find the first character that appears more than once.

### Input

```text
programming
```

### Output

The first repeating character.

### Concepts Practiced

* Sets
* Traversal

### What to Pay Attention To

* Detect repetition during left-to-right traversal.

### Common Mistakes

* Returning the most frequent character instead.

---

## 104. StringBuilder Sentence Processor

**Difficulty:** 🟡 Medium

### Problem

Take an array of words and construct a sentence using `StringBuilder`.

### Requirements

* Add spaces between words.
* Avoid trailing spaces.

### Input

```text
["Java", "is", "fun"]
```

### Output

```text
Java is fun
```

### Concepts Practiced

* `StringBuilder`
* Arrays
* String processing

### What to Pay Attention To

* Mutable versus immutable strings.

### Common Mistakes

* Unnecessary string concatenation inside loops.

---

## 105. String Comparison Investigation

**Difficulty:** 🟡 Medium

### Problem

Create experiments demonstrating the difference between:

* `==`
* `equals()`
* `equalsIgnoreCase()`
* `compareTo()`

### Requirements

Test string literals and `new String()` objects.

### Input

No fixed input.

### Output

Display the result of each comparison.

### Concepts Practiced

* String pool
* References
* Value equality

### What to Pay Attention To

* `==` checks reference identity.

### Common Mistakes

* Using `==` for string value comparison.

---

# 🧠 Checkpoint

You should now be able to:

* Manipulate strings confidently.
* Explain String immutability.
* Explain `String`, `StringBuilder`, and `StringBuffer`.
* Use arrays and collections for frequency problems.
* Choose between sorting, hashing, and direct traversal.

---

# 10. Classes, Objects & Encapsulation

## 106. Student Class

**Difficulty:** 🟢 Easy

### Problem

Create a `Student` class.

### Requirements

Include:

* `name`
* `age`
* `rollNumber`
* `course`

Create multiple objects and display their details.

### Input

Create objects in code.

### Output

Display each student's details.

### Concepts Practiced

* Class
* Object
* Instance fields
* Methods

### What to Pay Attention To

* Difference between class and object.

### Common Mistakes

* Making every field unnecessarily static.

---

## 107. Student with Getters and Setters

**Difficulty:** 🟢 Easy

### Problem

Improve the `Student` class using encapsulation.

### Requirements

* Make fields private.
* Add getters.
* Add setters.
* Validate age and roll number.

### Edge Cases

* Negative age.
* Invalid roll number.

### Concepts Practiced

* Encapsulation
* Access modifiers
* Getters/setters

### What to Pay Attention To

* Objects should protect their internal state.

### Common Mistakes

* Leaving fields public.

---

## 108. Constructor-Based Student

**Difficulty:** 🟢 Easy

### Problem

Create constructors for the `Student` class.

### Requirements

Implement:

* No-argument constructor.
* Parameterized constructor.
* Multiple students with different initialization.

### Concepts Practiced

* Constructors
* Constructor overloading

### What to Pay Attention To

* Constructors have no return type.

### Common Mistakes

* Writing `void` before constructor name.

---

## 109. Student Management Mini System

**Difficulty:** 🟡 Medium

### Problem

Create a console-based student manager.

### Requirements

Support:

* Add student.
* Display students.
* Search by roll number.
* Update student.
* Delete student.

### Data Model

Create a `Student` class.

### Expected Behavior

Operations should be menu-driven.

### Edge Cases

* Duplicate roll number.
* Student not found.
* Empty student list.

### Concepts Practiced

* OOP
* Encapsulation
* Collections
* Methods

### What to Pay Attention To

* Separate model logic from menu logic.

### Common Mistakes

* Putting all functionality inside `main()`.

---

## 110. Bank Account

**Difficulty:** 🟡 Medium

### Problem

Create a `BankAccount` class.

### Requirements

Support:

* Deposit.
* Withdraw.
* Balance inquiry.
* Account details.

### Constraints

* Prevent invalid withdrawals.
* Prevent negative deposits.

### Edge Cases

* Zero balance.
* Withdrawal greater than balance.
* Negative amount.

### Concepts Practiced

* Encapsulation
* Validation
* Object state

### What to Pay Attention To

* State transitions.

### Common Mistakes

* Allowing callers to directly modify balance.

---

## 111. Immutable Student

**Difficulty:** 🟡 Medium

### Problem

Design an immutable `StudentProfile`.

### Requirements

* Private final fields.
* Constructor-based initialization.
* No setters.
* Defensive copying if mutable fields are included.

### Concepts Practiced

* `final`
* Immutability
* Encapsulation

### What to Pay Attention To

* Immutability is more than simply removing setters.

### Things to Think About

* What happens if the class contains a mutable `List`?

### Common Mistakes

* Returning internal mutable collections directly.

---

## 112. Static Counter

**Difficulty:** 🟡 Medium

### Problem

Create a class that counts how many objects have been created.

### Requirements

* Use a static variable.
* Increment it inside object creation logic.
* Provide a static accessor.

### Concepts Practiced

* `static`
* Shared class state

### What to Pay Attention To

* Static data belongs to the class.

### Common Mistakes

* Maintaining a separate counter per object.

---

## 113. Employee Salary Calculator

**Difficulty:** 🟡 Medium

### Problem

Create an `Employee` class with salary-related behavior.

### Requirements

Calculate:

* Basic salary.
* Allowance.
* Tax.
* Net salary.

### Concepts Practiced

* Objects
* Methods
* Encapsulation

### Edge Cases

* Zero salary.
* Negative salary.
* High salary.

### What to Pay Attention To

* Keep calculation rules isolated.

### Common Mistakes

* Hardcoding calculations throughout the application.

---

# 11. Inheritance, Polymorphism & Abstraction

## 114. Vehicle Inheritance

**Difficulty:** 🟡 Medium

### Problem

Create a base `Vehicle` class and a `Car` subclass.

### Requirements

* `Vehicle.service()`.
* Override it in `Car`.
* Call `super.service()` from `Car`.

### Concepts Practiced

* Inheritance
* Overriding
* `super`

### What to Pay Attention To

* Difference between inherited and overridden behavior.

### Common Mistakes

* Incorrect method signature.

---

## 115. Method Overloading Calculator

**Difficulty:** 🟡 Medium

### Problem

Create a `Calculator` class with overloaded `add()` methods.

### Requirements

Support:

* Two integers.
* Three integers.
* Two doubles.

### Concepts Practiced

* Method overloading
* Compile-time polymorphism

### What to Pay Attention To

* Parameters determine overload selection.

### Common Mistakes

* Attempting to overload only by return type.

---

## 116. Shape Polymorphism

**Difficulty:** 🟡 Medium

### Problem

Create an abstract `Shape` class.

### Requirements

Implement subclasses:

* `Circle`
* `Rectangle`
* `Triangle`

Each must calculate area.

### Concepts Practiced

* Abstraction
* Inheritance
* Polymorphism

### What to Pay Attention To

* Parent references can refer to child objects.

### Common Mistakes

* Duplicating common behavior unnecessarily.

---

## 117. Payment Interface

**Difficulty:** 🟡 Medium

### Problem

Create a `PaymentMethod` interface.

### Requirements

Implement:

* `CardPayment`
* `UPIPayment`
* `CashPayment`

Each should implement `pay()`.

### Concepts Practiced

* Interfaces
* Polymorphism

### What to Pay Attention To

* Program against abstractions.

### Common Mistakes

* Using condition-heavy code instead of polymorphism.

---

## 118. Employee Hierarchy

**Difficulty:** 🟠 Hard

### Problem

Design an employee hierarchy.

### Requirements

Include:

* Full-time employee.
* Part-time employee.
* Contract employee.

Each calculates salary differently.

### Concepts Practiced

* Inheritance
* Polymorphism
* Abstract classes

### What to Pay Attention To

* Avoid forcing unrelated behavior into the base class.

### Things to Think About

* Would composition be better than inheritance in some cases?

### Common Mistakes

* Deep inheritance trees.

---

## 119. Composition vs Inheritance

**Difficulty:** 🟠 Hard

### Problem

Model a `Car` with an `Engine`.

### Requirements

Implement two designs:

1. Inheritance-based attempt.
2. Composition-based design.

### Task

Compare the designs and explain which better represents the relationship.

### Concepts Practiced

* Composition
* Inheritance
* Object design

### What to Pay Attention To

* "Has-a" versus "is-a".

### Common Mistakes

* Using inheritance merely for code reuse.

---

## 120. Interface-Based Notification System

**Difficulty:** 🟠 Hard

### Problem

Design a notification system.

### Requirements

Support:

* Email.
* SMS.
* Console notification.

The main application should depend only on a notification interface.

### Concepts Practiced

* Interfaces
* Polymorphism
* Loose coupling

### What to Pay Attention To

* Adding a new notification type should require minimal changes.

### Common Mistakes

* Large `if-else` chains.

---

# 🧠 Checkpoint

You should now be able to:

* Build classes without tutorial assistance.
* Explain encapsulation.
* Use constructors correctly.
* Explain `this`, `super`, and `static`.
* Distinguish overloading from overriding.
* Explain abstraction and polymorphism.
* Decide between composition and inheritance.

---

# 12. Collections Framework

## 121. ArrayList Student Registry

**Difficulty:** 🟢 Easy

### Problem

Store students in an `ArrayList`.

### Requirements

Support:

* Add.
* Remove.
* Search.
* Display.

### Concepts Practiced

* `ArrayList`
* Generics
* Iteration

### What to Pay Attention To

* List maintains element order.

### Common Mistakes

* Removing by index when intending to remove an object.

---

## 122. LinkedList Task Queue

**Difficulty:** 🟡 Medium

### Problem

Build a task manager using `LinkedList`.

### Requirements

Support:

* Add task.
* Remove first task.
* View next task.

### Concepts Practiced

* `LinkedList`
* Queue behavior

### What to Pay Attention To

* Interface-based programming.

### Common Mistakes

* Treating every collection as interchangeable.

---

## 123. Stack-Based Browser History

**Difficulty:** 🟡 Medium

### Problem

Simulate browser history.

### Requirements

Support:

* Visit page.
* Back.
* Show current page.

### Concepts Practiced

* `Deque`
* Stack behavior

### What to Pay Attention To

* LIFO behavior.

### Common Mistakes

* Using a collection without understanding its access pattern.

---

## 124. HashSet Unique Names

**Difficulty:** 🟢 Easy

### Problem

Read names and store only unique names.

### Requirements

Display the number of unique names.

### Edge Cases

* Duplicate names.
* Different capitalization.

### Concepts Practiced

* `HashSet`
* Uniqueness

### What to Pay Attention To

* HashSet does not guarantee insertion order.

### Common Mistakes

* Expecting sorted output.

---

## 125. LinkedHashSet Ordered Unique Values

**Difficulty:** 🟢 Easy

### Problem

Remove duplicates while preserving insertion order.

### Requirements

Use `LinkedHashSet`.

### Input

```text
[4, 2, 4, 1, 2, 3]
```

### Output

```text
[4, 2, 1, 3]
```

### Concepts Practiced

* Sets
* Ordering

### What to Pay Attention To

* Difference from `HashSet`.

### Common Mistakes

* Assuming all sets behave the same way.

---

## 126. TreeSet Sorted Values

**Difficulty:** 🟡 Medium

### Problem

Store integers in a `TreeSet`.

### Requirements

Display:

* Sorted values.
* First value.
* Last value.
* Values greater than a target.

### Concepts Practiced

* `TreeSet`
* Sorted collections

### What to Pay Attention To

* Natural ordering.

### Common Mistakes

* Assuming `TreeSet` permits duplicates.

---

## 127. Country-Capital Map

**Difficulty:** 🟢 Easy

### Problem

Create a map of countries and capitals.

### Requirements

* Store at least five countries.
* Search by country.
* Display capital if present.

### Concepts Practiced

* `HashMap`
* Key-value mapping

### What to Pay Attention To

* Map keys are unique.

### Common Mistakes

* Expecting duplicate keys.

---

## 128. Word Frequency Map

**Difficulty:** 🟡 Medium

### Problem

Count the frequency of every word in a paragraph.

### Input

A paragraph.

### Output

Each word and its count.

### Constraints

* Normalize case.
* Decide punctuation behavior.

### Concepts Practiced

* `HashMap`
* Strings

### What to Pay Attention To

* Input normalization.

### Common Mistakes

* Treating `"Java"` and `"java"` as different unintentionally.

---

## 129. Collection Comparison Challenge

**Difficulty:** 🟡 Medium

### Problem

Solve the same data-management problem using:

* `ArrayList`
* `HashSet`
* `HashMap`

### Requirements

Explain why each collection is or isn't appropriate.

### Concepts Practiced

* Collections framework
* Data-structure selection

### What to Pay Attention To

* Access pattern should drive collection choice.

### Things to Think About

* Which structure is best for membership checks?
* Which is best for key-value lookup?
* Which preserves duplicates and order?

### Common Mistakes

* Choosing collections based only on familiarity.

---

## 130. LRU-Style Cache Simulation

**Difficulty:** 🟠 Hard

### Problem

Build a small cache with a fixed capacity.

### Requirements

* Insert key-value pairs.
* Retrieve values.
* Evict the least recently used item.
* Update usage on access.

### Concepts Practiced

* `Map`
* `LinkedHashMap`
* Data-structure design

### What to Pay Attention To

* Capacity enforcement.

### Things to Think About

* Can `LinkedHashMap` simplify the implementation?

### Common Mistakes

* Evicting the wrong entry.

---

# 13. Exceptions, File I/O & Serialization

## 131. Safe Integer Input

**Difficulty:** 🟡 Medium

### Problem

Read an integer from the user and gracefully handle invalid input.

### Requirements

Handle:

* Non-numeric input.
* Repeated invalid input.
* Valid input.

### Concepts Practiced

* `try-catch`
* Input validation

### What to Pay Attention To

* Program should not crash.

### Common Mistakes

* Catching every exception with `Exception`.

---

## 132. Custom InvalidAgeException

**Difficulty:** 🟡 Medium

### Problem

Create a custom exception for invalid age.

### Requirements

Reject:

* Negative age.
* Unreasonably large age.

### Concepts Practiced

* Custom exceptions
* `throw`
* `throws`

### What to Pay Attention To

* Exception should communicate the actual problem.

### Common Mistakes

* Using exceptions for normal control flow.

---

## 133. Bank Withdrawal Exception

**Difficulty:** 🟡 Medium

### Problem

Extend the bank account system with a custom insufficient-balance exception.

### Requirements

* Deposit.
* Withdraw.
* Throw meaningful exception when balance is insufficient.

### Concepts Practiced

* Custom exceptions
* Encapsulation

### What to Pay Attention To

* Preserve object invariants.

### Common Mistakes

* Changing balance before validating withdrawal.

---

## 134. Multi-Catch Validation

**Difficulty:** 🟡 Medium

### Problem

Create a program capable of handling multiple input-related failures.

### Requirements

Handle at least:

* Number format errors.
* Arithmetic errors.
* Invalid index access.

### Concepts Practiced

* Multiple catch
* Exception hierarchy

### What to Pay Attention To

* Catch specific exceptions where useful.

### Common Mistakes

* Catching `Exception` before specific exceptions.

---

## 135. Try-With-Resources File Reader

**Difficulty:** 🟡 Medium

### Problem

Read a text file using try-with-resources.

### Requirements

* Open file.
* Read all lines.
* Count lines.
* Close resources automatically.

### Edge Cases

* Missing file.
* Empty file.

### Concepts Practiced

* File I/O
* Try-with-resources

### What to Pay Attention To

* Resource lifecycle.

### Common Mistakes

* Forgetting to close resources.

---

## 136. File Statistics Analyzer

**Difficulty:** 🟡 Medium

### Problem

Read a text file and calculate:

* Number of lines.
* Number of words.
* Number of characters.

### Input

A text file.

### Output

A statistics report.

### Edge Cases

* Empty file.
* Multiple spaces.
* Blank lines.

### Concepts Practiced

* File I/O
* String processing

### What to Pay Attention To

* Define how whitespace is counted.

### Common Mistakes

* Counting empty tokens as words.

---

## 137. File-Based Contact Manager

**Difficulty:** 🟠 Hard

### Problem

Build a contact manager whose data persists in a file.

### Requirements

Support:

* Add.
* Search.
* Update.
* Delete.
* List contacts.
* Save and load.

### Concepts Practiced

* OOP
* Collections
* File I/O
* Exceptions

### What to Pay Attention To

* Separate persistence from business logic.

### Common Mistakes

* Mixing file parsing with menu code.

---

## 138. Object Serialization

**Difficulty:** 🟠 Hard

### Problem

Serialize and deserialize a list of objects.

### Requirements

* Create a serializable domain class.
* Save objects.
* Load objects.
* Display loaded objects.

### Edge Cases

* Missing file.
* Corrupted data.
* Version changes.

### Concepts Practiced

* Serialization
* Object streams
* Persistence

### What to Pay Attention To

* Understand serialization compatibility.

### Common Mistakes

* Serializing sensitive data blindly.

---

# 14. Generics, Enums, Comparable & Comparator

## 139. Generic Box

**Difficulty:** 🟢 Easy

### Problem

Create a generic `Box<T>` class.

### Requirements

* Store one value.
* Set value.
* Get value.

### Test

Use:

* `Integer`
* `String`
* Custom object

### Concepts Practiced

* Generics
* Type safety

### What to Pay Attention To

* Avoid raw types.

### Common Mistakes

* Using `Object` everywhere instead of generics.

---

## 140. Generic Pair

**Difficulty:** 🟡 Medium

### Problem

Create a generic `Pair<K, V>` class.

### Requirements

Store two values of potentially different types.

### Example

```text
Pair<String, Integer>
```

### Concepts Practiced

* Generic type parameters

### What to Pay Attention To

* Independent type parameters.

### Common Mistakes

* Making both values the same generic type unnecessarily.

---

## 141. Generic Maximum Method

**Difficulty:** 🟠 Hard

### Problem

Create a generic method that finds the maximum element.

### Requirements

Use an appropriate bounded generic type.

### Concepts Practiced

* Bounded generics
* `Comparable`

### What to Pay Attention To

* Generic type constraints.

### Common Mistakes

* Assuming every generic type supports comparison.

---

## 142. Day Enum

**Difficulty:** 🟢 Easy

### Problem

Create a `Day` enum.

### Requirements

Determine whether each day is a weekday or weekend.

### Output

```text
MONDAY -> Weekday
...
SUNDAY -> Weekend
```

### Concepts Practiced

* Enums
* Methods

### What to Pay Attention To

* Enums can contain behavior.

### Common Mistakes

* Treating enums as simple integer constants.

---

## 143. Rich Enum

**Difficulty:** 🟡 Medium

### Problem

Create an enum representing order status.

### Requirements

Each status should contain:

* Display name.
* Numeric code.
* Description.

### Concepts Practiced

* Enum fields
* Enum constructors
* Enum methods

### What to Pay Attention To

* Enum constructors are not called directly by application code.

### Common Mistakes

* Treating enum values like ordinary mutable objects.

---

## 144. Comparable Employee

**Difficulty:** 🟡 Medium

### Problem

Make an `Employee` class naturally sortable by employee ID.

### Requirements

Implement `Comparable<Employee>`.

### Concepts Practiced

* Comparable
* Natural ordering
* Sorting

### What to Pay Attention To

* Define one clear natural ordering.

### Common Mistakes

* Returning inconsistent comparison values.

---

## 145. Comparator Employee

**Difficulty:** 🟡 Medium

### Problem

Sort employees by:

* Salary.
* Name.
* Age.

### Requirements

Use `Comparator`.

### Concepts Practiced

* Comparator
* Multiple orderings
* Sorting

### What to Pay Attention To

* Natural ordering and custom ordering serve different purposes.

### Common Mistakes

* Modifying `Comparable` every time a new sorting requirement appears.

---

# 15. Lambda, Functional Programming, Optional & Streams

## 146. Functional Interface

**Difficulty:** 🟢 Easy

### Problem

Create a functional interface representing a mathematical operation.

### Requirements

Use lambdas for:

* Addition.
* Subtraction.
* Multiplication.
* Division.

### Concepts Practiced

* Functional interfaces
* Lambda expressions

### What to Pay Attention To

* Functional interfaces have one abstract method.

### Common Mistakes

* Trying to use lambdas with ordinary multi-method interfaces.

---

## 147. Method Reference Converter

**Difficulty:** 🟡 Medium

### Problem

Create a list of strings and transform them using method references where appropriate.

### Requirements

Demonstrate:

* Static method reference.
* Instance method reference.
* Constructor reference.

### Concepts Practiced

* Method references
* Functional programming

### What to Pay Attention To

* Method references are shorthand for compatible lambdas.

### Common Mistakes

* Using a method reference with an incompatible functional signature.

---

## 148. Optional User Lookup

**Difficulty:** 🟡 Medium

### Problem

Create a user lookup method that returns `Optional<User>`.

### Requirements

Support:

* User found.
* User not found.
* Default value.
* Conditional processing.

### Concepts Practiced

* `Optional`
* Null-safety

### What to Pay Attention To

* `Optional` is not a universal replacement for every nullable value.

### Common Mistakes

* Calling `get()` without checking presence.

---

## 149. Stream Distinct Collector

**Difficulty:** 🟢 Easy

### Problem

Given an integer array, use streams to remove duplicates and collect the result into a list.

### Input

```text
[1, 2, 2, 3, 3, 4]
```

### Output

```text
[1, 2, 3, 4]
```

### Concepts Practiced

* Streams
* `distinct()`
* `collect()`

### What to Pay Attention To

* Intermediate versus terminal operations.

### Common Mistakes

* Assuming intermediate operations execute immediately.

---

## 150. Stream Map and Reduce

**Difficulty:** 🟡 Medium

### Problem

Given:

```text
["1", "2", "3", "4"]
```

Convert them to integers, square them, and calculate their sum.

### Output

```text
30
```

### Concepts Practiced

* `map`
* `reduce`
* Stream pipeline

### What to Pay Attention To

* Transformation versus aggregation.

### Common Mistakes

* Returning strings instead of integers after mapping.

---

## 151. Employee Stream Sorting

**Difficulty:** 🟡 Medium

### Problem

Create employees with name and salary fields.

### Requirements

Use streams to:

* Sort by salary.
* Find highest salary.
* Find lowest salary.
* Collect results.

### Concepts Practiced

* Streams
* Comparator
* `sorted`
* `max`
* `min`
* `collect`

### What to Pay Attention To

* `max()` and `min()` may return `Optional`.

### Common Mistakes

* Ignoring empty collections.

---

## 152. Stream Filtering and Mapping

**Difficulty:** 🟡 Medium

### Problem

Given a list of employees:

* Filter employees earning above a threshold.
* Extract their names.
* Sort names.
* Collect them.

### Concepts Practiced

* `filter`
* `map`
* `sorted`
* `collect`

### What to Pay Attention To

* Build a readable pipeline.

### Common Mistakes

* Performing unrelated side effects inside streams.

---

## 153. Stream Frequency Analysis

**Difficulty:** 🟠 Hard

### Problem

Use streams to calculate word frequencies.

### Requirements

* Normalize words.
* Group equal words.
* Count occurrences.
* Sort by frequency.

### Concepts Practiced

* `groupingBy`
* `counting`
* Collectors
* Sorting

### What to Pay Attention To

* Nested collector logic.

### Common Mistakes

* Building unnecessarily complex pipelines.

---

## 154. Stream Employee Analytics

**Difficulty:** 🟠 Hard

### Problem

Given employees containing:

* Name
* Department
* Salary
* Age

Use streams to calculate:

* Average salary.
* Highest-paid employee.
* Salary by department.
* Employees above company average.
* Employee count by department.

### Concepts Practiced

* Streams
* Collectors
* Grouping
* Aggregation

### What to Pay Attention To

* Separate simple aggregation from grouped aggregation.

### Common Mistakes

* Performing multiple passes unnecessarily when one readable pipeline is sufficient.

---

# 16. Multithreading & Concurrency

## 155. Create a Thread

**Difficulty:** 🟢 Easy

### Problem

Create a thread that prints numbers from `1` to `10`.

### Requirements

Implement it using:

* `Thread`.
* `Runnable`.

### Concepts Practiced

* Thread creation
* Runnable

### What to Pay Attention To

* A `Runnable` represents work; a `Thread` represents execution.

### Common Mistakes

* Calling `run()` when `start()` is intended.

---

## 156. Thread Lifecycle Experiment

**Difficulty:** 🟡 Medium

### Problem

Create a program demonstrating thread states.

### Requirements

Observe:

* New.
* Runnable.
* Running.
* Waiting/Timed Waiting.
* Terminated.

### Concepts Practiced

* Thread lifecycle
* `Thread.State`

### What to Pay Attention To

* State changes depend on scheduling.

### Common Mistakes

* Assuming exact execution order.

---

## 157. Join Demonstration

**Difficulty:** 🟡 Medium

### Problem

Create multiple threads and use `join()` to enforce a dependency.

### Requirements

* Worker thread performs work.
* Main thread waits.
* Main thread continues after worker completion.

### Concepts Practiced

* `join()`
* Thread coordination

### What to Pay Attention To

* `join()` blocks the calling thread.

### Common Mistakes

* Assuming `join()` starts the thread.

---

## 158. Shared Counter Race Condition

**Difficulty:** 🟠 Hard

### Problem

Create multiple threads incrementing a shared counter.

### Requirements

1. Implement an unsafe version.
2. Observe incorrect results.
3. Make it thread-safe.

### Concepts Practiced

* Race conditions
* Synchronization
* Shared state

### What to Pay Attention To

* Compound operations are not automatically atomic.

### Things to Think About

* Why can `counter++` produce lost updates?

### Common Mistakes

* Assuming `int` makes increments thread-safe.

---

## 159. Executor Service Task Processor

**Difficulty:** 🟠 Hard

### Problem

Create a task-processing application using `ExecutorService`.

### Requirements

* Submit multiple tasks.
* Process tasks using a thread pool.
* Collect results.
* Shut down the executor correctly.

### Concepts Practiced

* Executor framework
* Thread pools
* `Callable`
* `Future`

### What to Pay Attention To

* Executor lifecycle.

### Common Mistakes

* Forgetting to shut down the executor.

---

## 160. Concurrent Ticket Booking System

**Difficulty:** 🔴 Expert

### Problem

Build a concurrent ticket-booking simulation.

### Requirements

Create:

* Shared ticket inventory.
* Multiple booking threads.
* Booking operation.
* Cancellation operation.
* Thread-safe inventory management.

### Constraints

* Never allow negative inventory.
* Never sell the same ticket twice.

### Edge Cases

* Last ticket requested simultaneously.
* Multiple cancellations.
* More requests than available tickets.

### Concepts Practiced

* Multithreading
* Synchronization
* Race conditions
* Thread safety
* Shared mutable state

### What to Pay Attention To

* Identify the critical section.
* Protect invariants rather than blindly synchronizing everything.

### Things to Think About

* What exactly must be atomic?
* Could locking be reduced?

### Common Mistakes

* Synchronizing unrelated operations.
* Checking availability and decrementing in separate unsynchronized operations.

---

# 🧠 Final Core Java Checkpoint

Before moving to interview and project mode, you should be able to:

* Write classes from scratch.
* Use constructors, getters, and setters.
* Explain object references.
* Explain pass-by-value in Java.
* Use inheritance and polymorphism.
* Use interfaces and abstract classes.
* Choose between `List`, `Set`, `Map`, and `Queue`.
* Handle exceptions correctly.
* Read and write files.
* Use generics.
* Use `Comparable` and `Comparator`.
* Write lambdas.
* Build stream pipelines.
* Explain intermediate and terminal stream operations.
* Create and coordinate threads.
* Identify race conditions.
* Use executor services.

---

# 17. Advanced Core Java & Interview Problems

## 161. Output Prediction — String Pool

**Difficulty:** 🟠 Hard

### Problem

Predict the output and explain why.

### Code

```java
String a = "Java";
String b = "Java";
String c = new String("Java");

System.out.println(a == b);
System.out.println(a == c);
System.out.println(a.equals(c));
```

### Task

1. Predict every output.
2. Explain each result.
3. Explain the role of the String pool.
4. Rewrite the code to compare values correctly.

### Concepts Practiced

* String pool
* References
* `==`
* `equals()`

### What to Pay Attention To

* Reference equality versus value equality.

### Common Mistakes

* Assuming `==` always compares contents.

---

## 162. Output Prediction — Static Members

**Difficulty:** 🟠 Hard

### Problem

Predict the output of a class containing:

* Static field.
* Instance field.
* Static block.
* Instance initializer.
* Constructor.

### Task

Explain the exact execution order.

### Concepts Practiced

* Initialization order
* Static members
* Constructors

### What to Pay Attention To

* Class initialization happens before object initialization.

### Common Mistakes

* Assuming constructor executes first.

---

## 163. Output Prediction — Overloading vs Overriding

**Difficulty:** 🔴 Advanced

### Problem

Create a parent and child class with overloaded and overridden methods.

### Task

Predict which method executes for different reference/object combinations.

### Concepts Practiced

* Compile-time polymorphism
* Runtime polymorphism
* Method dispatch

### What to Pay Attention To

* Overloading is resolved at compile time.
* Overriding uses runtime dispatch.

### Common Mistakes

* Assuming every method call is dynamically dispatched.

---

## 164. Output Prediction — `finally`

**Difficulty:** 🟠 Hard

### Problem

Create several methods containing:

* `try`
* `catch`
* `finally`
* `return`

### Task

Predict:

* Which value is returned.
* Which blocks execute.
* What happens when `finally` also returns.

### Concepts Practiced

* Exception handling
* Control flow

### What to Pay Attention To

* `finally` can significantly affect control flow.

### Common Mistakes

* Assuming `return` immediately ends every block.

---

## 165. Debug the Scanner Program

**Difficulty:** 🟡 Medium

### Buggy Code

```java
Scanner sc = new Scanner(System.in);

System.out.print("Age: ");
int age = sc.nextInt();

System.out.print("Name: ");
String name = sc.nextLine();

System.out.println(name + " is " + age);
```

### Task

1. Find the bug.
2. Explain why it occurs.
3. Fix it.
4. Explain the input-buffer behavior.
5. Identify whether the same issue can occur with other Scanner methods.

### Concepts Practiced

* `Scanner`
* Input buffering
* Debugging

### What to Pay Attention To

* `nextInt()` and `nextLine()` consume input differently.

---

## 166. Debug the NullPointerException

**Difficulty:** 🟡 Medium

### Buggy Code

```java
class User {
    String name;

    void printName() {
        System.out.println(name.toUpperCase());
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.printName();
    }
}
```

### Task

1. Find the runtime problem.
2. Explain why it occurs.
3. Fix it safely.
4. Decide whether constructor initialization or validation is better.

### Concepts Practiced

* References
* `null`
* Exceptions
* Object initialization

---

## 167. Debug the Static Access Problem

**Difficulty:** 🟡 Medium

### Buggy Code

```java
class Student {
    String name;

    static void printName() {
        System.out.println(name);
    }
}
```

### Task

1. Determine why it fails.
2. Fix it in at least two conceptually different ways.
3. Explain when each design is appropriate.

### Concepts Practiced

* `static`
* Instance state

---

## 168. Debug the Collection Modification Bug

**Difficulty:** 🟠 Hard

### Buggy Code

```java
List<Integer> numbers =
        new ArrayList<>(List.of(1, 2, 3, 4, 5));

for (Integer number : numbers) {
    if (number % 2 == 0) {
        numbers.remove(number);
    }
}
```

### Task

1. Identify the problem.
2. Explain why it occurs.
3. Implement multiple safe approaches.
4. Compare their readability.

### Concepts Practiced

* Collections
* Iterators
* Concurrent modification behavior

---

## 169. Refactor a God Class

**Difficulty:** 🔴 Advanced

### Problem

You receive one class containing:

* User input.
* Business logic.
* File persistence.
* Validation.
* Printing.
* Error handling.

### Task

Refactor it into appropriate classes.

### Requirements

* Improve separation of concerns.
* Reduce duplication.
* Improve testability.
* Preserve behavior.

### Concepts Practiced

* OOP
* SOLID principles
* Architecture
* Refactoring

### What to Pay Attention To

* Responsibility boundaries.

### Common Mistakes

* Splitting code into classes without meaningful responsibilities.

---

## 170. Performance Investigation

**Difficulty:** 🔴 Advanced

### Problem

Given several implementations of the same operation, compare their:

* Time complexity.
* Space complexity.
* Memory behavior.
* Readability.

### Task

Create your own benchmark using sufficiently large inputs.

### Concepts Practiced

* Complexity
* Benchmarking
* Performance analysis

### What to Pay Attention To

* Avoid trusting tiny benchmarks.

### Common Mistakes

* Declaring one approach faster from a single execution.

---

# 18. Real-World Projects

# Project 1 — Student Management System

**Difficulty:** 🟡 Medium

### Objective

Build a complete console-based student management application.

### Features

* Add student.
* Update student.
* Delete student.
* Search student.
* List students.
* Sort students.
* Validate input.
* Persist data.

### Suggested Components / Classes

```text
Student
StudentManager
StudentRepository
InputValidator
Main
```

### Data Model

```text
Student
- id
- name
- age
- email
- course
- marks
```

### Expected Behavior

All operations should work through a menu.

### Edge Cases

* Duplicate ID.
* Missing student.
* Invalid marks.
* Empty database.

### Technical Concepts

* OOP
* Collections
* Exceptions
* File I/O
* Generics
* Comparator

### Possible Extensions

* Search by multiple criteria.
* Statistics.
* Import/export.

### Challenge Requirements

Build it without copying a tutorial.

---

# Project 2 — Library Management System

**Difficulty:** 🟠 Hard

### Objective

Manage books, members, and borrowing.

### Features

* Add books.
* Register members.
* Borrow books.
* Return books.
* Search books.
* Track overdue books.

### Suggested Components / Classes

```text
Book
Member
Loan
Library
LibraryRepository
```

### Data Model

```text
Book
- id
- title
- author
- category
- available

Member
- id
- name
```

### Edge Cases

* Borrow unavailable book.
* Return unborrowed book.
* Unknown member.
* Duplicate book ID.

### Technical Concepts

* OOP
* Composition
* Collections
* Exceptions
* File persistence

---

# Project 3 — Banking System

**Difficulty:** 🟠 Hard

### Objective

Build a banking simulation.

### Features

* Create account.
* Deposit.
* Withdraw.
* Transfer.
* Transaction history.
* Account search.
* Balance display.

### Suggested Components / Classes

```text
Account
Customer
Transaction
Bank
BankService
```

### Edge Cases

* Insufficient balance.
* Invalid amount.
* Account not found.
* Transfer to same account.

### Technical Concepts

* Encapsulation
* Custom exceptions
* Collections
* File I/O
* Immutability

### Challenge Requirements

Maintain strong account invariants.

---

# Project 4 — ATM Simulator

**Difficulty:** 🟠 Hard

### Objective

Simulate an ATM.

### Features

* Card/PIN authentication.
* Balance inquiry.
* Withdrawal.
* Deposit.
* PIN change.
* Transaction history.

### Edge Cases

* Incorrect PIN.
* Locked account.
* Insufficient balance.
* Invalid denomination.
* Daily withdrawal limit.

### Technical Concepts

* OOP
* State management
* Exceptions
* Collections

---

# Project 5 — Employee Payroll System

**Difficulty:** 🟠 Hard

### Objective

Build payroll software supporting multiple employee types.

### Features

* Employee registration.
* Salary calculation.
* Tax calculation.
* Payslip generation.
* Employee search.
* Department reporting.

### Suggested Components / Classes

```text
Employee
FullTimeEmployee
PartTimeEmployee
ContractEmployee
PayrollService
Payslip
```

### Technical Concepts

* Inheritance
* Polymorphism
* Interfaces
* Streams
* Comparator

---

# Project 6 — Inventory Management System

**Difficulty:** 🔴 Advanced

### Objective

Manage products and inventory.

### Features

* Product creation.
* Stock addition.
* Stock removal.
* Low-stock alerts.
* Product search.
* Category filtering.
* Inventory reports.

### Data Model

```text
Product
- id
- name
- category
- price
- quantity
```

### Edge Cases

* Negative stock.
* Duplicate product.
* Invalid price.
* Large inventory.

### Technical Concepts

* OOP
* Collections
* Streams
* File persistence
* Exceptions

---

# Project 7 — Console E-Commerce System

**Difficulty:** 🔴 Advanced

### Objective

Build a console-based shopping system.

### Features

* Product catalog.
* Search.
* Filtering.
* Cart.
* Quantity management.
* Checkout.
* Discount.
* Payment abstraction.
* Order history.

### Suggested Components / Classes

```text
Product
Cart
CartItem
Customer
Order
PaymentMethod
OrderService
ProductRepository
```

### Edge Cases

* Out-of-stock products.
* Empty cart.
* Invalid coupon.
* Payment failure.
* Quantity greater than inventory.

### Technical Concepts

* OOP
* Interfaces
* Collections
* Streams
* Exceptions
* File I/O

---

# Project 8 — File-Based Contact Manager

**Difficulty:** 🟠 Hard

### Objective

Create a persistent contact management application.

### Features

* Add.
* Search.
* Update.
* Delete.
* Sort.
* Group.
* Save.
* Load.

### Technical Concepts

* OOP
* Collections
* File I/O
* Serialization
* Exceptions

### Challenge Requirements

The application should restore its state after restarting.

---

# Project 9 — Multithreaded Task Manager

**Difficulty:** 🔴 Advanced

### Objective

Build a task-processing system using a thread pool.

### Features

* Submit tasks.
* Execute tasks concurrently.
* Track status.
* Collect results.
* Handle failed tasks.
* Shut down gracefully.

### Suggested Components

```text
Task
TaskManager
TaskExecutor
TaskResult
```

### Technical Concepts

* `ExecutorService`
* `Callable`
* `Future`
* Concurrency
* Exception handling

---

# Project 10 — Final Java Capstone

**Difficulty:** 🔥 Expert

### Objective

Build a complete console-based enterprise-style application of your choice.

Choose one:

```text
Hospital Management System
Banking System
Library Management System
E-Commerce System
Inventory System
Employee Management System
Hotel Management System
Parking Management System
```

### Features

Your application must contain:

* At least 8 meaningful classes.
* Encapsulation.
* Interfaces.
* At least one abstract class where appropriate.
* Multiple collections.
* Custom exceptions.
* File persistence.
* Generics.
* Comparable or Comparator.
* Streams.
* At least one concurrent operation.
* Input validation.
* Logging/reporting.
* Search.
* Sorting.
* Filtering.

### Suggested Components / Classes

Design these yourself.

### Data Model

Design the entities yourself.

### Expected Behavior

The system should operate independently without tutorial instructions.

### Edge Cases

Identify and handle at least 15 yourself.

### Technical Concepts

```text
Core Java
OOP
Collections
Exceptions
File I/O
Generics
Streams
Concurrency
Design
Debugging
```

### Possible Extensions

* Unit tests.
* Configuration files.
* Better persistence.
* Import/export.
* Performance optimization.

### Challenge Requirements

Do not begin by writing code.

First create:

1. Requirements.
2. Entities.
3. Class responsibilities.
4. Relationships.
5. Collection choices.
6. Exception strategy.
7. Persistence strategy.
8. Concurrency strategy.
9. Test cases.

Then implement.

---

# 19. Mastery Tests

# Beginner Mastery Test

Solve these **without notes**.

## B1. Calculator

**Difficulty:** 🟢 Easy

Build a menu-driven calculator using methods and `switch`.

---

## B2. Number Analyzer

**Difficulty:** 🟢 Easy

Determine:

* Even/odd.
* Prime.
* Palindrome.
* Digit sum.
* Digit count.

---

## B3. Pattern Generator

**Difficulty:** 🟢 Easy

Generate five different patterns from a single program.

---

## B4. Array Analyzer

**Difficulty:** 🟢 Easy

Find:

* Minimum.
* Maximum.
* Average.
* Number of even values.
* Number of odd values.

---

## B5. String Analyzer

**Difficulty:** 🟢 Easy

Calculate:

* Character count.
* Word count.
* Vowels.
* Consonants.
* Digits.

---

# Intermediate Mastery Test

## I1. Student Registry

**Difficulty:** 🟡 Medium

Build a student registry using classes, `ArrayList`, methods, validation, and searching.

---

## I2. Frequency Analyzer

**Difficulty:** 🟡 Medium

Given a paragraph, calculate word and character frequencies.

---

## I3. Employee Sorting

**Difficulty:** 🟡 Medium

Create employees and support sorting by:

* ID.
* Name.
* Salary.
* Age.

---

## I4. File Statistics

**Difficulty:** 🟡 Medium

Read a file and generate a detailed statistics report.

---

## I5. Bank Account

**Difficulty:** 🟡 Medium

Implement deposit, withdrawal, transfer, custom exceptions, and transaction history.

---

# Advanced Mastery Test

## A1. Library System

**Difficulty:** 🔴 Advanced

Build a complete library management system with persistence.

---

## A2. Stream Analytics

**Difficulty:** 🔴 Advanced

Given employee data, generate:

* Department statistics.
* Salary statistics.
* Highest earners.
* Average salary.
* Employee rankings.

Use streams.

---

## A3. Concurrent Counter

**Difficulty:** 🔴 Advanced

Demonstrate a race condition and then solve it using appropriate synchronization.

---

## A4. Executor Task Processor

**Difficulty:** 🔴 Advanced

Process hundreds of independent tasks using an executor service.

---

## A5. Refactoring Challenge

**Difficulty:** 🔴 Advanced

Take a deliberately poorly designed Java program and redesign it for:

* Maintainability.
* Testability.
* Reusability.
* Error handling.

---

# Final Mastery Challenge

## FM1. Build a Real Application From Scratch

**Difficulty:** 🔥 Expert

Choose a real-world problem.

Do not use a tutorial.

### Requirements

You must independently determine:

```text
What problem am I solving?
What are the entities?
What classes are required?
What responsibilities belong to each class?
Which interfaces are needed?
Where is inheritance appropriate?
Where is composition better?
Which collections should I use?
What exceptions can occur?
How will data be persisted?
Where should validation occur?
Where should streams be used?
Where is concurrency useful?
How will I test the system?
How will I handle invalid input?
How will I handle edge cases?
```

### Success Criteria

You should be able to:

* Start from an empty project.
* Design the application.
* Implement it without step-by-step guidance.
* Debug your own mistakes.
* Explain every major design decision.
* Refactor the first version.
* Add new requirements without rewriting the entire system.

---

# Interview Mode

## Concept Questions

1. What is Java bytecode?
2. Why is Java platform independent?
3. What is the difference between JDK, JRE, and JVM?
4. Why is Java considered object-oriented?
5. What is the difference between primitive and reference types?
6. Is Java pass-by-value or pass-by-reference?
7. Why are Strings immutable?
8. What is the String pool?
9. What is the difference between `==` and `equals()`?
10. What is the difference between `String`, `StringBuilder`, and `StringBuffer`?
11. What is `final`?
12. What is `static`?
13. What is `this`?
14. What is `super`?
15. What is constructor overloading?
16. What is method overloading?
17. What is method overriding?
18. What is runtime polymorphism?
19. What is abstraction?
20. What is encapsulation?
21. Interface versus abstract class?
22. Composition versus inheritance?
23. What is the difference between `ArrayList` and `LinkedList`?
24. `HashSet` versus `TreeSet`?
25. `HashMap` versus `TreeMap`?
26. Why can a `Map` not contain duplicate keys?
27. What is a functional interface?
28. What is a lambda expression?
29. What is a method reference?
30. What is an `Optional`?
31. What is a Stream?
32. Intermediate versus terminal stream operation?
33. What is lazy evaluation in streams?
34. What is `map()`?
35. What is `filter()`?
36. What is `reduce()`?
37. What is `collect()`?
38. What is `Comparable`?
39. What is `Comparator`?
40. What is a checked exception?
41. What is an unchecked exception?
42. What is `try-with-resources`?
43. What is serialization?
44. What is a thread?
45. `start()` versus `run()`?
46. What does `join()` do?
47. What is synchronization?
48. What is a race condition?
49. What is `ExecutorService`?
50. Why use a thread pool?

---

# Output Prediction Questions

## OP1

Predict the output:

```java
int x = 5;
System.out.println(x++);
System.out.println(++x);
System.out.println(x);
```

Explain every step.

---

## OP2

Predict the output:

```java
String a = "Java";
String b = "Java";
String c = new String("Java");

System.out.println(a == b);
System.out.println(a == c);
System.out.println(a.equals(c));
```

---

## OP3

Predict the output:

```java
int x = 10;

if (x > 5 && x++ > 10) {
    System.out.println("A");
}

System.out.println(x);
```

Explain short-circuit evaluation.

---

## OP4

Predict the output:

```java
int x = 10;

System.out.println(x > 5 ? x : 0);
```

Then modify the expression to demonstrate nested ternary behavior.

---

## OP5

Predict the output of a program containing overloaded methods:

```java
print(int)
print(double)
print(String)
```

Call them with different argument types and explain overload resolution.

---

# Debugging Questions

## D1. Array Index Bug

Find and fix:

```java
int[] numbers = {10, 20, 30};

for (int i = 0; i <= numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

---

## D2. Infinite Loop

Find the problem:

```java
int i = 1;

while (i <= 10) {
    System.out.println(i);
}
```

---

## D3. Incorrect Average

Find the bug:

```java
int sum = 5;
int count = 2;

double average = sum / count;
```

---

## D4. String Comparison

Find the problem:

```java
String password = new String("java");

if (password == "java") {
    System.out.println("Correct");
}
```

---

## D5. Null Reference

Find the problem:

```java
Student student = null;
System.out.println(student.getName());
```

---

# Design Questions

## DS1. Notification System

Design a notification system supporting:

```text
Email
SMS
Push
Console
```

Explain:

* Classes.
* Interfaces.
* Dependencies.
* Extension strategy.

---

## DS2. Parking Lot

Design a parking system supporting:

```text
Car
Bike
Truck
```

Consider:

* Parking allocation.
* Availability.
* Fees.
* Exit.
* Different vehicle sizes.

---

## DS3. Library

Design a library where:

* Books can be borrowed.
* Members can borrow multiple books.
* Books can be reserved.
* Late fees exist.

Explain your object relationships.

---

## DS4. Shopping Cart

Design:

```text
Product
Cart
CartItem
Order
Payment
Customer
```

Explain which relationships should use composition.

---

## DS5. Concurrent Ticket Booking

Design a thread-safe booking system.

Explain:

* Shared state.
* Critical section.
* Synchronization strategy.
* Failure cases.

---

# "Why?" Questions

1. Why is `String` immutable?
2. Why does Java use bytecode?
3. Why can't Java inherit from multiple classes?
4. Why can Java implement multiple interfaces?
5. Why should fields usually be private?
6. Why should methods return values instead of relying on global state?
7. Why should composition often be preferred over inheritance?
8. Why does `HashMap` require correct `equals()` and `hashCode()` implementations?
9. Why does `HashSet` remove duplicates?
10. Why are streams lazy?
11. Why can't a stream normally be reused after a terminal operation?
12. Why does `Optional` return an empty value?
13. Why can multiple threads corrupt shared state?
14. Why does synchronization solve some race conditions?
15. Why are thread pools preferable to manually creating huge numbers of threads?
16. Why should exceptions not be used as ordinary control flow?
17. Why is try-with-resources preferable for resource management?
18. Why should a generic collection generally be preferred over a raw collection?
19. Why might `ArrayList` be preferable to `LinkedList` in many practical situations?
20. Why is algorithmic complexity important even when Java provides convenient APIs?

---

# 20. Mastery Checklist

For every problem:

* [ ] I understood the problem.
* [ ] I identified the required Java concepts.
* [ ] I designed the solution myself.
* [ ] I wrote the code myself.
* [ ] My code compiles.
* [ ] My code passes normal test cases.
* [ ] I tested edge cases.
* [ ] I tested invalid input where applicable.
* [ ] I can explain every important line.
* [ ] I can modify the program.
* [ ] I can rewrite the solution without looking.
* [ ] I understand why my approach works.
* [ ] I understand its limitations.
* [ ] I can explain its time/space complexity where relevant.
* [ ] I can identify a better approach when one exists.
* [ ] I can debug it without immediately searching for the solution.

The supplied practice material itself emphasizes that a problem should not be considered complete merely because its solution was seen; genuine completion means understanding, designing, implementing, testing, explaining, and modifying the program independently. 

---

# 🏆 Final Java Confidence Test

After completing this entire bank, close your notes and attempt these completely from scratch:

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

For each project, independently decide:

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
Where can streams help?
Where is concurrency appropriate?
How will I test the system?
How will I handle edge cases?
```

These project types and design questions align with the supplied Java mastery material's final confidence-test approach. 

---

# 🎯 Final Confidence Standard

After completing the bank, the goal is **not**:

> "I solved 160 Java questions."

The goal is:

> **"Give me a Java problem I have never seen before, and I can understand it, break it into smaller problems, choose appropriate classes/data structures/features, design a solution, write the code, debug it, test edge cases, improve it, and explain why my solution works."**

That is the standard for considering your Core Java practice genuinely complete.
