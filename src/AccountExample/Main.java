package AccountExample;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);

        Account acc01 = new Account(10110,"Eduardo",1000.0);
        acc01.withdraw(200.0);
        System.out.println(acc01.getBalance());

        Account acc02 = new SavingsAccount(1011,"Jope",1000.0,0.01);
        acc02.withdraw(200.0);
        System.out.println(acc02.getBalance());

        Account acc03 = new BusinessAccount(1099,"Jope",1000.0,500.0);
        acc03.withdraw(200.0);
        System.out.println(acc03.getBalance());

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"John",0.0,0.01);


        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        //AccountExample.BusinessAccount acc5 = (AccountExample.BusinessAccount) acc3;


        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
        }

    }
}