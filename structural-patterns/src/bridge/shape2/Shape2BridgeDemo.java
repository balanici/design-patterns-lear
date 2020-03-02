package bridge.shape2;

public class Shape2BridgeDemo {
    public static void main(String[] args) {
        Color blue = new BlueColor();
        Shape square = new Square(blue);

        Color red = new RedColor();
        Shape circle = new Circle(red);

        Color green = new GreenColor();
        Shape greenCircle = new Circle(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
    }
}
