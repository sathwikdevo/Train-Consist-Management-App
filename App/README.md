The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

In this use case (UC5), the application ensures both uniqueness and insertion order of bogies using LinkedHashSet.

🎯 Use Case 5: Preserve Insertion Order of Bogies
🧑 Actor

User

🔄 Flow

User runs the program
Bogies are added to the formation
Duplicate bogie is attempted
LinkedHashSet stores only unique elements
Formation is displayed in insertion order

💻 Features Implemented

Maintains insertion order of bogies
Prevents duplicate entries
Displays final train formation
Ensures predictable output

🧠 Concepts Used

LinkedHashSet – Maintains insertion order with uniqueness
Set Interface – Prevents duplicate elements
add() – Adds elements to the set
Automatic Deduplication – Ignores duplicate entries
Ordered Iteration – Maintains sequence of insertion

📊 Sample Output

=== Train Consist Management App ===
Final Train Formation (Insertion Order Preserved):
[Engine, Sleeper, Cargo, Guard]
Program continues...

🚀 How to Run

Save the file as TrainConsistApp.java
Compile using javac TrainConsistApp.java
Run using java TrainConsistApp

🌱 Key Benefits

Prevents duplicate bogies
Maintains real-world train order
Combines ordering with uniqueness
Ensures consistent and predictable train formation