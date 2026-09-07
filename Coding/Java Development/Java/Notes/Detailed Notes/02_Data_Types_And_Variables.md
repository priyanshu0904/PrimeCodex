# Variables
- Like containers used to store data values
- Memory block where data stored, referred as variable name and have a unique address in RAM
- camelCase naming, unique names
```java
//declaration
data_type variable_name;

//initialization
variable_name = value;

//declaration and initialization
data_type variable_name = value/literals;
```
- Can be consider as label
- Stored in memory cells or locations
- Can overlap or override variable but can't declare another one with same name

# Constants
- Use final keyword to make any value as constant, means its value can't be changed. Like final int year = 2026;

# Programming Language Type
## Strongly Typed Programming Language
- Statically typed, languages that required to specify the type of data to store. Like Java, C, C++ etc

## Loosely Typed Programming Language
- Dynamically typed, languages that do not require to specify the type of data to store. Like Python

# Data Types
- What type of values can be store in particular variable
- Everything has a binary value like character, emoji
- 1 bit: 0/1 and 1 Byte = 8 bit
- data_type(default size, default value)
- Primitive Data Type :-
	1. Boolean : boolean(1 byte, false): true, false
	2. Numeric : 
		i. Character : char(2 byte, '\u0000'): 'a' must be between single quotes, can be used unicode characters like '\u0098'.

		ii. Integral : Integer : byte(1 byte, 0), short(2 byte, 0), int(4 byte, 0), long(8 byte, 0L)
		- When to use:
			- byte: when to save memory in large data structures and arrays, saving memory is significant and values are known in byte's range
			- short: to save memory, when using system or library that requires 16-bit data
			- int: default choice, used for most mathematical operation
			- long: when values are much larger than of int range

		iii. Floating-Point : float(4 byte, 0.0f): 7 precision digits, double(8 byte, 0.0d):16 precision. By default every decimal value is double.

- Non-Primitive Data Type :- String, Array, Interface, Class, Object etc.
- '_' underscore can be placed between digits to enhance reading. Like 32_768 -> Consider as 32768, must be between two digits, like _32_678, 32_444_ , 32_456_L, 350_480._77 etc is invalid

```java
String name = "Priyanshu";
String newName = new String("Raj");
System.out.println(name + " " + newName); //concatenation
```

## Naming Conventions
Conventions are not rules but just used for better code visibility and understandability.
- No Spaces
- camelCase, snake_case, kebab-case
- Java -> camelCase
- Name : descriptive, medium length, clears the purpose of variable
- isMarried, myAge etc.

## Identifiers
- Characters allowed: A-Z, a-z, 0-9, '_' , '$'
- Can't use keywords or reserved words.
- Can't start with digit like 1name
- Length should be medium and must be descriptive
- Case sensitive.
- Variable name, method name, class name etc.
- Can use predefined class and interface name like Integer, Double, String, Runnable etc but not recommended.
- No limit of length, but preferred to be short/medium and descriptive

## Literals
- The value associated with the variable.
- Integer literals(10, -8, 0)
- Floating-point literals(1.22f, 8.9F, -2.8887)
- Boolean literals(true, false)
- Character literals('a', 'Y', '\u0078') -> single quote
- String literals("Priyanshu", "hi", "") -> double quotes
- Long(L/l), double(d/D) etc.

# Reserved Words
- Having predefined meaning in Java

## Keywords
- Only in lower case letters
- There is new keyword but not delete, can allocate memory yourself, but deletion done by Java Garbage Collector.

### Used Keywords
- Keywords for data types: byte, short, int, long, float, double, boolean, char
- Keywords for flow control: if, else, switch, case, default, while, do, for, break, continue, return
- Modifiers: public, private, protected, static, final, abstract, synchronized, native, strictfp(1.2 version), transient, volatile, sealed(Java 15), var(Java 10), non-sealed(Java 17), record(Java 16)
- Keywords for exception handling: try, catch, throw, throws, assert(1.4 version), finally
- Object and class related keywords: new, instanceof, super, this, class, interface, extends, implements, import, package
- Return type keywords: void
- Group definition keywords: enum(1.5 version)
- Module system keywords: modules, requires, exports
- Contextual/Restricted keywords: var, record, sealed, non-sealed, open, opens, uses, provides, to, with, transitive
- Reserved Identifier: _

### Unused Keywords
- goto, const

## Reserved Literal
- true, false, null

## Escape Sequences
- Where the escape sequence is written in text, the operation is applied at that point...
- \n - new line
- \t - tab space
- \b - backspace
- \\' - single quote
- \\" - double quote
- \\\ - backslash

# User Input
- import java.util.Scanner;
- Scanner sc = new Scanner(System.in); //Object of Scanner class, to take input from console
- nextInt() -> Integer, nextDouble() -> Double, nextFloat() -> Float, nextLong() -> Long, nextShort() -> Short, nextLine() -> String etc.
- next(); -> It stops after first whitespace -> used for single word or token

# Type Conversion and Casting
### 1. Implicit Conversion
- Store smaller to larger data type -> No data loss
- Automatic, Widening, Implicit, Coercion
- byte -> short -> int -> long -> float -> double and char -> int
- eg: float dec = 3; // output of dec = 3.0
### 2. Explicit Conversion
- Store larger to smaller data type forcefully -> data may loss
- Narrowing, Explicit, Casting
- byte <- short <- int <- long <- float <- double and char <- int
- eg: int myInt = (int) 3.4f;
- (in the bracket the desired datatype is written in which you want to convert this value).

# Enums
```java
enum Days{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
//access through Days.TUESDAY etc.

Days d1 = Days.MONDAY;
```
- Methods:
	- name(): d1.name(), value of d1, MONDAY
	- values(): Days.values()[3], converts to array representation and can be access by index, WEDNESDAY
	- valueOf(): Days d2 = Days.valueOf("FRIDAY"), sets value of d2, must be from enum only
	- ordinal(): d2.ordinal(), gives the index of the value os d2, 6