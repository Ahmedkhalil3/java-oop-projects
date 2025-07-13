
public class Building implements Mappable{
    String name;
    UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAINMENT -> Color.GREEN + " " + PointMakers.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMakers.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMakers.SQUARE;
            case SPORTS -> Color.YELLOW + " " + PointMakers.CIRCLE;
            default -> Color.BLACK + " " + PointMakers.DIAMOND;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": %s", "usage": %s"
                """
                .formatted(name, usage);
    }
}
