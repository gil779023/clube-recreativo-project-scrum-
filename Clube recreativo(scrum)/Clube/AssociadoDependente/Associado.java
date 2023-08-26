package Clube.AssociadoDependente;

import Clube.setorCadastro.CadastroGeral;
import java.util.ArrayList;
import java.util.List;

public class Associado extends CadastroGeral {
    private List<Dependente> dependentesList;
    private Integer idAssociado;
    private Pagamento pagamento;

    public Associado(String nome, String endereco, String telefone, String email, Integer idAssociado, Pagamento pagamento) {
        super(nome, endereco, telefone, email);
        this.dependentesList = new ArrayList<>();
        this.idAssociado = idAssociado;
        this.pagamento = pagamento;
    }

    public void adicionarDependente(Dependente dependente) {
        dependentesList.add(dependente);
    }

    public List<Dependente> getDependentes() {
        return dependentesList;
    }

    public Integer getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(Integer idAssociado) {
        this.idAssociado = idAssociado;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void atualizarContato(String novoEndereco, String novoTelefone, String novoEmail) {
        // Implementação para atualizar o contato
    }

    @Override
    public void exibirCadastro() {
        super.exibirCadastro();
        System.out.println("Matrícula: " + idAssociado);
        System.out.println("Método de Pagamento: " + pagamento.getMetodo());
        System.out.println("Número do Pagamento: " + pagamento.getNumero());
        System.out.println("Dependentes:");
        for (Dependente dependente : dependentesList) {
            System.out.println("Nome: " + dependente.getNome());
            System.out.println("Idade: " + dependente.getIdade());
            System.out.println("Parentesco: " + dependente.getParentesco());
        }
    }

    public String getContato() {
        return super.getContato(); // Implementação real depende da classe CadastroGeral
    }

    public boolean isStatusPagamento() {
        // Implementação para verificar o status de pagamento
        return false;
    }
}
