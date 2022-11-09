public class Cattle extends Mammal {
    private int numberHead;

    public Cattle(int numberOfLegs, int numberHead) {
        super(numberOfLegs);
        this.numberHead = numberHead;
    }

    @override
    public void setNumberOfLegs(int numberOfLegs) {
        int numLegs = numberOfLegs + 1;
        super.setNumberOfLegs(numLegs);
    }

    public static void main(String[] args) {
        Cattle cow = new Cattle(4, 1);
        System.out.println(cow.numberOfLegs);
        System.out.println(cow.numberHead);
    }

}