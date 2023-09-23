package Clube.UsoFuncionario;


import java.util.Scanner;

public class AtualizarFuncionario {
    
    public static void atualizarFuncionario(GerenciarFuncionarios gerenciador, Scanner scanner) {
        System.out.println("Digite o nome do funcionário que deseja atualizar:");
        String nomeFuncionario = scanner.nextLine();

        Funcionario funcionario = gerenciador.buscarFuncionario(nomeFuncionario);

        if (funcionario != null) {
            System.out.println("Escolha o que deseja atualizar:");
            System.out.println("1. Nome");
            System.out.println("2. Endereço");
            System.out.println("3. Telefone");
            System.out.println("4. E-mail");
            System.out.println("5. Cargo");
            System.out.println("6. Salário");
            System.out.println("7. Voltar");

            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    funcionario.setNome(novoNome);
                    break;
                case 2:
                    System.out.print("Novo endereço: ");
                    String novoEndereco = scanner.nextLine();
                    funcionario.setEndereco(novoEndereco);
                    break;
                case 3:
                    System.out.print("Novo telefone: ");
                    String novoTelefone = scanner.nextLine();
                    funcionario.setTelefone(novoTelefone);
                    break;
                case 4:
                    System.out.print("Novo e-mail: ");
                    String novoEmail = scanner.nextLine();
                    funcionario.setEmail(novoEmail);
                    break;
                case 5:
                    System.out.print("Novo cargo: ");
                    String novoCargo = scanner.nextLine();
                    funcionario.setCargo(novoCargo);
                    break;
                case 6:
                    System.out.print("Novo salário: ");
                    double novoSalario = Double.parseDouble(scanner.nextLine());
                    funcionario.setSalario(novoSalario);
                    break;
                case 7:
                    return; // Voltar ao menu anterior
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Funcionário atualizado com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}

