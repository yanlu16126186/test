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
//返回xml
public class ServletDemo6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Province> provinces = new ArrayList<Province>();
		
		Province bj = new Province("北京", "首都");
		bj.getCitys().add(new City("海淀区", "没啥可描述的"));
		bj.getCitys().add(new City("朝阳区", "没啥可描述的"));
		bj.getCitys().add(new City("昌平区", "没啥可描述的"));
		
		Province sd = new Province("山东", "SD省份");
		sd.getCitys().add(new City("济南市", "泉城省会"));
		sd.getCitys().add(new City("青岛市", "没啥可描述的"));
		sd.getCitys().add(new City("淄博市", "没啥可描述的"));
		
		Province hb = new Province("湖北", "九头鸟省份");
		hb.getCitys().add(new City("武汉市", "省会"));
		hb.getCitys().add(new City("荆州市", "没啥可描述的"));
		hb.getCitys().add(new City("襄阳市", "没啥可描述的"));
		
		provinces.add(bj);
		provinces.add(sd);
		provinces.add(hb);
		
		XStream xt = new XStream();
		
		//设置别名：对象对应的标签的名称
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
