package ExercicioInterface;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero:");
        int numero = sc.nextInt();
        System.out.print("Data (dd/mm/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/mm/yyyy"));
        System.out.print("Valor do ccontrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(numero , data , totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();


        ContractService contractService = new ContractService(null);

        contractService.processContract(contract, parcelas);

        System.out.println("Parcelas");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
