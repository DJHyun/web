package board.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import board.dao.BoardDao;
import board.vo.Board;

public class BoardDaoImpl implements BoardDao{
	private static BoardDaoImpl daoImpl = new BoardDaoImpl();
	public static BoardDaoImpl getInstance(){
		return daoImpl;
	}
	private BoardDaoImpl(){}
	
	@Override
	public int insertBoard(SqlSession session, Board board) {
		return session.insert("board.config.mapper.boardMapper.insertBoard",board);
	}

	@Override
	public int insertBoardSeq(SqlSession session, Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(SqlSession session, Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(SqlSession session, Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Board> selectBoardList(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> selectPagingList(SqlSession session, int beginItemNo, int endItemNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectBoardCount(SqlSession session) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
