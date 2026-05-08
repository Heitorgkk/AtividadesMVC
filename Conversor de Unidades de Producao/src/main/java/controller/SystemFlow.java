package controller;

import view.EntregadorValor;
import view.MenuConverter;

public class SystemFlow {

    public static void chamarSistema(){
        
        int cv = MenuConverter.menu();

        ProcessadorConversao processador = new ProcessadorConversao();
        double kW = processador.converterCV(cv);

        EntregadorValor.mostrarValor(kW);

    }

}
