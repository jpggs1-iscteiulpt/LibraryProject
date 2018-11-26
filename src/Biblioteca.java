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
    
    public static int nmrLivros() {
		return livros.size();
	}
    
	public static boolean addLivro(Livro l) {
		if (l == null)
			return false;
		if (livros.contains(l)) {
			System.out.println("Esse livro ja existe");
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
			System.out.println("Diga o que informa��o pertende atualizar");
			return false;
		}
		switch (variavel) {
		case "T�tulo": // chama um metodo
			break;
		case "Edi��o": // chama um metodo
			break;
		default:
			System.out.println("Variavel inv�lida");
			break;
		}

		return false; // POR ACABAR
	}

	public static List<Livro> procurarLivros(String tipoProcura, String valor) {
		switch (tipoProcura.toLowerCase()) {
		case "mostrar todos os livros":
			return getLivros();
		case "porcurar livro por titulo":
			return procurarPorTitulo(valor);
		case "procurar livro por autor":
			return procurarPorAutor(valor);
		case "procurar livro por editora":
			return procurarPorEditora(valor);
		case "procurar livro por ano":
			return procurarPorAno(valor);
		case "procurar livro por tema":
			return procurarPorTema(valor);
		default:
			System.out.println("Variavel invalida");
			return null;
		}
	}

	
	private static List<Livro> procurarPorTema(String valor) {
		if(valor == null) return null;
		List<Livro> retorno = new ArrayList<>();
		for(Livro l : livros) {
			if(l.getTema().toLowerCase().equals(valor.toLowerCase())) {
				retorno.add(l);
			}
		}
		return retorno;
	}

	private static List<Livro> procurarPorTitulo(String valor) {
		if(valor == null) return null;
		List<Livro> retorno = new ArrayList<>();
		for(Livro l : livros) {
			if(l.getTitulo().toLowerCase().equals(valor.toLowerCase())) {
				retorno.add(l);
			}
		}
		return retorno;
	}

	private static List<Livro> procurarPorAutor(String valor) {
		if(valor == null) return null;
		List<Livro> retorno = new ArrayList<>();
		for(Livro l : livros) {
			for(String autor : l.getAutor()) {
				if(autor.toLowerCase().equals(valor.toLowerCase())) {
					retorno.add(l);
				}
			}
		}
		return retorno;
	}
	
	private static List<Livro> procurarPorEditora(String valor) {
		if(valor == null) return null;
		List<Livro> retorno = new ArrayList<>();
		for(Livro l : livros) {
			if(l.getEditora().toLowerCase().equals(valor.toLowerCase())) {
				retorno.add(l);
			}
		}
		return retorno;
	}

	private static List<Livro> procurarPorAno(String valor) {
		if(valor == null) return null;
		List<Livro> retorno = new ArrayList<>();
		for(Livro l : livros) {
			if(l.getAno().equals(valor)) {
				retorno.add(l);
			}
		}
		return retorno;
	}

	public static List<Livro> getLivros() {
		return livros;
	}

}