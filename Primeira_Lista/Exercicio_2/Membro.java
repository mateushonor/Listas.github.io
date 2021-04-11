public class Membro {
	private String nome;
	private int idade;
	private int tempo;
	private String equipe;
	protected static int contSek=0;
	protected static int contHuman=0;
	
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
		if(_equipe=="SEK") {
			contSek++;
		}if(_equipe=="Humanoide"){
			contHuman++;
		}
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
	
	public void atualiza_Nome(String _nome) {
		this.nome =_nome;
	}
	public void atualiza_Idade(int _idade) {
		this.idade =_idade;
	}
	public void atualiza_Tempo(int _tempo) {
		this.tempo =_tempo;
	}
	public void atualiza_Equipe(String _equipe) {
		this.equipe =_equipe;
	}
	
	public int getSek() {
		return(contSek);
	}
	public int getHuman() {
		return(contHuman);
	}
	
}