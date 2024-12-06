package Classes;

public class Catalogo {

    private final String codigo;
    private final String descricao;
    private final double valor;
    
    public Catalogo(String codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }


}
