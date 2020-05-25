import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        do {
            if (value % 2 != 0) {
                System.out.println("odd");
            } else if (value % 2 == 0 && value != 0){
                System.out.println("even");
            } else {
                break;
            }
            value = scan.nextInt();
        } while (value != 0);



    }
}