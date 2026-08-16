import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long n = sc.nextLong();

        long count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.print(count);
    }
}
