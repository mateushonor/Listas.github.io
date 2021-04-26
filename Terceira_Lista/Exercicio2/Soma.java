import java.util.Arrays;

public class Soma {
	
	public int[][] matriza = new int[2][2];
	public int[][] matrizb = new int[2][2];

	public void SomaMatriz() {
		
	
		matrizb = Matriz.Matriz1();
		
		System.out.println(Arrays.deepToString(matrizb));
			
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matriza[i][j] = matrizb[i][j]+ Matriz.matriz[i][j];
			}
		}
		
		System.out.println("+");
		
		System.out.println(Arrays.deepToString(Matriz.matriz));
		
		System.out.println(" ");
		
		System.out.println(Arrays.deepToString(matriza));
			
		
		
	}


}