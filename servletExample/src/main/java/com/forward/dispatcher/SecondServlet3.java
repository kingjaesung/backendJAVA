package com.forward.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet3
 */
@WebServlet("/secondDispatcher")
public class SecondServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");

		String name = (String) request.getAttribute("name");
		String language = (String) request.getAttribute("language");
		String address = (String) request.getAttribute("address");
		Date today = (Date) request.getAttribute("now");
		int age = (int) request.getAttribute("age");

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8' />");
		out.println("<title>dispatcher 예제</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.println("<div>우리가 배운 언어" + language + "</div>");
		out.println("<div>이름:" + name + "</div>");
		out.println("<div> 주소:" + address + "</div>");
		out.println("<div> 내 나이:" + age + "</div>");
		out.println("<div> 날짜" + (new SimpleDateFormat("yyyy년 MM월 dd일").format(today)) + "</div>");
		out.println("</body></html>");

	}

}
