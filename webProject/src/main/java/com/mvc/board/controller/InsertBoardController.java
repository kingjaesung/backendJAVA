package com.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.board.service.BoardService;
import com.mvc.board.service.BoardServiceImpl;
import com.mvc.board.vo.BoardVO;
import com.mvc.common.controller.Controller;

public class InsertBoardController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String path = null;

		BoardVO VO = new BoardVO();
		VO.setTitle(request.getParameter("title")); // input 태그의 name명 명시
		VO.setAuthor(request.getParameter("author"));
		VO.setContent(request.getParameter("content"));
		VO.setPasswd(request.getParameter("passwd"));
		System.out.println(VO);
		BoardService service = BoardServiceImpl.getInstance();
		int result = service.boardinsert(VO);

		if (result == 1) { // 입력 성공시
			System.out.println("입력성공");
			path = "/board/getBoardList.do"; // 게시판 리스트 요청
		} else {
			request.setAttribute("errorMsg", "등록완료에 문제가 있어 잠시 후 다시 입력해 주세요");
			path = "/board/insertForm"; // 입력화면이동
		}

		// 3 화면 네비게시션
		return path;
	}

}
