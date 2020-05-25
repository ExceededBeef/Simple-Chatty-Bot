import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int bridges = scan.nextInt();
        int bridgeCounter = 0;
        int crashCounter = 0;
        for (int i = 0; i < bridges; i++) {
            int bridgeHeight = scan.nextInt();
            if (bridgeHeight <= height) {
                bridgeCounter++;
                crashCounter++;
                System.out.println("Will crash on bridge " + bridgeCounter);
                break;
            } else {
                bridgeCounter++;
            }
        }
        if (crashCounter == 0){
            System.out.println("Will not crash");
        }
    }
}