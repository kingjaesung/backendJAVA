package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookOutputServlet
 */
@WebServlet("/bookOutput")
public class BookOutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		
		BookDTO book = (BookDTO)request.getAttribute("book");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8' />");
		out.println("<title>dispatcher 예제</title>");
		out.println("<style> caption{font-size:14px}");
		out.println("table{border-collapse : collapse; width:300px}");
		out.println("td {border: 1px solid black} </style>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.println("<table><caption>입력 책정보</caption>");
		out.println("<tr><td>책 제목</td><td> "+ title + "</td></tr>");
		out.println("<tr><td>작가 </td> <td>" + author +"</td></tr>");
		out.println("<tr><td>출판사</td><td>"+ publisher+"</td></tr></table>");
		out.println("<br>");
		out.println("<div>"+book.toString()+"</div>");
		out.println("</body></html>");
		
	}

}
