package exam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScoreServlet
 */
@WebServlet("/score")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		request.setCharacterEncoding("UTF-8");
		
		int score = Integer.parseInt(request.getParameter("scoreInput"));
		
		String grade = "";
		
		
		
		int switchScore = score/10;
		
		switch(switchScore) {
		case 10: case 9:
			grade = "A";
			break;
		case 8: 
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade ="F";
		}
		
		
		request.setAttribute("grade", grade); 
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/score1.jsp");
		dispatcher.forward(request, response);
	}

}
