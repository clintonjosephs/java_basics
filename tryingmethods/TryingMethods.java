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
} 