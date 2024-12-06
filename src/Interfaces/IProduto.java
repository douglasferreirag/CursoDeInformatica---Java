package Interfaces;

import java.util.ArrayList;

import Classes.Produto;


public interface IProduto {

    public void incluir(Produto produto);

    public void editar(int id, Produto produtoAlterado);

    public ArrayList<Produto> listar();

    public void excluir(int id);

}
