Use Case 3: Track Unique Bogie IDs
🧑 Actor

User

🔄 Flow

User runs the program
Bogie IDs are added
Duplicate IDs are inserted intentionally
System stores IDs in HashSet
Duplicates are automatically ignored
Final unique IDs are displayed

💻 Features Implemented

Storage of bogie IDs using HashSet
Automatic removal of duplicate IDs
Display of unique bogie IDs

🧠 Concepts Used

Set – Collection that does not allow duplicates
HashSet – Implementation of Set using hashing
add() – Inserts elements into the set
Automatic Deduplication – Prevents duplicate entries
Unordered Storage – Elements are not stored in order

📊 Sample Output

=== Train Consist Management App ===
Unique Bogie IDs in Train:
[BG101, BG102, BG103]
Program continues...

(Note: Order may vary because HashSet is unordered)

🚀 How to Run

Save the file as TrainConsistApp.java
Compile using javac TrainConsistApp.java
Run using java TrainConsistApp

🌱 Key Benefits

Ensures uniqueness of bogie IDs
Prevents duplicate data issues
Introduces Set data structure
Improves data integrity in system