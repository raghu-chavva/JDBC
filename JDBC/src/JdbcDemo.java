import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection connection=null;
	    ResultSet rs=null;
			Class.forName("org.sqlite.JDBC");
			
			String url="jdbc:sqlite:C:\\sqlite\\univ.db";
			
			connection=DriverManager.getConnection(url);
			System.out.println("Connected to the SQLite database");
			
			Statement st= connection.createStatement();
			
			String query="SELECT * FROM people";
			
			rs=st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+
				rs.getString("name")+rs.getInt("age")+rs.getString("city"));
			}
			
			
		
	}

}
