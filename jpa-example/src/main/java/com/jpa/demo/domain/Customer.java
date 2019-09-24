package com.jpa.demo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class Customer 
{
	@Id		//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)		//generated auto_increment IDENTITY	SEQUENCE	TABLE	AUTO
	private Long id;
	
	@Column(length = 20, nullable = false)	//@Column database use column
	private String name;
	
	@Column(length = 20, nullable = false, unique = true)
	private String phone;
	
	@Builder
	public Customer(String name, String phone)
	{
		this.name = name;
		this.phone = phone;
	}

}
