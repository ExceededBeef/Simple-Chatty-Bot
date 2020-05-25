import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int intLength;
        if (a > b) {
            intLength = a - b;
        } else {
            intLength = b - a;
        }
        float sum = 0;
        float counter = 0;

        for(int i = 0; i <= intLength; i++) {
            int nextNum = a++;
            if (nextNum % 3 == 0) {
                sum = sum + nextNum;
                counter = counter + 1;
            }
        }
        System.out.println(sum / counter);
    }
}