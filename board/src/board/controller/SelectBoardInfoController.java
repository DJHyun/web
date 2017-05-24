package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectBoardInfoController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String date = req.getParameter("date");
		int id = Integer.parseInt(req.getParameter("id"));
		
		req.setAttribute("id", id);
		req.setAttribute("date", date);
		req.setAttribute("title", title);
		req.setAttribute("content", content);
		req.getRequestDispatcher("/boardInfo.jsp").forward(req, resp);
	}
}
