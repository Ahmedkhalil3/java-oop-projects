public interface Mappable {
    void render();

    static double[] stringToLatLon(String location){
        String[] splits = location.split(",");

        double lat = Double.parseDouble(splits[0]);
        double lon = Double.parseDouble(splits[1]);

        return new double[] {lat, lon};
    }
}
