# Java Basics
- Java JDK (Java Development Kit) -> Oracle
- **Program.java** -> java compiler (javac) -> **Program.class** (bytecode) -> JVM (java) (of each machine) -> Output in 0/1 form, Machine code as per machine specifications.
- javac -> Compilation to bytecode and checks all errors, responsible for syntax only
- From Program.java -> Program.class is compilation.
- From Program.class -> 0/1 form is Interpretation.
- Ignores Whitespaces
- Java creates many VMs for security.
```shell
C://.......>java -version 
C://.......>javac -version
```

```
*Steps to run a Java program:*
source code -> Main.java
to bytecode -> javac Main.java
to execute bytecode -> java Main //JVM
then got output in console/terminal

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
- The class name must be same as file name.
- Only one public class in one file and name same as File name. Other non-public classes can be created.

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
- JDK :- Used for development
- JRE :- Used to run applications
- JVM :- Executes Bytecode

## Showing Output
```java
System.out.print();
System.out.println();
```

## main() Method
```java
public static void main(String[] args)
```
- Structure is fixed, used by JVM directly.
- Entry point for execution by JVM.
- Must be public and static for accessible by JVM without creating object
- If you don't write main method so compiler compiles it as there is no syntax error but the JVM gives an error.

## IDE
- Integrated Development Environment (All basic tools required for software development)
- Coding, finding, problems and testing...
- It streamlines development, increase productivity and efficiency, simplifies complex tasks, unified workspace.
- Code autocomplete, syntax highlighting, version control, error checking.
- We use Intellij IDEA by JetBrains community version.
- Do refactor -> rename to reflect the change everywhere.

## Comments
```java
- //Single line comment -> Shortcut is ctrl + /
- /* Multi 
  Line 
  Comment */
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


