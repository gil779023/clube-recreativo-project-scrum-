package Clube.Classes;

public abstract class Pagamento {
    private String metodo;
    private String numero;

    public Pagamento(String metodo, String numero) {
        this.metodo = metodo;
        this.numero = numero;
    }

    public String getMetodo() {
        return metodo;
    }

    public String getNumero() {
        return numero;
    }

    // Método abstrato para obter o valor do pagamento
    public abstract double getValor();
}

class PagamentoCartaoCredito extends Pagamento {
    private double valor;

    public PagamentoCartaoCredito(String metodo, String numero, double valor) {
        super(metodo, numero);
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }
}

class PagamentoDebito extends Pagamento {
    private double valor;

    public PagamentoDebito(String metodo, String numero, double valor) {
        super(metodo, numero);
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }
}

class PagamentoDinheiro extends Pagamento {
    private double valor;

    public PagamentoDinheiro(String metodo, String numero, double valor) {
        super(metodo, numero);
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }
}


