The Train Consist Management App is a console-based Java application that simulates train consist operations.

In UC9, the system groups bogies into categories using the Stream API and Collectors.groupingBy().

🎯 Use Case 9: Group Bogies by Type
🧑 Actor

User

🔄 Flow

User runs the program
Bogie list is created
Stream is generated
groupingBy() is applied
Bogies are grouped into categories
Grouped data is displayed

💻 Features Implemented

Grouping bogies by type
Transforming list into Map structure
Displaying categorized bogies
Non-destructive processing

🧠 Concepts Used

Stream API – Processes collections declaratively
groupingBy() – Groups elements based on key
Map – Stores grouped result
Lambda Expression – Defines grouping logic
Data Aggregation – Collects into structured form

📊 Sample Output

=== Train Consist Management App ===
Grouped Bogies by Type:
Sleeper : [Sleeper - Capacity: 72, Sleeper - Capacity: 72]
AC Chair : [AC Chair - Capacity: 56]
First Class : [First Class - Capacity: 40]
Program continues...

🚀 How to Run

Save as TrainConsistApp.java
Compile: javac TrainConsistApp.java
Run: java TrainConsistApp

🌱 Key Benefits

Organizes data into categories
Improves reporting clarity
Introduces advanced stream operations
Supports structured data analysis

🧪 Test Case Scenarios

testGrouping_BogiesGroupedByType()
→ Bogies with same type grouped together

testGrouping_MultipleBogiesInSameGroup()
→ Multiple bogies appear in same list

testGrouping_DifferentBogieTypes()
→ Different types appear as separate keys

testGrouping_EmptyBogieList()
→ Returns empty Map

testGrouping_SingleBogieCategory()
→ Only one key present

testGrouping_MapContainsCorrectKeys()
→ Expected keys exist in Map

testGrouping_GroupSizeValidation()
→ Group sizes are correct

testGrouping_OriginalListUnchanged()
→ Original list remains unchanged