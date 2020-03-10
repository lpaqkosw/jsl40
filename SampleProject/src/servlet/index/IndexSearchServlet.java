package servlet.index;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardVO;
import model.GuestDAO;
import model.GuestVO;
import model.IndexDAO;
import util.PageIndex;

/**
 * Servlet implementation class IndexSearchServlet
 */
@WebServlet("/index_search")
public class IndexSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		IndexDAO dao = new IndexDAO();
		String genre = request.getParameter("genre");
		String item = request.getParameter("item");
		String key = request.getParameter("key");
		int nowpage = 1; // current page
		int maxlist= 10; // list per page
		int totpage = 1;
		int totcount = dao.indexBoardSearchCnt(genre, item, key);
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
		List<BoardVO> blist;
		List<GuestVO> glist;
		String uri="";
		if(genre.equals("board")) {
			BoardDAO bdao = new BoardDAO();
			blist = bdao.boardSearchList(startlist, endlist, item, key);	
			request.setAttribute("list", blist);
			uri = "Board/board_list_tmp.jsp";
		}
		else {
			GuestDAO gdao = new GuestDAO();
			glist = gdao.guestSearchList(startlist, endlist, item, key);
			request.setAttribute("list", glist);
			uri = "Index/index_guest.jsp";
		}
		String pageSkip = PageIndex.pageList(nowpage, totpage, genre, "");
		request.setAttribute("cnt", totcount);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
