import java.util.Scanner;
public class Uri1005{
    public static void main (String args[]){
        double A, B, MEDIA;

        Scanner teclado = new Scanner (System.in);

        System.out.println ("Por favor, digite o promeiro valor ");
        A = teclado.nextDouble();
      
        System.out.println ("Por favor, digite o segundo valor ");
        B = teclado.nextDouble();
       
        MEDIA = (A *3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.5f%n", MEDIA);

    }
}