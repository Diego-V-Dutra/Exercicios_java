import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("digite um numero:");
        x = sc.nextInt();
        if(x>=0){
            System.out.println("positivo");
            
        }else{
            System.out.println("negativo");
        }
    }
}
