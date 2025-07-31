package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionTest")
public class SessionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset = utf-8");

		PrintWriter out = response.getWriter();

		String param = request.getParameter("param");
		String msg = null;
		HttpSession session = null;

		// 최초 실행시
		if (param == null) {
			out.print("값은 create, delete, add, remove, replace 중 하나를 선택해 주세요. <br />");
			out.print("요청 URL은 http://localhost:8080/servletExample/sessionTest?param=값을 명시해 주세요.");
			return;
		}

		
		if(param.equals("create")) {
			session = request.getSession(); 
			//기존 세션 객체 존재시 기존 섹션 반환. 없을시 객체 생성 후 반환
			if(session.isNew()) {
				//클라이언트가 서버에 처음 요청해서
				//isNew() = 새 세션이 만들어 졌으면 true
				//기전에 만들어진 세션이 있으면 false 반환
				msg = "새로운 세션 객체 리턴";
			} else {
				msg = "기존의 새션 객체 리턴";
			}
		} else if (param.equals("delete")) {
			session = request.getSession(false);
			// 기존 세션 객체 존재시 반환 . 없으면 null
			if(session != null) {
				session.invalidate();
				// invalidate() 현재 생성된 세션을 무효화 시킴
				// 즉 현재 세션을 삭제 (로그아웃 할때 사용)
				msg = "세션 객체 삭제 작업 완료";
			} else {
				msg = "삭제할 세션 존재하지 않음";
			}
		} else if (param.equals("add")) {
			session = request.getSession();
			//기존 세션 객체 존재시 반환 없으면 null;
			//새션 객체에 속성 추가(바인딩) 로그인 정보 세션에 저장
			// 바인딩 = 특정 영역에 데이터를 저장하는 것 
			session.setAttribute("msg", "메시지 입니다");
			msg = "세션 객체에 데이터(속성) 등록 완료";
		} else if (param.equals("get")) {
			session = request.getSession(false);
			// 기존 세션 객체 존재시 반환 없으면 null;
			if (session != null) {
				String str = (String) session.getAttribute("msg");
				// 세션 정보를 읽어 올때
				msg = str;
			}else {
				msg = "데이터 (솏성)를 추출할 세션 객체 존재하지 않음";
			}
		}  else if (param.equals("remove")) {
			session = request.getSession(false );
			//기존 세션 객체 존재시 반환 없으면 null 반환
			if(session != null) {
				session.removeAttribute("msg");
				//특정 세션값만 삭제할 때
				msg = "세션 객체의 데이터 (속성) 삭제 완료";
			} else {
				msg = "데이터 (속성)를 삭제할 세션 객체 존재하지 않음";
			}
		} else if (param.equals("replace")) {
			session = request.getSession();
			session.setAttribute("msg", "새로운 메시지입니다");
			msg = "세션 객체에 데이터 (속성) 등록 완료";
		}
		
		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
		out.print("<link href='/servletExample/image/icon.png' rel='icon' type='image/x-icon' />");
		out.println("<title>세션 객체 </title></head><body>");
		
		out.print("처리결과 : " + msg ) ;
		out.println("</body></html>");
		out.close();
		
	}

}
