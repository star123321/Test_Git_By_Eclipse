package nuc.ss.serviceimpl;

import java.util.List;

import nuc.ss.dao.Wz_StaffDao;
import nuc.ss.daoimpl.Wz_StaffDaoImpl;
import nuc.ss.entity.Wz_Staff;
import nuc.ss.service.Wz_StaffService;

public class Wz_StaffServiceImpl implements Wz_StaffService {

	private Wz_StaffDao wz_staffDao;
	
	public Wz_StaffServiceImpl() {
		wz_staffDao = new Wz_StaffDaoImpl();
	}
	
	@Override
	public boolean insStaff(Wz_Staff wz_staff) {
		
		return wz_staffDao.insStaff(wz_staff);
	}

	@Override
	public List<Wz_Staff> selStaff() {
		
		return wz_staffDao.selStaff();
	}

	@Override
	public boolean delStaff(int wzstaffno) {
		
		return wz_staffDao.delStaff(wzstaffno);
	}

}
