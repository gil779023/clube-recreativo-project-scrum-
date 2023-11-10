package Clube.ConsumoAssociado.Clube.ConsumoAssociado.java;

import java.util.ArrayList;
import java.util.List;

// Interface para representar os consumíveis
interface Consumivel {
    String getNome();
}

// Interface para representar os associáveis
interface Associavel {
    void registrarConsumo(Consumivel consumivel);
}

// Classe que representa um associado
class Associado implements Associavel {
    private String nome;
    private List<Consumivel> itensConsumidos;

    public Associado(String nome) {
        this.nome = nome;
        this.itensConsumidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Consumivel> getItensConsumidos() {
        return itensConsumidos;
    }

    @Override
    public void registrarConsumo(Consumivel consumivel) {
        itensConsumidos.add(consumivel);
        System.out.println("Consumo registrado para o associado " + nome + ": " + consumivel.getNome());
    }
}

// Classe que representa um item consumível
class Item implements Consumivel {
    private String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
}

// Interface para representar os funcionários da lanchonete
interface FuncionarioLanchonete {
    void registrarConsumoAssociado(Associavel associavel, Consumivel consumivel);
}

// Classe que representa um funcionário da lanchonete
class Funcionario implements FuncionarioLanchonete {
    @Override
    public void registrarConsumoAssociado(Associavel associavel, Consumivel consumivel) {
        associavel.registrarConsumo(consumivel);
    }
}

public class ConsumoLanchonete {
    public static void main(String[] args) {
        Associado associado = new Associado("João");
        FuncionarioLanchonete funcionario = new Funcionario();

        Item sanduiche = new Item("Sanduíche");
        Item suco = new Item("Suco");

        // O associado consome itens
        funcionario.registrarConsumoAssociado(associado, sanduiche);
        funcionario.registrarConsumoAssociado(associado, suco);

        // Mostrar itens consumidos pelo associado
        System.out.println("Itens consumidos pelo associado " + associado.getNome() + ":");
        for (Consumivel item : associado.getItensConsumidos()) {
            System.out.println(item.getNome());
        }
    }
}

