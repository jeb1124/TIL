package com.encore.datatype;

public class WhiteBoard {
	 public int size;
	 public char color;
	 public float price;
	 public String madeCompany;
	 public String material;
	 public boolean scratch;
	
	public void setInfo(int size, char color, float price, String madeCompany, String material, boolean scratch) { //local V
		//�ʵ�� ���ú����� �̸��� ������, �����ϱ� ���ؼ� �ʵ�տ� this���δ�.
		// this�� �ش�Ŭ���� �ڱ��ڽ�...������ �ϴ� �ؼ�..
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