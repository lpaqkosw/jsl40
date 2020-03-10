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

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BoardDAO bdao = new BoardDAO();
		GuestDAO gdao = new GuestDAO();
		int bcnt = bdao.boardCount();
		List<BoardVO> blist = bdao.indexBoardList(bcnt);
		List<GuestVO> glist = gdao.indexGuestList();
		request.setAttribute("blist", blist);
		request.setAttribute("glist", glist);
		System.out.println(blist.size());
		RequestDispatcher rd = request.getRequestDispatcher("Index/index.jsp");
		rd.forward(request, response);
	}

	/**r
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		request.setCharacterEncoding("utf-8");
		 
		IndexDAO dao = new IndexDAO();
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		MemVO vo = dao.loginIndex(userid, passwd);
		if(!vo.getName().equalsIgnoreCase("-1")) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(60*60);
			session.setAttribute("userName", vo.getName());			
		}
		
		request.setAttribute("logincheck", vo.getName());
		RequestDispatcher rd = request.getRequestDispatcher("Index/index.jsp");
		rd.forward(request, response);
		
		*/
		doGet(request, response);
	}

}
