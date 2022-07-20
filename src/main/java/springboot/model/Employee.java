package springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long Id;
	@Column(name="frist_name",nullable=false )
	
private String fristname;
	@Column(name="last_name")
private String lastname;
	@Column(name="email")
			private String Email;
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getFristname() {
	return fristname;
}
public void setFristname(String fristname) {
	this.fristname = fristname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Employee() {
	super();
}



}
