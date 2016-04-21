package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.entity.Users;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Users user=new Users();
		user.setUsername(username);
		user.setPassword(password);
		UserDao userdao=new UserDao();
		if(userdao.login(user)){
			//�����ض���ʽ��ת��**.jsp����ǰ·����jdbclogin/com/servlet/
			//response.sendRedirect(loginsuccess.jsp");
			//ʹ��request.getContextPath()��������Ķ���
			response.sendRedirect(request.getContextPath()+"/loginsuccess.jsp");
			//�������ڲ���ת��/ ��ʾ��Ŀ�ĸ�Ŀ¼���� ../loginsuccess.jsp
			//request.getRequestDispatcher("/loginsuccess.jsp").forward(request, response);
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
		}
		else{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}

}
