import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie Found: " + key);
        } else {
            System.out.println("Bogie Not Found");
        }

        System.out.println("Program continues...");
    }
}