package Clube.UsoAssociado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AtividadeEsportiva {
    String nome;
    private String descricao;
    private String instrutor;
    private String horario;
    private String nivelHabilidade;

    public AtividadeEsportiva(String nome, String descricao, String instrutor, String horario, String nivelHabilidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.instrutor = instrutor;
        this.horario = horario;
        this.nivelHabilidade = nivelHabilidade;
    }

    @Override
    public String toString() {
        return "Atividade: " + nome + "\nDescrição: " + descricao + "\nInstrutor: " + instrutor
                + "\nHorário: " + horario + "\nNível de Habilidade: " + nivelHabilidade + "\n";
    }
}

public class MostrarCategorias {
    public static void main(String[] args) {
        List<AtividadeEsportiva> atividades = new ArrayList<>();

        // Cadastre algumas atividades esportivas
        atividades.add(new AtividadeEsportiva("Yoga", "Prática de Yoga para iniciantes", "Instrutor A", "Segunda e Quarta, 10:00 - 11:00", "Iniciante"));
        atividades.add(new AtividadeEsportiva("Pilates", "Treino de Pilates avançado", "Instrutor B", "Terça e Quinta, 15:00 - 16:00", "Avançado"));
        atividades.add(new AtividadeEsportiva("Natação", "Aulas de Natação para todas as idades", "Instrutor C", "Sexta, 08:00 - 09:00", "Todos os níveis"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Atividades Esportivas Oferecidas Pelo Clube:");
        for (AtividadeEsportiva atividade : atividades) {
            System.out.println(atividade);
        }

        // Associado pode visualizar as atividades
        System.out.print("Para mais detalhes sobre uma atividade, digite o nome da atividade (ou 'sair' para sair): ");
        String escolha = scanner.nextLine();

        while (!escolha.equalsIgnoreCase("sair")) {
            boolean encontrou = false;
            for (AtividadeEsportiva atividade : atividades) {
                if (atividade.nome.equalsIgnoreCase(escolha)) {
                    System.out.println("Detalhes da Atividade Selecionada:\n" + atividade);
                    encontrou = true;
                    break;
                }
            }

            if (!encontrou) {
                System.out.println("Atividade não encontrada.");
            }

            System.out.print("Para mais detalhes sobre uma atividade, digite o nome da atividade (ou 'sair' para sair): ");
            escolha = scanner.nextLine();
        }

        scanner.close();
    }
}
