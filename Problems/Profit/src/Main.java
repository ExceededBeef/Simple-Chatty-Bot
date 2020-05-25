import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double M = scan.nextDouble();
       double P = scan.nextDouble();
       double K = scan.nextDouble();
       int yearCount = 0;

       while (M < K) {
           yearCount++;
           M = M + (M * (P / 100));
       }
        System.out.println(yearCount);
    }
}