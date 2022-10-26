class Dog {
    String name = "";
    int age = 0;

    Dog(String name) {
        this.name = name;
    }

    static void bark() {
        System.out.println("Woof!");
    }

    void run() {
        System.out.println("running");
    }

    String getName(String type) {
        return type + " " + name;
    }

    String getName(String type, String breed) {
        return type + " " + breed + " " + name;
    }
}