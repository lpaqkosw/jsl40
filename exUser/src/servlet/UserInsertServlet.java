package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import KISA.SHA256;
import model.UserDAO;
import model.UserVO;
import sun.misc.BASE64Encoder;

/**
 * Servlet implementation class UserInsertServlet
 */
@WebServlet("/user_insert")
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String veripass;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
			
		RequestDispatcher rd = request.getRequestDispatcher("User/user_insert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		UserVO vo = new UserVO();
		String email = request.getParameter("email1")+"@"+request.getParameter("email2");
		String pass = request.getParameter("passwd");
		SHA256 hash = new SHA256(pass.getBytes());
		BASE64Encoder base = new BASE64Encoder();
		vo.setPasswd(base.encode(hash.GetHashCode()));
		vo.setEmail(email);
		vo.setName(request.getParameter("name"));
		vo.setTel(request.getParameter("tel"));
		vo.setUserid(request.getParameter("userid"));
		
		
		
	}

}
