import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*  Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
        Scanner sc= new Scanner(System.in);
        int a,b,c,d,diferença;
       
        System.out.println("Digite o valor de A:");
        a = sc.nextInt();
       
        System.out.println("Digite o valor de B:");
        b = sc.nextInt();
        
        System.out.println("Digite o valor de C:");
        c = sc.nextInt();
        
        System.out.println("Digite o valor de D:");
        d = sc.nextInt();
        
        diferença = (a*b-c*d);
       
        System.out.println("A diferença é: "+ diferença);
        sc.close();
    }
}
