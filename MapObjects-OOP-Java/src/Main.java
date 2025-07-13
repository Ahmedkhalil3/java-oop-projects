import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<Mappable>();

        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St", UtilityType.ELECTRICAL));
        mappables.add(new UtilityLine("College Australia", UtilityType.FIBER_OPTIC));

        for (Mappable m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
