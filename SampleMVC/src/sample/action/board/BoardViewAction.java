package sample.action.board;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;
import sample.model.board.BoardVO;
import sample.util.SqlMark;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		boolean flag = false;
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i <cookies.length;i++) {
			cookie = cookies[i];
			if(cookie.getName().equals(idx+"view")) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			BoardDAO.getInstance().readBoard(idx);
			cookie = new Cookie(idx+"view", Integer.toHexString(idx));
			cookie.setMaxAge(3000);
			response.addCookie(cookie);
		}
		BoardVO vo = BoardDAO.getInstance().viewBoard(idx);
		vo.setContents(SqlMark.lineBreak(vo.getContents()));
		request.setAttribute("vo", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("Board/board_view.jsp");
		rd.forward(request, response);
		

	}

}
