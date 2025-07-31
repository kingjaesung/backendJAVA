package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet2
 */

@WebServlet(
		name = "firstServlet2", 
		urlPatterns = { 
				"/first2", 
				"/first3"
		})

//http://localhost:8080/servletExample/first3
//http://localhost:8080/servletExample/first2 
//둘다 같은 페이지 출력
public class FirstServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		// response - 사용자의 브라우저에게 응답을 보낸 때 사용하는 객체
		// getWriter() 브라우저로 데이터를 출력할 수 있는 출력 객체(printWriter)가죠옴
		//PrintWriter out - 글을 쓰듯이 사용할 수 있게 도와주는 객체 out.print()로 출력 가능
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8' />");
		out.println("<title>JSP 예제</title>");
		out.println("<link rel='icon' href='data:,'<head>");
		out.println("<body><h1>안녕하세온</h1></body>");
		out.println("</html>");
		
		out.close();
		
		
		
	}

}
