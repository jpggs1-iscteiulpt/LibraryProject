
public class Livro {
	
	private int id;
	private String titulo;
	private String autor;
	private String editora;
	private String edi�ao;
	private String ano;
	
	public Livro (int id, String titulo, String autor, String editora, String edi�ao, String ano) { //CRL p�
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.edi�ao = edi�ao;
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
	public String getEdi�ao() {
		return edi�ao;
	}
	public String getAno() {
		return ano;
	}
	
	public void setEdi�ao(String edi�ao) {
		this.edi�ao = edi�ao;
	}


}
