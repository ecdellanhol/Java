import java.util.Scanner;
public class Uri_{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int valor;

        System.out.println("DIGITE O DDD PARA CONSULTA");

        valor = teclado.nextInt();


        switch (valor){
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvado");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD Inexistente");
                break;
        }
        System.out.println("                 FIM DO PROGRAMA _____________");

    }
}