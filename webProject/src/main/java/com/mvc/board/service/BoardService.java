package com.mvc.board.service;

import java.util.List;

import com.mvc.board.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> boardList();

	public int boardinsert(BoardVO vO);

	public void readcntUpdate(BoardVO vO);

	public BoardVO boardDetail(BoardVO vO);

	public BoardVO updateForm(BoardVO vO);
	
}
