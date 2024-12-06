package Interfaces;

import java.util.ArrayList;

import Classes.Servico;

public interface IServico {

    public void incluir(Servico servico);

    public void editar(int id, Servico servicoAlterado);

    public ArrayList<Servico> listar();

    public void excluir(int id);

}
