package com.example;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@ToString (callSuper = true)



public class Persona {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero; 
	
}