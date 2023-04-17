import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение х: ");
        double x = input.nextDouble();
        double a = 3.7;
        double b = 4.9;
        double c = 2.5;
        double y = (Math.sin(Math.sqrt(Math.pow(Math.E , x) + (a * Math.pow(x , 2)) + (b * Math.log(x))))) / (a * Math.pow(x , 2) + (c * x) + 13.7);
        System.out.println("у = " + y);
    }
}
