import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static GUI gui;

	public static void main(String args []) {
		lerFicheiro("Biblioteca.txt");
		System.out.println("Numero de Livros lidos: " + Biblioteca.nmrLivros() + "\n");
		List<Livro> livros = Biblioteca.getLivros();
		for(Livro l : livros) {
			System.out.println(l.getTitulo());
		}
		gui = new GUI();
	}

	public static boolean lerFicheiro(String nomeFicheiro) {
		if(nomeFicheiro == null) return false;
		try {
            File ficheiro = new File(nomeFicheiro);
            //System.out.println(nomeFicheiro);
            Scanner LeitorFicheiro = new Scanner(ficheiro);
            while (LeitorFicheiro.hasNextLine()) {
            	String linha = LeitorFicheiro.nextLine();  
            	String dados[] = linha.split(";");
            	if(dados.length == 7) {
                	String id = dados[0];
                    String titulo = dados[1];
                    String [] autor = dados[2].split(",");
                    String editora = dados[3];
                    String edicao = dados[4];
                    String ano = dados[5];
                    String tema = dados[6];
                    
                    Livro livro = new Livro(id, titulo, autor, editora, edicao, ano, tema);
                    Biblioteca.addLivro(livro);
                }
            }
            LeitorFicheiro.close();
            return true;
        } catch (FileNotFoundException exception) {
            String mensagem = "Erro: o ficheiro " + nomeFicheiro
                    + "nao foi encontrado.";
            System.out.println(mensagem);
        }
		return false;
		
	}
}
