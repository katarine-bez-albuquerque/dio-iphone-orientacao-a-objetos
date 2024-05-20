package br.com.projetos.model;

public class Telefone {
	
	private Contato contato;
	private CorreioDeVoz correioDeVoz;
	
	public Telefone(Contato contato, CorreioDeVoz correioDeVoz) {
		super();
		this.contato = contato;
		this.correioDeVoz = correioDeVoz;
	}

	public void ligar() {
		System.out.println("Ligando...");
	}
	
	public void receber() {
		System.out.println("Recebendo...");
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public CorreioDeVoz getCorreioDeVoz() {
		return correioDeVoz;
	}

	public void setCorreioDeVoz(CorreioDeVoz correioDeVoz) {
		this.correioDeVoz = correioDeVoz;
	}
}
