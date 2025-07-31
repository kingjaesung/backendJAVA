package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodatMenu
 */
@WebServlet("/todatMenu")
public class TodayMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 직렬화(serialization) 할 때 사용하는 클래스 고유 ID
	// 직렬화 > 객체를 파일이나 네트워크로 보내기 위해 바이트로 변환하는 과정

	// request > 브라우저가 웹 서버에 요청
	// response > 웹 서버가 브라우저에게 보내는 응답
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
		out.println("<title>SELECT & POST</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.println("<div style='text-align:center'>오늘점심메뉴 : <strong>");

		String [] value = request.getParameterValues("menuSelect");
		for(int i = 0; i < value.length; i++) {
			out.print(value[i]);
			if(i < value.length -1) {
				out.print(",");
			}
			
		}
		
		out.println("</strong></div>");
		out.println("</body></html>");
		
		out.close();
	}

}
