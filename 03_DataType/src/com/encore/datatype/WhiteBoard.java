package com.encore.datatype;

public class WhiteBoard {
	 public int size;
	 public char color;
	 public float price;
	 public String madeCompany;
	 public String material;
	 public boolean scratch;
	
	public void setInfo(int size, char color, float price, String madeCompany, String material, boolean scratch) { //local V
		//필드와 로컬변수의 이름이 같을때, 구분하기 위해서 필드앞에 this붙인다.
		// this는 해당클래스 자기자식...쯤으로 일단 해석..
		this.size = size;
		this.color = color;
		this.price = price;
		this.madeCompany = madeCompany;
		this.material = material;
		this.scratch = scratch;
	}	
	public void printInfo() {
		System.out.println(size+"\t"+color+"\t"+price+"\t"+madeCompany+"\t"+material+"\t"+scratch);
	}	
}