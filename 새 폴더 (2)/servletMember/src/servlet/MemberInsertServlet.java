package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;

/**
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/userinfo_insert")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("Member/userinfo_insert.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("UTF-8");
		MemberVO vo = new MemberVO();
		
		vo.setName(request.getParameter("name"));
		vo.setUserid(request.getParameter("userid"));
		vo.setPasswd(request.getParameter("passwd"));
		vo.setGubun(request.getParameter("gubun"));
		vo.setZipcode(request.getParameter("zip"));
		vo.setAddr1(request.getParameter("addr1"));
		vo.setAddr2(request.getParameter("addr2"));
		vo.setTel(request.getParameter("tel"));
		vo.setEmail(request.getParameter("email"));
		vo.setJob(request.getParameter("job"));
		vo.setIntro(request.getParameter("intro"));
		
		String favs[] = request.getParameterValues("fa");
		String favsm = null;
		
		if (null != favs)
		{
			favsm = favs[0];
			
			for (int i = 1; i < favs.length; ++i)
				favsm += "," + favs[i];
		}
		
		
		vo.setFavor(favsm);
		boolean result = new MemberDAO().memberInsert(vo);

		if (!result)
		{
			response.getWriter().print("<script>alert('오류');history.back();</script>");
		}
		else
		{
			response.sendRedirect("userinfo_list");
		}
	}

}
