import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um numero:");
        x=sc.nextInt();
        if(x%2==0){
            System.out.println("O número é par");
        }else{
        System.out.println("O número é ímpar");
        }
    }
}
