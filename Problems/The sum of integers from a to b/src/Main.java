import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
            }
        System.out.println(sum);
    }
}