/**
    Dynamic methods belongs to the OBJECT (Instance of the class) of the class, and can only be called by the object
    Static methods belongs to the class, and can be called by the class or the object

    Method overloading: same method name, different parameters/arguments
 */

 public class Methods {

    public static void main(String[] args) {
        Dog luna = new Dog("Cindy");
        luna.run();
        String name = luna.getName("German Shepard");
        String overloadName = luna.getName("lion", "Shepard");
        System.out.println(name);

        User kwame = new User("Kwame", "kwame@meltwater.org", "myPassword");
        Status kwameStatus = kwame.getStatus();
        if (kwameStatus.isActive()) {
            System.out.println("Kwame is active");
        } else {
            System.out.println("Kwame is not active");
        }

        if (kwameStatus.getLastLogin() != null) {
            System.out.println("Kwame last logged in on " + kwameStatus.getLastLogin());
        } else {
            System.out.println("Kwame has never logged in");
        }
    }

    static void addTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
 }