import java.io.IOException;
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) throws IOException {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the amount of coke (can): ");
        int coca_can = myInput.nextInt();
        System.out.print("Enter the amount of noodle (pack): ");
        int noodle = myInput.nextInt();
        System.out.print("Enter the amount of orange (kg): ");
        int orange = myInput.nextInt();
        int coca_can_amount = coca_can * 5000;
        int noodle_amount = noodle * 3000;
        int orange_amount = orange * 7000;
        if (orange > 2) {
            orange_amount -= 5000;
        }
        int total = coca_can_amount + noodle_amount + orange_amount;
        System.out.println("Coca   " + coca_can + " " + coca_can_amount);
        System.out.println("Noodle " + noodle + " " + noodle_amount);
        System.out.println("Orange " + orange + " " + orange_amount);
        System.out.println("---------");
        System.out.println("Total  " + total);
    }
}
