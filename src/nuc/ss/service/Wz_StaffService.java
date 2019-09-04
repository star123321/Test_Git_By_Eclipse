package nuc.ss.service;

import java.util.List;

import nuc.ss.entity.Wz_Staff;

public interface Wz_StaffService {

	boolean insStaff(Wz_Staff wz_staff);
	
	List<Wz_Staff> selStaff();
	
	boolean delStaff(int wzstaffno);
	
}
