import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < input; i++) {
            int nextInt = scan.nextInt();
            if (nextInt % 6 == 0) {
                sum += nextInt;
            }
        }
        System.out.println(sum);
    }
}