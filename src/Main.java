import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	private static GUI gui;
	
	public static void main(String[] args) {
		//lerFicheiro()
		gui = new GUI();
	}
	
	
	public static boolean lerFicheiro(String nomeFicheiro) {
		if(nomeFicheiro == null) return false;
		try {
            File ficheiro = new File(nomeFicheiro);
            Scanner LeitorFicheiro = new Scanner(ficheiro);
            while (LeitorFicheiro.hasNextLine()) {
                String linha = LeitorFicheiro.nextLine();  
                String dados[] = linha.split(";");

                long id = Integer.parseInt(dados[0]);
                String titulo = dados[1];
                String autor = dados[2];
                String editora = dados[3];
                String edicao = dados[4];
                String ano = dados[5];
                
//               Livro livro = new Livro(id, titulo, autor, editora, edi�ao, ano);
//                b.addLivro(livro);
            }

            LeitorFicheiro.close();
        } catch (FileNotFoundException exception) {
            String mensagem = "Erro: o ficheiro " + nomeFicheiro
                    + "n�o foi encontrado.";
            System.out.println(mensagem);
        }
		return true;
	}
			


}
