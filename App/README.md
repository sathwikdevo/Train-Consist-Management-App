# 🚆 Train Consist Management App – UC20

Overview:
This use case prevents searching on an empty train using defensive programming.

Use Case:
- User triggers search
- System checks if bogie list is empty
- Throws exception if empty
- Stops execution immediately

Concepts Used:
- Defensive Programming
- IllegalStateException
- Fail-Fast Principle
- State Validation

Sample Output:
Exception in thread "main" java.lang.IllegalStateException:
Cannot perform search: Train consist is empty

How to Run:
javac TrainConsistApp.java
java TrainConsistApp

Key Benefits:
- Prevents invalid operations
- Improves reliability
- Enforces correct system state