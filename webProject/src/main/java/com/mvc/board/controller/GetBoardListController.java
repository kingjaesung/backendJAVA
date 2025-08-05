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
		
		String search = request.getParameter("search");
		// 게시판 레코드 검색 시 검색 할 대상과 단어를 인자값으로 전달
		
		if(search == null) {
			// 최초 요청시  null값 처리
			search = "all";
			// search 값이 null이면 전체 조회
		}
		
		BoardVO vO = new BoardVO();
		
		vO.setSearch(search);
		vO.setKeyword(request.getParameter("keyword"));
		
		BoardService service = BoardServiceImpl.getInstance();
		// 보통 인터페이스형으로 변수 초기화한다
		List<BoardVO> list = service.boardList(vO);
		// 게시판 조회

		request.setAttribute("list", list);
		// JSP 페이지에서는 표현언어인 ${list} 로 사용하면 된다

		return "/board/getBoardList";
	}

}
