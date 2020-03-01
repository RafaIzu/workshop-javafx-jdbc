package model.service;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List<Department> list=new ArrayList<>();
		list.add(new Department(1, "Toys"));
		list.add(new Department(2, "Eletronics"));
		list.add(new Department(3, "GayStuff"));
		
		return list;
		
	}
}

