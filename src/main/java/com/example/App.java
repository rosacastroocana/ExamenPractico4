package com.example;

public class App {

    public static void main( String[] args ) { 
    
    Object[] empleadosycoches = {
    		
    	Empleado.builder()
    		.departamento(Dpto.CONTABILIDAD)
    		.salario(1200.80)
    		.build(),
    	Empleado.builder()
    		.departamento(Dpto.INFORMATICA)   		
    		.salario(2000.00)
    		.build(),
        Empleado.builder()
    		.departamento(Dpto.RRHH)    		
    		.salario(1100)
    		.build(),    		
	    Estudiante.builder()
			.facultad(Facultad.DERECHO)
			.totalAsignaturasMatriculadas(5)
			.build(),
		    Estudiante.builder()
    		.facultad(Facultad.MEDICINA)
    		.totalAsignaturasMatriculadas(10)
    		.build(),
    	    Estudiante.builder()
    		.facultad(Facultad.INFORMATICA)
    		.totalAsignaturasMatriculadas(2)    		
    		.build()
    		};
}
}