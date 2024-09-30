import java.util.Scanner;

public class mibandito_pohuito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите L G: ");

        int L = scanner.nextInt();
        int G = scanner.nextInt();

        int Lar = L - 1;
        int Garry = G - 1;

        System.out.println(G + " " + L);
    }
}
