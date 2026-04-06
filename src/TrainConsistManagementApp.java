import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> bogieIds = new ArrayList<>();

        try {
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("No bogies available for search");
            }

            String searchKey = "BG101";
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "Bogie found" : "Bogie not found");

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}