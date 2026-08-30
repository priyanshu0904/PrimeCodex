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