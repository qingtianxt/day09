package com.itheima.c_life;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeServlet implements Servlet {
	/**
	 * ��ʼ������
	 * ִ���ߣ�������
	 * ִ�д�����1��
	 * ִ��ʱ�䣺Ĭ�ϵ�һ�η��ʵ�ʱ��
	 */
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
			System.out.println("55555");
	}
	/**
	 * ����
	 * ִ���ߣ�������
	 * ִ�д���������1�Σ�ִ��һ��
	 * ִ��ʱ�䣺��������ʱ��
	 */
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
			System.out.println("666666");
	}
	/**
	 * ����
	 * ִ���ߣ�������
	 * ִ�д�����ִֻ��һ��
	 * ִ��ʱ�䣺servlet���Ƴ���ʱ����߷����������رյ�ʱ��
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
			System.out.println("44444444444");
			
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
