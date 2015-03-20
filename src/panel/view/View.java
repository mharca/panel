package panel.view;
import javax.swing.*;

import javax.swing.JTabbedPane;

public class View extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTabbedPane pane;
	public PanelIncluir panelIncluir;
	public PanelSair panelSair;
	public PanelListar panelListar;
	
	public View(){
		panelIncluir = new PanelIncluir();
		panelListar = new PanelListar();
		panelSair = new PanelSair();

		
		pane = new JTabbedPane();
		pane.add(panelIncluir, "Incluir");
		pane.add(panelListar, "Listar");
		pane.add(panelSair,"Sair");
		
		setSize(400, 150);
		//pack();
		add(pane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null); // Faz o jframe ficar no centro.
	}
}
