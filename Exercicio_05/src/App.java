import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo1, num_peca1, codigo2, num_peca2;
        double valor_uni1, valor_uni2, valor_total;

        System.out.println("Digite o codigo da peça 1:");
        codigo1 = sc.nextInt();
        
        System.out.println("Digite a quantidade de peça 1:");
        num_peca1 = sc.nextInt();
        
        System.out.println("Digite o valor unitario da peça 1:");
        valor_uni1 = sc.nextDouble();
        
        System.out.println("Digite o codigo da peça 2:");
        codigo2 = sc.nextInt();
        
        System.out.println("Digite a quantidade de peça 2:");
        num_peca2 = sc.nextInt();
        
        System.out.println("Digite o valor unitario da peça 2:");
        valor_uni2 = sc.nextDouble();

        valor_total = (valor_uni1*num_peca1)+(valor_uni2*num_peca2);

        System.out.printf("Valor total: "+valor_total);

        sc.close();
    }
}
