Overview

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

In this use case (UC6), the application associates each bogie with its seating or load capacity using a HashMap.

🎯 Use Case 6: Map Bogie to Capacity
🧑 Actor

User

🔄 Flow

User runs the program
Bogie-capacity mapping is created
Entries are inserted into HashMap
System iterates through the map
Bogie capacities are displayed
Program continues

💻 Features Implemented

Mapping bogies to their capacities
Storing data using key–value pairs
Displaying both bogie names and capacities
Efficient lookup structure

🧠 Concepts Used

HashMap – Stores data in key–value pairs
Map Interface – Represents mapping structure
put() – Inserts key–value pairs
entrySet() – Iterates through map entries
Key–Value Association – Links bogie with capacity
Fast Lookup – Efficient retrieval using keys

📊 Sample Output

=== Train Consist Management App ===
Bogie Capacity Details:
Bogie: Sleeper | Capacity: 72
Bogie: AC Chair | Capacity: 60
Bogie: First Class | Capacity: 40
Program continues...

🚀 How to Run

Save the file as TrainConsistApp.java
Compile using javac TrainConsistApp.java
Run using java TrainConsistApp

🌱 Key Benefits

Associates real-world data with bogies
Enables structured data representation
Supports efficient lookup and validation
Forms the base for analytics and planning