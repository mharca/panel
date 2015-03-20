package panel.model;
import java.util.*;

;
public class Model {
	Pessoa pessoa;
	Sql sql;
	public Model(){
		sql = new Sql();
		
	}
	
	//----------------------------------------------------------
	public void setNome(String nome){
		System.out.println(nome);
	}
	public void setTel(String tel){
		System.out.println(tel);
	}
	public void setPos(String pos){
		System.out.println(pos);
	}
	
	//public void listar(String nome){
	public void listar(List<String> nomes)	{
		System.out.println("Teste: listar");
		sql.listarSql(nomes);
		
	}
	public void inserir(Pessoa p){
		sql.insertSql(p);
	}
	public void getTel(String nome, String  telefone){
		sql.getSqlTel(nome, telefone);
	}
}
