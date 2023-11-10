package Clube.UsoAssociado;

import java.util.ArrayList;
import java.util.List;

interface Visualizavel {
    void visualizar();
}

class Atividade implements Visualizavel {
    private String nome;
    private int numeroFaltas;

    public Atividade(String nome) {
        this.nome = nome;
        this.numeroFaltas = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void registrarFalta() {
        numeroFaltas++;
    }

    @Override
    public void visualizar() {
        System.out.println(nome + ": " + numeroFaltas + " faltas");
    }
}

class Associado implements Visualizavel {
    private String nome;
    private List<Visualizavel> associaveis;

    public Associado(String nome) {
        this.nome = nome;
        this.associaveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Visualizavel> getAssociaveis() {
        return associaveis;
    }

    public void adicionarAssociavel(Visualizavel associavel) {
        associaveis.add(associavel);
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando para o associado " + nome + ":");
        for (Visualizavel associavel : associaveis) {
            associavel.visualizar();
        }
    }
}

public class VisualizarFaltas {
    public static void main(String[] args) {
        Associado associado = new Associado("João");

        Atividade atividade1 = new Atividade("Atividade 1");
        Atividade atividade2 = new Atividade("Atividade 2");

        associado.adicionarAssociavel(atividade1);
        associado.adicionarAssociavel(atividade2);

        // Simulando faltas
        atividade1.registrarFalta();
        atividade1.registrarFalta();
        atividade2.registrarFalta();

        // Visualizar faltas
        associado.visualizar();
    }
}

