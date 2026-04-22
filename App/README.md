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

🚀 How to RunOverview

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist.

In this use case (UC7), the application sorts passenger bogies based on their seating capacity using a custom Comparator.

🎯 Use Case 7: Sort Bogies by Capacity
🧑 Actor

User

🔄 Flow

User runs the program
Bogie objects are created
Bogies are stored in a list
Comparator is applied for sorting
Sorted bogies are displayed
Program continues

💻 Features Implemented

Creation of custom Bogie objects
Storage using List collection
Sorting based on capacity
Displaying sorted results

🧠 Concepts Used

Comparator – Defines custom sorting logic
Custom Objects – Bogie class with name and capacity
List – Stores multiple objects dynamically
sort() – Sorts list using Comparator
Lambda Expression – Simplifies comparison logic
Separation of Data and Logic – Improves maintainability

📊 Sample Output

=== Train Consist Management App ===
Bogies sorted by capacity:
First Class - Capacity: 40
AC Chair - Capacity: 56
Sleeper - Capacity: 72
Program continues...

🚀 How to Run

Save the file as TrainConsistApp.java
Compile using javac TrainConsistApp.java
Run using java TrainConsistApp

🌱 Key Benefits

Introduces object-based programming
Applies real-world sorting logic
Improves planning and comparison
Demonstrates clean and scalable design

Save the file as TrainConsistApp.java
Compile using javac TrainConsistApp.java
Run using java TrainConsistApp

🌱 Key Benefits

Associates real-world data with bogies
Enables structured data representation
Supports efficient lookup and validation
Forms the base for analytics and planning