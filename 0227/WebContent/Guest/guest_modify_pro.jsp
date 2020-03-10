<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.*" %>
    
<%
	request.setCharacterEncoding("utf-8");
	GuestVO vo = new GuestVO();
	int idx = Integer.parseInt(request.getParameter("idx"));
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String contents = request.getParameter("contents");
	
	GuestDAO dao = GuestDAO.getInstance();
	
	vo.setIdx(idx);
	vo.setName(name);
	vo.setSubject(subject);
	vo.setContents(contents);
	int row = dao.guestUpdate(vo);
	response.sendRedirect("guest_list.jsp");
%>
