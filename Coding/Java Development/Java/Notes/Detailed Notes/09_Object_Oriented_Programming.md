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