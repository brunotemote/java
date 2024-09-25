package br.com.delivery;
class RestauranteConcreto extends Restaurante {
    private String[] menu;

    public RestauranteConcreto(String nome, String endereco, String[] menu) {
        super(nome, endereco);
        this.menu = menu;
    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menu do " + getNome() + ":");
        for (String item : menu) {
            System.out.println(item);
        }
    }
}
