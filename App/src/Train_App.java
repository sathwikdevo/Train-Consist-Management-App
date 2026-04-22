import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Empty bogie list (to simulate failure case)
        List<String> bogieIds = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Defensive check
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train consist is empty");
        }

        // (This part will not execute if empty)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie Found: " + key);
        } else {
            System.out.println("Bogie Not Found");
        }

        System.out.println("Program continues...");
    }
}