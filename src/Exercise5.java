import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение х: ");
        double x = input.nextDouble();
        System.out.print("Введите значения a и b: ");
        int a = input.nextInt();
        int b = input.nextInt();
        double y = 0;
        if (x > 3) {
            y = (a + x) * Math.atan(a * x);
        } else {
            y = Math.pow(Math.cos(b + Math.pow(x , 3)) , 2);
        }
        System.out.println("у = " + y);
    }
}
