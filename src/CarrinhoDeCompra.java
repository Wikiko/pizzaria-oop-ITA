import java.util.HashSet;
import java.util.Set;

public class CarrinhoDeCompra {
	
	private final Set<Pizza> pedidos;
	
	public CarrinhoDeCompra() {
		pedidos = new HashSet<Pizza>();
	}
	
	public void adicionarPedido(Pizza pizza) {
		if(pizza.temIngredientes()) {
			pedidos.add(pizza);			
		}
	}
	
	public int getQtdePedidos() {
		return pedidos.size();
	}
	
	public double getTotal() {
		return pedidos.stream().mapToDouble(pizza -> pizza.getPreco()).sum();
	}
	
}
