package org.person.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "department")
public class Department implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "departmentname")
	private String departmentName;

	public Department() {
	}
	
	public Department(int i, String string) {
		this.id = i;
		this.departmentName = string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
}
