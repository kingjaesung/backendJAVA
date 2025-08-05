package com.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.board.service.BoardService;
import com.mvc.board.service.BoardServiceImpl;
import com.mvc.board.vo.BoardVO;
import com.mvc.common.controller.Controller;

public class UpdateFormController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		String num = request.getParameter("num"); //input 태그에서 name가 num을 명시

		BoardVO VO = new BoardVO();
		VO.setNum(Integer.parseInt(num));

		BoardService service = BoardServiceImpl.getInstance();
		BoardVO board = service.updateForm(VO);

		request.setAttribute("updateData", board);

		return "/board/updateForm";
	}

}
