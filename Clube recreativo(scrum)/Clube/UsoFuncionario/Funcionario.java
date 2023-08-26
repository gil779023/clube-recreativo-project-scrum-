package Clube.UsoFuncionario;

import Clube.setorCadastro.CadastroGeral;

class Funcionario extends CadastroGeral {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String endereco, String telefone, String email, String cargo, double salario) {
        super(nome,  endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirCadastro(){
        super.exibirCadastro();
        System.out.println("Cargo: " + cargo );
        System.out.println("Salario: " + salario );
    }
}




