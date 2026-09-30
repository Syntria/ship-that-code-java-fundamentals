import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        // Use streams to filter evens, square, sum, and print.

        int sum = Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sum();

        System.out.println(sum);
    }
}
