package servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.PdsDAO;
import model.PdsVO;
import util.DBConn;

/**
 * Servlet implementation class PdsWrite
 */
@WebServlet("/pds_write")
public class PdsWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsWrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Pds/pds_write.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			ServletContext sc = getServletContext();
			String path = sc.getRealPath("/upload");
			MultipartRequest multi = new MultipartRequest(request, path, 2*1024*1024, "utf-8", new DefaultFileRenamePolicy());
			PdsVO vo = new PdsVO();
			PdsDAO dao = PdsDAO.getInstance();
			vo.setContents(multi.getParameter("contents"));
			vo.setEmail(multi.getParameter("email"));
			vo.setFilename(multi.getFilesystemName("filename"));
			vo.setName(multi.getParameter("name"));
			vo.setPass(multi.getParameter("pass"));
			vo.setSubject(multi.getParameter("subject"));
			int row = dao.pdsWrite(vo, conn);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("pds_list");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
