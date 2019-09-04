package nuc.ss.dao;

import java.util.List;

import nuc.ss.entity.Wz_Staff;

public interface Wz_StaffDao {

	boolean insStaff(Wz_Staff wz_staff);
	
	List<Wz_Staff> selStaff();
	
	boolean delStaff(int wzstaffno);
	
}
