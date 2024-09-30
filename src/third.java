import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи сюда скорость 1 авто = ");
        int a = scanner.nextInt();

        System.out.print("Введи сюда скорсоть 2 авто = ");
        int b = scanner.nextInt();

        System.out.print("Введи сюда расстояние между ними = ");
        int s = scanner.nextInt();

        double t = (s / (a + b));

        System.out.printf("Время, через которое встретятся авто: %.2f час ", t);
    }
}
