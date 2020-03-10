package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemInsertServlet
 */
@WebServlet("/insert.do")
public class MemInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Member/userinfo_insert.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String repasswd = request.getParameter("repasswd");
		String gubun = request.getParameter("gubun");
		if(gubun==null)
		{
			gubun="3";
		}
		String zip = request.getParameter("zip");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String[] fa = request.getParameterValues("fa");
		String fastr = "asdf";
		if(fa!=null) {
			fastr=fa[0];
			for(int i = 1; i < fa.length; i++) {
				fastr = fastr+ ", "+fa[i];
			}
		}
		
		String job = request.getParameter("job");
		if(job==null) {
			job = "0";
		}
		String intro = request.getParameter("intro");
		
		request.setAttribute("name", name);
		request.setAttribute("userid", userid);
		request.setAttribute("passwd", passwd);
		request.setAttribute("repasswd", repasswd);
		request.setAttribute("gubun", gubun);
		request.setAttribute("zip", zip);
		request.setAttribute("addr1", addr1);
		request.setAttribute("addr2", addr2);
		request.setAttribute("tel", tel);
		request.setAttribute("email", email);
		request.setAttribute("fa", fastr);
		request.setAttribute("job", job);
		request.setAttribute("intro", intro);
		
		//db 저장
		request.setAttribute("row", 0);
		RequestDispatcher rd = request.getRequestDispatcher("Member/userinfo_modify.jsp");
		rd.forward(request, response);
	}

}
