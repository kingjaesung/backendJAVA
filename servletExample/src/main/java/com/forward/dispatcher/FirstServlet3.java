package com.forward.dispatcher;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet3
 */
@WebServlet("/firstDispatcher")
public class FirstServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");

//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("secondDispatcher?language=java");
//		dispatcher.forward(request, response);
//		

		request.setAttribute("language", "java");
		request.setAttribute("name", "안재성");
		request.setAttribute("id", "wotjd6344");
		request.setAttribute("address", "도봉구 창3동");
		request.setAttribute("age", 20);
		request.setAttribute("now", new Date());

		RequestDispatcher dispatcher = request.getRequestDispatcher("secondDispatcher");
		dispatcher.forward(request, response);
	}

}
