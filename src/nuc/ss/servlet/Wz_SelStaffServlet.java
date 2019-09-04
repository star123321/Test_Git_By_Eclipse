package nuc.ss.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.ss.entity.Wz_Staff;
import nuc.ss.service.Wz_StaffService;
import nuc.ss.serviceimpl.Wz_StaffServiceImpl;

@WebServlet("/Wz_SelStaff")
public class Wz_SelStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Wz_SelStaffServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Wz_StaffService wz_staffService = new Wz_StaffServiceImpl();
		List<Wz_Staff> ls = wz_staffService.selStaff();
		
		request.setAttribute("msg", ls);
		request.getRequestDispatcher("1713011003wzselmsg.jsp").forward(request, response);
	}

}
