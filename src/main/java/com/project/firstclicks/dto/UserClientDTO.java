package com.project.firstclicks.dto;

//DTO para Estudiantes y Tutores
public record UserClientDTO(
		String username,
		String password,
		Integer roleId,
		String firstname,
		String lastname, 
		String email,
		String address
		) {
	
}
