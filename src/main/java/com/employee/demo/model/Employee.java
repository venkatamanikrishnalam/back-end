package com.employee.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private Integer id;
		
		@Column(name="first_name")
		private String firstName;
		@Column(name="last_name")
		private String lastName;
		@Column(name="email_id")
		private String emailId;
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		


}
