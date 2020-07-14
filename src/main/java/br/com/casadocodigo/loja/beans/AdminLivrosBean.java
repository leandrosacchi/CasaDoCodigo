package br.com.casadocodigo.loja.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.casadocodigo.loja.models.Livro;

//CDI: liga a classe com a tela
@Named
@RequestScoped
public class AdminLivrosBean {
	
	private Livro livro = new Livro();
		
	public Livro getLivro() {
		return livro;
	}

	public void salvar() {
		System.out.println("Livro cadastrado: "+livro);
	}
	

}
