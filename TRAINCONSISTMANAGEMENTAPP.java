import java.util.LinkedList;

public class TRAINCONSISTMANAGEMENTAPP {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App - UC4 ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (indexing starts at 0)
        trainConsist.add(2, "Pantry Car");

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display final ordered train consist
        System.out.println("Final Train Consist: " + trainConsist);
    }
}