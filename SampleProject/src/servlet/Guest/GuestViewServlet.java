package servlet.Guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GuestDAO;
import model.GuestVO;

/**
 * Servlet implementation class GuestViewServlet
 */
@WebServlet("/GuestView")
public class GuestViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestDAO dao = new GuestDAO();
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i <cookies.length;i++) {
			info = cookies[i];
			if(info.getName().equals("guest"+idx)) {
				bool = true;
				break;
			}
		}
		
		String newVal = ""+System.currentTimeMillis();
		if(!bool) {
			dao.guestReadcnt(idx);
			info = new Cookie("guest"+idx, newVal);
			info.setMaxAge(3000);
			response.addCookie(info);
		}
		
		GuestVO vo = dao.guestSelect(idx);
		request.setAttribute("vo", vo);
		request.setAttribute("idx", idx);
		RequestDispatcher rd = request.getRequestDispatcher("Guest/guest_view.jsp");
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
