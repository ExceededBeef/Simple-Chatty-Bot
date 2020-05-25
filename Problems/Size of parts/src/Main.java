import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int largerPart = 0;
        int perfectPart = 0;
        int smallerPart = 0;
        for (int i = 0; i < input; i++) {
            int value = scan.nextInt();
            if (value == 1) {
                largerPart++;
            } else if (value == 0) {
                perfectPart++;
            } else {
                smallerPart++;
            }
        }
        System.out.println(perfectPart + " " + largerPart + " " + smallerPart);
    }
}