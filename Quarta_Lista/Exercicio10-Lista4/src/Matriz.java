
public class Matriz {
	
	public int[][] matriz = {{1,4,},
							{3,4}};
	
	public int[][] matrizb = {{6,5,},
							{2,3}};
	public int[][] matrizc = new int[2][2];
	public int[][] matrizd = new int[2][2];
	public int[][] matrize = new int[2][2];
	public int[][] matrizf = new int[2][2];
	public int resta;
	public int restb;
	

	
	public void Soma() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matrizc[i][j] = matriz[i][j] + matrizb[i][j];
				System.out.print("["+matrizc[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	public void subtracao() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matrizd[i][j] = matriz[i][j] - matrizb[i][j];
				System.out.print("["+matrizd[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	public void multiplica() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matrize[i][j] = matriz[i][j] * matrizb[i][j];
				System.out.print("["+matrize[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	public void divide() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matrizf[i][j] = matriz[i][j] / matrizb[i][j];
				System.out.print("["+matrizf[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	public void determinantea() {
		
			int resta = (matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
			System.out.print("Determinante a: "+ resta);
		}
	

	public void determinanteb() {
	
		int restb = (matrizb[0][0]*matrizb[1][1])-(matrizb[1][0]*matrizb[0][1]);
		System.out.print("Determinante B: "+ restb);
		
	}

	
	public void ImpimirMatriz() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("["+matrizb[i][j]+"]");
			}
			System.out.println("");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
