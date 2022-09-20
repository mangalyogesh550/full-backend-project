package com.backend.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
//@Getter
//@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "user_name", nullable = false, length = 100)
	private String name;

//	@Column(name ="email_address",nullable = false, length = 100)
	private String email;

//	@Column(name ="password_value",nullable = false, length = 15)
	private String password;

//	@Column(name ="about_user",nullable = false, length = 250)
	private String about;

}
