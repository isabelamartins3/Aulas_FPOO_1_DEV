
import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de kWh consumidos: ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o tipo de instalação (R para residência, I para indústria, C para comércio): ");
        char tipoInstalacao = scanner.next().charAt(0);

        double precoTotal = 0.0;

        if (tipoInstalacao == 'R' || tipoInstalacao == 'r') {
            if (consumo <= 500) {
                precoTotal = consumo * 0.4;
            } else {
                precoTotal = consumo * 0.65;
            }
        } else if (tipoInstalacao == 'C' || tipoInstalacao == 'c') {
            if (consumo <= 1000) {
                precoTotal = consumo * 0.55;
            } else {
                precoTotal = consumo * 0.6;
            }
        } else if (tipoInstalacao == 'I' || tipoInstalacao == 'i') {
            if (consumo <= 5000) {
                precoTotal = consumo * 0.55;
            } else {
                precoTotal = consumo * 0.6;
            }
        } else {
            System.out.println("Tipo de instalação inválido.");
            System.exit(1);
        }

        System.out.println("O preço a pagar pelo fornecimento de energia elétrica é: R$" + precoTotal);
    }
}
