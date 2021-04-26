import java.util.*;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Membro a1 = new Membro();
		Membro a2 = new Membro();
		Membro a3 = new Membro();
		
		ArrayList<Membro> myList = new ArrayList<>();
		
		myList.add(a1);
		myList.add(a2);
		myList.add(a3);
		
		Membro a4 = new Membro();
		
		a4.setNome("Marcos");
		a4.setIdade(12);
		a4.setTempo(3);
		a4.setEquipe("Humanoide");
		
		
		System.out.println("Minha Lista");
		System.out.println(myList);
		
		int rando = (int) ((Math.random() * 10));
		
		System.out.println("Posição a ser excluida:" + rando);
		myList.remove(rando);
		
		System.out.println("Posição Removida");
		System.out.println(myList);
		
		myList.add(rando,a4);
		
		System.out.println("Posição adicionada");
		System.out.println(myList);
	}
	
}