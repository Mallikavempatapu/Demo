package com.genericservletexample;

import java.io.IOException;
import javax.servlet.Servlet;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "GenericServletExample", urlPatterns = "/genericDemo")

public class GenericServletExample extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.append("<html><body>");
		String name = req.getParameter("name");
		out.append("hello" + name);
		out.append("</body></html>");
		
		}
	
	
}
