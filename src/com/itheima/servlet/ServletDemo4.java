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
		
		response.setContentType("text/plain;charset=UTF-8");//��֪�ͻ����Ǵ��ı�
		PrintWriter out = response.getWriter();
		
		Person p1 = new Person("����ϼ", "��Ů");
		//���JSON : {name:'����ϼ',gender:'��Ů'}
		out.write("{name:'"+p1.getName()+"',gender:'"+p1.getGender()+"'}");//�Լ���֯�ַ����ǱȽϿ�ġ�
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
