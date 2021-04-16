public class main {
	
	public static void main(String[] args) {
	
	Capitao membro3 = new Capitao();
		membro3.setNome("Lucas");
		membro3.setIdade(23); 
		membro3.setTempo(3);
		membro3.setEquipe("Humanoide");
		
		System.out.println("\n");
		membro3.capitao();
		System.out.println("Idade:" + membro3.getIdade());
		System.out.println("Tempo em ano:" + membro3.getTempo());
		System.out.println("Equipe:" + membro3.getEquipe());
		
		Capitao membro4 = new Capitao();
		membro4.setNome("Marcos");
		membro4.setIdade(21); 
		membro4.setTempo(2);
		membro4.setEquipe("SEK");
		
		System.out.println("\n");
		membro4.capitao();
		System.out.println("Idade:" + membro4.getIdade());
		System.out.println("Tempo em ano:" + membro4.getTempo());
		System.out.println("Equipe:" + membro4.getEquipe());
		
		Capitao membro5 = new Capitao();
		membro5.setNome("Felipe");
		membro5.setIdade(18); 
		membro5.setTempo(1);
		membro5.setEquipe("SEK");
		
		System.out.println("\n");
		membro5.proxCapitao();
		System.out.println("Idade:" + membro5.getIdade());
		System.out.println("Tempo em ano:" + membro5.getTempo());
		System.out.println("Equipe:" + membro5.getEquipe());
		
		Capitao membro6 = new Capitao();
		membro6.setNome("Marcio");
		membro6.setIdade(20); 
		membro6.setTempo(2);
		membro6.setEquipe("Humanoide");
		
		System.out.println("\n");
		membro6.proxCapitao();
		System.out.println("Idade:" + membro6.getIdade());
		System.out.println("Tempo em ano:" + membro6.getTempo());
		System.out.println("Equipe:" + membro6.getEquipe());
	} 
}
