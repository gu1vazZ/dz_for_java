import java.util.Scanner;

public class zhuravliep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи сюда всех журавлей: ");
        int S = scanner.nextInt();

        double Ss = S/6;

        System.out.println(Ss + " " + Ss * 4 + " " + Ss);


    }
}