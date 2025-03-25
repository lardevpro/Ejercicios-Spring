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
		
		Empleados empleado1 = contexto.getBean("miEmpleado",Empleados.class);
		
		//Uso de los objetos creados
		System.out.println(empleado1.getTareas());
		
		System.out.println(empleado1.getInforme());
		
		contexto.close();
	}
}
