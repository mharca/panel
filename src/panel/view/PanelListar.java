package panel.view;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import panel.model.*;

public class PanelListar extends JPanel{

	JButton jbExcluirButton;
	JButton jbEndereco;
	JLabel jlPesquisa;
	JComboBox<List<String>> jc;
	
	public PanelListar(){
		
		jc = new JComboBox();
		jbExcluirButton = new JButton("Atualizar lista");
		jbEndereco = new JButton("Mostrar no mapa");
		jlPesquisa = new JLabel("Nome: ");
		//jc.addItem("bob");
		
		add(jlPesquisa);
		add(jc);
		add(jbExcluirButton);
		add(jbEndereco);
		
	}
	public void addjbListarListener(ActionListener listener){
		jbExcluirButton.addActionListener(listener);
	}
	
	public void addjbPesquisaListener(ActionListener listener){
		jbEndereco.addActionListener(listener);
		
	}
	
	public void setCombo(List<String> s){
		//	jc.addItem(s);
		jc.setModel(new DefaultComboBoxModel(s.toArray()));
		
	}
	public String getCombo()
	{
		return jc.getSelectedItem().toString();
	}
}
