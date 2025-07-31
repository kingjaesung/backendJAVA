package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.subject.SubjectDAO;
import com.subject.SubjectVO;

/**
 * Servlet implementation class StudentDataCheck
 */
@WebServlet("/studentCheck")
public class StudentDataCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		// 클라이언트가 보낸 데이터(파라미터)의 인코딩방식을 UTF-8로 설정
		
		response.setContentType("text/plain; charset=UTF-8");
		// 클라이언트(브라우저)에게 보낼 응답의 타입과 문자 인코딩 설정
		//text/plain << 그냥 텍스트 태그써도 문자로 출력
		
		PrintWriter out = response.getWriter();
		
		
		String subjectNumber = request.getParameter("subjectNumber");
		SubjectVO vo = new SubjectVO();
		vo.setSubjectNumber(subjectNumber);
		
		
		
		
		SubjectDAO dao = SubjectDAO.getInstance();
		int count = dao.studentDataCheck(vo);
		
		out.print(count);
		
		

	}

}
