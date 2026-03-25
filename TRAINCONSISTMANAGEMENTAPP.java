import java.util.ArrayList;
import java.util.List;

public class TRAINCONSISTMANAGEMENTAPP {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after insertion
        System.out.println("After Adding Bogies: " + bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        // Check existence of Sleeper
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists");
        } else {
            System.out.println("Sleeper bogie not found");
        }

        // Final list
        System.out.println("Final Bogie List: " + bogies);
    }
}