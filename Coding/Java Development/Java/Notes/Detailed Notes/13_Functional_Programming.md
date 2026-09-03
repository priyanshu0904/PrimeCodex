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
- Represents a sequence of elements
- Functional Operations like map, filter and reduce
- They don't store data, they process it on-the-fly from sources like collections and arrays
- Stream operations can be lazy, processing elements only as needed, which is efficient for large data
- Streams are consumable, once processed, they can't be used 
- They support parallel processing, making operations faster by utilizing multiple threads automatically
- stream source -> intermediate operations -> termination operation -> operation result
```java
list.streams()
    .filter()
    .map()
    .sort()
    .forEach();
//chaining of operations on stream
```

### Intermediate Operations
#### Filter
- Filter elements of stream based on given predicate.Only elements satisfy the condition are included in resulting stream.
- Lazy operation, it is not executed until a terminal operation is invoked on the stream.
- returns a new stream with match the predicate
- .filter()

#### Other Filter Operations

### Terminal Operations
#### Reduce
- Reduce the elements of a stream to a single value
- Takes binary operator as parameter and applies repeatedly, combining the elements of stream
- Versatile: Used for summing, finding, max, min and combining elements in a myriad of ways
- Optional or default value: Without an identity value, it returns an Optional. With an identity value, it returns a default value if stream is empty.
- .reduce() 

#### Other Terminal Operations
- forEach(): implement a specific function written inside it to each element of streams

## Functional Interface
- it have only Single abstract method(SAM), but default and static methods it can have
- Lambda capability, intended to be used with lambda expressions, providing a target type for lambda and method references
- @FunctionalInetrface Annotation, not mandatory, helps compiler to identify intention of making functional interface if not satisfy then can generate error
- Predicate, Consumer, BinaryOperator, Runnable, Callable, Comparator and user-defined interface if only one abstract method

## Method Reference
- Described using (::) double colon. like System.out::println, refers to the println method of the System.out object
- They are used with functional interfaces.
- Can make code more readable and concise
- Can only used for methods that fit parameters and return type
- Synatx
```java
//Static method reference
ClassName::staticMethodName;

//Instance Method
instance::instanceMethodName;

//Instance Method Particular Class
ClassName::methodName;

//Constructor Reference
ClassName::new;
```
# Programming Paradigms
- Imperative Programming:
    1. Procedural Programming
    2. Structured Programming
    3. Object-Oriented Programming
- Declarative Programming:
    1. Functional Programming
    2. Logic Programming

# Functional vs Structural Programming
## Imperative or Structural Programming
- Computation: You describe the step-by-step instructions for how an executed program achieves the desired results.
- Readability and Complexity: With the emphasis on the control flow, you can often follow the step-by-step process fairly easily. However, as you add more code, it can become longer and more complex
- Customization: A straightforward way to customize and edit code and structure is offered. You have complete control and can easily adapt the structure of your program to your needs.
- Optimization: Adding extensions and making upgrades are supported, but doing so is significantly more challenging than with declarative programming, making it harder to optimize.
- Structure: The code structure can be long and complex. The code itself specifies how it should run and in what order. 

## Declarative or Functional Programming
- Computation: You set the conditions that trigger the program execution to produce the desired results.
- Readability and Complexity: Step-by-step processes are eschewed. You’ll discover that this paradigm is less complex and requires less code, making it easier to read.
- Customization: Customizing the source code is more difficult because of complicated syntax and the paradigm’s dependence on implementing a pre-configured algorithm.
- Optimization: You can easily optimize code because an algorithm controls the implementation. Furthermore, you can add extensions and make upgrades.
- Structure: The code structure is concise and precise, and it lacks detail.

