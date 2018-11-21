import java.util.ArrayList;
import java.util.List;

class Biblioteca {
	private List<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<>();
	}

	public boolean addLivro(Livro l) {
		if (l == null)
			return false;
		if (livros.contains(l)) {
			System.out.println("Esse livro já existe");
			return false;
		}
		return livros.add(l);
	}

	public boolean removeLivro(Livro l) {
		if (l == null)
			return false;

		return livros.remove(l);
	}

	public boolean atualizarLivro(Livro l, String variavel) {
		if (l == null)
			return false;
		if (variavel == null) {
			System.out.println("Diga o que informação pertende atualizar");
			return false;
		}
		switch (variavel) {
		case "Título": // chama um metodo
			break;
		case "Edição": // chama um metodo
			break;
		default:
			System.out.println("Variavel inválida");
			break;
		}

		return false; // POR ACABAR
	}

	public List<Livro> procurarLivro(String tipoProcura, String valor) {
		switch (tipoProcura) {
		case "Título":
			return procurarPorTitulo(valor);
		case "Autor":
			return procurarPorAutor(valor);
		case "Editora":
			return procurarPorEditora(valor);
		case "Ano":
			return procurarPorAno(valor);
		default:
			System.out.println("Variavel inválida");
			return null;
		}
	}

	private List<Livro> procurarPorTitulo(String valor) {
		List<Livro> retorno = null;
		for(Livro l : livros) {
			if(l.getTitulo().equals(valor)) {
				retorno.add(l);
			}
		}
		if(retorno.isEmpty()) return null;
		else return retorno;
	}

	private List<Livro> procurarPorAutor(String valor) {
		List<Livro> retorno = null;
		for(Livro l : livros) {
			if(l.getAutor().equals(valor)) {
				retorno.add(l);
			}
		}
		if(retorno.isEmpty()) return null;
		else return retorno;
	}
	
	private List<Livro> procurarPorEditora(String valor) {
		List<Livro> retorno = null;
		for(Livro l : livros) {
			if(l.getEditora().equals(valor)) {
				retorno.add(l);
			}
		}
		if(retorno.isEmpty()) return null;
		else return retorno;
	}

	private List<Livro> procurarPorAno(String valor) {
		List<Livro> retorno = null;
		for(Livro l : livros) {
			if(l.getAno().equals(valor)) {
				retorno.add(l);
			}
		}
		if(retorno.isEmpty()) return null;
		else return retorno;
	}

}