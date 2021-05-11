
public class Consumidor extends Thread{
	private Caixa caixa;
	private int numero;
	
	public Consumidor(Caixa c, int numero) {
		caixa = c;
		this.numero = numero;
	}
	
	public void run() {
		int valor = 0;
		for(int i=0;i<20;i++) {
			valor = caixa.get(numero);
		}
	}
	
}
