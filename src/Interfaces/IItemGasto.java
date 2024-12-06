package Interfaces;

import java.util.ArrayList;

import Classes.ItemGasto;

public interface IItemGasto {

     public void incluir(ItemGasto item);

    public void editar(int id, ItemGasto itemAlterado);

    public ArrayList<ItemGasto> listar();

    public void excluir(int id);

}
