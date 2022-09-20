package com.backend.project.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min =4,message="userName must be min of 4 characters..!!")
	private String name;
	
	@Email(message = "email address is not valid,Plz enter a valid email address..!!")
	private String email;
	
	@NotEmpty
	@Size(min= 4,max = 15,message = "password must be min of 4 character and max of 15 characters..!!")
	@Pattern(regexp = "^[a-zA-Z0-9]{4,15}$",message="use only alphanumeric letters")
	private String password;
	
	@NotEmpty
	private String about;

}
