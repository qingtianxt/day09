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
		//接受参数
		String value=req.getParameter("username");
		
		
		//往浏览器回写数据
		//resp.getWriter().println("data:"+value);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().println("数据:"+value);
		System.out.println(value);
		
	}
}
