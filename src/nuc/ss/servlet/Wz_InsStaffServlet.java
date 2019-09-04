package nuc.ss.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.ss.entity.Wz_Staff;
import nuc.ss.service.Wz_StaffService;
import nuc.ss.serviceimpl.Wz_StaffServiceImpl;

@WebServlet("/Wz_InsStaff")
public class Wz_InsStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Wz_InsStaffServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		Wz_StaffService wz_staffService = new Wz_StaffServiceImpl();
		
		String wzStaffNo = request.getParameter("wzstaffno");
		String wzStaffName = request.getParameter("wzstaffname");
		String wzUnit = request.getParameter("wzunit");
		String wzStaffPhone = request.getParameter("wzstaffphone");
		String wzStaffQQ = request.getParameter("wzstaffqq");
		String wzTime = request.getParameter("wztime");
		
		Wz_Staff wz_staff = new Wz_Staff(wzStaffNo, wzStaffName, wzUnit, wzStaffPhone, wzStaffQQ, wzTime);
		boolean flag = wz_staffService.insStaff(wz_staff);
		
		if(flag) response.sendRedirect("Wz_SelStaff");
	}

}
