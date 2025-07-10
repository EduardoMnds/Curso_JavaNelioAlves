package ExemploEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();


        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Employee is outsourced (y/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("employee name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("employee hours: ");
            int hours = sc.nextInt();
            System.out.print("employee per hour: ");
            double perHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Employee additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutSourcedEmployee(name , hours , perHour , additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name , hours , perHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("Payments: ");
        for (Employee e : list) {
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }
}
