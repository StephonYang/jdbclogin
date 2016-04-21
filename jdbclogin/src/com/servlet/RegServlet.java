package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.entity.Users;

public class RegServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String gender=request.getParameter("gender");
	Users user=new Users();
	user.setUsername(username);
	user.setPassword(password);
	user.setGender(gender);
	
	UserDao userdao=new UserDao();
	userdao.addUser(user);
	
	response.sendRedirect(request.getContextPath()+"/regsuccess.jsp");
	
}
}
