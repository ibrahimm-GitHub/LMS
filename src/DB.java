import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root@241404");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}

}
