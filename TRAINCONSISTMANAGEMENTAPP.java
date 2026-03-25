import java.util.HashMap;
import java.util.Map;

public class TRAINCONSISTMANAGEMENTAPP {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App - UC6 ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogies with their capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display each bogie with its capacity
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }
    }
}