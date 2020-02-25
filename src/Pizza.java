import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Pizza {
	public static Map<String, Integer> totaisIngredientes = new HashMap<String, Integer>();
	
	private final List<String> ingredientes;
	
	public Pizza() {
		ingredientes = new ArrayList<String>();
	}
	
	private static void contabilizarIngrediente(String ingrediente) {
		int quantidadeAtual = totaisIngredientes.getOrDefault(ingrediente, 0);
		totaisIngredientes.put(ingrediente, quantidadeAtual + 1);
	}
	
	public void adicionarIngrediente(String ingrediente){
		ingredientes.add(ingrediente);
		contabilizarIngrediente(ingrediente);
	}
	
	public double getPreco() {
		int qtdeIngredientes = ingredientes.size();
		if(qtdeIngredientes <= 2) {
			return 15;
		}
		if(qtdeIngredientes >=3 && qtdeIngredientes<=5) {
			return 20;
		}
		return 23;
	}

	public boolean temIngredientes() {
		return !ingredientes.isEmpty();
	}
	
}
