package com.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.board.service.BoardService;
import com.mvc.board.service.BoardServiceImpl;
import com.mvc.board.vo.BoardVO;
import com.mvc.common.controller.Controller;

public class PasswdCheckController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		BoardVO vO = new BoardVO();
		
		vO.setNum(Integer.parseInt(request.getParameter("num")));
		vO.setPasswd(request.getParameter("passwd"));
		
		BoardService service = BoardServiceImpl.getInstance();
		int result = service.boardPasswdCheck(vO);
		
		
		request.setAttribute("resultData", result);
		
		return "/common/resultData";
	}

}
