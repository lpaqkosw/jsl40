package board.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDAO;
import board.model.BoardVO;
import board.util.PageIndex;

/**
 * Servlet implementation class BoardListServlet
 */
@WebServlet("/board_list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();

		int nowpage = 1; // current page
		int maxlist= 10; // list per page
		int totpage = 1;
		int totcount = dao.boardCount();
		if(totcount%maxlist ==0) {
			totpage = totcount/maxlist;
		}
		else {
			totpage = totcount/maxlist +1;
		}
		
		if(request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page"));
		}
		
		int startlist = (nowpage -1)*maxlist;
		int endlist = (nowpage * maxlist);
		int listcount = totcount - ((nowpage-1)*maxlist);
		
		List<BoardVO> list = dao.boardList(startlist, endlist);
		String pageSkip = PageIndex.pageList(nowpage, totpage, "board_list", "");
		request.setAttribute("cnt", totcount);
		request.setAttribute("list", list);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		RequestDispatcher rd = request.getRequestDispatcher("Board/board_list.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BoardDAO dao = new BoardDAO();
		String search = request.getParameter("search");
		String key = request.getParameter("key");
		List<BoardVO> list = dao.boardSearch(search, key);
		int cnt = dao.boardCount(search, key);
		request.setAttribute("list", list);
		request.setAttribute("cnt", cnt);
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		RequestDispatcher rd = request.getRequestDispatcher("Board/board_list.jsp");
		rd.forward(request, response);
		
	}

}
