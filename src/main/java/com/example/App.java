package com.example;

public class App {

    public static void main( String[] args ) { 
    
    Empleado[] empleados = {
    		
    	Empleado.builder()
    		.genero(Genero.HOMBRE)
    		.departamento(Dpto.INFORMATICA)
    		.nombre("Carlos")
    		.primerApellido("Ruiz")
    		.salario(1200.80)
    		.build(),
    	Empleado.builder()
    		.genero(Genero.MUJER)
    		.departamento(Dpto.INFORMATICA)   		
    		.nombre("Rosa")
    		.primerApellido("Castro")
    		.salario(2000.00)
    		.build(),
    	Empleado.builder()
    		.genero(Genero.MUJER)
    		.departamento(Dpto.RRHH)    		
    		.nombre("Tamara")
    		.primerApellido("Gomez")
    		.segundoApellido("Lopez")
    		.salario(1100)
    		.build()
    };

    double salarioPromedioHombres = 0.0;
    double salarioPromedioMujeres = 0.0;
    double salarioPromedioOtro = 0.0;
    
    double sumatoriaSalariosHombre = 0.0;
    double sumatoriaSalariosMujer = 0.0;
    double sumatoriaSalariosOtro = 0.0;
    
    int totalGeneroHombre = 0;
    int totalGeneroMujer = 0;
    int totalGeneroOtro = 0;

   
    for(Empleado empleado : empleados) {
    	if(empleado.getGenero().equals(Genero.HOMBRE)) {
    		sumatoriaSalariosHombre += empleado.getSalario();
    		totalGeneroHombre++;
    	} else if(empleado.getGenero().equals(Genero.MUJER)) {
    		sumatoriaSalariosMujer += empleado.getSalario();
    		totalGeneroMujer++;
    	} else {
    		sumatoriaSalariosOtro += empleado.getSalario();
    		totalGeneroOtro++;
    		}
    	
    	salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
    	salarioPromedioMujeres = sumatoriaSalariosMujer / totalGeneroMujer;
    	salarioPromedioOtro = sumatoriaSalariosOtro / totalGeneroOtro;
 	
    } System.out.println("El salario Promedio de los hombres es: " + salarioPromedioHombres);
      System.out.println("El salario Promedio de los mujeres es: " + salarioPromedioMujeres);
      System.out.println("El salario Promedio de los otros generos es: " + salarioPromedioOtro);
      
    
      double salarioPromedioRRHH = 0.0;
      double salarioPromedioCONTABILIDAD = 0.0;
      double salarioPromedioINFORMATICA = 0.0;
    
      double sumatoriaSalariosRRHH = 0.0;
      double sumatoriaSalariosCONTABILIDAD = 0.0;
      double sumatoriaSalariosINFORMATICA = 0.0;
      
      int totalRRHH = 0;
      int totalCONTABILIDAD = 0;
      int totalINFORMATICA = 0;
      
      
      for(Empleado empleado : empleados) {
      	if(empleado.getDepartamento().equals(Dpto.RRHH)) {
      		sumatoriaSalariosRRHH += empleado.getSalario();
      		totalRRHH++;
      	} else if(empleado.getDepartamento().equals(Dpto.CONTABILIDAD)) {
      		sumatoriaSalariosCONTABILIDAD += empleado.getSalario();
      		totalCONTABILIDAD++;
      	} else {
      		sumatoriaSalariosINFORMATICA += empleado.getSalario();
      		totalINFORMATICA++;
      		}
      	
      	
  	salarioPromedioRRHH = sumatoriaSalariosRRHH / totalRRHH;
  	salarioPromedioCONTABILIDAD = sumatoriaSalariosCONTABILIDAD / totalCONTABILIDAD;
  	salarioPromedioINFORMATICA = sumatoriaSalariosINFORMATICA / totalINFORMATICA;    	
  	  
  	
      System.out.println("El salario promedio por departamento RRHH es :" + salarioPromedioRRHH);
      System.out.println("El salario promedio por departamento CONTABILIDAD es :" + salarioPromedioCONTABILIDAD);
      System.out.println("El salario promedio por departamento INFORMATICA es :" + salarioPromedioINFORMATICA);
      }}}