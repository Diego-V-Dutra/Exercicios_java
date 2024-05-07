import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
        casas decimais.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159 */ 
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Double raio, area, pi = 3.14159;
        
        System.out.println("Digite o valor do raio:");
        
        raio = sc.nextDouble();
        
        area = pi*(raio*raio);
       
        System.out.printf("area= %.4f%n ", area);
        sc.close();
    }
}
