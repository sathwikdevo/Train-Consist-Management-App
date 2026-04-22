# 🚆 Train Consist Management App – UC14

Overview:
This use case validates passenger bogie capacity using a custom exception.

Use Case:
- Create passenger bogie
- Validate capacity in constructor
- Throw exception if invalid
- Handle exception using try-catch

Concepts Used:
- Custom Exception
- Exception Inheritance
- throw keyword
- throws declaration
- Fail-fast validation

Rule:
Capacity must be greater than 0

Sample Output:
Error: Capacity must be greater than zero

How to Run:
javac TrainConsistApp.java
java TrainConsistApp

Key Benefits:
- Prevents invalid data
- Improves reliability
- Enforces business rules