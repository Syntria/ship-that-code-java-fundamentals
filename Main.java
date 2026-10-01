public class Main {
    static int safeDivide(int a, int b) {

        try {
            return a / b;
        } catch (ArithmeticException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(safeDivide(a, b));
    }
}
