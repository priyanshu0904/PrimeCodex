# Process vs Object Oriented
- **Procedural Programming:**  Work on functions or procedure or logic, Functional programming, to check error execute whole program
- **Object-oriented Programming:** Work on actual object or value or data, to check error or change functionality, execute only specific classes

# Instance Variable and Methods
- Variable of class -> Instance variable, properties, attribute
- Method that apply on object of that class -> Instance methods
- To use them, create object of that class
- camelCasing naming 

# Declaring Objects
- Car myCar = new Car(); 
- myCar -> reference to heap memory, Car -> class, new -> Create new instance of class, Car() -> Constructor
- Object -> Heap memory
- Object created -> Constructor called
- Array, String, Scanner -> Object creation
- new allows dynamic memory allocation means allocating at runtimes. new -> instantiation
- To access instance members -> Use dot( . ) operator

# Class vs Object
- Class is a blueprint or template and objects are real values in memory. Class is used to create Objects.
```java
class Car{
	//Car class
	int wheels;
	public void start(){//statements}
}

class Demo{
	public static void main(){
		Car newCar = new Car(); //Object of Car class
		newCar.start();
		System.out.println(newCar.wheels);
	}
}
```

# this Keyword
- this -> refers to current class or object
- To invoke another constructor of same class (this()).
- Invokes a method of the current object.
- Can be passes as an argument in the method call.
- Can return current class instance from the method.

# static Keyword
- Created only once, used by every objects, can be called without creating object just by class name. Property of class not objects. It can be variables or methods.
-  Anti to OOP Principle
```java
class_name.static_property_name;
```
- main() is static, JVM not create object, direct use or call
```java
class_name.main();
```

## Static vs Non-Static Member Access

| Access From ↓ | **Static Member** | **Non-Static Member (Object Property)** |
|---|---|---|
| **Same Class — Static Context** | ✅ Direct: `x`<br>✅ Class name: `Test.x`<br>⚠️ Object reference: `obj.x` | ❌ Direct: `y`<br>❌ `this.y`<br>❌ Direct object property access<br>✅ Using an explicit object: `obj.y` |
| **Same Class — Non-Static Context** | ✅ Direct: `x`<br>✅ Class name: `Test.x`<br>⚠️ Object reference: `obj.x` | ✅ Direct: `y`<br>✅ Current object: `this.y`<br>✅ Another object: `obj.y` |
| **Different Class — Static Context** | ❌ Direct: `x`<br>✅ Class name: `Test.x`<br>⚠️ Object reference: `obj.x` | ❌ Direct: `y`<br>❌ `this.y`<br>❌ No current object available<br>✅ Using an object: `obj.y` |
| **Different Class — Non-Static Context** | ❌ Direct: `x`<br>✅ Class name: `Test.x`<br>⚠️ Object reference: `obj.x` | ❌ Direct: `y`<br>❌ `this.y` *(if `y` belongs to `Test`)*<br>✅ Using a `Test` object: `obj.y` |

### Important Rule: Static Members vs Object Properties

| Member Type | Can Directly Access Static Members? | Can Directly Access Object Properties? | Can Access Object Properties Using an Object? |
|---|---|---|---|
| **Static Member / Static Method** | ✅ Yes | ❌ No | ✅ Yes — `obj.property` |
| **Non-Static Member / Instance Method** | ✅ Yes | ✅ Yes | ✅ Yes |

### Legend
- ✅ **Valid**
- ❌ **Invalid**
- ⚠️ **Valid but not recommended** — use the class name for static members

# Constructors
- Initialize new objects and set initial values
- Same name as class name in which declared, no return type
- Automatic called when object created
- Default: Car(); sets default values
- No Argument: Car() {set initial values to each};
- Parameterized Constructor: Car(int a, String b) {set parameter values};
## Constructor Chaining
- Use this() to invoke another constructor in same class
- this() -> Must be first statement
- Can't make loop, termination point
- Car() {this(b)};
## Code Blocks
- Code blocks {} determines the scope of variable.
- Variable inside {} -> local variable
- Initialization Block -> Run every-time object created, Static Block -> Run once when class loaded
- static{ }, { }

# Stack vs Heap Memory
- Stack -> Structured memory, local variables, reference to objects.
- Heap -> Unstructured memory, actual object, allocates at runtime

# Primitive vs Reference Types
- Primitive -> Actual values (default - 0, false etc), Reference Type -> Store address of objects (default - null or absence of any value)
- Access -> Primitive faster than reference type
- Primitive -> stack, Reference -> Heap
- Primitive -> Compared by values, Reference -> Compared by reference

# Variable Scopes
- It determines at compile time or during writing code by developers.
- Global or Instance Variables -> Access anywhere inside class, universal
- Local -> Variable inside method, code blocks etc.

# Garbage Collection and Finalize
## Garbage Collection
- Automatic, Managed by JVM, Running in background, only in heap, can affect application performance
- Object that are no longer reachable and active -> Eligible for GC.
- Can suggest System.gc(); but it depends, developers can not do it explicitly
- Ages or Generations -> Young (Frequent gc), Old (less gc), Permanent generation
- Finalize: Not used now, theory, Giving object a chance to clean resources but not guaranteed, use better code practice instead of this, 

> Good conventions : Static variables, instance variables, static block, initialization block, constructors, chaining, static methods, instance methods, main method