

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorUnitario * quantidade;

        System.out.print("Digite a forma de pagamento (D - débito, C - crédito): ");
        char formaPagamento = scanner.next().charAt(0);

        if (formaPagamento == 'D' || formaPagamento == 'd') {
            double desconto = valorTotal <= 100 ? 0.05 : 0.03;
            valorTotal -= valorTotal * desconto;
        }

        System.out.print("Deseja parcelar a compra? (S/N): ");
        char escolhaParcela = scanner.next().charAt(0);

        if (escolhaParcela == 'S' || escolhaParcela == 's') {
            System.out.print("Digite o número de parcelas: ");
            int numParcelas = scanner.nextInt();
            double valorParcela = valorTotal / numParcelas;
            
            System.out.println("\nResumo da compra:");
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Valor unitário: R$ " + valorUnitario);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total do produto: R$ " + valorTotal);
            System.out.println("Forma de pagamento: " + (formaPagamento == 'D' || formaPagamento == 'd' ? "Débito" : "Crédito"));
            System.out.println("Número de parcelas: " + numParcelas);
            System.out.println("Valor da parcela: R$ " + valorParcela);
        } else {
            System.out.println("\nResumo da compra:");
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Valor unitário: R$ " + valorUnitario);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total do produto: R$ " + valorTotal);
            System.out.println("Forma de pagamento: " + (formaPagamento == 'D' || formaPagamento == 'd' ? "Débito" : "Crédito"));
            System.out.println("Valor total com desconto: R$ " + valorTotal);
        }

        scanner.close();
    }
}