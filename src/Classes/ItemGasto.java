package Classes;

public class ItemGasto {

    private final String codigoGasto;
    private final String codigoCatalogo;
    private final double quantidade;
    private final double total;

    public ItemGasto(String codigoGasto, String codigoCatalogo, double quantidade, double total) {
        this.codigoGasto = codigoGasto;
        this.codigoCatalogo = codigoCatalogo;
        this.quantidade = quantidade;
        this.total = total;
    }


    public String getCodigoGasto() {
        return codigoGasto;
    }

    public String getCodigoCatalogo() {
        return codigoCatalogo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return total;
    }



}
