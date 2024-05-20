package br.com.projetos.aplicacao;

import br.com.projetos.model.Contato;
import br.com.projetos.model.CorreioDeVoz;
import br.com.projetos.model.Email;
import br.com.projetos.model.Foto;
import br.com.projetos.model.IPhone;
import br.com.projetos.model.Mapa;
import br.com.projetos.model.Midia;
import br.com.projetos.model.Navegador;
import br.com.projetos.model.Telefone;
import br.com.projetos.model.Widget;

public class Programa {

	public static void main(String[] args) {
				
		Midia midia = new Midia();
		Foto foto = new Foto();
		Contato contato = new Contato();
		CorreioDeVoz correioDeVoz = new CorreioDeVoz();
		Telefone telefone = new Telefone(contato, correioDeVoz);
		Email email = new Email();
		Navegador navegador = new Navegador();
		Mapa mapa = new Mapa();
		Widget widget = new Widget();
		IPhone iphone = new IPhone(email, navegador, mapa);
		
		System.out.println("--------------- IPHONE ---------------");
				
		System.out.println("\n1- Midia:");		
		iphone.adicionarMidias(midia);
		for(Midia m : iphone.getMidias()) {
			m.exibirAlbum();
			m.selecionar();
			m.tocar();
			m.pausar();
		}		
		
		System.out.println("\n2 - Foto:");		
		iphone.adicionarFoto(foto);
		for(Foto f: iphone.getFotos()) {
			f.salvar();
			f.editar();
			f.mover();
			f.compartilhar();
		}
		
		System.out.println("\n3 - Telefone:");
		iphone.adicionarTelefones(telefone);
		for(Telefone t: iphone.getTelefones()) {
			t.getContato().exibir();
			t.getContato().pesquisar();
			t.ligar();
			t.receber();
			t.getCorreioDeVoz().receber();			
		}
		
		System.out.println("\n4 - Email:");
		iphone.getEmail().connectar();
		iphone.getEmail().escrever();
		iphone.getEmail().enviar();
		iphone.getEmail().receber();
		
		System.out.println("\n5 - Navegador:");
		iphone.getNavegador().connectar();
		iphone.getNavegador().exibirPagina();
		iphone.getNavegador().atualizarPagina();
		iphone.getNavegador().favoritarPagina();
		
		System.out.println("\n6 - Mapa:");
		iphone.getMapa().connectar();
		iphone.getMapa().pesquisar();
		iphone.getMapa().ampliar();
		iphone.getMapa().reduzir();
		
		System.out.println("\n7 - Widget:");		
		iphone.adicionarWidget(widget);
		for(Widget w: iphone.getWidgets()) {
			w.connectar();
			w.selecionar();
		}
		
		System.out.println("\n--------------- ////// ---------------");
	}
}
