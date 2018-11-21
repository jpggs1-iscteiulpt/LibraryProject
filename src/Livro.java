
public class Livro {
	
	private int id;
	private String titulo;
	private String autor;
	private String editora;
	private String ediçao;
	private String ano;
	
	public Livro (int id, String titulo, String autor, String editora, String ediçao, String ano) { //CRL pá
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ediçao = ediçao;
		this.ano = ano;
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
	
	public void setEdiçao(String ediçao) {
		this.ediçao = ediçao;
	}


}
