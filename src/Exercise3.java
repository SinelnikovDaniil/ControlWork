import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение t: ");
        int t = input.nextInt();
        double x = Math.sin(2 * t) + Math.sin(3 * t);
        System.out.println("х = " + x);
    }
}
