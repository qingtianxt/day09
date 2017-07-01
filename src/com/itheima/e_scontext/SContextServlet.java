package com.itheima.e_scontext;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SContextServlet
 */
public class SContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.��ȡȫ�ֹ�����
			ServletContext context = this.getServletContext();
		//��ȡ��ʼ������
		String encoding = context.getInitParameter("encoding");
		System.out.println("��ʼ��������"+encoding);
		
		//��ȡ�ļ�����ʵ·��
//		String path=context.getRealPath("/");
		String path=context.getRealPath("/1.txt");
		System.out.println(path);
		//��������ʽ����һ���ļ�
		InputStream is = context.getResourceAsStream("1.txt");
		System.out.println(is);
		//��ȡ�ļ���mime����
		System.out.println("----------------");
		String mimeType = context.getMimeType("1.jpg");
		System.out.println(mimeType);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
