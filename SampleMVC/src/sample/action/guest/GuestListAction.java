package sample.action.guest;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.guest.GuestDAO;
import sample.model.guest.GuestVO;
import sample.util.PageIndex;

public class GuestListAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		GuestDAO dao = GuestDAO.getInstance();
		int currentPage = 1;
		int maxlist= 10;
		int totpage = 1;
		int totcount = dao.countGuest();
		if(totcount%maxlist == 0) {
			totpage = totcount/maxlist;
		}
		else {
			totpage = totcount/maxlist +1;
		}
		if(request.getParameter("page") != null) {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}
		
		int startlist = (currentPage -1) * maxlist;
		int endlist = (currentPage * maxlist);
		int listcount = totcount - ((currentPage -1)* maxlist);
		List<GuestVO> list = dao.listGuest(startlist,endlist);
		String pageList = PageIndex.pageList(currentPage, totpage, "Guest?command=guest_list&", "");
		request.setAttribute("list", list);
		request.setAttribute("totcount", totcount);
		request.setAttribute("listcount", listcount);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageList", pageList);
		RequestDispatcher rd = request.getRequestDispatcher("Guest/guest_list.jsp");
		rd.forward(request, response);
	}
}
