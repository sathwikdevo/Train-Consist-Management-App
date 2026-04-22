import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        // Sorting using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("Program continues...");
    }
}