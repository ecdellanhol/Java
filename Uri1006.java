import java.util.Scanner;
public class Uri1006{
    public static void main (String args[]){
        double A, B, C, MEDIA;

        Scanner teclado = new Scanner (System.in);

        System.out.println ("Por favor, digite o promeiro valor ");
        A = teclado.nextDouble();
      
        System.out.println ("Por favor, digite o segundo valor ");
        B = teclado.nextDouble();

        System.out.println ("Por favor, digite o terceiro valor ");
        C = teclado.nextDouble();
       
        MEDIA = (A * 2 + B * 3 + C * 5) / 10;
        System.out.printf("MEDIA = %.1f%n", MEDIA);

    }
}