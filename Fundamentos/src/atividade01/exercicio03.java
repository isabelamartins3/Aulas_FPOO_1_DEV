
    import java.util.Scanner;
public class exercicio03 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a velocidade do carro (em km/h): ");
        int velocidade = scanner.nextInt();
        
        if (velocidade > 80) {
            int kmAcima = velocidade - 80;
            double multa = kmAcima * 5.0;
            
            System.out.println("Motorista foi multado!");
            System.out.println("Valor da multa: R$ " + multa);
        } else {
            System.out.println("Velocidade dentro do limite permitido.");
        }
        
        scanner.close();
    }
}

    

