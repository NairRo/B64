package com.crud.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
public class Books {
	@Id
	@GeneratedValue
	private Integer id;
	private String Author;
	private String Title;
	private Double Cost;
}
