package com.devsuperior.bds04.dto;

import java.util.Objects;

import com.devsuperior.bds04.services.validations.UserInsertValid;

@UserInsertValid
public class UserInsertDTO extends UserDTO{

	private static final long serialVersionUID = 1L;
	
	private String password;
	
	public UserInsertDTO() {
		super();
	}
	

	public UserInsertDTO(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(password);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInsertDTO other = (UserInsertDTO) obj;
		return Objects.equals(password, other.password);
	}
	
	
}
