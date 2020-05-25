import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int M = Integer.parseInt(scan.next());
        int K = Integer.parseInt(scan.next());
        if((K <= N*M) && (K % N == 0 || K % M == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}