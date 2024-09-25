package br.com.delivery;

class Cliente extends Pessoa {
    private String endereco;

    public Cliente(String nome, String telefone, String endereco) {
        super(nome, telefone);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cliente: " + getNome() + ", Telefone: " + getTelefone() + ", Endereço: " + getEndereco());
    }
}
