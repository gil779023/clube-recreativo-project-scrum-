package Clube.UsoFuncionario;
import java.util.ArrayList;
import java.util.List;

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
}



