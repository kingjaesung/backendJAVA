package com.mvc.common.controller;

import java.util.HashMap;
import java.util.Map;

import com.mvc.board.controller.DetailBoardController;
import com.mvc.board.controller.GetBoardListController;
import com.mvc.board.controller.InsertBoardController;
import com.mvc.board.controller.InsertFormController;
import com.mvc.board.controller.UpdateFormController;

public class HandlerMapping {

	private Map<String, Controller> mappings;

	public HandlerMapping() { 

		mappings = new HashMap<String, Controller>();
		// 매핑 정보 (key) 구현 클래스(value)
		mappings.put("/board/getBoardList.do", new GetBoardListController());
		// 게시판 조회
		mappings.put("/board/insertForm.do", new InsertFormController());
		// 입력화면
		mappings.put("/board/insertBoard.do", new InsertBoardController());
		// 입력화면
		mappings.put("/board/detailBoard.do", new DetailBoardController());
		// 게시판 상세화면
		mappings.put("/board/updateForm.do", new UpdateFormController());
		
	}

	public Controller getController(String path) {
		return mappings.get(path);
	}
}
