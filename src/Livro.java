//import java.util.Arrays;

public class Livro {
	
	private String id;
	private String titulo;
	private String [] autor;
	private String editora;
	private String edicao;
	private String ano;
	private String tema;
	
	public Livro (String id, String titulo, String [] autor, String editora, String edicao, String ano, String tema) { 
		
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
		this.ano = ano;
		this.tema = tema;
		
	}
	
	public String getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String[] getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public String getEdicao() {
		return edicao;
	}
	public String getAno() {
		return ano;
	}
	public String getTema() {
		return tema;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public String toString() {
		String sAutores = "";
		for(int i = 0; i < autor.length; i++) {
			if(i == autor.length - 1) {
				sAutores +=  autor[i];
			}else {
				sAutores +=  autor[i] + " e ";
			}
		}
		return titulo + " de " + sAutores;
	}


}
