package com.itheima.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.itheima.domain.Product;

public class ServletDemo5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		List<Product> products = ProductDB.getAllProducts();
		JSONArray ja = JSONArray.fromObject(products);
		out.write(ja.toString());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
