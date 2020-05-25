import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prev = sc.nextInt();
        int curr = sc.nextInt();

        while (sc.hasNextInt() && prev == curr) {
            prev = curr;
            curr = sc.nextInt();
        }

        boolean flag = prev < curr;

        while (sc.hasNextInt()) {
            prev = curr;
            curr = sc.nextInt();

            if (prev < curr && flag) {
                System.out.println("Ascending");
            } else if (prev > curr && !flag) {
                System.out.println("Descending");
            } else if (prev == curr) {
                System.out.println("Equal");
            } else {
                System.out.println("Not sorted");
                break;
            }
        }
    }
}