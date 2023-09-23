package Clube.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NovoAssociado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Associado> associados = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Associado");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            switch (opcao) {
                case 1:
                    cadastrarAssociado(scanner, associados);
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        System.out.println("Encerrando o programa.");
        scanner.close();
    }

    public static void cadastrarAssociado(Scanner scanner, List<Associado> associados) {
        System.out.println("Cadastro de Associado");
        System.out.print("Nome: ");
        String nomeAssociado = scanner.nextLine();

        System.out.print("Endereço: ");
        String enderecoAssociado = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefoneAssociado = scanner.nextLine();

        System.out.print("E-mail: ");
        String emailAssociado = scanner.nextLine();

        System.out.print("Método de Pagamento: ");
        String metodoPagamento = scanner.nextLine();

        System.out.print("Valor do Pagamento: ");
        double valorPagamento = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        Pagamento pagamento;
        if (metodoPagamento.equalsIgnoreCase("cartao")) {
            pagamento = new PagamentoCartaoCredito("Cartão de Crédito", "1234-5678-9012-3456", valorPagamento);
        } else if (metodoPagamento.equalsIgnoreCase("debito")) {
            pagamento = new PagamentoDebito("Débito", "9876-5432-1098-7654", valorPagamento);
        } else if (metodoPagamento.equalsIgnoreCase("dinheiro")) {
            pagamento = new PagamentoDinheiro("Dinheiro", "N/A", valorPagamento);
        } else {
            System.out.println("Método de pagamento inválido.");
            return;
        }

        Associado associado = new Associado(nomeAssociado, enderecoAssociado, telefoneAssociado, emailAssociado, null, pagamento);

        System.out.print("Deseja cadastrar um dependente? (S/N): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            
            System.out.println("Cadastro de Dependente");
            System.out.print("Nome do Dependente: ");
            String nomeDependente = scanner.nextLine();

            System.out.print("Endereço do Dependente: ");
            String enderecoDependente = scanner.nextLine();

            System.out.print("Telefone do Dependente: ");
            String telefoneDependente = scanner.nextLine();

            System.out.print("E-mail do Dependente: ");
            String emailDependente = scanner.nextLine();

            System.out.print("Idade do Dependente: ");
            Integer idadeDependente = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            System.out.print("Parentesco com o Associado: ");
            String parentescoDependente = scanner.nextLine();

            Dependente dependente1 = new Dependente(nomeDependente, enderecoDependente, telefoneDependente,
             emailDependente, idadeDependente, parentescoDependente, parentescoDependente);

            associado.adicionarDependente(dependente1);
        }

        associados.add(associado);
        System.out.println("Associado cadastrado com sucesso!");
    }
}




