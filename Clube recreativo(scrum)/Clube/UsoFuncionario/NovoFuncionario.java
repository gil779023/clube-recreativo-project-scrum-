package Clube.UsoFuncionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NovoFuncionario {
    private List<Funcionario> funcionarios;

    public NovoFuncionario() {
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

    public static void main(String[] args) {
        GerenciarFuncionarios gerenciador = new GerenciarFuncionarios();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar novo funcionário");
            System.out.println("2. Mostrar lista de funcionários");
            System.out.println("3. Sair");
            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    Funcionario novoFuncionario = criarNovoFuncionario(scanner);
                    gerenciador.adicionarFuncionario(novoFuncionario);
                    break;
                case 2:
                    gerenciador.mostrarFuncionarios();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static Funcionario criarNovoFuncionario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = Double.parseDouble(scanner.nextLine());

        return new Funcionario(nome, endereco, telefone, email, cargo, salario);
    }

    public static void executarMenu(Scanner scanner) {
    }
}
