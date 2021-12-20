
public class Pasajero {
	int edad;
	boolean enfermo;
	boolean sintomas;
	boolean contactoReciente;
	boolean profesional;
	
	public Pasajero(int edad, boolean enfermo, boolean sintomas, boolean contactoReciente, boolean profesional) {
		this.edad = edad;
		this.enfermo = enfermo;
		this.sintomas = sintomas;
		this.contactoReciente = contactoReciente;
		this.profesional = profesional;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEnfermo() {
		return enfermo;
	}

	public void setEnfermo(boolean enfermo) {
		this.enfermo = enfermo;
	}

	public boolean isSintomas() {
		return sintomas;
	}

	public void setSintomas(boolean sintomas) {
		this.sintomas = sintomas;
	}

	public boolean isContactoReciente() {
		return contactoReciente;
	}

	public void setContactoReciente(boolean contactoReciente) {
		this.contactoReciente = contactoReciente;
	}

	public boolean isProfesional() {
		return profesional;
	}

	public void setProfesional(boolean profesional) {
		this.profesional = profesional;
	}
	
}
