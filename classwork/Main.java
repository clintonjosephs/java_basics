public class Main {
    // Enumerators are used to define a set of constants
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // int examScore = 90;
        // float examScore2 = 90.0f;
        // boolean isPassed = examScore >= 60;
        // String name = "John willo feather";

        // Test.displayResult(examScore, isPassed);
        Payment payment = new Payment("0241234567", "MTN", "GHS", "10");
        System.out.println(payment.getPhoneNumber());

        Shape shape = new Square(0, 10);
        Shape shape2 = new Rectangle(0, 10, 20);

        System.out.println(shape.findArea());
        System.out.println(shape2.findArea());
    }

    public static void another() {
        System.out.println("Testing Another method");
    }
}