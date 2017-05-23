package board.service;

import java.util.Map;

import board.vo.Board;

public interface BoardService {
	
	/**
	 * 등록하는 Service
	 * @param board
	 * @return
	 */
	String InsertBoardService(Board board);
	
	/**
	 * 수정하는 Service
	 * @param board
	 * @return
	 */
	String UpdateBoardService(Board board);
	
	/**
	 * 삭제하는 Service
	 * @param boardId
	 * @return
	 */
	int deleteBoardService(int boardId);
	
	/**
	 * 조회하는 Sercive
	 * @return
	 */
	String selectBoardListService();
	
	/**
	 * page 기준으로 board들을 조회하는 메소드.
	 * @param page 보려는 페이지
	 * @return Map 내에 그 페이지에서 보여줄 board들을 담은 List와 PaingBean 객체를 리턴
	 */
	Map<String, Object> getBoardList(int page);
	
	
	

}
