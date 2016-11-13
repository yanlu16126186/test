package com.itheima.jsonlib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.junit.Test;

import com.itheima.domain.Person;

public class JsonLibDemo {
	//数组---》JSON
	@Test
	public void test1(){
		String str[] = {"a","b","c","d"};
		JSONArray ja = JSONArray.fromObject(str);
		System.out.println(ja);
	}
	@Test
	public void test2(){
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		JSONArray ja = JSONArray.fromObject(list);
		System.out.println(ja);
	}
	@Test
	public void test3(){
		Set<String> set = new HashSet<String>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		JSONArray ja = JSONArray.fromObject(set);
		System.out.println(ja);
	}
	//不要用数组
	@Test
	public void test4(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("k1","v1");
		map.put("k2","v2");
		map.put("k3","v3");
		JSONArray ja = JSONArray.fromObject(map);
		System.out.println(ja);
	}
	@Test
	public void test5(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("k1","v1");
		map.put("k2","v2");
		map.put("k3","v3");
		JSONObject ja = JSONObject.fromObject(map);
		System.out.println(ja);
	}
	@Test
	public void test6(){
		Person p1 = new Person("张湾", "美女");
		JSONObject ja = JSONObject.fromObject(p1);
		System.out.println(ja);
	}
	
	@Test
	public void test7(){
		List<Person> ps = new ArrayList<Person>();
		ps.add(new Person("张湾", "美女") );
		ps.add(new Person("张新朋", "人妖") );
		JSONArray ja = JSONArray.fromObject(ps);
		System.out.println(ja);
	}
	//过滤属性
	@Test
	public void test8(){
		Person p1 = new Person("张湾", "美女");
		
		JsonConfig jc = new JsonConfig();
		jc.setExcludes(new String[]{"gender"});
		
		JSONObject ja = JSONObject.fromObject(p1,jc);
		System.out.println(ja);
	}
}
