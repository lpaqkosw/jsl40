package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GroupVO;
import model.ProductDAO;
import model.ProductVO;

/**
 * Servlet implementation class ProductInsertServlet
 */
@WebServlet("/product_insert")
public class ProductInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO dao = new ProductDAO();
		List<GroupVO> list = dao.listGroup();
		request.setAttribute("glist", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/insert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ProductVO vo = new ProductVO();
		vo.setCode(request.getParameter("code"));
		vo.setPname(request.getParameter("pname"));
		vo.setCost(Integer.parseInt(request.getParameter("cost")));
		vo.setPnum(Integer.parseInt(request.getParameter("pnum")));
		vo.setJnum(Integer.parseInt(request.getParameter("jnum")));
		vo.setSale(Integer.parseInt(request.getParameter("sale")));
		vo.setGcode(request.getParameter("gcode"));
		ProductDAO dao = new ProductDAO();
		int row=dao.insertProduct(vo);

		request.setAttribute("row", row);
		RequestDispatcher rd = request.getRequestDispatcher("/insert_pro.jsp");
		rd.forward(request, response);
		
	}

}
