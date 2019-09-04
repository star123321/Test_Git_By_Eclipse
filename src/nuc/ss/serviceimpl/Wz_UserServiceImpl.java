package nuc.ss.serviceimpl;

import nuc.ss.dao.Wz_UserDao;
import nuc.ss.daoimpl.Wz_UserDaoImpl;
import nuc.ss.entity.Wz_User;
import nuc.ss.service.Wz_UserService;

public class Wz_UserServiceImpl implements Wz_UserService {

	private Wz_UserDao wz_userDao;
	
	public Wz_UserServiceImpl() {
		wz_userDao = new Wz_UserDaoImpl();
	}

	@Override
	public boolean login(Wz_User ny_user) {
		
		return wz_userDao.login(ny_user);
	}

}
