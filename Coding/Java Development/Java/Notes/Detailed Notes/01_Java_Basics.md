# Java Basics
- Java JDK (Java Development Kit) -> Oracle
- Java SE(Standard Edition), EE(Jakarta, Enterprise Edition), ME(Micro Edition) and LTS is Long-term Support version(preferred)
- LTS versions: Stability over features, Long term support, Reduced frequency for upgrade
- **Program.java** -> java compiler (javac) -> **Program.class** (bytecode) (Platform independent) -> JVM (java) (of each individual machine) -> Output in 0/1 form, Machine code as per machine specifications.
- javac -> Compilation to bytecode and checks all errors, responsible for syntax only
- From Program.java -> Program.class is compilation process. (HLL -> Machine code or LLL), software is Compiler
- If trying to run without compiling, gives runtime error. Because JVM can't find .class file.
- From Program.class -> 0/1 form is Interpretation.
- Ignores Whitespaces
- Java creates many VMs for security.
- Java ignores spaces, in string it considers.
```shell
C://.......>java -version 
C://.......>javac -version

C://.......>java //to check if it is working or not 
C://.......>javac //to check if it is working or not
```

```
*Steps to run a Java program:*
source code -> Main.java 
to bytecode -> javac Main.java //compilation -> Main.class
to execute bytecode -> java Main //JVM and execution
then got output in console/terminal

//Source file mode---> java Main.java ---> One-step process (Java 21 and finalize in Java 25)

cat Main.java -> to see content inside Main
```

## Boilerplate Code
```java
import java.lang.*;
public class Main{
	public static void main(String[] args){ //psvma
		System.out.println("Hello PrimeCodex"); //sout
	}
}
```

## Anatomy
- First Letter of class -> Capital
- The public class name must be same as file name.
- At-most one public class in one file and named same as File name.It is not necessary to always have public class.
- Other non-public classes can be created in one file and no need to match with file name. Package-private access by default.
- Can run the non-public class having main method using Class name.
```java
//File name must be Public
//Can have multiple main method in different classes
class NonPublic{
  main(); //main 1
}

public class Public{
  main(); //main 2
}
//When compiled two .class files have created, NonPublic.class and Public.class, .class created of the all class names not of source file name
//To run NonPublic.class -> java NonPublic(main 1 executes) and to run Public.class -> java Public (main 2 executes)
//java command requires .class files with main method execution
```

## Errors
1. Compile-time Error: 
2. Run-time Error:
3. Logical Error: 

## File Extensions
### 1. .java
- Contains Java Source Code
- High level human readable
- Used for Development.
- Editable
### 2. .class
- Contains Java Bytecode
- For consumptions of JVM
- Used for Execution
- Not meant to be edited
- It doesn't contains 0/1 or machine code
- A human can't understand it

## JDK vs JRE vs JVM
### JDK
- Java Development Kit
- It is a Software development kit required to develop java applications
- Includes JRE, interpreter/loader(java), compiler(javac), doc generator(Javadoc) and other tools like debuggers, jheap

### JRE
- Java Runtime Environment
- Part of JDK but can be download separately, to run java applications only
- Provides runtime libraries, class package, JVM and other components to run java application
- Does not have tools for development

### JVM
- Java Virtual Machine
- Part of JRE and responsible for executing bytecode, runtime engine
- Ensures java's write once, run anywhere capability.
- Not platform independent, different JVM needed for each OS

## Showing Output
- Prints the desired output to console
```java
System.out.print();
System.out.println(); //adds new line after statement
```

## main() Method
```java
public static void main(String[] args)
```
- main() method is used to run any class either public or anything.
- Structure/signature is fixed, used by JVM directly. If changed, JVM can't recognize it.
- Entry point of java program for starting execution by JVM.
- Must be public and static for accessible by JVM without creating object of class
- If you don't write main method so compiler compiles it as there is no syntax error but the JVM gives an error.

## IDE
- Integrated Development Environment, software (All basic tools required for software development)
- Coding, finding, problems and testing... Central hub, improves developer efficiency
- It streamlines development, increase productivity and efficiency, simplifies complex tasks, unified workspace.
- Code autocomplete, syntax highlighting, version control, error checking.
- We use Intellij IDEA by JetBrains community edition.
- Do refactor -> rename to reflect the change everywhere.

## Comments
- This will not executed, ignored by compiler
- Used for developers
```java
- //Single line comment -> Shortcut is ctrl + /
- /* Multi 
  Line 
  Comment
  ->Shortcut is ctrl + shift + /
  */
- /** Java 
  * Docs
  * Used for definition to write in code
  * Can see upon hover */
Java Docs are applied before any Java method or class only. Document of any Java method or class. You can see upon hover to that class.

You can see the documentation of any function by just hovering over it. And to go to the source code just ctrl + click.
```

# Flowchart and Algorithms
- Flowchart -> Diagrammatical representation to solve problem
- Algorithm -> Steps to solve problem
- Pseudo Code -> Looking like code but not the actual code

# Classes and Objects
- Classes are blueprint or template and Objects are instance of classes.
- Basis of Java
- Class name is written in first letter capital, convention
- Why to use? :-
    - Promotes readability of code
    - Helps to manage large programs by dividing them
    - Simulate real-world objects.