package nuc.ss.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import nuc.ss.dao.Wz_UserDao;
import nuc.ss.entity.Wz_User;
import nuc.ss.utils.Wz_ConnUtil;

public class Wz_UserDaoImpl implements Wz_UserDao {

	public static Connection conn;
	public static PreparedStatement pst;
	public static final String SEL_SQL = "select * from wzuser where wzusername = ? and wzpassword = ?";
	
	@Override
	public boolean login(Wz_User wz_user) {
		
		boolean flag = false;
		ResultSet rs = null;
		
		try {
			conn = Wz_ConnUtil.getConn();
			pst = conn.prepareStatement(SEL_SQL);
			
			pst.setString(1, wz_user.getWzUsername());
			pst.setString(2, wz_user.getWzPassword());
			
			rs = pst.executeQuery();
			if(rs.next()) flag = true;
			else flag = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

}
