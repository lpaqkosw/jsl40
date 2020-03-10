package servlet.Guest;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardVO;
import model.GuestDAO;
import model.GuestVO;
import util.PageIndex;

/**
 * Servlet implementation class Guest
 */
@WebServlet("/Guest")
public class GuestListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		GuestDAO dao = new GuestDAO();
		
		int nowpage = 1; // current page
		int maxlist= 10; // list per page
		int totpage = 1;
		int totcount = dao.guestCount();
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
		
		List<GuestVO> list = dao.guestList(startlist, endlist);
		String pageSkip = PageIndex.pageList(nowpage, totpage, "Guest", "");
		request.setAttribute("cnt", totcount);
		request.setAttribute("list", list);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		request.setAttribute("list", list);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Index/index_guest.jsp");
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