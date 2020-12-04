import java.util.Scanner;
public class Uri1052{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int ENTRADA;

        System.out.println ("Informe o numero corresponde ao mes");
        ENTRADA = teclado.nextInt();

        if (ENTRADA == 1){
            System.out.println("January");
        }
        else if (ENTRADA == 2){
            System.out.println("February");
        }
        else if (ENTRADA == 3){
            System.out.println("March");
        }
        else if (ENTRADA == 4){
            System.out.println("April");
        }
        else if (ENTRADA == 5){
            System.out.println("May");
        }
        else if (ENTRADA == 6){
            System.out.println("June");
        }
        else if (ENTRADA == 7){
            System.out.println("July");
        }
        else if (ENTRADA == 8){
            System.out.println("August");
        }
        else if (ENTRADA == 9){
            System.out.println("September");
        }
        else if (ENTRADA == 10){
            System.out.println("October");
        }
        else if (ENTRADA == 11){
            System.out.println("November");
        }
        else if (ENTRADA == 12){
            System.out.println("December");
        }
        else{
            System.out.println("Mes nao existe");
        }

    }
}