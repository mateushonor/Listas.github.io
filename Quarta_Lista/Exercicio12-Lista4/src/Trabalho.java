
public class Trabalho {
	int temp = 1000;
	
	public synchronized void put() throws InterruptedException{
		System.out.println("Membro est� tenstando");
		System.out.println("Espere o tempo");
		Thread.sleep(temp);
	}

}
