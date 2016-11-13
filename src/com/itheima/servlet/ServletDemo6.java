package com.itheima.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.City;
import com.itheima.domain.Province;
import com.sun.org.apache.xerces.internal.xs.XSTerm;
import com.thoughtworks.xstream.XStream;
//����xml
public class ServletDemo6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Province> provinces = new ArrayList<Province>();
		
		Province bj = new Province("����", "�׶�");
		bj.getCitys().add(new City("������", "ûɶ��������"));
		bj.getCitys().add(new City("������", "ûɶ��������"));
		bj.getCitys().add(new City("��ƽ��", "ûɶ��������"));
		
		Province sd = new Province("ɽ��", "SDʡ��");
		sd.getCitys().add(new City("������", "Ȫ��ʡ��"));
		sd.getCitys().add(new City("�ൺ��", "ûɶ��������"));
		sd.getCitys().add(new City("�Ͳ���", "ûɶ��������"));
		
		Province hb = new Province("����", "��ͷ��ʡ��");
		hb.getCitys().add(new City("�人��", "ʡ��"));
		hb.getCitys().add(new City("������", "ûɶ��������"));
		hb.getCitys().add(new City("������", "ûɶ��������"));
		
		provinces.add(bj);
		provinces.add(sd);
		provinces.add(hb);
		
		XStream xt = new XStream();
		
		//���ñ����������Ӧ�ı�ǩ������
		xt.alias("provinces", List.class);
//		xt.alias("province", Province.class);
//		xt.alias("city", City.class);
		xt.autodetectAnnotations(true);
		String xml = xt.toXML(provinces);
		//System.out.println(xml);
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write(xml);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
