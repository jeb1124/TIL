package com.encore.test;

import com.encore.service.EmployeeService;
import com.encore.util.MyDate;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		System.out.println("#########등록########");
		service.addEngieer(new Engineer("jiwon",new MyDate(1998,10,04),18000.0,"java",1500.0));
		service.addEngieer(new Engineer("eunbi",new MyDate(1998,11,24),20000.0,"python",2500.0));	

		service.addManager(new Manager("James",new MyDate(1996,11,14),16000.0,"c++",350));
		service.addManager(new Manager("Peter",new MyDate(1993,9,22),28000.0,"spring",250));
		System.out.println("#########조회########");
		service.printEngineer();
		service.printManagers();
		
		System.out.println("###########수정###########");
		service.updateEngineer(new Engineer("eunbi",new MyDate(1998,01,04),15000.0,"c",400.0));
		service.updateManager(10000.0,"James","computer", 100);
		service.printEngineer();
		service.printManagers();
		
		
		System.out.println("#########삭제########");
		service.delateManager("James");
		service.findEngineer("eunbi");
		
		System.out.println("#########검색########");
		
		Manager[] mg = service.findManager(0);
		for(Manager i : mg) {
			if(i!=null) System.out.println(i);
		}

		System.out.println(service.findEngineer("jiwon"));
		System.out.println("############################");
		service.printManagers();		
		service.printEngineer();
	}

}
