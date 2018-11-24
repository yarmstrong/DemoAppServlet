package com.holkem;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/DemoServlet/add" })
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    public AddServlet() { }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum = num1 + num2;
		res.getWriter().append("<h3>Served at: ").append(req.getRequestURI())
			.append("</h3>\nYour sum is: ").append(String.valueOf(sum));
	}
}
