import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo"};

        Arrays.sort(bogieTypes);

        System.out.println("Sorted Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}