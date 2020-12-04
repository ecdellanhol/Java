import java.util.Scanner;
public class Uri1003{
    public static void main (String args[]){
        int A, B, SOMA;

        Scanner teclado = new Scanner (System.in);

        System.out.println ("Por favor, digite o promeiro valor inteiro");
        A = teclado.nextInt();

        System.out.println ("Por favor, digite o segundo valor inteiro");
        B = teclado.nextInt();

        SOMA = A + B;
        System.out.println ("A soma de A + B é = " + SOMA);

    }
}