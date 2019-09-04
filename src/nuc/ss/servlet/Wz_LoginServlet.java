package nuc.ss.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.ss.entity.Wz_User;
import nuc.ss.service.Wz_UserService;
import nuc.ss.serviceimpl.Wz_UserServiceImpl;

@WebServlet("/Wz_Login")
public class Wz_LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Wz_LoginServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		Wz_UserService wz_userService = new Wz_UserServiceImpl();
		
		String wzUsername = request.getParameter("wzusername");
		String wzPassword = request.getParameter("wzpassword");
		
		Wz_User wz_user = new Wz_User(wzUsername, wzPassword);
		boolean flag = wz_userService.login(wz_user);
	
		if(flag) response.sendRedirect("Wz_SelStaff");
	}

}
