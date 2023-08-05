package com.codewithabhijit.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Data
@AllArgsConstructor
@ToString
public class Employees {
//implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column
	private int age;

	@Column
	private String gender;

	@Column
	private String job;

	@Column
	private double salary;

	@Column
	private String phone;

	@Column
	private String aadharNo;

	@Column
	private String email;

	@Column
	private String password;
	
	@Column
	private String roles;

//	public String getRoles() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		Set<GrantedAuthority> authorities = new HashSet<>();
//		authorities.add(new SimpleGrantedAuthority("ROLE_USER")); // You can add more roles based on your requirements.
//		return authorities;
//
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return this.email;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}

}
