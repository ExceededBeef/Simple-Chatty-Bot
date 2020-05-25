import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        long counter = 0;
        for (long i = 1; i <= number; ++i) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter > 2) {
            return true;
        } else {
            return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}