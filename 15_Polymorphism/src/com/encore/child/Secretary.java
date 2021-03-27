package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Secretary extends Employee{
	private String bossOfName;

	public Secretary(String name, MyDate birthday, double salary,String bossOfName) {
		super(name, birthday, salary);
		this.bossOfName = bossOfName;
	}

	public String getDetails() {
		return super.getDetails()+","+bossOfName;
	}

	public void changetBossOfName(String bossOfName) {
		this.bossOfName = bossOfName;
	}
	
	

}
