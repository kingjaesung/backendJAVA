package com.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.board.service.BoardService;
import com.mvc.board.service.BoardServiceImpl;
import com.mvc.board.vo.BoardVO;
import com.mvc.common.controller.Controller;

public class DetailBoardController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String num = request.getParameter("num"); //input 태그의 num 을 명시
		BoardVO VO = new BoardVO();
		VO.setNum(Integer.parseInt(num));

		BoardService service = BoardServiceImpl.getInstance();
		service.readcntUpdate(VO);

		BoardVO board = service.boardDetail(VO);

		request.setAttribute("detail", board);

		return "/board/detailBoard" ;

	}

}
