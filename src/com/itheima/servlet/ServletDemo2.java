package com.itheima.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo2 extends HttpServlet {
	private List<String> names = new ArrayList<String>();
	public void init() throws ServletException {
		names.add("zxp");
		names.add("yy");
		names.add("zw");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");//��֪�ͻ������ı�
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");//��ȡ�û����������
		if(names.contains(name)){
			//����
			out.write("<font color='red'>�û����Ѿ�����</font>");
		}else{
			//������
			out.write("<font color='green'>�û�������ʹ��</font>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
