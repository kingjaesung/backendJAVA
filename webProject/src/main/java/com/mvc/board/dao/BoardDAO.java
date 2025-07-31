package com.mvc.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mvc.board.vo.BoardVO;
import static com.mvc.common.util.DBUtil.getConnection;

public class BoardDAO {
	private static BoardDAO instance = null;

	public static BoardDAO getInstance() {
		if (instance == null) {
			instance = new BoardDAO();
		}
		return instance;
	}

	private BoardDAO() {
	};

	// 게시판 입력 메서드
	private BoardVO addBoard(ResultSet rs) throws SQLException {
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(rs.getInt("num"));
		boardVO.setAuthor(rs.getString("author"));
		boardVO.setTitle(rs.getString("title"));
		boardVO.setWriteday(rs.getString("writeday"));
		boardVO.setReadcnt(rs.getInt("readcnt"));
		return boardVO;
	}

	// 게시판 조회 메서드
	public List<BoardVO> boardList() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		StringBuilder query = new StringBuilder();

		// StringBuilder = 문자열을 빠르게 추가/ 수정할 수 있는 클래스

		// String 은 불변 이지만 StringBuilder 는 가변 객체
		// writday - date 타입 칼럼
		// TO_CHAR() 날짜나 숫자를 문자열로 바꿔주는 함수
		// YYYY/MM/DD 날짜 방식 지정

		query.append("SELECT num, author, title, ");
		query.append("to_char(writeday, 'YYYY/MM/DD') writeday, readcnt ");
		// to_char(writeday, 'YYYY//MM/DD')
		query.append("FROM board ");
		query.append("order by num desc");
		// desc 내림차순 정렬

		try (Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(query.toString());
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {
				list.add(addBoard(rs));
			}

		} catch (Exception e) {
			System.err.println("[boardList] SQL 오류 : " + e.getMessage());
		}
		return list;
	}

	public int boardInsert(BoardVO boardVO) {
		/*
		 * String query = """ INSERT INTO board (num, author, title, content, passwd)
		 * VALUES (board_seq.nextval, ?, ?, ?, ?) """;
		 */

		StringBuilder query = new StringBuilder();
		query.append("INSERT INTO board(num, author, title, content, passwd) ");
		query.append("VALUES(board_seq.nextval, ?, ?, ?, ?)");

		int result = 0;

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query.toString())) { // 주석
																														// 부분을
																														// 해제하고
																														// 사용한다면
																														// query.toString()
																														// ->
																														// query로
																														// 변경.

			pstmt.setString(1, boardVO.getAuthor());
			pstmt.setString(2, boardVO.getTitle());
			pstmt.setString(3, boardVO.getContent());
			pstmt.setString(4, boardVO.getPasswd());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("[boardInsert] SQL 오류: " + e.getMessage());
			// e.printStackTrace(); //오류 발생 시 주석 해제
		}
		return result;
	}

	public void readCount(BoardVO VO) {
		StringBuilder query = new StringBuilder();
		query.append("UPDATE board SET readcnt = readcnt + 1 ");
		query.append("WHERE num =? ");

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query.toString());) {
			pstmt.setInt(1, VO.getNum());
			pstmt.executeUpdate();
			// SQL의 Insert,Update,Delete 같은 변경 작업 실행시
			// 영향을 받은 행의 수를 반환

		} catch (Exception e) {
			System.err.println("[readCount] SQL 오류 :" + e.getMessage());
		}

	}

	public BoardVO boardDetail(BoardVO VO) {
		System.out.println("addBoard 되나");
		StringBuilder query = new StringBuilder();
		query.append("SELECT num, author, title, content, ");
		query.append("TO_CHAR(writeday, 'YYYY-MM-DD HH24:MI:SS') writeday, readcnt ");
		query.append("FROM board WHERE num = ?");

		BoardVO resultData = null;

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(query.toString());) {
			pstmt.setInt(1, VO.getNum());
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					resultData = addBoard(rs);					
					resultData.setContent(rs.getString("content"));
					
				}
			}

		} catch (Exception e) {
			System.err.println("[boardDetail] SQL 오류 :" + e.getMessage());
		}
		System.out.println(resultData);
		return resultData;
	}

}
