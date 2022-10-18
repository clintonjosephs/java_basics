public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int examScore = 90;
        float examScore2 = 90.0f;
        boolean isPassed = examScore >= 60;
        String name = "John willo feather";

        Test.displayResult(examScore, isPassed);
    }

    public static void another() {
        System.out.println("Testing Another method");
    }
}