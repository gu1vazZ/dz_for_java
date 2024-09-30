import java.util.Scanner;

public class lilput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите K M: ");

        double K = scanner.nextDouble();
        double M = scanner.nextDouble();

        System.out.println(Math.pow(K, 2) * M);
    }
}

