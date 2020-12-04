import java.util.Scanner;
public class Uri1018 {
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int NOTA, A, B, C, D, E, F, G, H, I, J,K, L, M, RESTO;

        NOTA = teclado.nextInt();

        A = NOTA / 100;
        B = NOTA % 100;
        C = B / 50;
        D = B % 50;
        E = D / 20;
        F = D % 20;
        G = F / 10;
        H = F % 10;
        I = H / 2;
        J = H % 2;
        K = J / 1;
        L = J % 1;
        M = L / 1;


        N100 = NOTA / 100;
        RESTO = NOTA % 100;
        N50 = (RESTO % 100) / 50;
        N20 = (RESTO % 50) / 20;
        N10 = (RESTO % 20) / 10;
        N05 = (RESTO % 10) / 5;
        N02 = (RESTO % 10) / 2;
        N01 = (RESTO % 2);
        

        System.out.println (NOTA);
        System.out.println (A +" notas(s) de R$ 100,00");
        System.out.println (C +" notas(s) de R$ 50,00");
        System.out.println (E +" notas(s) de R$ 20,00");
        System.out.println (G +" notas(s) de R$ 10,00");
        System.out.println (I +" notas(s) de R$ 5,00");
        System.out.println (K +" notas(s) de R$ 2,00");
        System.out.println (M +" notas(s) de R$ 1,00");

    }
}