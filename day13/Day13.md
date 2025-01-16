# Day 13 Notes

## Overview
This folder contains Java code that demonstrates various recursive operations, including calculating sums, factorials, powers, checking for prime numbers, and printing multiplication tables.

### Classes and Methods

#### 1. `MainOperations` Class
- **Purpose**: This is the main class that executes the operations defined in the `Operations` class.
- **Key Methods**:
  - `main(String[] args)`: The entry point of the program. It creates an instance of the `Operations` class and calls various methods to demonstrate their functionality.
    - Calls `calculateFactorial(5)` and prints the result.
    - Calls `calculatePower(5, 3)` and prints the result.
    - Calls `isPrime(2, 2)` and prints whether the number is prime.
    - Calls `printTable(5, 10)` to print the multiplication table for 5 up to 10.

#### 2. `Operations` Class
- **Purpose**: Contains methods for performing various recursive operations.
- **Key Methods**:
  - `calculateSum(int no)`: Recursively calculates the sum of all integers from `no` down to 0. Returns 1 if `no` is negative.
  
  - `calculateFactorial(int no)`: Recursively calculates the factorial of `no`. Returns 1 if `no` is less than or equal to 0.
  
  - `calculatePower(int base, int expo)`: Recursively calculates the power of a base raised to an exponent. Uses a ternary operator for a concise implementation. Returns the base if the exponent is less than or equal to 1.
  
  - `isPrime(int number, int factor)`: Recursively checks if a number is prime. It returns false for numbers less than 2, true if no factors are found up to the square root of the number, and false if a factor is found.
  
  - `printTable(int table, int limit)`: Recursively prints the multiplication table for a given number (`table`) up to a specified limit. The method prints the results in the correct order by making the recursive call before printing.

### Notes
- The use of recursion in these methods demonstrates a fundamental programming concept that can simplify problems that can be broken down into smaller, similar subproblems.
- The `printTable` method is particularly interesting as it prints the multiplication table in ascending order by making the recursive call before the print statement.
- The `isPrime` method effectively uses recursion to check for primality, leveraging the mathematical property that if a number is not prime, it must have a factor less than or equal to its square root.

### Conclusion
The code in this folder serves as a practical example of recursion in Java, showcasing how it can be applied to various mathematical operations and algorithms. The `MainOperations` class acts as a driver to demonstrate the functionality of the recursive methods defined in the `Operations` class.


# Array Data Structure

## Introduction to Arrays
An **array** is a fundamental data structure that allows us to store a collection of elements, all of the same type, in a single variable. This structure is particularly useful for managing and organizing data efficiently.

### Key Characteristics of Arrays
- **Fixed Size**: When an array is created, its size is defined and cannot be altered. This means that the number of elements it can hold is predetermined.
- **Homogeneous Elements**: All elements within an array must be of the same data type (e.g., all integers, all strings). This uniformity allows for efficient memory allocation and access.
- **Indexed Access**: Each element in an array can be accessed directly using its index, which typically starts at 0. This allows for quick retrieval of data.

### Types of Arrays
1. **One-Dimensional Arrays**: 
   - A one-dimensional array is essentially a list of elements. Each element can be accessed using a single index.
   - **Example**: 
     ```java
     int[] numbers = {1, 2, 3, 4, 5};
     ```
   - In this example, `numbers[0]` would access the first element (1), while `numbers[4]` would access the last element (5).

2. **Multi-Dimensional Arrays**: 
   - Multi-dimensional arrays are arrays of arrays, allowing for the representation of more complex data structures, such as matrices or tables.
   - **Example**: 
     ```java
     int[][] matrix = {{1, 2}, {3, 4}};
     ```
   - Here, `matrix[0][1]` would access the element in the first row and second column (2).

### Advantages of Using Arrays
- **Efficient Memory Usage**: Arrays allocate memory in a contiguous block, which can lead to better performance, especially in terms of cache utilization.
- **Fast Access**: Accessing an element by its index is a constant time operation (O(1)), making arrays ideal for scenarios where quick data retrieval is essential.

### Disadvantages of Arrays
- **Fixed Size**: The inability to change the size of an array after its creation can lead to wasted memory if the array is not fully utilized or can limit functionality if more elements need to be added.
- **Insertion and Deletion**: Adding or removing elements from an array can be inefficient, as it may require shifting elements to maintain the order, leading to a time complexity of O(n).

### Conclusion
Arrays are a foundational data structure in programming, providing a simple yet powerful way to store and manipulate collections of data. A solid understanding of arrays is crucial for any programmer, as they serve as the building blocks for more complex data structures and algorithms. Mastery of arrays will enhance your ability to write efficient and effective code.
