import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи сюда длину катета a = " );
        int a = scanner.nextInt();

        System.out.print("Введи сюда длину катета b = " );
        int b = scanner.nextInt();

        Double C = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

        System.out.println("Длина гипотенузы = " + C);
}
}