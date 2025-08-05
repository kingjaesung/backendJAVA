package com.mvc.board.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.board.service.BoardService;
import com.mvc.board.service.BoardServiceImpl;
import com.mvc.board.vo.BoardVO;
import com.mvc.common.controller.Controller;


public class UpdateBoardContriller implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		 
		String path = "";
		
		String passwd = request.getParameter("passwd");
		if(passwd.isEmpty()) passwd = "";
		
		BoardVO vO = new BoardVO();
		vO.setNum(Integer.parseInt(request.getParameter("num")));
		vO.setTitle(request.getParameter("title"));
		vO.setContent(request.getParameter("content"));
		vO.setPasswd(passwd);
		
		
		BoardService service = BoardServiceImpl.getInstance();
		
		int result = service.boardUpdate(vO);
		
		if(result == 1) {
			path = "/board/detailBoard.do?num=" + vO.getNum(); 
		} else {
			path = "/error/errorPage";
		}
		
		return path;
	}

}
