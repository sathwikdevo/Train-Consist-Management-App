The Train Consist Management App is a console-based Java application that simulates train consist management.

In UC8, the system filters passenger bogies based on seating capacity using the Java Stream API.

🎯 Use Case 8: Filter Passenger Bogies Using Streams
🧑 Actor

User

🔄 Flow

User runs the program
Bogie list is created
Stream is generated from the list
filter() is applied
Matching bogies are collected
Filtered bogies are displayed

💻 Features Implemented

Filtering bogies based on capacity
Use of Stream API
Creation of new filtered list
Non-destructive processing (original list unchanged)

🧠 Concepts Used

Stream API – Declarative data processing
stream() – Converts list to stream
filter() – Applies condition
Lambda Expression – Defines filtering logic
collect() – Converts stream back to list
Declarative Style – Focus on “what” not “how”

📊 Sample Output

=== Train Consist Management App ===
Filtered Bogies (Capacity > 60):
Sleeper - Capacity: 72
Program continues...

🚀 How to Run

Save as TrainConsistApp.java
Compile: javac TrainConsistApp.java
Run: java TrainConsistApp

🌱 Key Benefits

Reduces boilerplate code
Improves readability
Supports functional programming
Keeps original data safe
Enables flexible filtering

🧪 Test Case Scenarios

testFilter_CapacityGreaterThanThreshold()
→ Bogies with capacity > 70 should appear

testFilter_CapacityEqualToThreshold()
→ Bogies with capacity = 70 should NOT appear

testFilter_CapacityLessThanThreshold()
→ Bogies with capacity < threshold should NOT appear

testFilter_MultipleBogiesMatching()
→ All matching bogies should be returned

testFilter_NoBogiesMatching()
→ Result should be empty list

testFilter_AllBogiesMatching()
→ All bogies should appear

testFilter_EmptyBogieList()
→ Should return empty list without error

testFilter_OriginalListUnchanged()
→ Original list must remain unchanged