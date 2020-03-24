package servlet;

import java.io.IOException;
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
 * Servlet implementation class ProductModServlet
 */
@WebServlet("/product_modDelSel")
public class ProductSelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductSelServlet() {
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
		
		RequestDispatcher rd = request.getRequestDispatcher("/modDelSel.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String option = request.getParameter("option");
		ProductDAO dao = new ProductDAO();
		ProductVO vo =null;
		String code ;
		String pname;
		int cost;
		int pnum;
		int jnum;
		int sale;
		String gcode;
		if(option.equals("1")){
			code = request.getParameter("code");
			vo = dao.selectProduct(code);
			request.setAttribute("vo", vo);
			RequestDispatcher rd = request.getRequestDispatcher("/modDelSel.jsp");
			rd.forward(request, response);
		}
		else if(option.equals("2")) {
			vo.setCode(request.getParameter("code"));
			vo.setPname(request.getParameter("pname"));
			vo.setCost(Integer.parseInt(request.getParameter("cost")));
			vo.setJnum(Integer.parseInt(request.getParameter("jnum")));
			vo.setPnum(Integer.parseInt(request.getParameter("pnum")));
			vo.setSale(Integer.parseInt(request.getParameter("sale")));
			vo.setGcode(request.getParameter("gcode"));
			int row = dao.modifyProduct(vo);
			request.setAttribute("row", row);
			request.setAttribute("option", option);
			List<GroupVO> list = dao.listGroup();
			request.setAttribute("glist", list);
			RequestDispatcher rd = request.getRequestDispatcher("/modDelSel_pro.jsp");
			rd.forward(request, response);
		}
		else {
			vo.setCode(request.getParameter("code"));
			vo.setPname(request.getParameter("pname"));
			vo.setCost(Integer.parseInt(request.getParameter("cost")));
			vo.setJnum(Integer.parseInt(request.getParameter("jnum")));
			vo.setPnum(Integer.parseInt(request.getParameter("pnum")));
			vo.setSale(Integer.parseInt(request.getParameter("sale")));
			vo.setGcode(request.getParameter("gcode"));
			int row = dao.deleteProduct(vo);
			request.setAttribute("row", row);
			request.setAttribute("option", option);
			List<GroupVO> list = dao.listGroup();
			request.setAttribute("glist", list);
			RequestDispatcher rd = request.getRequestDispatcher("/modDelSel_pro.jsp");
			rd.forward(request, response);
		}
	}

}
