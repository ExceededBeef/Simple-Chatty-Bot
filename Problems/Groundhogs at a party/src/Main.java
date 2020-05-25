import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfReeses = Integer.parseInt(scanner.next());
        boolean isWeekend = Boolean.parseBoolean(scanner.next());
        boolean successWeekday = numOfReeses >= 10 && numOfReeses <= 20;
        boolean successWeekend = numOfReeses >= 15 && numOfReeses <= 25;
        boolean result = (isWeekend == true && successWeekend == true) || (isWeekend == false && successWeekday == true);
        System.out.println(result);

    }
}