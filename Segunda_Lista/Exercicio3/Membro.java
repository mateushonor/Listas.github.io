public class Membro {
	private String nome;
	private int idade;
	private int tempo;
	private String equipe;
	
	public void setNome(String _nome) {
		nome = _nome;
	}
	public void setIdade(int _idade) {
		idade = _idade;
	}
	public void setTempo(int _tempo) {
		tempo = _tempo;
	}
	public void setEquipe(String _equipe) {
		equipe = _equipe;
	}
	
	public String getNome() {
		return(nome);
	}
	public int getIdade() {
		return(idade);
	}
	public int getTempo() {
		return(tempo);
	}
	public String getEquipe() {
		return(equipe);
	}
}