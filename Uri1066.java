
import java.util.Scanner;

public class Uri1066{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor, qtdePar=0, qtdeImp=0, qtdePos=0, qtdeNeg=0;


        for (int cont=1; cont<=5; cont++){

            valor = teclado.nextInt();

            if ((valor % 2) == 0){
                
                qtdePar++;
            }
            else{
                qtdeImp++;
            }
            if (valor > 0){
                qtdePos++;
            }
            else{
                qtdeNeg++;
            }

        }

        System.out.println(qtdePar +" valor(es) par(es)");
        System.out.println(qtdeImp +" valor(es) impar(es)");
        System.out.println(qtdePos +" valor(es) positivo(s)");
        System.out.println(qtdeNeg +" valor(es) negativo(s)");
        
    }

}
}