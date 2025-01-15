# Access Specifiers in Java

Access specifiers in Java are keywords that define the visibility or accessibility of classes, methods, and variables. They are fundamental to the concept of encapsulation in object-oriented programming, allowing developers to control how data is accessed and modified. Java provides four types of access specifiers:

1. **Public**
2. **Private**
3. **Protected**
4. **Default** (no specifier)

## Table of Access Specifiers

| Access Specifier | Class | Package | Subclass | World |
|-------------------|-------|---------|----------|-------|
| **Public**        | Yes   | Yes     | Yes      | Yes   |
| **Private**       | Yes   | No      | No       | No    |
| **Protected**     | Yes   | Yes     | Yes      | No    |
| **Default**       | Yes   | Yes     | No       | No    |

## Detailed Explanation of Access Specifiers

### 1. Public
- Members (variables and methods) declared as **public** are accessible from any other class in any package.
- This is the least restrictive access level.
- **Example:**
    ```java
    public class PublicExample {
        public int publicVar = 10;

        public void publicMethod() {
            System.out.println("Public Method");
        }
    }
    ```

### 2. Private
- Members declared as **private** are accessible only within the class they are declared in.
- They are not visible to any other class, including subclasses.
- This is the most restrictive access level, promoting encapsulation.
- **Example:**
    ```java
    public class PrivateExample {
        private int privateVar = 20;

        private void privateMethod() {
            System.out.println("Private Method");
        }
    }
    ```

### 3. Protected
- Members declared as **protected** are accessible within the same package and also in subclasses, even if they are in different packages.
- This allows for a level of access that is more flexible than private but still restricts access from non-subclass classes outside the package.
- **Example:**
    ```java
    public class ProtectedExample {
        protected int protectedVar = 30;

        protected void protectedMethod() {
            System.out.println("Protected Method");
        }
    }
    ```

### 4. Default (Package-Private)
- If no access specifier is declared, the member is considered to have **default** access (also known as package-private).
- Members with default access are accessible only within classes in the same package and are not accessible from subclasses in different packages.
- **Example:**
    ```java
    class DefaultExample {
        int defaultVar = 40; // Default access

        void defaultMethod() {
            System.out.println("Default Method");
        }
    }
    ```

## Summary

Access specifiers are essential for controlling the visibility of class members in Java. By using them appropriately, developers can protect sensitive data and ensure that the internal workings of a class are hidden from the outside world. This promotes better encapsulation and modularity in code design, leading to more maintainable and secure applications.


### Null Pointer Exception

#### Definition
A **Null Pointer Exception (NPE)** is a runtime exception in Java that occurs when an application attempts to use an object reference that has a null value. This means that the object being referenced does not exist or has not been initialized, leading to a crash.


- **Example:**
    ```java
    public class NullPointerExample {
        public static void main(String[] args) {
            String str = null;
            System.out.println(str.length()); // This line will throw a Null Pointer Exception
        }
    }
    ```

