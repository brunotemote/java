package br.com.delivery;

public class SistemaDelivery {
    public static void main(String[] args) {
        
        String[] menu = {"Pizza", "Hambúrguer", "Salada"};
        RestauranteConcreto restaurante = new RestauranteConcreto("FastFood", "Rua Principal, 123", menu);

        restaurante.mostrarMenu();

        Cliente cliente = new Cliente("João", "9999-9999", "Avenida Central, 45");

       
        Entregador entregador = new Entregador("Carlos", "8888-8888", "Moto");

    
        Prato prato = new Prato("Pizza", 30.0);

        Pedido pedido = new Pedido(cliente, entregador, prato);

        pedido.exibirDetalhes();

    
        pedido.entregarPedido();

        pedido.exibirDetalhes();
    }
}
 