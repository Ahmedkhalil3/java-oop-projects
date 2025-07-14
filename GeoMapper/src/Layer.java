import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> layersElements;

    public Layer(T[] layersElements) {
        this.layersElements = new ArrayList<>(List.of(layersElements));
    }

    public void addElement(T... element) {
        layersElements.addAll(List.of(element));
    }

    public void renderLayer() {
        for (T element : layersElements) {
            element.render();
        }
    }
}
