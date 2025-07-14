    public class Main {
        public static void main(String[] args) {
            Park[] nationalPark = new Park[] {
                    new Park("Park 1", "22.234, -1203.33"),
                    new Park("Park 2", "19.234, -122.33"),
                    new Park("Park 3", "21.234, -113.32"),
            };

            Layer<Park> parkLayer = new Layer<>(nationalPark);
            parkLayer.renderLayer();

            River[] rivers = new River[] {
                    new River("River 1", "22.234, -1203.33", "22.234, -1203.33"),
                    new River("River 2", "19.234, -122.33", "22.234, -1203.33"),
                    new River("River 3", "21.234, -113.32", "22.234, -1203.33"),
            };
            Layer<River> riverLayer = new Layer<>(rivers);
            riverLayer.renderLayer();
        }
    }
