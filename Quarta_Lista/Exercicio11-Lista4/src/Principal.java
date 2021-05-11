
public class Principal {
	
	public static void main(String[] args) {
		Caixa c = new Caixa();
		Produtor p1 = new Produtor(c, 1);
		Consumidor c1 = new Consumidor(c, 1);
		
		p1.start();
		c1.start();
	}
}
