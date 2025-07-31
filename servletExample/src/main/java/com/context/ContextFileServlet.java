package com.context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextFile")
public class ContextFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();

		InputStream is = context.getResourceAsStream("/WEB-INF/config/init.txt");
		// 특정 경로에 있는 파일을 읽기 위한 InputStream으로 가져옴
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(is));

		String menu = null;
		String menu_member = null;
		String menu_order = null;
		String menu_goods = null;

		// buffer는 보통 bufferReader 타입 객체
		// readLine()메서드는 한 줄씩 문자열을 읽어서 반환
		// 읽을 줄이 없다면 null 반환
		while ((menu = buffer.readLine()) != null) {
			// buffer.readLine()이 null이 아니면 true
			// 아직 읽을 줄이 남아 있다는 뜻
			StringTokenizer tokens = new StringTokenizer(menu, ",");
			menu_member = tokens.nextToken();
			menu_order = tokens.nextToken();
			menu_goods = tokens.nextToken();

		}

		// 만약 속성으로 설정한 회원이름이 필요하다면
		List<String> member = (List<String>) context.getAttribute("member");

		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8' />");
		out.println("<title>ServletContext 예제</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body><h3>[init.txt 파일로 부터 읽은 데이터]</h3><p>");

		out.println(menu_member + "<br />");
		out.println(menu_order + "<br />");
		out.println(menu_goods + "<br/>");

		out.println("<div><h3>[회원 이름 출력] </h3><div>");
		for (int i = 0; i < member.size(); i++) {
			out.println(member.get(i) + "<br/>");
		}
		out.print("</body></html>");
		out.close();
	}

}
