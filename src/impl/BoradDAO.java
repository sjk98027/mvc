package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DAO;
import model.Borad;
import model.User;

public class BoradDAO {
	public static User user;

	public List<Borad> getBoradList() {
		Connection conn = DAO.getconn(user);
		String sql = "select * from borads order by 1";
		Borad borad = null;
		List<Borad> list = new ArrayList<Borad>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				borad = new Borad();
				borad.setBoradSeq(rs.getInt("borads"));
				borad.setTitle(rs.getString("title"));
				borad.setOriginNumber(rs.getInt("orgin_no"));
				borad.setContent(rs.getString("contents"));
				borad.setUserId(rs.getString("user_id"));
				borad.setCreateDate(rs.getString("create_date"));
				list.add(borad);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public List<Borad> getBoradList(String keyword) {
		Connection conn = DAO.getconn(user);
		String sql = "select * from borads " + 
				"where title like '%?%'" + 
				" or contents like '%?%' " +
				"order by 1";
		Borad borad = null;
		List<Borad> list = new ArrayList<Borad>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(0, keyword);
			pstmt.setString(1, keyword);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				borad = new Borad();
				borad.setBoradSeq(rs.getInt("borads"));
				borad.setTitle(rs.getString("title"));
				borad.setOriginNumber(rs.getInt("orgin_no"));
				borad.setContent(rs.getString("contents"));
				borad.setUserId(rs.getString("user_id"));
				borad.setCreateDate(rs.getString("create_date"));
				list.add(borad);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Borad> getBoradList(int boradId) {
		Connection conn = DAO.getconn(user);
		String sql = "select * from borads " + 
				"where borads = ?" + 
				"order by 1";
		Borad borad = null;
		List<Borad> list = new ArrayList<Borad>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(0, boradId);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				borad = new Borad();
				borad.setBoradSeq(rs.getInt("borads"));
				borad.setTitle(rs.getString("title"));
				borad.setOriginNumber(rs.getInt("orgin_no"));
				borad.setContent(rs.getString("contents"));
				borad.setUserId(rs.getString("user_id"));
				borad.setCreateDate(rs.getString("create_date"));
				list.add(borad);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void insertBorad(Borad borad) {
		Connection conn = DAO.getconn(user);
		String sql = "insert into borads values(borads_seq.nextval, ?,?,?,?,sysdate)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, borad.getOriginNumber());
			pstmt.setString(2, borad.getTitle());
			pstmt.setString(3,borad.getContent());
			pstmt.setString(4, borad.getUserId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "삽입");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateBorad(Borad borad) { //need update
		Connection conn = DAO.getconn(user);
		String sql = "update borads "
				+ "set SALARY = ?,"
				+ "where employee_id =?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, salary);
			//pstmt.setInt(2, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "수정");
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteBorad(Borad borad) { //need update
		Connection conn = DAO.getconn(user);
		String sql = "delete from borads where boards = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(0, borad.getBoradSeq());
			int r = pstmt.executeUpdate();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Borad getBorad(int boradId) {
		Connection conn = DAO.getconn(user);
		String sql = "select * from borads where borads = ?";
		Borad borad = null;

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boradId);
			ResultSet rs = pstmt.executeQuery();
			borad = new Borad();
			borad.setBoradSeq(rs.getInt("borads"));
			borad.setTitle(rs.getString("title"));
			borad.setOriginNumber(rs.getInt("orgin_no"));
			borad.setContent(rs.getString("contents"));
			borad.setUserId(rs.getString("user_id"));
			borad.setCreateDate(rs.getString("create_date"));
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return borad;
	}

}
