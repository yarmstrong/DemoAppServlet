package com.holkem;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Simple Demo Servlet", urlPatterns = { "/DemoServlet" })
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    public DemoServlet() { }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<h3>Served at: ").append(request.getRequestURI())
			.append("</h3>");
		System.out.println("hello from GET method.");
	}
}
