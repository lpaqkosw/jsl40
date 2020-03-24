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

public class BoardSearchAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option = request.getParameter("search");
		String key = request.getParameter("key");
		
		
		int currentPage = 1;
		int maxlist = 10;
		int totpage = 1;
		int totcount = BoardDAO.getInstance().countSearchListBoard(option, key);
		if(totcount%maxlist ==0) {
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
		String pageList = PageIndex.pageList(currentPage, totpage, "Board?command=board_search&search="+option+"&key="+key+"&", "");
		List<BoardVO> list = BoardDAO.getInstance().searchListBoard(option, key, startlist, endlist);
//		System.out.println("\nlist size= "+list.size());
//		System.out.println("currentPage= "+currentPage);
//		System.out.println("totPage= "+totpage);
//		System.out.println("startlist= "+startlist);
		
		request.setAttribute("totcount", totcount);
		request.setAttribute("list", list);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("listcount", listcount);
		request.setAttribute("pageList", pageList);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Board/board_list.jsp");
		rd.forward(request, response);
		
	}
}
