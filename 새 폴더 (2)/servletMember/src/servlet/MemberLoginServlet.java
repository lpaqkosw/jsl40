package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;
import model.MemberVO;

/**
 * Servlet implementation class MemberLoginServlet
 */
@WebServlet("/userlogin_form")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if (null != request.getSession().getAttribute("user"))
		{
			//response.sendRedirect("userinfo_list");
			response.getWriter().print("<script>location.href='userinfo_list'</script>");
		}
		else
			request.getRequestDispatcher("Member/userlogin_form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");

		HttpSession session = request.getSession();
		
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.memberLogin(userid, passwd);

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		if (vo == null)
			out.print("<script>alert('아이디 없음');location.href='userlogin_form';</script>");
		else if (vo.getPasswd() == null)
			out.print("<script>alert('비번 오류');location.href='userlogin_form';</script>");
		else
		{
			session.setAttribute("user", vo);
			session.setMaxInactiveInterval(30 * 60);
			
			response.sendRedirect("userinfo_list");
		}
	}
}
