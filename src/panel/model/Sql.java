package panel.model;
import java.sql.*;
import java.util.*;

public class Sql {
	Connection c = null;
	Statement stmt = null;
	Pessoa pessoa;
	
	public Sql(){
		try{
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:pessoas.db");
			criarSql();
			//stmt.close();
		}catch(Exception e){
			System.err.print(e.getMessage());
		}
		System.out.println("Abriu database");
		//criarSql();
		
	}
	
//--------------------------------------------------------------------------------------------------
	void criarSql(){
		try{
		stmt = c.createStatement();
		String sql = "CREATE TABLE IF NOT EXISTS PESSOAS ( NAME TEXT NOT NULL, " +
						"POSICAO	 TEXT, "+
						"TELEFONE	TEXT);";
		stmt.executeUpdate(sql);
		stmt.close();
		//c.close();
		System.out.println("criado sql ok");
		}catch(SQLException e){
			System.out.println("--->"+e.getMessage()+"---"+ e.getMessage());
			
		}
	}
	//--------------------------------------------------------------------------------------------------
	public void listarSql(List<String> name){
		try{
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PESSOAS;");
			while(rs.next()){
				System.out.println("passed");
				name.add( rs.getString("NAME"));
				
				System.out.println("Nome ok: "+name);
			}
			for (int i=0;i<5;i++)
				System.out.println(name);
			rs.close();
		stmt.close();
		//	c.close();
		}catch(Exception e){
			System.out.println("Erro 1"+e.getClass() +e.getStackTrace() + e.getMessage());
			//c.close();
			//System.exit(0);
		}
	}
	//--------------------------------------------------------------------------------------------------
public void getSqlTel(String nome, String tel){
	try{
		stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT telefone FROM pessoas WHERE name = '"+nome+"'");
		
<<<<<<< HEAD
		System.out.println("Teste -->"+rs);
=======
		System.out.println("Teste --> "+rs);
		
>>>>>>> f480c6c813ec66332324c156dbf5182cc3fea1d8
		rs.close();
		stmt.close();
		
	}catch(Exception e){
		System.out.println("Erro 2 --------> "+e.getClass() + e.getMessage());
	}
}
	//--------------------------------------------------------------------------------------------------

	public void insertSql(Pessoa p){
		try{
			stmt = c.createStatement();
			c.setAutoCommit(false);
			//criarSql();
			System.out.println("entrou. nome = "+p.getNome() + p.getPos()+p.getTel());
			
<<<<<<< HEAD
			/*
			stmt.executeUpdate("INSERT INTO PESSOAS VALUES("""
					+ p.getNome()+ "","
							+ p.getPos() +")");
*/
		//	String sql = "INSERT INTO PESSOAS VALUES( ' "+p.getNome()+" ', "+" ' "+p.getPos()+" ', '"+p.getTel()+"' );";
		//	String sql = "insert into pessoas values(' "+p.getNome()+" ', ' "+p.getPos()+" ',' "+p.getTel()+" ')";
			
			//String sql = "INSERT INTO PESSOAS(NAME,POSICAO,TELEFONE) VALUES('BOZO',1,2);";
			PreparedStatement st = c.prepareStatement("INSERT INTO PESSOAS(NAME, POSICAO,TELEFONE) VALUES(?,?,?)");
=======
			PreparedStatement st = c.prepareStatement("INSERT INTO PESSOAS(NAME,POSICAO,TELEFONE) VALUES(?,?,?)");
>>>>>>> f480c6c813ec66332324c156dbf5182cc3fea1d8
			st.setString(1, p.getNome());
			st.setString(2, p.getPos());
			st.setString(3, p.getTel());
			st.executeUpdate();
			
					System.out.println("passou sql");
			//stmt.executeUpdate(sql);
			System.out.println("passou sql2");
			stmt.close();
			System.out.println("passou sql3");

			c.commit();
			System.out.println("passou sql4");
			//c.close();
		}catch(Exception e){
			System.out.println(e.getClass() + e.getMessage());
			System.exit(0);
		}
		System.out.println("Inserido");
	}
}
