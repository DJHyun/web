package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import board.vo.Board;

public interface BoardDao {

	/**
	 * 게시판 등록  메소드
	 * @param session
	 * @param board
	 * @return
	 */
	int insertBoard(SqlSession session, Board board);
	
	/**
	 * 게시판 id 시퀀스 사용 메소드
	 * @param session
	 * @param board
	 * @return
	 */
	int insertBoardSeq(SqlSession session, Board board);
	
	/**
	 * 게시판 수정 메소드
	 * @param session
	 * @param board
	 * @return
	 */
	int updateBoard(SqlSession session, Board board);
	
	/**
	 * 게시판 삭제 메소드
	 * @param session
	 * @param board
	 * @return
	 */
	int deleteBoard(SqlSession session, Board board);
	
	/**
	 * 게시판 조회 메소드
	 * @param session
	 * @return
	 */
	List<Board> selectBoardList(SqlSession session);
	
	/**
	 * 
	 * @param session
	 * @param beginItemNo : 보려는 페이지의 시작 item 번호
	 * @param endItemNo : 보려는 페이지의 마지막 item 번호
	 * @return
	 */
	List<Board> selectPagingList(SqlSession session, int beginItemNo, int endItemNo);

	/**
	 * item_tb의 총 레코드 수를 조회
	 * @param session
	 * @return
	 */
	int selectBoardCount(SqlSession session);
}
