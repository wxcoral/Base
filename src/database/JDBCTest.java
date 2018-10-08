package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql:///babasport", "root", "1234");
			String sql="select * from bbs_brand";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
	
			while(rs.next()){
				System.out.println("商品id:"+rs.getString(1)+"---商品名称："+rs.getString(2));
			}
			
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps!=null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	}
}
