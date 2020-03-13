package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuDAO;
import model.StuVO;

/**
 * Servlet implementation class StuInsertServlet
 */
@WebServlet("/insert")
public class StuInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		RequestDispatcher rd = request.getRequestDispatcher("/insert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		StuDAO dao = new StuDAO();
		StuVO vo = new StuVO();
		vo.setBun(Integer.parseInt(request.getParameter("bun")));
		vo.setName(request.getParameter("name"));
		vo.setSex(request.getParameter("sex"));
		vo.setKor(Integer.parseInt(request.getParameter("kor")));
		vo.setEng(Integer.parseInt(request.getParameter("eng")));
		vo.setMat(Integer.parseInt(request.getParameter("mat")));
		vo.setRegdate(request.getParameter("regdate"));
		int row = dao.insertStu(vo);
		
		request.setAttribute("row", row);
		
		RequestDispatcher rd = request.getRequestDispatcher("/insert_pro.jsp");
		rd.forward(request, response);
	}

}
