package com.example.benjamin;

public class People {
	public People(String tel, String name) {
		this.tel = tel;
		this.name = name;
	}

	private String tel, name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
