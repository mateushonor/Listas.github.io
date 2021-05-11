
public class Membro1 extends Thread{
	private Trabalho trabalho;
	
	public Membro1(Trabalho c) {
		trabalho = c;
	}
	
	public void run() {
		
		try {
			trabalho.put();
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

