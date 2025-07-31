package com.mvc.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.board.service.BoardService;
import com.mvc.board.service.BoardServiceImpl;
import com.mvc.board.vo.BoardVO;
import com.mvc.common.controller.Controller;


public class GetBoardListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		BoardService service = BoardServiceImpl.getInstance();
		// 보통 인터페이스형으로 변수 초기화한다
		List<BoardVO> list = service.boardList();
		// 게시판 조회
		
		request.setAttribute("list", list);
		// JSP 페이지에서는 표현언어인 ${list} 로 사용하면 된다
		
		return "/board/getBoardList";
	}

}
