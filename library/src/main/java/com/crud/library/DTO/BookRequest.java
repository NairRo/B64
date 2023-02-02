package com.crud.library.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class BookRequest {
	@Id
	@GeneratedValue
	private int id;
	@Pattern (regexp = "^\\w{7}$", message= "invalid author name entered")
	private String Author;
	@NotBlank(message = "title should not be blank")
	private String Title;
	@NotNull
	private Double Cost;
}
