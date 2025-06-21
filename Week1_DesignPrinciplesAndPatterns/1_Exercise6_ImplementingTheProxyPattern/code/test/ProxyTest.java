package test;

import image.ProxyImage;
import image.Image;

public class ProxyTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("design.png");
        Image img2 = new ProxyImage("design.png");
        Image img3 = new ProxyImage("logo.png");

        img1.display();
        img2.display();
        img3.display();
        img3.display();
    }
}
