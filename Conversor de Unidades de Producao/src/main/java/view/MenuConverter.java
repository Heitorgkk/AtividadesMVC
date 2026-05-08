package view;

import model.service.Entrada;

public class MenuConverter {

    public static int menu(){

        System.out.printf("=== Conversor CV para kW ===\n\n");
        System.out.printf("Insira o valor: ");

        int valor = Entrada.pedirIntValidado();
        return valor;
    }

}
