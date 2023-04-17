import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение а: ");
        int a = input.nextInt();

        double z1 = Math.pow(Math.cos((3.0 / 8.0 * Math.PI) - (a / 4.0)) , 2) - Math.pow(Math.cos((11.0 / 8.0 * Math.PI) + (a / 4.0)) , 2);
        double z2 = Math.sqrt(2) / 2 * Math.sin(a / 2.0);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
    }
}
