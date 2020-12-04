import java.util.Scanner;
public class Uri1010{
    public static void main (String args[]){
        int cPC1, cPC2, nPC1, nPC2;
        double vPC1,vPC2,TOTAL;

        Scanner teclado = new Scanner (System.in);
        
        cPC1 = teclado.nextInt();
        nPC1 = teclado.nextInt();
        vPC1 = teclado.nextDouble();

        cPC2 = teclado.nextInt();
        nPC2 = teclado.nextInt();
        vPC2 = teclado.nextDouble();

        TOTAL = nPC1*vPC1 + nPC2*vPC2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",TOTAL);
       
    }
}