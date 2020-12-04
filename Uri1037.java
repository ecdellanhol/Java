import java.util.Scanner;
public class Uri1037{
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);
        double ENTRADA;

        ENTRADA = teclado.nextDouble();
        
        if ((ENTRADA >= 0.25) && (ENTRADA <= 25.00)) {
            System.out.println("Intervalo [0,25]");
        } 
        else if ((ENTRADA > 25.00) && (ENTRADA <= 50.00)){
            System.out.println("Intervalo (25,50)");
        }
        else if ((ENTRADA > 50.00) && (ENTRADA <= 75.00)){
            System.out.println("Intervalo [50,75]");
        } 
        else if ((ENTRADA > 75.00) && (ENTRADA <= 100.00)){
            System.out.println("Intervalo (75,100)");
        }
        else {
            System.out.println("Fora de intervalo");
        }
    }
}