package com.context;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetServletContext
 */
@WebServlet("/setContext")
public class SetServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 설정시 객체를 저장했던 시점의 클래스와 지금 클래스가 같은 버전인지 판단 가능
	// 객체를 저장했다가 나중에 꺼낼 때, 같은 클래스인지 아닌지 확인 가능

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		// getServletContext() 메서드는 현재 웹 어플리케이션 전체에서 공유되는
		// ServletContext 객체를 가져오는 것
		// ServletContext란 말 그대로 웹 어플리케이션의 환경(컨텍스트)를 담은 객체
		
		
		List<String> member = new ArrayList<String>();
		
		member.add("박찬호");
		member.add("안재성");
		member.add("송진성");
		
		context.setAttribute("member", member);
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/index.jsp");
		dispatcher.forward(request, response);
		
	
	}

}
