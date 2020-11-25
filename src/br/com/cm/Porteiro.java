package br.com.cm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.cm.interfaces.ChegadaAniversariante;

public class Porteiro {
    private List<ChegadaAniversariante> observadores = new ArrayList<>();


    public void registrarObservador(ChegadaAniversariante o){
        observadores.add(o);
    }

    public void monitorar(){
        Scanner scan = new Scanner(System.in);
        String valor = "";
        while(!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante chegou ?: ");
            EventoDoAniversariante evento = new EventoDoAniversariante(new Date());

            valor = scan.nextLine();

            if("sim".equalsIgnoreCase(valor)){
                observadores.stream().forEach(o -> o.chegou(evento));
                valor = "sair";
            }else{
                System.out.println("Alarme falso");
            }
        }

        scan.close();
        

    }

    
}
