public class Main {
    static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public String greet() {

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" says hello");

            return stringBuilder.toString();

        }
    }

    static class Dog extends Animal {

        public Dog(String name) {

            super(name);
        }

        @Override
        public String greet() {

            StringBuilder stringBuilder = new StringBuilder(this.name);
            stringBuilder.append(" says woof");

            return stringBuilder.toString();

        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.nextLine();

        Dog d = new Dog(name);
        System.out.println(d.greet());
    }
}
