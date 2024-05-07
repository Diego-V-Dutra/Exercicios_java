import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
    mensagem explicativa*/
        Scanner sc = new Scanner(System.in);
        int x,y,resultado;
        
        System.out.println("Digite o valor de x:");
        x = sc.nextInt();
        
        System.out.println("digite o valor de y:");
        y = sc.nextInt();
        
        resultado = x + y;
        
        System.out.println("Resultado = "+resultado);
        sc.close();
    }
}
