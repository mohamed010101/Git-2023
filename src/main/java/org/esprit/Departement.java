package org.esprit;

public class Departement {
 private int id;
 private String department_name;
 
public Departement(int id, String department_name) {
	super();
	this.id = id;
	this.department_name = department_name;
}

public Departement() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}

@Override
public String toString() {
	return "Departement [id=" + id + ", department_name=" + department_name + "]";
}

}
