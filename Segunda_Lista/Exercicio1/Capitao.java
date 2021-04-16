public class Capitao extends Membro {
	
	
	public void capitao() {
		if(getEquipe()=="SEK") {
			System.out.println(getNome() + " capitão Sek");
		}else {
			System.out.println(getNome() + " capitão Humanoide");
		}
	}
	
	public void proxCapitao() {
		if(getEquipe()=="SEK") {
			System.out.println(getNome() + " proximo capitão Sek");
		}else {
			System.out.println(getNome() + " proximo capitão Humanoide");
		}
	}
	
	
	
}
