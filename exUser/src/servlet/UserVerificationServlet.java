package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import KISA.SHA256;
import sun.misc.BASE64Encoder;
import util.EmailVerification;

/**
 * Servlet implementation class UserVerificationServlet
 */
@WebServlet("/user_verification")
public class UserVerificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserVerificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		EmailVerification ev = new EmailVerification();
		String email = request.getParameter("email1")+"@"+request.getParameter("email2");
		String pass = request.getParameter("passwd");
		System.out.println(pass);
		SHA256 hash = new SHA256(pass.getBytes());
		BASE64Encoder base = new BASE64Encoder();
		String shapass = base.encode(hash.GetHashCode());
		String lastpass = shapass.substring(0,5);
		ev.sendMail(email, lastpass);
		request.setAttribute("veripass", lastpass);
		RequestDispatcher rd = request.getRequestDispatcher("User/user_verification.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input = request.getParameter("verinum");
		String veripass = request.getParameter("veripass");
		int bool = 0;
		if(input.equals(veripass)) {
			bool =1;
		}
		request.setAttribute("bool", bool);
		RequestDispatcher rd = request.getRequestDispatcher("User/user_verification_pro.jsp");
		rd.forward(request, response);
	}

}
