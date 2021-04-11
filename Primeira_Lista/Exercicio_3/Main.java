public class main {
	
	public static void main(String[] args) {
		Membro membro1 = new Membro();
		
		membro1.setNome("Joao");
		membro1.setIdade(19); 
		membro1.setTempo(2);
		membro1.setEquipe("SEK");
		
		System.out.println("Nome:" + membro1.getNome());
		System.out.println("Idade:" + membro1.getIdade());
		System.out.println("Tempo em ano:" + membro1.getTempo());
		System.out.println("Equipe:" + membro1.getEquipe());
		
		membro1.Atualiza("Leandro",25,3,"SEK");
		
		System.out.println("\n");
		System.out.println("Atualiza");
		System.out.println("Nome:" + membro1.getNome());
		System.out.println("Idade:" + membro1.getIdade());
		System.out.println("Tempo em ano:" + membro1.getTempo());
		System.out.println("Equipe:" + membro1.getEquipe());
		
		
		Membro membro2 = new Membro();
		
		membro2.setNome("Mara");
		membro2.setIdade(34); 
		membro2.setTempo(4);
		membro2.setEquipe("Humanoide");
		
		System.out.println("\n");
		System.out.println("Nome:" + membro2.getNome());
		System.out.println("Idade:" + membro2.getIdade());
		System.out.println("Tempo em ano:" + membro2.getTempo());
		System.out.println("Equipe:" + membro2.getEquipe());
		
		
		System.out.println("\n");
		System.out.println("Quantidade de Pessoas na equipe Sek:" + membro2.getSek());
		System.out.println("Quantidade de Pessoas na equipe Humanoide:" + membro2.getHuman());
		
	} 
}