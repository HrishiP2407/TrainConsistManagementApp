public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {"BG101", "BG205", "BG150", "BG300"};

        String searchKey = "BG150";

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID found");
        } else {
            System.out.println("Bogie ID not found");
        }
    }
}