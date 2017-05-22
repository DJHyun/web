package board.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import board.dao.impl.BoardDaoImpl;
import board.util.SqlSessionFactoryManager;
import board.vo.Board;

public class ListController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int movieId = Integer.parseInt(req.getParameter("movie")); 
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		int score = Integer.parseInt(req.getParameter("score"));
		

		
		BoardDaoImpl daoImpl = BoardDaoImpl.getInstance();
		SqlSession session = null;
		int cnt = 0; //변경 row 수를 저장할 변수
		try {
			//TX 처리 시작 - 업무 시작
			session = SqlSessionFactoryManager.getInstance().getSqlSessionFactory().openSession();
			
		   cnt = daoImpl.insertBoard(session, new Board(1,title,new Date(),content,score,20,"현동준",movieId));
		   System.out.println(cnt);
		   session.commit();
		}finally{
			session.close();
		}
}
}
