package AbstractExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Progam {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape # " + i + "data:");
            System.out.print("Rectangle or Circle (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double w = sc.nextDouble();
                System.out.print("Height: ");
                double h = sc.nextDouble();
                shapes.add(new Rectangle(color, w, h));
            } else {
                System.out.print("Radius: ");
                double r = sc.nextDouble();
                shapes.add(new Circle(color, r));
            }
        }
        System.out.println();
        System.out.println("Shapes Area:");
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }

        sc.close();
    }
}
