public class Main {
    public static void main(String[] args) {
        TryingMethods tryingMethods = new TryingMethods();
        // Testing the dayOfWeek method
        for (int j = 1; j < 8; j++) {
            System.out.println(tryingMethods.dayOfWeek(j));
        }

        // Testing the printStatement method
         tryingMethods.printStatement(90);
         TryingMethods.changeName("Clinton");
         tryingMethods.printStatement(40);
         TryingMethods.changeName("John Doe");
         tryingMethods.printStatement(50);


        // Testing the sumLessthanOneThousand method
        System.out.println(TryingMethods.sumLessthanOneThousand());

        // Testing the sumEvenNumbers method
        System.out.println(TryingMethods.sumEvenNumbers());
    }
}