Use Case 1: Initialize Train and Display Consist Summary
🧑 Actor

User

🔄 Flow
User runs the program
Application displays a welcome message
Train consist is initialized
Initial bogie count is displayed
Program continues execution
💻 Features Implemented
Console-based application startup
Initialization of train consist using dynamic collection
Display of initial bogie count
Simple and clear output messages
🧠 Concepts Used
Class: Defines the structure of the application
Main Method: Entry point of the Java program
Static Keyword: Allows JVM to execute main() without object creation
ArrayList: Dynamic data structure to store bogies
List Interface: Provides abstraction for list implementations
Console Output: Uses System.out.println() for display
Dynamic Initialization: Starts with an empty collection for future updates
📊 Sample Output

=== Train Consist Management App ===
Train consist initialized successfully.
Initial number of bogies: 0
System ready for further operations...

🚀 How to Run
Save the file as TrainConsistApp.java
Compile the program using: javac TrainConsistApp.java
Run the program using: java TrainConsistApp
🌱 Future Enhancements
Add passenger bogies (Sleeper, AC Chair, First Class)
Add goods bogies (Rectangular, Cylindrical)
Implement capacity tracking
Add safety validation for cargo
Display complete train consist details