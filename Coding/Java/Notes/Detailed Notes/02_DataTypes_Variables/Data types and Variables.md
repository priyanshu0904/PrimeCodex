# Variables
- Containers to store data values.
```
data_type variable_name = value/literals;
```
- Stored in RAM for execution, have a memory cell/location which has a reference name and it's corresponding memory address.
```
int age; //Declaration
float marks = 88.5f; //Initialization
```

---
## Data Types

![alt text](<Data Type Table.jpg>)

![alt text](<Data Types Chart.jpg>)

- 1 bit - can store either 0/1. 1 byte = 8 bit.

---
## Naming Conventions
Conventions are not rules but just used for better code visibility and understandability.
- Can not give spaces.
- **camelCase** : myInt, myAge etc.
- **snake_case** : my_int, my_age etc.
- **kebab-case** : my-int, my-age etc.
- In Java we use **camelCase** naming convention.
- Keep the name descriptive, medium length and make easy to understand the variable's purpose. eg: myAge, isMarried etc.

---
## Identifiers
- A-Z, a-z, 0-9, '_' , '$'.
- Can't use keywords.
- Not start with digits. Eg: 01name etc.
- Valid : $abc, \_abc, etc
- Invalid : c@sh, abc-def, 1abc, final etc
- Case sensitive. name and Name are different identifiers.
- int can not be used but Int can be.
- Variable name, method name, class name etc.

---
## Literals
- The value associated with the variable.
- Integer literals like 10, 5, -8.........
- Floating Point literals like 1.2f, 0.25, -1.99999d (f for float, d for double and default for double)
- Boolean literals like true and false
- Character literals like 'a', 'R'...... (single quote) - single character is stored, whitespace is also a character ' '
- String literals like "hi", "What's up" .........(double quote) - "" empty string is also a string.
- Long literals like 55L, 89658745L ....... (L for long)

---
## Keywords
abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, exports, extends, final, finally, float, for, goto, if, implements, impact, import, instanceof, int, interface, long, module, native, new, package, private, protected, public, requires, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, var, void, volatile, while, _

---
## Escape Sequences
Insert at the point where they written.
- \n - new line
- \t - tab space
- \b - backspace
- \\' - single quote
- \\" - double quote
- \\\ - backslash

---
## User Input
```
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); //Object of Scanner class.
		String name = sc.nextLine();
	}
}
```

```
for int - nextInt();
for double - nextDouble();
for float - nextFloat();
for long - nextLong();
for short - nextShort();
for single token or word - next(); //it stops after 
firt whitespace
for String - nextLine();
```

```
System.out.println("Hello " + age); //concatenation
//In concatenation, if the numeric value is there after string or before string then it is considered also as string.
//If only numeric values are there then it evaluates the value.
```
---
## Type Conversion and Casting
### 1. Implicit Conversion
- If you want to store smaller value into large data type or container. No risk of data loss. 
- Automatic, Widening, Implicit, Coercion
- byte -> short -> int -> long -> float -> double
- eg: float dec = 3; // output of dec = 3.0

### 2. Explicit Conversion
- If you want to store larger value into smaller data type or container forcefully. Risk of data loss.
- Narrowing, Explicit, Casting
- byte <- short <- int <- long <- float <- double
- eg: int myInt = (int) 3.4f;
- (in the bracket the desired datatype is written in which you want to convert this value).