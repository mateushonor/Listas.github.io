
public class Principal1 {
	
	public static void main(String[] main) {
		Trabalho c = new Trabalho();
		Membro1 a1 = new Membro1(c);
		Membro2 a2 = new Membro2(c);
		
		a1.start();
		a2.start();
	}

}
