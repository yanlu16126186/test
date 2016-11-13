package com.itheima.servlet;

import java.util.ArrayList;
import java.util.List;

import com.itheima.domain.Product;

public class ProductDB {
	private static List<Product> products = new ArrayList<Product>();
	static{
		products.add(new Product(1, "³äµç±¦", 100));
		products.add(new Product(2, "½ðÆ¿Ã·", 20));
		products.add(new Product(3, "°®·è", 6000));
		products.add(new Product(4, "Ï´ÒÂ·Û", 30));
	}
	public static List<Product> getAllProducts(){
		return products;
	}
}
