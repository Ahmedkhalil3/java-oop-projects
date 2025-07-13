import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        String hitPointsStr = String.valueOf(hitPoints);
        String strengthStr = String.valueOf(strength);
        return List.of(getName(), hitPointsStr, strengthStr );
    }

    @Override
    public void read(List<String> list) {
        if(list != null && !list.isEmpty()){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='%s', hitPoints=%d, strength=%d}"
                .formatted(getName(), getHitPoints(), getStrength());
    }
}
