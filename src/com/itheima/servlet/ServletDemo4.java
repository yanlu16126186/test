package com.itheima.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Person;

public class ServletDemo4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=UTF-8");//告知客户端是纯文本
		PrintWriter out = response.getWriter();
		
		Person p1 = new Person("范青霞", "美女");
		//输出JSON : {name:'范青霞',gender:'美女'}
		out.write("{name:'"+p1.getName()+"',gender:'"+p1.getGender()+"'}");//自己组织字符串是比较苦的。
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
