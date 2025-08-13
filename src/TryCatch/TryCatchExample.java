package TryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        method2();

        System.out.println("End of program");
    }

    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
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
        sc.close();
        System.out.println("***METHOD2 END***");
    }

}
