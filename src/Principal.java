
public class Principal {

	public static void main(String[] args) {
		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		pizza1.adicionarIngrediente("presunto");
		pizza1.adicionarIngrediente("mussarela");
		
		carrinhoDeCompra.adicionarPedido(pizza1);
		
		pizza2.adicionarIngrediente("presunto");
		pizza2.adicionarIngrediente("mussarela");
		pizza2.adicionarIngrediente("tomate");
		
		carrinhoDeCompra.adicionarPedido(pizza2);
		
		pizza3.adicionarIngrediente("presunto");
		pizza3.adicionarIngrediente("mussarela");
		pizza3.adicionarIngrediente("tomate");
		pizza3.adicionarIngrediente("batata palha");
		pizza3.adicionarIngrediente("lombo");
		pizza3.adicionarIngrediente("catupiry");
		pizza3.adicionarIngrediente("milho");
		pizza3.adicionarIngrediente("ervilha");
		
		carrinhoDeCompra.adicionarPedido(pizza3);

		System.out.println("Valor Pizza1: " + pizza1.getPreco());
		System.out.println("Valor Pizza2: " + pizza2.getPreco());
		System.out.println("Valor Pizza3: " + pizza3.getPreco());
		
		System.out.println("Quantidade de pedidos: " + carrinhoDeCompra.getQtdePedidos());
		System.out.println("Preço total: " + carrinhoDeCompra.getTotal());
	}

}
