
public class Livro {
	
	private long id;
	private String titulo;
	private String autor;
	private String editora;
	private String ediçao;
	private String ano;
	private String tema;
	
	public Livro (long id, String titulo, String autor, String editora, String ediçao, String ano, String tema) { 
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ediçao = ediçao;
		this.ano = ano;
		this.tema = tema;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public String getEdiçao() {
		return ediçao;
	}
	public String getAno() {
		return ano;
	}
	public String getTema() {
		return tema;
	}
	
	public void setEdiçao(String ediçao) {
		this.ediçao = ediçao;
	}


}
