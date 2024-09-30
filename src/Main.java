import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print (" Впиши длину ребра куба: ");
        int n = scanner.nextInt();

        Double V = Math.pow(n, 3);
        Double S = Math.pow(n, 2) * 4;

        System.out.println("Объем: " + V);
        System.out.println("Площадь боковой поверхности : " + S);
    }
}