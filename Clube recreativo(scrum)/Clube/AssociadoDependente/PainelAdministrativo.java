package Clube.AssociadoDependente;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PainelAdministrativo {
    private static List<Associado> associados = new ArrayList<>();
    private static List<Dependente> dependentes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        while (true) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Listar Associados");
            System.out.println("2. Visualizar Associado e Dependentes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (escolha) {
                case 1:
                    listarAssociados();
                    break;
                case 2:
                    visualizarAssociado();
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void listarAssociados() {
        System.out.println("\nLISTA DE ASSOCIADOS:");
        for (int i = 0; i < associados.size(); i++) {
            System.out.println((i + 1) + ". " + associados.get(i).getNome());
        }
    }

    private static void visualizarAssociado() {
        listarAssociados();
        System.out.print("Escolha o número do associado: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        if (escolha >= 1 && escolha <= associados.size()) {
            Associado associado = associados.get(escolha - 1);
            System.out.println("\nDETALHES DO ASSOCIADO: " + associado.getNome());
            System.out.println("Contato: " + associado.getContato());
            System.out.println("Status de Pagamento: " + (associado.isStatusPagamento() ? "Em dia" : "Atrasado"));

            System.out.println("\nDEPENDENTES:");
            for (Dependente dependente : dependentes) {
                System.out.println("- Nome: " + dependente.getNome());
                System.out.println("  Atividade Esportiva: " + dependente.getAtividadeEsportiva());
            }
        } else {
            System.out.println("Associação inválida.");
        }
    }
}