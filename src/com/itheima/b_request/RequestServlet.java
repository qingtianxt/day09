package com.itheima.b_request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class RequestServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ܲ���
		String value=req.getParameter("username");
		
		
		//���������д����
		//resp.getWriter().println("data:"+value);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().println("����:"+value);
		System.out.println(value);
		
	}
}
