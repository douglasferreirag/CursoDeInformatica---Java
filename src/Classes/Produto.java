package Classes;

import java.sql.Date;

public class Produto extends Catalogo {

    public Produto(String codigo, String descricao, double valor, Date dataVencimento, Date dataFabricacao){

        super(codigo, descricao, valor);

        this.dataFabricacao = dataFabricacao;

        this.dataVencimento = dataVencimento;

    }

    private final Date dataFabricacao;

    private final Date dataVencimento;

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

}
