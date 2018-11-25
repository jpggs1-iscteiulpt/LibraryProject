import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static GUI gui;
	
	public static void main(String[] args) {
		System.out.println(lerFicheiro("Biblioteca.txt"));
		List<Livro> livros = Biblioteca.getInstance().getLivros();
		for(Livro l : livros){
			System.out.println(l.getTitulo());
		}
		gui = new GUI();
	}
	
	
	public static boolean lerFicheiro(String nomeFicheiro) {
		if(nomeFicheiro == null) return false;
		try {
            File ficheiro = new File(nomeFicheiro);
            System.out.println(nomeFicheiro);
            Scanner LeitorFicheiro = new Scanner(ficheiro);
            while (LeitorFicheiro.hasNextLine()) {
            	System.out.println("chupa");
                String linha = LeitorFicheiro.nextLine();  
                System.out.println(linha);
                String dados[] = linha.split(";");

                long id = Integer.parseInt(dados[0]);
                String titulo = dados[1];
                String [] autor = dados[2].split(",");
                String editora = dados[3];
                String edicao = dados[4];
                String ano = dados[5];
                String tema = dados[6];
                
                Livro livro = new Livro(id, titulo, autor, editora, edicao, ano, tema);
                Biblioteca.getInstance().addLivro(livro);
            }

            LeitorFicheiro.close();
            return true;
        } catch (FileNotFoundException exception) {
            String mensagem = "Erro: o ficheiro " + nomeFicheiro
                    + "n�o foi encontrado.";
            System.out.println(mensagem);
        }
		return false;
		
	}
			


}
