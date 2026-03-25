import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TRAINCONSISTMANAGEMENTAPP {

    // Inner class to represent a Bogie
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App - UC7 ===");

        // Create List of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies with capacities
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Sort bogies by capacity using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Passenger Bogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}