import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);   
		
		Membro membro1 = new Membro();

		System.out.println("Digite uma nome : ");
		String nome = ler.nextLine();   
		membro1.setNome(nome);
		
		System.out.println("Digite uma idade : ");
		Scanner ler1 = new Scanner(System.in);
		int idade = ler1.nextInt();
		membro1.setIdade(idade);
		
		System.out.println("Digite um tempo : ");
		Scanner ler2 = new Scanner(System.in);
		int tempo = ler2.nextInt();
		membro1.setTempo(tempo);
		
		System.out.println("Digite uma equipe : ");
		Scanner ler3 = new Scanner(System.in);
		String equipe = ler3.nextLine();   
		membro1.setEquipe(equipe);
		
	
		System.out.println("\n");
		System.out.println("Nome:" + membro1.getNome());
		System.out.println("Idade:" + membro1.getIdade());
		System.out.println("Tempo em ano:" + membro1.getTempo());
		System.out.println("Equipe:" + membro1.getEquipe());
		
		ler.close();
		ler1.close();
		ler2.close();
		ler3.close();
		
		
	    }
	}