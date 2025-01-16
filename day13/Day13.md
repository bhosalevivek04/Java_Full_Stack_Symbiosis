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
