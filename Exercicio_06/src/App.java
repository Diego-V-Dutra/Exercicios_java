import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
            a) a área do triângulo retângulo que tem A por base e C por altura. 
            b) a área do círculo de raio C. (pi = 3.14159) 
            c) a área do trapézio que tem A e B por bases e C por altura. 
            d) a área do quadrado que tem lado B. 
            e) a área do retângulo que tem lados A e B. */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a,b,c,areaTri,areaCir,areaTrap,areaQua,areaRet;
        double pi = 3.14159;
        
        System.out.println("digite o valor de a: ");
        a = sc.nextDouble();
        
        System.out.println("digite o valor de b: ");
        b = sc.nextDouble();
        
        System.out.println("digite o valor de c:");
        c = sc.nextDouble();

        areaTri = a*c/2;
        areaCir = pi*c*c;
        areaTrap = (a+b)*c/2;
        areaQua = b*b;
        areaRet = a*b;
        System.out.printf("area do triangulo: %.3f\n",areaTri);
        System.out.printf("area do circulo: %.3f\n",areaCir);
        System.out.printf("area do trapezio: %.3f\n",areaTrap);
        System.out.printf("area do quadrado: %.3f\n",areaQua);
        System.out.printf("area do retangulo: %.3f\n",areaRet);
        sc.close();
    }
}
