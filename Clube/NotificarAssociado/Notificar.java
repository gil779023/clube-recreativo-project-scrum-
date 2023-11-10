package Clube.NotificarAssociado;

import java.util.ArrayList;
import java.util.List;

// Interface para representar objetos notificáveis
interface Notificavel {
    void receberNotificacao(String mensagem);
}

// Classe que representa uma notificação
class Notificacao {
    private String mensagem;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}

// Classe que representa um associado
class Associado implements Notificavel {
    private String nome;
    private List<Notificacao> notificacoes;

    public Associado(String nome) {
        this.nome = nome;
        this.notificacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    // Método para receber notificações
    @Override
    public void receberNotificacao(String mensagem) {
        Notificacao notificacao = new Notificacao(mensagem);
        notificacoes.add(notificacao);
        System.out.println("Notificação recebida por " + nome + ": " + mensagem);
    }
}

// Sistema de comunicação do clube
class SistemaComunicacaoClube {
    // Método para enviar notificações para associados
    public static void enviarNotificacao(Notificavel notificavel, String mensagem) {
        notificavel.receberNotificacao(mensagem);
    }
}

public class Notificar {
    public static void main(String[] args) {
        Associado associado = new Associado("João");

        // Simulando uma notificação sobre um evento especial
        SistemaComunicacaoClube.enviarNotificacao(associado, "Participe do evento especial no próximo sábado!");

        // Simulando uma notificação sobre uma nova atividade esportiva
        SistemaComunicacaoClube.enviarNotificacao(associado, "Nova atividade esportiva disponível: Yoga às quartas-feiras!");

        // Mostrar notificações recebidas pelo associado
        System.out.println("Notificações recebidas por " + associado.getNome() + ":");
        for (Notificacao notificacao : associado.getNotificacoes()) {
            System.out.println(notificacao.getMensagem());
        }
    }
}
