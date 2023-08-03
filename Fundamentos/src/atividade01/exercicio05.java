
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância da viagem em km: ");
        double distancia = scanner.nextDouble();
        double preco;

        if (distancia <= 200) {
            preco = distancia * 0.50;
        } else {
            preco = distancia * 0.45;
        }

        System.out.println("O preço da passagem é: R$ " + preco);

        scanner.close();
    }
}


