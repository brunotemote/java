package br.com.delivery;

class Entregador extends Pessoa {
    private String veiculo;

    public Entregador(String nome, String telefone, String veiculo) {
        super(nome, telefone);
        this.veiculo = veiculo;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Entregador: " + getNome() + ", Telefone: " + getTelefone() + ", Veículo: " + getVeiculo());
    }
} 
  
 