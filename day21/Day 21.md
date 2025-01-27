# Abstract Class and Interface

## Difference between Abstract Class and Interface

| Feature                | Abstract Class                                      | Interface                                         |
|------------------------|----------------------------------------------------|--------------------------------------------------|
| **Definition**         | Cannot be instantiated; can have abstract and concrete methods. | A contract that defines methods without implementation. |
| **Implementation**     | Single inheritance (a class can inherit from one abstract class). | Multiple inheritance (a class can implement multiple interfaces). |
| **Members**            | Can have fields, constructors, and methods with any access modifier. | All members are implicitly public and abstract (methods) or public and static (fields). |
| **Use Case**           | Used when classes share a common base and behavior. | Used to define a contract for classes that may not share a common base. |
| **Default Methods**    | Can have default methods with implementation.      | Can have default methods with implementation (from Java 8 onwards). |
| **Instantiation**      | Cannot be instantiated directly.                   | Cannot be instantiated directly.                  |
| **Access Modifiers**   | Can use any access modifier for its members.      | Members are implicitly public; cannot use other access modifiers. |

Assignment
    addition
    subtraction
    multiplication
    division

functional interface
    -lamda expression used when single abstract method(SAM) in interface