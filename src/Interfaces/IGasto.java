package Interfaces;


import Classes.Gasto;
import java.util.ArrayList;

public interface IGasto {

    public void incluir(Gasto gasto);

    public void editar(int id, Gasto gastoAlterado);

    public ArrayList<Gasto> listar();

    public void excluir(int id);

}
