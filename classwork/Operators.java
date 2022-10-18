public class Operators {
    public static void main(String[] args) {
       operations();
       loops();
    }

    private static void loops() {
        // int i = 0;
        // while (i < 10) {
        //     System.out.println("i is " + i);
        //     i++;
        // }

        for (int j = 0; j < 20; j+=1) {
            if (j % 2 > 0) {
                System.out.println(j);
            }
        }

        // int k = 0;
        // do {
        //     System.out.println("k is " + k);
        //     k++;
        // } while (k < 10);
    }

    public static void operations() {
        double valueA = 10;
        int valueB = 20;
        int ifStatementBoss = 5;

        if (valueA > valueB) {
            System.out.println("Value A is greater than Value B");
        } else if (valueA < valueB) {
            System.out.println("Value A is less than Value B");
        } else {
            System.out.println("Value A is equal to Value B");
        }
        
        System.out.println(valueA / valueB);
    }
}