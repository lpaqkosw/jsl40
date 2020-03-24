package sample.action.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;

public class BoardDelProAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int idx = Integer.parseInt(request.getParameter("idx"));
		String pass = request.getParameter("pass");
		int row = BoardDAO.getInstance().delBoard(idx, pass);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(row == 0) {
			out.println("<script language='javascript'>");
			out.println("alert('삭제 오류');");
			out.println("history.back()");
			out.println("</script>"); 			
		}
		else {
			out.println("<script language='javascript'>");
			out.println("opener.location.href='/Board';");
			out.println("self.close();");
			out.println("</script>"); 
		}
		out.close();
		
		//RequestDispatcher rd = request.getRequestDispatcher("Board/board_delete_pro.jsp");
		
	}
}
