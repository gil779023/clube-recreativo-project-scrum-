package Clube.AcessoGerente;


import java.util.ArrayList;
import java.util.List;


class ExperienciaProfissional {
    private String empresa;
    private String cargo;
    private String periodo;

    public ExperienciaProfissional(String empresa, String cargo, String periodo) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Empresa: " + empresa + ", Cargo: " + cargo + ", Período: " + periodo;
    }
}

class Treinamento {
    private String nome;
    private String data;

    public Treinamento(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Treinamento: " + nome + ", Data: " + data;
    }
}

class Feedback {
    private String autor;
    private String comentario;
    private String data;

    public Feedback(String autor, String comentario, String data) {
        this.autor = autor;
        this.comentario = comentario;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Autor: " + autor + ", Comentário: " + comentario + ", Data: " + data;
    }
}

class Funcionario {
    private String nome;
    private String cargo;
    private List<ExperienciaProfissional> historicoProfissional = new ArrayList<>();
    private List<Treinamento> treinamentos = new ArrayList<>();
    private List<Feedback> feedbacks = new ArrayList();

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void adicionarExperienciaProfissional(String empresa, String cargo, String periodo) {
        historicoProfissional.add(new ExperienciaProfissional(empresa, cargo, periodo));
    }

    public void adicionarTreinamento(String nome, String data) {
        treinamentos.add(new Treinamento(nome, data));
    }

    public void adicionarFeedback(String autor, String comentario, String data) {
        feedbacks.add(new Feedback(autor, comentario, data));
    }

    public String obterResumo() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("Nome: ").append(nome).append("\n");
        resumo.append("Cargo: ").append(cargo).append("\n");

        if (!historicoProfissional.isEmpty()) {
            resumo.append("Histórico Profissional:\n");
            for (ExperienciaProfissional experiencia : historicoProfissional) {
                resumo.append(experiencia.toString()).append("\n");
            }
        }

        if (!treinamentos.isEmpty()) {
            resumo.append("Treinamentos Concluídos:\n");
            for (Treinamento treinamento : treinamentos) {
                resumo.append(treinamento.toString()).append("\n");
            }
        }

        if (!feedbacks.isEmpty()) {
            resumo.append("Feedbacks Recebidos:\n");
            for (Feedback feedback : feedbacks) {
                resumo.append(feedback.toString()).append("\n");
            }
        }

        return resumo.toString();
    }
}

public class ListarDadosFuncionario  {
    public static void listarDadosFuncionario(String[] args) {
        Funcionario funcionario = new Funcionario("João", "Desenvolvedor");
        funcionario.adicionarExperienciaProfissional("Empresa A", "Analista de Sistemas", "2015-2017");
        funcionario.adicionarTreinamento("Java Certification", "2021");
        funcionario.adicionarFeedback("Maria", "Excelente trabalho!", "2022-01-15");

        // Visualizar o resumo das informações do funcionário
        System.out.println(funcionario.obterResumo());
    }

    
}

