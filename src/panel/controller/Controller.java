package panel.controller;
import java.awt.event.*;

import panel.model.*;
import panel.view.*;

import java.util.*;
public class Controller {
	View view;
	Model model;

	public Controller(View v, Model m){
		this.view = v;
		this.model = m;
		
		view.panelIncluir.addjbGravarListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			/*	model.setNome(view.panelIncluir.getNome());
				model.setTel(view.panelIncluir.getTel());
				model.setPos(view.panelIncluir.getPos());
				*/
			   Pessoa p = new Pessoa();
			   p.setNome (view.panelIncluir.getNome());
			   p.setPos(view.panelIncluir.getPos());
			   p.setTel(view.panelIncluir.getTel());
			   
			   System.out.println(p.getNome());
			   model.inserir(p);
			   
				view.panelIncluir.limparCampos();
			}
		});
		
		view.panelSair.addSairListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Saindo..");
				System.exit(0);
			}
		});
		
		view.panelListar.addjbPesquisaListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t =new String();
					System.out.print(view.panelListar.getCombo());
					model.getTel(view.panelListar.getCombo(), t);
					System.out.println("-->>> ");
			}
		});
		
		view.panelListar.addjbListarListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				List<String> nomes=new ArrayList<String>();
				model.listar(nomes);
				view.panelListar.setCombo(nomes);
			}
		});
	}
}
