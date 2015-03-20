package panel.view;
import javax.swing.*;
import panel.*;
import java.awt.*;
import java.awt.event.*;

public class PanelIncluir extends JPanel{

	private static final long serialVersionUID = 1L;
	JButton jbGravar;
	JTextField jtNome,jtTel,jtPos;
	JLabel jlNome, jlTel,jlPos;
//	Pessoa pessoa;
	
	public PanelIncluir(){
		setLayout(new GridLayout(4,2));
	
	//	pessoa = new Pessoa();
		
		jlNome = new JLabel("Nome: ");
		jtNome = new JTextField(20);
		
		jlTel = new JLabel("Telefone: ");
		jtTel = new JTextField(20);
		
		jlPos = new JLabel("Posicao: ");
		jtPos = new JTextField(20);
		
		
		jbGravar = new JButton("Gravar");
		add(jlNome);
		add(jtNome);
		add(jlTel);
		add(jtTel);
		add(jlPos);
		add(jtPos);
		
		add(jbGravar);
		
		
	}
	public void addjbGravarListener(ActionListener listener){
		jbGravar.addActionListener(listener);
	}
	//===================================================//
	
	public String getNome(){
		System.out.println(jtNome.getText()+"<-- nome");
		return jtNome.getText();
	}
	public String getTel(){
		return jtTel.getText();
	}
	public String getPos(){
		return jtPos.getText();
	}
	//-----------------------------------------------------------
	
	
	public void limparCampos(){
		jtNome.setText("");
		jtTel.setText("");
		jtPos.setText("");
		
	}
	
}
