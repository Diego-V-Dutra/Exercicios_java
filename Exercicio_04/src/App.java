import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
        decimais. */
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       int numero, horas_trab;
       double valor_hora, salario;
       
       System.out.println("Digite o numero do funcionario:");
       numero = sc.nextInt();
       
       System.out.println("Digite o numero de horas trabalhados:");
       horas_trab = sc.nextInt();
       
       System.out.println("Digite o valor recebido por hora:");
       valor_hora = sc.nextDouble();

       salario = horas_trab * valor_hora;
       
       System.out.println("Numero: " +numero);
       System.out.printf("Salario: " + salario);
       sc.close();
    }
}
