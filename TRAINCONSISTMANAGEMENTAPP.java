import java.util.HashSet;
import java.util.Set;

public class TRAINCONSISTMANAGEMENTAPP {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App - UC3 ===");

        // Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs
        bogieIDs.add("B001");
        bogieIDs.add("B002");
        bogieIDs.add("B003");
        bogieIDs.add("B001"); // duplicate, automatically ignored

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}