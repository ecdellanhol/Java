import java.util.Scanner;
public class Uri1018_2 {
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int ENTRADA, N100, N50, N10, N20, N05, N02, N01, RESTO;

        ENTRADA = teclado.nextInt();

        N100 = ENTRADA / 100;
        N50 = (ENTRADA % 100) / 50;
        N20 = (ENTRADA % 100 % 50) / 20;
        N10 = (ENTRADA % 100 % 50 % 20) / 10;
        N05 = (ENTRADA % 100 % 50 % 20 % 10) / 5;
        N02 = (ENTRADA % 100 % 50 % 20 % 10 % 5) / 2;
        N01 = (ENTRADA % 100 % 50 % 20 % 10 % 5 % 2);
        

        System.out.println (ENTRADA);
        System.out.println (N100 +" notas(s) de R$ 100,00");
        System.out.println (N50 +" notas(s) de R$ 50,00");
        System.out.println (N20 +" notas(s) de R$ 20,00");
        System.out.println (N10 +" notas(s) de R$ 10,00");
        System.out.println (N05 +" notas(s) de R$ 5,00");
        System.out.println (N02 +" notas(s) de R$ 2,00");
        System.out.println (N01 +" notas(s) de R$ 1,00");

    }
}