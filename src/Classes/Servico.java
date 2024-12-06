package Classes;

import java.sql.Time;



public class Servico extends Catalogo {

    public Servico (String codigo, String descricao, double valor, Time tempoGasto){

        super(codigo, descricao, valor);

        this.tempoGasto = tempoGasto;


       
    }

    private final Time tempoGasto;

    public Time getTempoGasto() {
        return tempoGasto;
    }

 


}
