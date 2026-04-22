import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate bogie
        trainFormation.add("Sleeper"); // duplicate

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("Program continues...");
    }
}