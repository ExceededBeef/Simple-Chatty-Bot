import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}