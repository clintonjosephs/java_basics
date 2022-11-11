abstract public class Shape {

    private double startPosition;

    Shape(double startPosition) {
        this.startPosition = startPosition;
    }

    abstract double calculateVolume();

    abstract double findArea();

    void move(double nextLocation) {
        System.out.println("Moving from " + startPosition + " to " + nextLocation);
    }
}