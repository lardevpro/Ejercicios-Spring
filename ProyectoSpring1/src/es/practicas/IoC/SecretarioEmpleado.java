package es.practicas.IoC;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

}
