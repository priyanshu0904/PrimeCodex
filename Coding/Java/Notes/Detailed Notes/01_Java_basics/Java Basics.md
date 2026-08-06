# Java Basics
- Download Java JDK (Java Development Kit) from Oracle website.
- **Program.java** -> java compiler (javac) -> **Program.class** (bytecode) -> JVM (java) (of each machine) -> Output in 0/1 form, Machine code as per machine specifications.
- javac is used for bytecode conversion, it checks the error, code validity and converts into intermediate step which is not human readable and that is bytecode. It is responsible for syntax only. 
- From Program.java -> Program.class is compilation.
- From Program.class -> 0/1 form is Interpretation.
- Java completely ignores the whitespaces outside the string, but it consider the whitespace inside the String literal.
- In one device, java creates many virtual machines so that all program runs on different VM and doesn't interrupt each other. Security.
```
In terminal to check the available version in the device:
C://.......>java -version 
C://.......>javac -version
```

```
*Steps to run a Java program:*
source code Main.java
to convert into byte code command: javac Main.java
to run command: java Main //JVM
then got output in console/terminal

cat Main.java is used to see the content inside Main.
```

![[Compiling_and_Running.jpg]]

---
## Boilerplate Code
```
import java.lang.*;
public class Main{
	public static void main(String[] args){ //psvm
		System.out.println("Hello PrimeCodex"); //sout
	}
}
//Indentation is important.
```

---
## Anatomy

![[Anatomy.png]]

- The first letter of class must be Capital, it is a good practice. The class name must be same as file name.
- Only one public class in a file.
---
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

---
## JDK vs JRE vs JVM
### 1. .JDK
- Software development kit required to developed Java applications.
- Superset of JRE.
- Includes JRE, interpreter/loader (Java), compiler (javac), a doc generator (Javadoc) and other tools for Java Development.

### 2. .JRE
- Part of JDK but can be downloaded separately.
- Provides libraries, JVM and other components to run applications.
- Doesn't have tools and utilities like compilers and debuggers for developers.

### 3. .JVM
- Responsible for executing bytecode. Part of JRE.
- Ensures Java's **write-once-run-anywhere** capability.
- Platform dependent, different JVMs required for each type of OS.

![[JDK vs JRE vs JVM.jpg]]

---
## Showing Output
- `System.out.print();` - Showing the output to console and doesn't provide new line.
- `System.out.println();` - Showing the output to console and provides new line at the end of line.

---
## main() Method
```
public static void main(String[] args)
```

- It has a fixed structure, if you change in this the JVM doesn't recognize it.
- public - Access specifier; static - keyword; void - return type; main - method name; String[] args - array of string type.
- Entry point of any Java program where the execution starts. It is required to have a main method for JVM to know where to start the execution. Requirement of JVM.
- main method must be public and static for accessible to the JVM without needing instantiate the class.
- If you don't write main method so compiler compiles it as there is no syntax error but the JVM gives an error.

---
## IDE
- Integrated Development Environment (All basic tools required for software development)
- Coding, finding, problems and testing...
- It streamlines development, increase productivity and efficiency, simplifies complex tasks, unified workspace.
- Code autocomplete, syntax highlighting, version control, error checking.
- We use Intellij IDEA by JetBrains community version.