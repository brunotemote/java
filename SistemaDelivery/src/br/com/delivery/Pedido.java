package br.com.delivery;

class Pedido {
    private Cliente cliente;
    private Entregador entregador;
    private Prato prato;
    private boolean entregue;

    public Pedido(Cliente cliente, Entregador entregador, Prato prato) {
        this.cliente = cliente;
        this.entregador = entregador;
        this.prato = prato;
        this.entregue = false;
    }

    public void entregarPedido() {
        this.entregue = true;
        System.out.println("Pedido entregue ao cliente " + cliente.getNome() + " pelo entregador " + entregador.getNome());
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Pedido:");
        cliente.exibirDados();
        entregador.exibirDados();
        prato.exibirPrato();
        System.out.println("Status: " + (entregue ? "Entregue" : "Pendente"));
    }
}
