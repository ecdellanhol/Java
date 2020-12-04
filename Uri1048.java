import java.util.Scanner;
public class Uri1048{
public static void main (String args[]){
    Scanner teclado = new Scanner (System.in);
    double SALARIO, NSALARIO, REAJUSTE;

    SALARIO = teclado.nextDouble();

    if (SALARIO <= 400.00){
        REAJUSTE = SALARIO * 0.15;
        NSALARIO = SALARIO + REAJUSTE;
        System.out.printf("Novo salario: %.2f%n", NSALARIO);
        System.out.printf("Reajuste ganho: %.2f%n", REAJUSTE);
        System.out.println("Em percentual: 15 %");
    }
    else if ((SALARIO > 400.00) && (SALARIO <= 800.00)){
        REAJUSTE = SALARIO * 0.12;
        NSALARIO = SALARIO + REAJUSTE;
        System.out.printf("Novo salario: %.2f%n", NSALARIO);
        System.out.printf("Reajuste ganho: %.2f%n", REAJUSTE);
        System.out.println("Em percentual: 12 %");
    }
    else if ((SALARIO > 800.00) && (SALARIO <= 1200.00)){
        REAJUSTE = SALARIO * 0.10;
        NSALARIO = SALARIO + REAJUSTE;
        System.out.printf("Novo salario: %.2f%n", NSALARIO);
        System.out.printf("Reajuste ganho: %.2f%n", REAJUSTE);
        System.out.println("Em percentual: 10 %");
    }
    else if ((SALARIO > 1200.00) && (SALARIO <= 2000.00)){
        REAJUSTE = SALARIO * 0.07;
        NSALARIO = SALARIO + REAJUSTE;
        System.out.printf("Novo salario: %.2f%n", NSALARIO);
        System.out.printf("Reajuste ganho: %.2f%n", REAJUSTE);
        System.out.println("Em percentual: 7 %");
    }
    else if (SALARIO > 2000.00){
        REAJUSTE = SALARIO * 0.04;
        NSALARIO = SALARIO + REAJUSTE;
        System.out.printf("Novo salario: %.2f%n", NSALARIO);
        System.out.printf("Reajuste ganho: %.2f%n", REAJUSTE);
        System.out.println("Em percentual: 4 %");
    }

}
}