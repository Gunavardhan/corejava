/**
 * 
 */
package com.practice.map;

/**
 * @author Dell
 *
 */
public class EmployeeKey {
	private Integer empId;
	private String email;

	public EmployeeKey(Integer empId, String email) {
		this.empId = empId;
		this.email = email;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this != obj) {
			return true;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		EmployeeKey ek = (EmployeeKey) obj;
		if (this.empId != null && this.empId.equals(ek.getEmpId()) && this.email != null
				&& this.email.equals(ek.getEmail())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.empId.hashCode() + this.email.hashCode();
	}
	
	@Override
	public String toString() {
		return "EmployeeKey [empId=" + empId + ", email=" + email + "]";
	}

}
