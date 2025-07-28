package TryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }

        System.out.println("End of program");

        sc.close();
    }

}
