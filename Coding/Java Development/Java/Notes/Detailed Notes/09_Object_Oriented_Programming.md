# Object-Oriented Programming
- 4 pillars of OOPs, Language independent
    1. **Encapsulation**: Object exposes selected information, data hiding
    2. **Abstraction**: Hides complex details
    3. **Inheritance**: Inherit attributes from other
    4. **Polymorphism**: Can have more than one form

## Encapsulation
- hides internal data, allows access through methods only, no external interference and maintain integrity
- access modifiers -> public, protected, default(no keyword), private
- getters and setters -> public method to control property access
- enhances modularity, keeps classes separate and reduces coupling
- Use everywhere

### Import and Packages
- Package -> namespace to organize classes and interfaces, prevents name conflicts, avoid name collision categorizes similar classes together, package keyword, declared in the top or beginning of Java file, name of website in opposite manner -> convention, built-in and user-defined
- Import -> bring classes and interfaces from other package to current file, import keyword, single-type import: java.util.List etc & on-demand import: java.util.* but not recommended
- Java have built-in packages, java.lang is automatically imported

### Access Modifiers
- Public: allows access everywhere
- Protected: allows access within same package and subclasses
- Default: nothing written in access modifier, allows access within same package only, package-private
- Private: restricts access to the defining class only
- Any class can be either public or default
- Any variable, methods, constructors can use all four modifiers to control visibility
- Restrictiveness: Public < Protected < Default < Private
- No import in same package

|                       |                   | public | private | protected | default |
| --------------------- | ----------------- | ------ | ------- | --------- | ------- |
| **Same Package**      | **Class**         | YES    | YES     | YES       | YES     |
|                       | **Sub class**     | YES    | NO      | YES       | YES     |
|                       | **Non sub class** | YES    | NO      | YES       | YES     |
| **Different Package** | **Sub class**     | YES    | NO      | YES       | NO      |
|                       | **Non sub class** | YES    | NO      | NO        | NO      |


> Always make the software or anything more restrictive, whenever needed make them less restrictive, security increases, make less public things

### Getter and Setter
- Getter -> getName(), retrieve private fields
- Setter -> setName(), set or update private field
- controlled access and allow for validation logic
- Encapsulation -> it facilitates read-only and write-only access to fields
- allows internal changes without affecting external interfaces, make it flexible

## Inheritance
- new child/sub class inherits features from existing parent/super class
- code reusability, child can access parent features
- protected is used, only subclass can use them in both same and different package, available in same package for all
- Trick: child is a parent is true -> inheritance otherwise child has a parent us true -> make object
- extend keyword is used

### Types of Inheritance
- Single: 1 Parent -> 1 Child
- Multi-level: ....1 Grandparent -> 1 Parent -> 1 Child
- Hierarchical: 1 Parent -> Multiple Child
- Multiple: Multiple Parents -> 1 Child, not used in java directly

### Object Class
- Root class, parent class of all class, top of hierarchy, if a class is non-inherited, then it is automatically inherited by Object class
- Default methods -> equals(), hashCode(), toString(), getClass(), wait(), clone(), finalize(), notify() etc. and can be overridden by subclasses.
- toString() -> returns string representation of object, can be overridden

#### Equals and HashCode
- equals() -> logical equality checks between objects, by default check references, override it
- hashCode() -> generates integer hashcode representing object, used in HashMap
- Equals-HashCode Contract -> two objects are equal based on equals() - must have same hash code, but same hash code objects aren't necessarily equal
- equals() overridden then also override hashCode() to maintain consistency

### Nested and Inner Classes
- We can define classes inside classes, to logically grouping classes, improving encapsulation, enhances code readability
- Static Nested Class -> static member of outer class, can access static members only directly, otherwise creating object
- Inner Classes or Non-static classes -> associated with instance of outer class, can access all members including private
- Nested or inner classes can be private and protected also
```java
//Car is outer, Tyre is inner and Wheels is static nested class
Car.Wheels wheels = new Car.Wheels(); //to create object

Car car = new Car();
Car.Tyre tyre = car.new Tyre(); //associated with instance of outer class
```

- Local Inner Class -> Within a block or method, not accessible outside
- Anonymous Inner Class -> Nameless and use for single-use implementation

## Abstraction
- Hides complex implementation, showing essential features only, focusing on functionality means what an object does not on how it does
- Simplifies complexity, Real-world modeling(create object with real-life entities)
- Ladder of Abstraction: Far(less complex), near(more complex) -> try to make less complex for user

### abstract Keyword
- Abstract Class and Abstract Method
- Abstract Class -> no object created, non-instantiable, base class
- Abstract Method -> defines without implementations, subclasses require to provide specific functionality
- Subclasses must implement all the abstract methods of abstract class, otherwise make itself abstract
- Every subclass defines by its own, flexibility
- Constructor of parent must be called in child, explicit constructor

### Interfaces
- declare abstract methods, public and abstract methods, can be overridden in any subclass whether it is abstract
- can have default methods with implementations and static methods
- interface keyword is used, to inherit implements keyword is used, multiple interface allows means multiple inheritance
- Can use extends and implements simultaneously
- Object of abstract and interface can't be created, use upcasting

## Polymorphism
- Object of different classes, same method call in different ways -> flexible and reusable code, developer can write simple and readable codes by same name and different arguments
- Compile-time -> Method, Constructor, Operator overloading
- Run-time -> Method, Constructor overriding, subclass overrides a superclass method

### References and Objects
- Upcasting -> subclass to superclass reference, automatic and safe, access to superclass methods only, used for generalization in methods
- Downcasting -> superclass to subclass reference, manual and risky, needs instanceof check, access to subclass-specific methods only, used for specific subclass behavior
- instanceof is used to check whether a is instanceof b or not.
```java
//Vehicle is parent and Car is subclass
Vehicle veh = new Car(); //upcasting
Car car = new Vehicle(); //compilation error

Vehicle veh = new Car();
Car car = (Car)veh; //downcasting
```

### Compile-time Polymorphism
- Method overloading, same class multiple methods with same name but different parameters list
- Parameter must differ in number or type or sequence to distinguish them
- Automatic type casting can occur if not exact data type match, lossless conversion if no exact match
- return type can be different, but not alone to distinguish
- resolved during compile time
- Constructor overloading is same
- Operator overloading -> + for addition and concatenation built-in, no user-defined possible

### Super Keyword
- to refer immediate parent class instance variable, method, constructor
- in every child class, calling it's parent constructor is important if explicit constructor

### Run-time Polymorphism
- Method Overriding -> subclass redefines or overrides a method already defined in superclass
- run-time, method call is determined by object's type at runtime
- Overridden method can be called through a superclass reference holding a subclass object using super keyword.
- Overridden method must have same signature(name, return type, parameter) as method in parent class.
- access level can not be more restrictive than parent class access level
- @Override Annotation, optional but to ensure that correctly overridden.
- Constructor overriding is not possible

### Final Keyword
- Variable -> to create constant variable, must be initialized before constructor completes, reducing null pointer error, compiler can make certain assumptions so performance optimized
- Method -> to prevent method overriding by subclass
- Class -> to prevent inheritance
- Helps in creating immutable objects in combination with private fields and no setter method

### Pass by value and Pass by reference
- Value -> default method, primitive type always do this, copies argument to parameter, original variable not affected
- Reference -> object created, pass reference value for object, original variable affected