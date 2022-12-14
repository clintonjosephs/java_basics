class TryingMethods {
    static String userName = "";
    /**
        This class is used to test out methods, conditional statements, 
        iterations/loops, method types (Static / Dynamic) 
    */ 
  
    public static void changeName(String name) {
        userName = name;
    }

    public String dayOfWeek(int day) {
        /**
            This method receives an integer and returns a string, the integer is received
            and then a switch statement is used to return the day of the week
         */ 
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        return dayOfWeek;
    }

    public void printStatement(int score) {
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
        } else if (score < 60 && userName == "Clinton") {
            System.out.println("You passed 😀");
        } else {
            System.out.println("You got an F");
        }
    }

    public static int sumLessthanOneThousand() {
        /**
            This method sums all the numbers from 1 to 1000
            and prints the sum
         */ 
        int sum = 0;
        int tracker = 1;
        while (tracker < 1000) {
            sum += tracker;
            tracker++;
        }
        return sum;
    }

    public static int sumEvenNumbers() {
        /**
            This method sums all the even numbers between 12 and 103
         */
         int sum = 0;
         for (int i = 13; i < 103; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
         }
        return sum;
    }
} 