# 🚆 Train Consist Management App – UC11

Overview:
This application validates Train ID and Cargo Code using Regular Expressions.

Use Case:
- User inputs Train ID and Cargo Code
- Regex patterns are defined
- Pattern & Matcher validate inputs
- Valid/Invalid results displayed

Concepts Used:
- Regular Expressions (Regex)
- Pattern class
- Matcher class
- matches() method
- Input validation

Regex Rules:
Train ID → TRN-1234 (TRN- followed by 4 digits)
Cargo Code → PET-AB (PET- followed by 2 uppercase letters)

Sample Output:
Enter Train ID: TRN-1234
Enter Cargo Code: PET-AB
Valid Train ID
Valid Cargo Code

How to Run:
javac TrainConsistApp.java
java TrainConsistApp

Key Benefits:
- Ensures valid input
- Prevents incorrect data
- Improves system reliability