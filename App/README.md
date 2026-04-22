# 🚆 Train Consist Management App – UC15

Overview:
This use case handles unsafe cargo assignments using try-catch-finally.

Use Case:
- Assign cargo to goods bogie
- Validate cargo compatibility
- Throw exception if unsafe
- Catch and handle exception
- Execute finally block

Concepts Used:
- try-catch-finally
- Runtime Exception
- Custom Exception
- Graceful Failure Handling

Rule:
Rectangular bogie → Petroleum NOT allowed

Sample Output:
Cargo assigned successfully: Petroleum
Error: Unsafe cargo assignment
Cargo assignment process completed.

How to Run:
javac TrainConsistApp.java
java TrainConsistApp

Key Benefits:
- Prevents runtime crashes
- Ensures safe operations
- Demonstrates exception handling