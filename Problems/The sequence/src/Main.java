import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLength = scan.nextInt();
        int i = 0;
        int maxValue = 0;
        while (i < numLength) {
            i++;
            int value = scan.nextInt();
            if (value % 4 == 0 && value > maxValue) {
                maxValue = value;
            }

        }
        System.out.println(maxValue);
    }
}