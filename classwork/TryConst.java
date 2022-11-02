public class TryConst {
        String username;
        int age;

        public TryConst(String username, int age) {
            this.username = username;
            this.age = age;
        }

        public TryConst(String username) {
            this.username = username;
        }

        public static void main(String[] args) {
            TryConst user1 = new TryConst("Kwame", 25);
            TryConst user2 = new TryConst("Kwame");
            System.out.println(user1.username);
            System.out.println(user2.username);
        }
}

// Path: classwork/Constructors.java
