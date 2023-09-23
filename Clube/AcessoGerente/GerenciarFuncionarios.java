package Clube.AcessoGerente;

import java.util.ArrayList;
import java.util.List;

import Clube.Classes.Funcionario;


public class GerenciarFuncionarios {
    private List<Funcionario> funcionarios;

    public GerenciarFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios() {
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirCadastro();
            System.out.println("--------------------");
        }
    }

    public Funcionario buscarFuncionario(String nomeFuncionario) {
        return null;
    }
}



