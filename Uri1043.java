import java.util.Scanner;
public class Uri1043{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        float A, B, C;
        float RES;
    
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();
    
        if (A+B > C && B+C > A && A+C > B){
            RES = A + B + C;
            System.out.printf("Perimetro = %.f%n", RES);
        }
        else {
            RES = (A+B)*C/2;
            System.out.printf("Area = %.1%N", RES);
        }
    }

}
