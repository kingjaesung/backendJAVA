package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		// HttpSession = 서블릿에서 세션정보를 저장,관리하는 인터페이스
		//getSession() = 기존 세션 객체 존재시 반환 없으면 객 체 생성
		//getSession(false) = 기존 세션 객체 존재시 반환, 없으면 null 반환
		
		out.println("<!DOCTYPE html><html>");
	    out.println("<head><meta charset='UTF-8' />");
	    out.println("<title>session 객체의 메서드 예제</title>");
	    out.println("<link rel='icon' href='data:,'></head>");
	    out.println("<body>");
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    out.println("세션 아이디 : " + session.getId() + "<br/>");
	    out.println("최초 세션 생성 시각 : "+ sdf.format(new Date(session.getCreationTime()))+"<br/>");
	    //getCreationTime() = 최초 세션 만들어진 시간
	    out.println("최근 세션 접근 시각 : " + sdf.format(new Date(session.getLastAccessedTime())) +"<br/>");
	    // getLastAccessedTime() 마지막 세션 접근 시간
	    out.println("세션 유효 시간 : " + session.getMaxInactiveInterval() + "<br / >");
	    // getMaxInactiveInterval() = 세션의 유효시간을 가져오는 메서드(기본 1800초)
	    if(session.isNew()) {
	    	out.println("새 세션이 만들어 졌습니다");
	    }
	    out.println("</body></html>");
	    out.close();
	
	}

}
