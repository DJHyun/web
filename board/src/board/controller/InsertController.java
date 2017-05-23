package board.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.impl.BoardServiceImpl;
import board.vo.Board;

public class InsertController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int movieId = Integer.parseInt(req.getParameter("movie"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		int score = Integer.parseInt(req.getParameter("score"));
		String memberId = req.getParameter("memberId");
		
		BoardServiceImpl service = BoardServiceImpl.getInstance();  
		String message = service.InsertBoardService(new Board(1,title,new Date(),content,score,0,memberId,movieId));
		
		req.setAttribute("message", message);
		req.getRequestDispatcher("/SelectController").forward(req, resp);
		System.out.println(message);
	}
}
//뷰 -> 서블릿(controller) -> 서비스 -> daoImpl -> vo(db) -> 