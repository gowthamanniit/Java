package folder1;
import java.sql.*;
public class DatabaseOracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver accepted");			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:system/12345@localhost:1521:xe");
			System.out.println("connection success");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			int col=rs.getMetaData().getColumnCount();
			System.out.println(col);
			
			while(rs.next())
			{			
				System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
			}
			System.out.println("finished");
			rs.close();
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
