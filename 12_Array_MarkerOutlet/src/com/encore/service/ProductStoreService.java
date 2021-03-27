package com.encore.service;

import com.encore.vo.Product;
/*
 *  ProductStore�� �ִ� �پ��� ��ǰ���� �ٷ�� ��ɸ��� ��Ƴ��� Ŭ����
 *  �̷� ��ɸ����� �ۼ��� Ŭ������ ����(Manage) Ŭ������ �Ѵ�.
 */

//1)��� ��ǰ���� maker�� ����ϴ� ���
public class ProductStoreService {
	public void printAllProductMaker(Product[] pros) {
		for(Product p: pros)System.out.println(p.getMaker());
		
	}
//2)��ǰ���� �� ���Ծ��� �����ϴ� ���	
	public int getTotalPrice(Product[] pros) {
		// ����
		int total = 0;
		for(Product p: pros) total += p.getPrice()*p.getQuantity();
		return total;
	}
//3)Ư�� �ݾ� �̻��� �Ǵ� ��ǰ�� �����ϴ� ���
	public Product[] getMorePrice(Product[] pros,int price) {
		Product[] temp = new Product[pros.length];
		int idx = 0;		
		for(Product p: pros) {
			if(p.getPrice()>=price) 
				temp[idx++] = p;
		}//for
		return temp;
	}//
//4)Ư��ȸ�� ��ǰ���� �����ϴ� ���	
	public Product[] getCertainCompany(Product[] pros, String company) {
		Product[] temp = new Product[pros.length];
		int idx = 0;		
		for(Product p: pros) {
			if(p.getCompany().equals(company))
				temp[idx++] = p;			
			}//for
			return temp;
	}//
//5)������ ��ǰ�� ��հ��� �����ϴ� ��� 
//	--> ����� Identifier�����ϴ� ����� �Բ�
	public int getAvgPrice(Product[] pros) {
		//������ ������ �Ѱ����� ���ϴ� �޼ҵ带 ȣǮ...����
		//�Ѱ����� ������ ������.
		return getTotalPrice(pros)/pros.length;	
	
		
	}
}
