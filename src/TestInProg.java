import java.sql.*;
public class TestInProg {

		public static void main(String[] args) {
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root");
					System.out.println(con);
					Statement stmt=con.createStatement();
					System.out.println("Data added");
					String sql="Insert into testing values(77)";
					stmt.executeUpdate(sql);
			}
			catch(Exception e){
	            System.out.println(e);
			}

		}

	}

