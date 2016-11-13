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
		
		response.setContentType("text/html;charset=UTF-8");//告知客户端是文本
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");//获取用户输入的数据
		if(names.contains(name)){
			//存在
			out.write("<font color='red'>用户名已经存在</font>");
		}else{
			//不存在
			out.write("<font color='green'>用户名可以使用</font>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
