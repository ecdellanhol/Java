import java.util.Scanner;
public class Leituras{
    public static void main(String args[]){
        Scanner teclado; //declaro um componente do tipo scanner e chamo 
        teclado = new Scanner(System.in); //este componente irá ler dados do teclado

        int a;
        float b;
        double c;
        float d;

        System.out.println ("Por favor, digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("Você digitou " + a);

        System.out.println ("Agora digite um valor float");
        b = teclado.nextFloat();
        System.out.println("Você digitou " + b);

        System.out.println ("Digite outro valor double");
        c = teclado.nextDouble();
        System.out.println("Você digitou " + c);

        d = (float) a + b;
        System.out.println ("A soma de a + b é = "+ d);

        System.out.printf("%.1f%n", c);
        System.out.printf("%.2f%n", c);
        System.out.printf("%.3f%n", c);

    }
}