package com.mvc.board.service;

import java.util.List;

import com.mvc.board.dao.BoardDAO;
import com.mvc.board.vo.BoardVO;


// 비지니스 로직은 서비스에서 정의가 곧 힘이다
public class BoardServiceImpl implements BoardService {
	private static BoardServiceImpl service = null;
	private BoardDAO dao;

	

	private BoardServiceImpl() {
		super();
		dao = BoardDAO.getInstance();
	}
	
	public static BoardServiceImpl getInstance () {
		if (service == null) {
			service = new BoardServiceImpl();
		}
		return service;
	}
	
	@Override
	public List<BoardVO> boardList() {
		List<BoardVO> list = dao.boardList();
		// 게시판 조회 기능 삽입
		return list;
	}

	@Override
	public int boardinsert(BoardVO VO) {
		int result = dao.boardInsert(VO);
		return result;
	}

	@Override
	public void readcntUpdate(BoardVO VO) {
		dao.readCount(VO);
		
	} 

	@Override
	public BoardVO boardDetail(BoardVO VO) {
		System.out.println("boardDetail 실행 되나");
		BoardVO board = dao.boardDetail(VO); 
		board.setContent(board.getContent().replaceAll("\n", "<br/ >"));
		return board; 
	}

	@Override
	public BoardVO updateForm(BoardVO VO) {
		BoardVO board = dao.boardDetail(VO);
		return board;
	}
	
	
	
	

}
