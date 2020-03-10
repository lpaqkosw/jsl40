package servlet.index;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemDAO;
import model.MemVO;

/**
 * Servlet implementation class UserDeleteServlet
 */
@WebServlet("/userDelete")
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		MemDAO dao = new MemDAO();
		MemVO vo = dao.memSelect((int)session.getAttribute("userIdx"));
		request.setAttribute("userId", vo.getUserid());
		RequestDispatcher rd = request.getRequestDispatcher("Index/index_delete.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		MemDAO dao = new MemDAO();
		String userId = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		int idx = (int)session.getAttribute("userIdx");
		int row = dao.memDelete(userId, passwd, idx);
	
		if(row == 1) {
			session.invalidate();
		}
		request.setAttribute("row", row);
		RequestDispatcher rd = request.getRequestDispatcher("Index/index_delete_pro.jsp");
		rd.forward(request, response);
	}

}
