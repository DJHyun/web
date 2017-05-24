package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 원래 등록되어 있던 글 정보들을 파라미터로 받아오는 서블릿
 * @author SaeromCho
 *
 */
public class ModifyController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. 요청파라미터 조회
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String date = req.getParameter("date");

		System.out.println(title);
		
		req.setAttribute("date", date);
		req.setAttribute("title", title);
		req.setAttribute("content", content);
		
		//.
		req.getRequestDispatcher("/SelectController").forward(req, resp);
		System.out.println("요청값조회완료");
	}
}
