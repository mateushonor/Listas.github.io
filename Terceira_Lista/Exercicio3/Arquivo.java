import java.io.*;

public class Arquivo {
	
	
	public void GravarTexto(String _texto) {
		FileWriter writer;
		try {
			File f = new File("C:\\Users\\mateu\\Desktop\\Arquivo.txt");
			writer = new FileWriter(f);
			writer.write(_texto);
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorreu um erro");
		}
	}
	public void LerArquivo() throws IOException  {
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\mateu\\Desktop\\Arquivo.txt"));
			while(br.ready()){
				String linha = br.readLine();
				System.out.println(linha);
				}
				br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}