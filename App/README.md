The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

In this use case, the application focuses on dynamically managing passenger bogies using ArrayList operations.

🎯 Use Case 2: Add Passenger Bogies to Train
🧑 Actor

User

🔄 Flow

User runs the program
Passenger bogies are added
Bogies are displayed
One bogie is removed
Existence of a bogie is checked
Program continues

💻 Features Implemented

Dynamic addition of passenger bogies
Removal of a bogie from the list
Checking whether a bogie exists
Displaying the list before and after operations

🧠 Concepts Used

ArrayList – A resizable collection that allows dynamic insertion and deletion
add() – Used to insert elements into the list
remove() – Used to delete elements from the list
contains() – Used to check if an element exists
Insertion Order – Maintains the order of elements
CRUD Operations – Demonstrates Create, Read, and Delete operations

📊 Sample Output

=== Train Consist Management App ===
Passenger Bogies after addition:
[Sleeper, AC Chair, First Class]
After removing AC Chair:
[Sleeper, First Class]
Is Sleeper bogie present? true
Final Passenger Bogies List:
[Sleeper, First Class]
Program continues...

🚀 How to Run

Save the file as TrainConsistApp.java
Compile using javac TrainConsistApp.java
Run using java TrainConsistApp

🌱 Key Benefits

Demonstrates real-world list management
Shows how collections grow dynamically
Introduces CRUD operations
Helps visualize how bogies are added and removed