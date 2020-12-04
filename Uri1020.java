import java.util.Scanner;
public class Uri1020{
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        int ENTRADA, ANO, MES, DIAS;

        ENTRADA = teclado.nextInt();

        ANO = ENTRADA / 365;
        MES = (ENTRADA % 365)/30;
        DIAS = (ENTRADA % 365)%30;

        System.out.println(ANO + " ano(s)");
        System.out.println(MES + " mes (es)");
        System.out.println(DIAS + " dia(s)");

    }
}