import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи сюда значение x: ");

        double x = scanner.nextInt();
        double y;

        if (x > 0) {
            y = Math.pow(Math.sin(x), 2);
        } else {
            y = 1 - 2 * (Math.sin(Math.pow(x,2)));
        }

        System.out.println("Значение y: "+y);
}   }
