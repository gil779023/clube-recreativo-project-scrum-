package Clube.UsoFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Atividade {
    private String nome;
    private String descricao;
    private String faixaEtaria;
    private String niveisHabilidade;
    private List<Turma> turmas = new ArrayList<>();

    public Atividade(String nome, String descricao, String faixaEtaria, String niveisHabilidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtaria = faixaEtaria;
        this.niveisHabilidade = niveisHabilidade;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    @Override
    public String toString() {
        StringBuilder atividadeInfo = new StringBuilder();
        atividadeInfo.append("Nome da Atividade: ").append(nome).append("\n");
        atividadeInfo.append("Descrição: ").append(descricao).append("\n");
        atividadeInfo.append("Faixa Etária: ").append(faixaEtaria).append("\n");
        atividadeInfo.append("Níveis de Habilidade: ").append(niveisHabilidade).append("\n");

        atividadeInfo.append("Turmas Disponíveis:\n");
        for (Turma turma : turmas) {
            atividadeInfo.append(turma.toString()).append("\n");
        }

        return atividadeInfo.toString();
    }
}

class Turma {
    private String horarioInicio;
    private String horarioTermino;
    private String diasDaSemana;

    public Turma(String horarioInicio, String horarioTermino, String diasDaSemana) {
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.diasDaSemana = diasDaSemana;
    }

    @Override
    public String toString() {
        return "Horário: " + horarioInicio + " - " + horarioTermino + " (" + diasDaSemana + ")";
    }
}

public class CadastroDeAtividades {
    public static void cadastrarAtividades(Scanner scanner2) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastramento de Nova Atividade");

        System.out.print("Nome da Atividade: ");
        String nomeAtividade = scanner.nextLine();

        System.out.print("Descrição da Atividade: ");
        String descricaoAtividade = scanner.nextLine();

        System.out.print("Faixa Etária Indicada: ");
        String faixaEtaria = scanner.nextLine();

        System.out.print("Níveis de Habilidade: ");
        String niveisHabilidade = scanner.nextLine();

        Atividade atividade = new Atividade(nomeAtividade, descricaoAtividade, faixaEtaria, niveisHabilidade);

        System.out.println("Adicionar Turmas à Atividade (Digite 'fim' para terminar):");

        while (true) {
            System.out.print("Horário de Início: ");
            String horarioInicio = scanner.nextLine();

            if (horarioInicio.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Horário de Término: ");
            String horarioTermino = scanner.nextLine();

            System.out.print("Dias da Semana (ex: Segunda e Terça): ");
            String diasDaSemana = scanner.nextLine();

            Turma turma = new Turma(horarioInicio, horarioTermino, diasDaSemana);
            atividade.adicionarTurma(turma);
        }

        // Exibir informações da atividade cadastrada
        System.out.println("\nDetalhes da Atividade Cadastrada:");
        System.out.println(atividade);
        
        scanner.close();
    }

    public static void adicionarTurma(Scanner scanner) {
    }
}

