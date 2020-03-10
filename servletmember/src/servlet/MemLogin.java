package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemDAO;
import model.MemVO;

/**
 * Servlet implementation class MemLogin
 */
@WebServlet("/MemLogin")
public class MemLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Member/userlogin_form.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		MemDAO dao = new MemDAO();
		int row =0;
		String userid = request.getParameter("userid");
		if(userid.equals("")) {
			row = 1;
		}
		String passwd = request.getParameter("passwd");
		if(passwd.equals("")) {
			row = 2;
		}
		MemVO vo = dao.memLogin(userid, passwd);
		request.setAttribute("userid", vo.getUserid());
		request.setAttribute("passwd", vo.getPasswd());
		request.setAttribute("row", row);
		if(row == 0) {
			RequestDispatcher rd = request.getRequestDispatcher("Member/userlogin_ok.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Member/userlogin_pro.jsp");
			rd.forward(request, response);			
		}
		}
	}


