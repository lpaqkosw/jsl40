package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import KISA.SHA256;
import model.MemDAO;
import model.MemVO;
import sun.misc.BASE64Encoder;

/**
 * Servlet implementation class MemInsert
 */
@WebServlet("/MemInsert")
public class MemInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Member/userinfo_insert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		MemDAO dao = new MemDAO();
		MemVO vo = new MemVO();
		String pass = request.getParameter("passwd");
		SHA256 hash = new SHA256(pass.getBytes());
		BASE64Encoder Base64Encoder= new BASE64Encoder();
		
		vo.setName(request.getParameter("name"));
		vo.setUserid(request.getParameter("userid"));
		vo.setPasswd(Base64Encoder.encode(hash.GetHashCode()));
		vo.setGubun(request.getParameter("gubun"));
		vo.setZipcode(request.getParameter("zipcode"));
		vo.setAddr1(request.getParameter("addr1"));
		vo.setAddr2(request.getParameter("addr2"));
		vo.setTel(request.getParameter("tel"));
		vo.setEmail(request.getParameter("email"));
		String[] arr = request.getParameterValues("fa");
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		for(int i = 1; i < arr.length;i++) {
			sb.append(", "+arr[i]);
		}
		vo.setFavorite(sb.toString());
		vo.setJob(request.getParameter("job"));
		vo.setIntro(request.getParameter("intro"));
		int row = 0;
		row = dao.memInsert(vo);
		request.setAttribute("row", row);
		RequestDispatcher rd = request.getRequestDispatcher("Member/userinfo_insert_pro.jsp");
		rd.forward(request, response);
	}

}
