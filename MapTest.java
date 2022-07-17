package com.monocept.maptest;
import java.util.*;

import com.monocept.model.*;;
public class MapTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Gagan", 569863);
		Employee e2 = new Employee(102, "Harsh", 236985);
		Employee e3 = new Employee(103, "Patil", 698563);
		Employee e4 = new Employee(104, "Dep", 569874);
		Employee e5 = new Employee(105, "Latum", 789652);

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		Map<Integer,Employee> empMap=new HashMap<>();
		
		
		for(Employee emp: employees){
			empMap.put(emp.getId(),emp);
		}
		

		
		for(Integer em:empMap.keySet()){
			System.out.println("Key: "+em);
			System.out.println("Value: "+empMap.get(em));
		}
		
		
	}

}
