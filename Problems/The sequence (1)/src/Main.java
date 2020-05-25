import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        if (n == 2) {
            System.out.println("1 2");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < i; k++) {
                    counter++;
                    if (counter <= n) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
        }
    }