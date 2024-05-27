package com.sist.map;
import java.util.*;
public class Container {
	// 스프링 => 메모리 누수 현상 방지 => 한개의 메모리 공간 ㅣㅇ용 => 싱글턴
	private Map<String,Model> map = new HashMap<String,Model>();
	public Container() {
		map.put("board", new BoardModel());
		map.put("join", new JoinModel());
		map.put("food", new FoodModel());
		map.put("login", new LoginModel());
		map.put("notice", new NoticeModel());
	}
	public Model getBean(String key)
	{
		return map.get(key);
	}
}
