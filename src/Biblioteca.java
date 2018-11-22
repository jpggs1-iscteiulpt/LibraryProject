import java.util.ArrayList;
import java.util.List;

class Biblioteca {
	private static List<Livro> livros = new ArrayList<>();
	private static Biblioteca biblioteca;
	


    private Biblioteca() {
    }
 
    public static synchronized Biblioteca getInstance() {
        if (biblioteca == null)
            biblioteca = new Biblioteca();
 
        return biblioteca;
    }

	public static boolean addLivro(Livro l) {
		if (l == null)
			return false;
		if (livros.contains(l)) {
			System.out.println("Esse livro já existe");
			return false;
		}
		return livros.add(l);
	}

	public static boolean removeLivro(Livro l) {
		if (l == null)
			return false;

		return livros.remove(l);
	}

	public static boolean atualizarLivro(Livro l, String variavel) {
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

	public static List<Livro> procurarLivros(String tipoProcura, String valor) {
		switch (tipoProcura) {
		case "Título":
			return procurarPorTitulo(valor);
		case "Autor":
			return procurarPorAutor(valor);
		case "Editora":
			return procurarPorEditora(valor);
		case "Ano":
			return procurarPorAno(valor);
		case "Tema":
			return procurarPorTema(valor);
		default:
			System.out.println("Variavel inválida");
			return null;
		}
	}

	private static List<Livro> procurarPorTema(String valor) {
		List<Livro> retorno = null;
		for(Livro l : livros) {
			if(l.getTema().equals(valor)) {
				retorno.add(l);
			}
		}
		if(retorno.isEmpty()) return null;
		else return retorno;
	}

	private static List<Livro> procurarPorTitulo(String valor) {
		List<Livro> retorno = null;
		for(Livro l : livros) {
			if(l.getTitulo().equals(valor)) {
				retorno.add(l);
			}
		}
		if(retorno.isEmpty()) return null;
		else return retorno;
	}

	private static List<Livro> procurarPorAutor(String valor) {
		List<Livro> retorno = null;
		for(Livro l : livros) {
			if(l.getAutor().equals(valor)) {
				retorno.add(l);
			}
		}
		if(retorno.isEmpty()) return null;
		else return retorno;
	}
	
	private static  List<Livro> procurarPorEditora(String valor) {
		List<Livro> retorno = null;
		for(Livro l : livros) {
			if(l.getEditora().equals(valor)) {
				retorno.add(l);
			}
		}
		if(retorno.isEmpty()) return null;
		else return retorno;
	}

	private static List<Livro> procurarPorAno(String valor) {
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