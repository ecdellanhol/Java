import java.util.Scanner;
public class Uri1007{
    public static void main (String args[]){
        int A, B, C, D, DIFERENCA;

        Scanner teclado = new Scanner (System.in);

        System.out.println ("Por favor, digite o promeiro valor ");
        A = teclado.nextInt();
      
        System.out.println ("Por favor, digite o segundo valor ");
        B = teclado.nextInt();

        System.out.println ("Por favor, digite o terceiro valor ");
        C = teclado.nextInt();

        System.out.println ("Por favor, digite o quarto valor ");
        D = teclado.nextInt();
       
        DIFERENCA = (A*B - C*D);
        System.out.printf("DIFERENCA = " + DIFERENCA);

    }
}