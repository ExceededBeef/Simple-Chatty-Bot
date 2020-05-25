import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int total1 = num1 / 2 + num1 % 2;
        int total2 = num2 / 2 + num2 % 2;
        int total3 = num3 / 2 + num3 % 2;
        System.out.println(total1 + total2 + total3);
    }
}