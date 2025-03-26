package es.practicas.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
			
		//Creación de objetos de tipo empleado
		
		/*
		Empleados empleado1 = new SecretarioEmpleado();
		Empleados empleado2 = new DirectorEmpleado();
		Empleados empleado3 = new JefeEmpleado();
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Empleados empleado1 = contexto.getBean("miEmpleado",Empleados.class);
		
		//Uso de los objetos creados
		System.out.println(empleado1.getTareas());
		
		System.out.println(empleado1.getInforme()); */
		
		
		
		/*Empleados empleado2 = contexto.getBean("miSecretarioEmpleado",Empleados.class);
		
		System.out.println(empleado2.getTareas());
		
		System.out.println(empleado2.getInforme()); */
		
		
		
		SecretarioEmpleado empleado3 = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(empleado3.getTareas());
		
		System.out.println(empleado3.getInforme());
		
		System.out.println(empleado3.getEmail());
		
		System.out.println(empleado3.getNombreEmpresa());
		
		
		contexto.close();
	}
}
