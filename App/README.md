# 🚆 Train Consist Management App – UC12

Overview:
This use case validates safety compliance of goods bogies using Stream API.

Use Case:
- Create goods bogie list
- Convert to stream
- Apply allMatch()
- Validate cylindrical cargo rule
- Display safety result

Concepts Used:
- Stream API
- allMatch()
- Lambda Expressions
- Conditional Logic
- Business Rule Validation

Rule:
Cylindrical bogie → only Petroleum allowed

Sample Output:
Train is SAFE for operation

How to Run:
javac TrainConsistApp.java
java TrainConsistApp

Key Benefits:
- Ensures safety compliance
- Prevents invalid cargo
- Improves system reliability