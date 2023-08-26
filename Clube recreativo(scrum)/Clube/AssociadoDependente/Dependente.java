package Clube.AssociadoDependente;

import Clube.setorCadastro.CadastroGeral;

public class Dependente extends CadastroGeral {

    private Integer idade;
    private String parentesco;
    private String atividadeEsportiva;
    
    public Dependente(String nome, String endereco, String telefone, String email, Integer idade, String parentesco, String atividadeEsportiva){
        super(nome, endereco, telefone, email);
        this.idade = idade;
        this.parentesco = parentesco;
        this.atividadeEsportiva = atividadeEsportiva;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getParentesco(){
        return parentesco;
    }

    public String getAtividadesEsportivas(){
        return atividadeEsportiva;
    }

    public String getAtividadeEsportiva() {
        return null;
    }


}
