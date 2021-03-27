package com.encore.service;

import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeService {
	private int midx;
	private int egidx;
	private Manager[] manager;
	private Engineer[] engineer;
	
	public EmployeeService() {
		manager = new Manager[100];
		engineer = new Engineer[100];
		midx = 0;
		egidx = 0;
	}
	
	public void addManager(Manager m) {
		manager[midx++]=m;		
	}
	public void addEngieer(Engineer e) {
		engineer[egidx++]=e;		
	}
	
	public void delateManager(String name) {
		for(int i=0;i<manager.length;i++) {
			if(manager[i]!=null) {
				if(manager[i].getName().equals(name)) {
					manager[i]=null;
				}
			}
		}
	}
	
	public void delateEngieer(String name) {
		for(int i=0;i<engineer.length;i++) {
			if(engineer[i]!=null) {
				if(engineer[i].getName().equals(name)) {
					engineer[i]=null;
				}
			}
		}
	}
	
	public void updateManager(double salary,String name,String dept,int deptno) {
		for(Manager i: manager) {
			if(i.getName().equals(name)) {
				i.setSalary(salary);
				i.setDeptno(deptno);
				i.setDept(dept);
			}
		}
	}
	public void updateEngineer(Engineer engineer) {
		for(Engineer i: this.engineer) {
			if(i!=null) {
				if(i.getName().equals(engineer.getName())) {
					i.setSalary(engineer.getSalary());
					i.setBirthDay(engineer.getBirthDay());
					i.setBonus(engineer.getBonus());
					i.setTech(engineer.getTech());
				}
			}						
		}
	}
	public Manager findManager(String name) {
		for(Manager i:manager) {
			if(i!=null) {
				if(i.getName().equals(name)) 
					return i;
			}
		}
		return null;	
	}
	public Manager[] findManager(int deptno) {
		Manager[] temp = new Manager[100];
		int k = 0;
		for(Manager i : manager) {
			if(i!=null){
				if(i.getDeptno()==deptno) temp[k++]=i;
				}
			}
		return null;
	}
	public Engineer findEngineer(String name) {
		for(Engineer i : engineer){
			if(i!=null){
				if(i.getName().equals(name))
					return i;
			}
		}
		return null;
	}
	public void printManagers() {
		for(Manager i : manager) {
			System.out.println(i.getDetail());
		}
	}
	public void printEngineer() {
		for(Engineer i : engineer) {
			System.out.println(i.getDetail());
		}
	}
}
		
