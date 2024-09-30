import java.util.Scanner;

public class dendolbaeba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи сюда год: ");

        int year = scanner.nextInt();

        if (year % 400 == 0){
            System.out.print(" 12/09/" + year);
        }

        else if (year % 4 == 0 & year % 100 !=0) {
            System.out.print (" 12/09/" + year);
        }
        else {
            System.out.print("13/09/" + year);
        }
    }
}
