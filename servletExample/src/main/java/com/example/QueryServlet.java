package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryServlet
 */
@WebServlet({"/queryget","/querypost"})
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
		
	}

	
	
	//*서블릿(Java 웹 프로그래밍)**에서 **자동으로 제공되는 객체(변수)**야.
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		// 응답할 문서의 타입 텍스트 기반 HTML 
		
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("guestName");
		//요청하는 파라메터는 guestName = 홍길동
		int number = Integer.parseInt(request.getParameter("num"));
		// 요청하는 파라메터 num = 임의 101
		
		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'/>");
		out.println("<title>GET방식과 POST방식</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		
		out.print("<h2>요청 방식:" + request.getMethod() + "</h2>");
		// 요청받아온 do 방식 POST or GET
		out.print("<h2>요청 방식:" + request.getRequestURI() + "<h2>");
		// 입력한 guestName, num 값
		
		out.print("<h2>당신의 이름은" + userName + "이군요!</h2>");
		out.print("<h2>당신이 좋아하는 숫자는 " + number + "이군요!</h2>");
		
		out.print("<a href='#' onclick='history.back();'>입력화면으로 가기</a>");
		// 클릭시(onclick) history.back(); < 이전 페이지
		
		out.println("</body></html>");
		
		
		
		out.close();
		
	}


}
