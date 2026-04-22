import java.util.*;
import java.util.stream.*;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " - Cargo: " + cargo;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true;
                });

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is NOT SAFE for operation");
        }

        System.out.println("Program continues...");
    }
}