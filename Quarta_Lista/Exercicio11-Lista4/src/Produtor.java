
public class Produtor extends Thread{
	private Caixa caixa;
	private int numero;
	
	public Produtor(Caixa c, int numero){
		caixa = c;
		this.numero = numero;
	}
	
	public void run() {
		int time = 10000;
		for(int i=0;i<20;i++) {
			caixa.put(numero, i);
			
			if(i==10) {
				System.out.println("Espere o tempo");
				try {
					sleep(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
