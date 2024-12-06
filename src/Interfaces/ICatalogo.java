package Interfaces;

import Classes.Catalogo;
import java.util.ArrayList;

public interface ICatalogo {

    public void incluir(Catalogo catalogo);

    public void editar(int id, Catalogo catalogoAlterado);

    public ArrayList<Catalogo> listar();

    public void excluir(int id);

}
