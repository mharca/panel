package panel.model;

public class Pessoa {
	private String nome, tel, pos;
	
	public String getNome(){
		return nome;
	}
	public String getTel(){
		return tel;
	}
	public String getPos(){
		return pos;
	}
	//------------------------------------
	public void setNome(String n){
		nome = n;
	}
	public void setTel(String t){
		tel = t;
	}
	public void setPos(String p){
		pos = p;
	}
}
