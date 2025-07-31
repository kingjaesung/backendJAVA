package com.binding;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.Address;
import com.member.User;

@WebServlet("/userinfo")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();
		Address add = new Address();
		
		add.setCity("서울 도봉구 창3동 460-23");
		add.setZipcode("01234");
		
		user.setAddress(add);
		user.setUid("wotjd6344");
		user.setUname("안재성");
		user.setUnum(20250729);
		
		request.setAttribute("user", user);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/user.jsp");
		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
		
	}

}
