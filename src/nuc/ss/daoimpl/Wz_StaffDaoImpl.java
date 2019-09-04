package nuc.ss.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import nuc.ss.dao.Wz_StaffDao;
import nuc.ss.entity.Wz_Staff;
import nuc.ss.utils.Wz_ConnUtil;

public class Wz_StaffDaoImpl implements Wz_StaffDao {

	public static Connection conn;
	public static PreparedStatement pst;
	public static final String INS_SQL = "insert into wzstaff values(?, ?, ?, ?, ?, ?)";
	public static final String SEL_SQL = "select * from wzstaff";
	
	@Override
	public boolean insStaff(Wz_Staff wz_staff) {
		
		boolean flag = false;
		int rs = 0;
		
		try {
			conn = Wz_ConnUtil.getConn();
			pst = conn.prepareStatement(INS_SQL);
			
			pst.setString(1, wz_staff.getWzStaffNo());
			pst.setString(2, wz_staff.getWzStaffName());
			pst.setString(3, wz_staff.getWzUnit());
			pst.setString(4, wz_staff.getWzStaffPhone());
			pst.setString(5, wz_staff.getWzStaffQQ());
			pst.setString(6, wz_staff.getWzTime());
			
			rs = pst.executeUpdate();
			if(rs > 0) flag = true;
			else flag = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public List<Wz_Staff> selStaff() {
		
		List<Wz_Staff> ls = new ArrayList<Wz_Staff>();
		ResultSet rs = null;
		
		try {
			conn = Wz_ConnUtil.getConn();
			pst = conn.prepareStatement(SEL_SQL);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				String wzStaffNo = rs.getString(1);
				String wzStaffName = rs.getString(2);
				String wzUnit = rs.getString(3);
				String wzStaffPhone = rs.getString(4);
				String wzStaffQQ = rs.getString(5);
				String wzTime = rs.getString(6);
				
				Wz_Staff wz_staff = new Wz_Staff(wzStaffNo, wzStaffName, wzUnit, wzStaffPhone, wzStaffQQ, wzTime);
				ls.add(wz_staff);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return ls;
	}

	@Override
	public boolean delStaff(int wzstaffno) {

		return false;
	}

}
