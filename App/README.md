Overview

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

In this use case (UC4), the application focuses on maintaining the correct order of bogies using LinkedList.

🎯 Use Case 4: Maintain Ordered Train Consist
🧑 Actor

User

🔄 Flow

User runs the program
Bogies are added to the train
Pantry Car is inserted at a specific position
First and last bogies are removed
Final ordered consist is displayed

💻 Features Implemented

Maintaining ordered train consist
Insertion at specific position
Removal from beginning and end
Display of final train structure

🧠 Concepts Used

LinkedList – Doubly linked list implementation
Node Structure – Elements linked via previous and next references
add() – Adds elements
add(index, element) – Inserts at specific position
removeFirst() – Removes first element
removeLast() – Removes last element
Order Preservation – Maintains sequence of bogies

📊 Sample Output

=== Train Consist Management App ===
Initial Train Consist:
[Engine, Sleeper, AC, Cargo, Guard]

After adding Pantry Car at position 2:
[Engine, Sleeper, Pantry Car, AC, Cargo, Guard]

Final Train Consist:
[Sleeper, Pantry Car, AC, Cargo]

Program continues...

🚀 How to Run

Save the file as TrainConsistApp.java
Compile using javac TrainConsistApp.java
Run using java TrainConsistApp

🌱 Key Benefits

Maintains real-world train order
Efficient insertion and deletion
Demonstrates LinkedList usage
Helps visualize train chaining structure