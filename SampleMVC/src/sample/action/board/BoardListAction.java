package sample.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;
import sample.model.board.BoardVO;
import sample.util.PageIndex;

public class BoardListAction implements Action{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BoardDAO dao = BoardDAO.getInstance();
		
		int currentPage = 1;
		int maxlist= 10;
		int totpage = 1;
		int totcount = dao.countBoard();
		if(totcount%maxlist == 0) {
			totpage = totcount/maxlist;
		}
		else {
			totpage = totcount/maxlist +1;
		}
		if(request.getParameter("page") != null) {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}
		
		int startlist = (currentPage -1) * maxlist;
		int endlist = (currentPage * maxlist);
		int listcount = totcount - ((currentPage -1)* maxlist);
		String pageList = PageIndex.pageList(currentPage, totpage, "Board?command=board_list&", "");
	
		List<BoardVO> list = dao.listBoard(startlist, endlist);
		request.setAttribute("totcount", totcount);
		request.setAttribute("list", list);
		request.setAttribute("listcount", listcount);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageList", pageList);
		request.setAttribute("currentPage", currentPage);
		
		RequestDispatcher rd = request.getRequestDispatcher("Board/board_list.jsp");
		rd.forward(request, response);
		
	}
}
