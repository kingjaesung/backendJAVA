package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8 ");

		String num1str = request.getParameter("num1");
		String num2str = request.getParameter("num2");

		String op = request.getParameter("oprator");

		int num1 = Integer.parseInt(num1str);
		int num2 = Integer.parseInt(num2str);

		int result = 0;
		String result2 = "";

		
			if (op.equals("+")) {
				result = num1 + num2;
			} else if (op.equals("-")) {
				result = num1 - num2;
			} else if (op.equals("*")) {
				result = num1 * num2;
			} else if (op.equals("/")) {
				result2 = String.valueOf(Double.valueOf(num1)/Double.valueOf(num2));
				Double.valueOf(result);
				Double.valueOf(num1);
				Double.valueOf(num2);
				result = (int) ((double) num1 / num2);
			};
		
//		switch(op) {
//		case "+" : result = num1 + num2;
//		case "-" : result = num1 - num2;
//		case "*" : result = num1 * num2;
//		case "/" : result = num1 / num2;
//		}
//		

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
		out.println("<title>SELECT & POST</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.println("<h1>계산 결과</h1>");
		
		out.println(num1 + op + num2 + "= "+ result +result2);
		
		out.println("<br>");
		
		out.println("<button onclick = 'history.back()'>안녕</button>");
		
		out.println("</body>");
		
		out.println("</html>");

	}

}
