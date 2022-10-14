public class TryingMethods {
    /**
        This class is used to test out methods, conditional statements, 
        iterations/loops, method types (Static / Dynamic) 
    */ 

    public String dayOfWeek(int day) {
        /**
            This method receives an integer and returns a string, the integer is received
            and then a switch statement is used to return the day of the week
         */ 
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        return dayOfWeek;
    }

    public void printStatement(int score, String name) {
        /**
            This method receives an integer and 
            prints a statement based on the 
            value of the integer
         */ 
        if (score >= 90) {
            System.out.println("You got an A");
        } else if (score >= 80) {
            System.out.println("You got a B");
        } else if (score >= 70) {
            System.out.println("You got a C");
        } else if (score >= 60) {
            System.out.println("You got a D");
        } else if (score < 60 && name == "Clinton") {
            System.out.println("You passed 😀")
        } else {
            System.out.println("You got an F");
        }
    }
} 