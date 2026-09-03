# Functional Programming
- Way of writing programs where we can use functions like small building blocks
- Functions can be passed as arguments, returned from other functions and assigned to variables -> First-class Function
- Immutable data, once creates data can't change it
- Pure Functions: These are special functions that always give the same result for the same input with no side-effects
- Functional Interface: These are likes templates for functions, making it easier to use them in different parts of your program
- These are Lazy in Evaluation, whenever anything calls them, then only they will start executing
- Statelessness

## Lambda Expression
- These are quick, nameless functions for small tasks, like shortcuts
- Syntax: 
```java
(parameters) -> {body}
//linking inputs to actions

//No arguments
() -> System.out.println("Hello");

//One argument
s -> System.out.println(s);

//Two Arguments
(x, y) -> x + y;

//With explicit arguments type
(Integer x, Integer y) -> x + y;

//Multiple statements
(x, y) -> {
    System.out.println(x);
    System.out.println(y);
    return x + y;
}
```
- Functional Interface: They work with interfaces that have only one method, making code concise
- Readability: Make code shorter and cleaner, especially with collections.
- Great for managing lists and sets, like filtering and sorting, useful in collections.

## Streams
- 