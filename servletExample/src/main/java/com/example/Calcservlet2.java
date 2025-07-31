package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcservlet2
 */
@WebServlet("/calcservlet2")
public class Calcservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String num1str = request.getParameter("num1");
		String num2str = request.getParameter("num2");
		
		int num1 = Integer.parseInt(num1str);
		int num2 = Integer.parseInt(num2str);
		String op = request.getParameter("oprator");
		
		Calc2 cal = new Calc2(num1,num2,op);
		
		int result = cal.getResult();
		
		out.print(result);
		
		out.close();
	}

}
