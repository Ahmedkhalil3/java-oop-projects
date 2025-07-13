import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim);

        // Save state to list
        List<String> savedData = tim.write();
        System.out.println("Saved Data: " + savedData);

        // Change player fields to simulate "loss"
        tim.setName("Unknown");
        tim.setHitPoints(0);
        tim.setStrength(0);
        tim.setWeapon("Stick");
        System.out.println("After reset: " + tim);

        // Restore saved state
        tim.read(savedData);
        System.out.println("After reading saved data: " + tim);
    }
}
