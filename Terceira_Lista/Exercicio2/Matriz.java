import java.lang.Math;
public class Matriz {
	
	
	public static int[][] matriz = {{3,2,},
				  	{1,9}};
	
	public static int[][] Matriz1() {
		
		int[][] minhaMatrizp = new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0; j<2;j++) {
			minhaMatrizp[i][j]=(int)(Math.random()*10);
			}
		}
		
		return minhaMatrizp;
		
	}
	

}