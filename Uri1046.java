import java.util.Scanner;
public class Uri1046{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int HINI, HFIM, DUR;

        HINI = teclado.nextInt();
        HFIM = teclado.nextInt();

        DUR = HFIM - HINI;

        if (DUR <=0){
            DUR = DUR + 24;
        }

        System.out.println("O JOGO DUROU "+DUR+" HORA(S)");
    
    }
}