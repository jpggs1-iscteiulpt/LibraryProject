
public class Livro {
	
	private long id;
	private String titulo;
	private String autor;
	private String editora;
	private String edi�ao;
	private String ano;
	private String tema;
	
	public Livro (long id, String titulo, String autor, String editora, String edi�ao, String ano, String tema) { 
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.edi�ao = edi�ao;
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
	public String getEdi�ao() {
		return edi�ao;
	}
	public String getAno() {
		return ano;
	}
	public String getTema() {
		return tema;
	}
	
	public void setEdi�ao(String edi�ao) {
		this.edi�ao = edi�ao;
	}


}
