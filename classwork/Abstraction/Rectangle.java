public class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double startPosition, double length, double width) {
        super(startPosition);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateVolume() {
        return 0;
    }

    @Override
    double findArea() {
        return length * width;
    }
}