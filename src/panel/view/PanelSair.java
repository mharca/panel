package panel.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelSair extends JPanel{
		JButton jbSair;
		PanelSair(){
			jbSair = new JButton("Sair");
			add(jbSair);
		}
		public void addSairListener(ActionListener listener){
			jbSair.addActionListener(listener);
		}
}
