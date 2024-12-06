package Classes;

import java.sql.Date;

public class Gasto {

    private final String codigo;

    public Gasto(String codigo, double valor, Date data) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    private final double valor;

    public double getValor() {
        return valor;
    }

    private final Date data;

    public Date getData() {
        return data;
    }

}
