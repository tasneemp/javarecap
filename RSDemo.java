package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSDemo {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = JdbcUtil.getConnection();
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT ID, SAL FROM EMP");
			//System.out.println(rs.getString("id"));
			rs.absolute(1); // moves the cursor to the fifth row of rs
			rs.updateString("ID", "AINS"); // updates the
			// NAME column of row 5 to be AINSWORTH
			rs.updateRow(); // updates the row in the data source
			rs.moveToInsertRow(); // moves cursor to the insert row
			rs.updateString(1, "AINSWORTH"); // updates the
			// first column of the insert row to be AINSWORTH
			rs.updateInt(2, 35); // updates the second column to be 35
			rs.insertRow();
			rs.moveToCurrentRow();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
