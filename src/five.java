import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи сюда длину стороны квадрата: ");
        double a = scanner.nextInt();

        System.out.print("Введи радиус круга: ");
        double r = scanner.nextInt();

        double S_square = Math.pow(a, 2);
        double circle = Math.PI * Math.pow(r, 2);

        if (S_square > circle) {
            System.out.printf("Площадь квадрата %.3f больше площади круга %.3f ", S_square, circle);
        } else {
            System.out.printf("Площадь круга %.3f больше площади квадрата %.3f ", circle, S_square);

        }
    }
}

