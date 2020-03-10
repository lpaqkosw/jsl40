<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.*" %>
    
<%
	request.setCharacterEncoding("utf-8");
	int idx = Integer.parseInt(request.getParameter("idx"));
	GuestDAO dao = GuestDAO.getInstance();
	int row = dao.guestDelete(idx);
	response.sendRedirect("guest_list.jsp");
%>
