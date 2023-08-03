package atividade01;
import java.util.Scanner;

public class exercicio06 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da casa a comprar: ");
        double valorCasa = scanner.nextDouble();

        System.out.print("Digite o salário da pessoa: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos a pagar: ");
        int anos = scanner.nextInt();

        double prestacaoMaxima = salario * 0.3;
        double prestacaoMensal = valorCasa / (anos * 12);

        if (prestacaoMensal <= prestacaoMaxima) {
            System.out.println("Empréstimo aprovado!");
            System.out.println("Valor da prestação mensal: " + prestacaoMensal);
        } else {
            System.out.println("Empréstimo rejeitado. Valor da prestação excede 30% do salário.");
        }

        scanner.close();
    }
}


