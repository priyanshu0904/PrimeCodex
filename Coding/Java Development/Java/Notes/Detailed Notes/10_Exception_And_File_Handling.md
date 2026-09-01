# Exception Handling
## Exception
- disruptive event occur during the execution of program, interrupting it's normal flow. It is an instance of problem that arises while the program is running.
- Exceptions are objects in Java, encapsulates information about error including type and state when error occurred.
- Hierarchy: Object ---> Throwable ---> Error, Exception(Run-time, Compile-time)

## Try-Catch
- try -> contains susceptible code to exception
- catch -> follows try, handles exception thrown by try
- when exception occurred in try block, control transferred to catch block to handle exception
- nested try-catch can be possible
- catch block -> write more specific to less specific, only one executes

## Type of Exceptions
- User-defined Exception or Custom Exception
- Built-in Exception
    1. Checked Exception:
        - ClassNotFoundException
        - InterruptedException
        - IOException
        - InstallationException
        - SQLException
        - FileNotFoundException
    2. Unchecked Exception: 
        - ArithmeticException
        - ClassCastException
        - NullPointerException
        - ArrayIndexOutOfBoundException
        - ArrayStornException
        - IllegalThreadStateException

- Checked exception must be either caught or declared in the method.
- Unchecked exception do not need to be explicitly handled

## Throw and Throws
- throws keyword: declare that method may throw one or more exception, used in method signature to indicate that method might throw exception of specific types, throws declared method requires the calling method to handle or further declare the exception, checked exceptions can propagate with throws, syntax throws is followed by class name(throws IOException, SQLException), can declare multiple exceptions
- throw keyword: used to explicitly throw exception from any method, can either create new instance of exception or an existing object using throw to throw the exception, cannot propagate checked exception, throw is followed by instanceof Exception class(throw new NumberFormatException), throw used inside method body only, can throw only one exception
- The method throws exception to it's calling method, and so on till main method

## Finally block
- executes after try-catch blocks, used for cleanup operations mainly
- always run, whether try throws exception or not, whether catch handles it or not
- ideal for closing resources like file or database connections to prevent resources leaks

## Custom Exceptions
- user-defined exceptions, extends Exception for checked exception or RuntimeException for unchecked exception
- created to represent specific error condition relevant to an application

# File Handling
## FileWriter Class
- FileWriter <--- OutputStreamWriter <--- Writer <--- Object
- FileWriter Class is used for writing streams of character to files
- character-based stream, best used for writing text rather than binary data
- Constructors: FileWriter(String fileName): creates FileWriter object given the name of file to write to
- FileWriter(File file): Creates a FileWriter Object given a File object
- Methods: write(int c) single character
- write(char[] cbuf) array of characters
- write(String str) string
-flush() flushes the stream, ensuring all data is written out, just a request, depend on JVM
- close() closes the stream, releasing any associated system resources

## FileReader Class
- FileReader class is used for reading streams of characters from files
- character based stream, reads characters, this make it suitable for reading text files
- Constructors: FileReader(String fileName): creates FileReader object to read from specific named file
- FileReader(File file): Creates FileReader object to read from specific file object
- Methods: read() -> read single character, returns integer, return -1 at the end of stream reached
- read(char[] cbuf) -> read characters into array and returns the number of character read