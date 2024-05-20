package br.com.projetos.model;

import java.util.ArrayList;
import java.util.List;

public class IPhone {

	private Email email;
	private Navegador navegador;
	private Mapa mapa;
	private List<Midia> midias;
	private List<Foto> fotos;
	private List<Telefone> telefones;
	private List<Widget> widgets;
	
	public IPhone() {		
	}

	public IPhone(Email email, Navegador navegador, Mapa mapa) {
		this.email = email;
		this.navegador = navegador;
		this.mapa = mapa;
		this.midias = new ArrayList<>();
		this.fotos = new ArrayList<>();
		this.telefones = new ArrayList<>();
		this.widgets = new ArrayList<>();
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Navegador getNavegador() {
		return navegador;
	}

	public void setNavegador(Navegador navegador) {
		this.navegador = navegador;
	}

	public Mapa getMapa() {
		return mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
	
	public List<Midia> getMidias() {
		return midias;
	}

	public List<Foto> getFotos() {
		return fotos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public List<Widget> getWidgets() {
		return widgets;
	}

	public void adicionarMidias(Midia midia) {
		midias.add(midia);
	}
	
	public void adicionarFoto(Foto foto) {
		fotos.add(foto);
	}
	
	public void adicionarTelefones(Telefone telefone) {
		telefones.add(telefone);
	}
	
	public void adicionarWidget(Widget widget) {
		widgets.add(widget);
	}	
}
