package com.atv2.model.service;

import java.util.Scanner;

public class Entrada {

    public static Scanner scanner = new Scanner(System.in);

    public static String lerString(){
        return scanner.nextLine();
    }

    public static boolean validarEmail(String email){
        if(!email.contains("@weg.net")) throw new RuntimeException("Erro: Dominio do Email deve ser WEG");
        return true;
    }

}
