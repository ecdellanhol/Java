import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int ENTRADA, HORA, MINUTO, SEGUNDO;

        ENTRADA = teclado.nextInt();

        HORA = ENTRADA / 3600;
        MINUTO = (ENTRADA % 3600)/60;
        SEGUNDO = (ENTRADA % 3600) % 60;

        System.out.print(HORA + ":");
        System.out.print(MINUTO + ":"); 
        System.out.print(SEGUNDO); 
    }
}