package es.ejercicio8;

import es.ejercicio7.Mostrable;

public class Usuario implements Validable,Mostrable{

	private String email;
	
	private String password;

	@Override
	public String mostrar() {
		return "Email: " + email + " Password: " + password;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		if(!email.contains("@")||email==null) {
			throw new IllegalArgumentException("El email debe incluir '@' y no puede ser null");
		}
		
		if(password.length()<8) {
			throw new IllegalArgumentException("La contraseña debe tener 8 caracteres como mínimo");
		}
		
		System.out.println("Validado correctamente");
		
	}

	public Usuario(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	
}
