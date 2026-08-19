# Variables
```java
data_type variable_name = value/literals;
```

## Data Types
- data_type(default size, default value)
- Primitive Data Type :-
	1. Boolean : boolean(1 byte, false)
	2. Numeric : 
		i. Character : char(2 byte, '\u0000')
		ii. Integral : Integer : byte(1 byte, 0), short(2 byte, 0), int(4 byte, 0), long(8 byte, 0L) and Floating-Point : float(4 byte, 0.0f), double(8 byte, 0.0d)
- Non-Primitive Data Type :- String, Array, Object etc.

## Naming Conventions
Conventions are not rules but just used for better code visibility and understandability.
- No Spaces
- camelCase, snake_case, kebab-case
- Java -> camelCase
- Name : descriptive, medium length, clears the purpose of variable
- isMarried, myAge etc.

## Identifiers
- A-Z, a-z, 0-9, '\_' , '$'.
- Can't use keywords.
- Can't start with digit like 1name
- Case sensitive.
- Variable name, method name, class name etc.

## Literals
- The value associated with the variable.
- Integer literals, floating-point, boolean, character, String, Long, double etc.

## Keywords
- These are reserved words by Java, some of these are not in use: 
abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, exports, extends, final, finally, float, for, goto, if, implements, impact, import, instanceof, int, interface, long, module, native, new, package, private, protected, public, requires, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, var, void, volatile, while, _

## Escape Sequences
- \n - new line
- \t - tab space
- \b - backspace
- \\' - single quote
- \\" - double quote
- \\\ - backslash


## User Input
- import java.util.Scanner;
- Scanner sc = new Scanner(System.in); //Object of Scanner class
- nextInt(), nextDouble(), nextFloat(), nextLong(), nextShort(), nextLine() -> String etc
- next(); -> It stops after first whitespace -> used for single word or token

## Type Conversion and Casting
### 1. Implicit Conversion
- Store smaller to larger data type -> No data loss
- Automatic, Widening, Implicit, Coercion
- byte -> short -> int -> long -> float -> double
- eg: float dec = 3; // output of dec = 3.0
### 2. Explicit Conversion
- Store larger to smaller data type forcefully -> data may loss
- Narrowing, Explicit, Casting
- byte <- short <- int <- long <- float <- double
- eg: int myInt = (int) 3.4f;
- (in the bracket the desired datatype is written in which you want to convert this value).