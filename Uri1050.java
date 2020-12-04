import java.util.Scanner;
public class Uri1050{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int ENTRADA, DDD61, DDD71, DDD11, DDD21, DDD32, DDD19, DDD27, DDD31;

        ENTRADA = teclado.nextInt();

        DDD61 = 61;
        DDD71 = 71;
        DDD11 = 11;
        DDD21 = 21;
        DDD32 = 32;
        DDD19 = 19;
        DDD27 = 27;
        DDD31 = 31;

        if (ENTRADA == 61){
            System.out.println("Brasilia");
        }
        else if (ENTRADA == 71){
            System.out.println("Salvador");
        }
        else if (ENTRADA == 11){
            System.out.println("Sao Paulo");
        }
        else if (ENTRADA == 21){
            System.out.println("Rio de Janeiro");
        }
        else if (ENTRADA == 32){
            System.out.println("Juiz de Fora");
        }
        else if (ENTRADA == 19){
            System.out.println("Campinas");
        }
        else if (ENTRADA == 27){
            System.out.println("Vitoria");
        }
        else if (ENTRADA == 31){
            System.out.println("Belo Horizonte");
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
    }
}