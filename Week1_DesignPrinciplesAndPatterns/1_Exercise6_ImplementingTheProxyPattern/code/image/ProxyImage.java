package image;

import java.util.HashMap;

public class ProxyImage implements Image {
    private String fileName;
    private static final HashMap<String, RealImage> cache = new HashMap<>();

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        RealImage realImage = cache.get(fileName);
        if (realImage == null) {
            realImage = new RealImage(fileName);
            cache.put(fileName, realImage);
        }
        realImage.display();
    }
}
