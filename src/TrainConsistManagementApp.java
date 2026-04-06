class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
            throw new CargoSafetyException("Unsafe cargo assignment!");
        }
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            GoodsBogie b1 = new GoodsBogie("Cylindrical", "Petroleum");
            GoodsBogie b2 = new GoodsBogie("Rectangular", "Petroleum");

            System.out.println("Bogies assigned successfully");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation completed");
        }
    }
}