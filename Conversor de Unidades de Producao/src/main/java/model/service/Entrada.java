package model.service;

import java.util.Scanner;

public class Entrada {

    private static Scanner scanner = new Scanner(System.in);

    public static int pedirInt(){
        int out = scanner.nextInt();
        scanner.nextLine();
        return out;
    }

    public static int validarPositivo(int n){
        if(n > 0) return n;
        return 0;
    }

    public static int pedirIntValidado(){
        int out = pedirInt();
        if(validarPositivo(out)==0){
            System.out.printf("Valor inválido! Precisa ser positivo.\n\n");
            System.out.printf("Insira novamente: ");
            return pedirIntValidado();
        }
        return out;
    }

}
