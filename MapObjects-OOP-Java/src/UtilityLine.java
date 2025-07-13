public class UtilityLine implements Mappable {
    String name;
    UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getLabel() {
        return name = " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.RED + " " + LineMakers.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMakers.DOTTED;
            default -> Color.BLACK + " " + LineMakers.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                "name": %s, "type": "%s"
                """
                .formatted(name, type);
    }
}
