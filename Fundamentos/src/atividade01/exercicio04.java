
import java.util.Scanner;

public class exercicio04 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double aumento;

        if (salario > 1350.00) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }

        double novoSalario = salario + aumento;

        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Novo salário: R$" + novoSalario);

        scanner.close();
    }
}


