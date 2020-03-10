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
 * Servlet implementation class UserModifyServlet
 */
@WebServlet("/userModify")
public class UserModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		int idx = (int)session.getAttribute("userIdx");
		MemDAO dao = new MemDAO();
		MemVO vo = new MemVO();
		System.out.println(idx);
		vo=dao.memSelect(idx);
		request.setAttribute("vo", vo);
		RequestDispatcher rd = request.getRequestDispatcher("Index/index_modify.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session =request.getSession();
		int idx = (int)session.getAttribute("userIdx");
		MemVO vo = new MemVO();
		vo.setUserid(request.getParameter("userid"));
		vo.setPasswd(request.getParameter("passwd"));
		vo.setName(request.getParameter("name"));
		vo.setGubun(request.getParameter("gubun"));
		vo.setZipcode(request.getParameter("zip"));
		vo.setAddr1(request.getParameter("addr1"));
		vo.setAddr2(request.getParameter("addr2"));
		vo.setTel(request.getParameter("tel"));
		vo.setEmail(request.getParameter("email"));
		String[] arr = request.getParameterValues("fa");
		StringBuilder sb = new StringBuilder();
		if(arr.length != 0) {
			sb.append(arr[0]);
		}
		for(int i = 1; i<arr.length;i++) {
			sb.append(", "+arr[i]);
		}
		vo.setFavorite(sb.toString());
		vo.setJob(request.getParameter("job"));
		vo.setIntro(request.getParameter("intro"));
		
		MemDAO dao = new MemDAO();
		int row = dao.memUpdate(vo, idx);
		if(row == 1) {
			session.invalidate();
		}
		request.setAttribute("row", row);
		RequestDispatcher rd = request.getRequestDispatcher("Index/index_modify_pro.jsp");
		rd.forward(request, response);
	}

}
