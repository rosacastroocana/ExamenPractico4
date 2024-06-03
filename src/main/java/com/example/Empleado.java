package com.example;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@ToString (callSuper = true)
@EqualsAndHashCode (callSuper = true)


public class Empleado extends Persona {
	
	private Dpto departamento;
	private double salario;	
}
