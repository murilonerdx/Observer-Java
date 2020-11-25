package br.com.cm;

import br.com.cm.interfaces.ChegadaAniversariante;

public class Namorada implements ChegadaAniversariante{

    public void chegou(EventoDoAniversariante evento){
        System.out.println("Avisando aos convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco..");
        System.out.println("SURPRESA!!!");
    }
    
}
