

public class CalcularPrecio {
	
	
	public static double CalcularPrecioBillete(int nivel, int edad, boolean profesional, boolean enfermo, boolean sintomas, boolean contacto, int plazasLibres, int plazasN){
		double precio = 14.0;
		if (enfermo||contacto||sintomas)return 0;
		else {
			switch (nivel){
				case 0:
						if (edad < 23)precio -= precio*0.6;
						else if (edad > 65) precio -= precio *0.8;
					break;
				case 1:
					if (plazasLibres > 0) {

							if (edad < 23)precio -= precio*0.3;
							else if (edad > 65) precio -= precio *0.5;
					}
					else {precio = 0;}
					break;
				case 2:
					if (plazasLibres > 0) {
						if (edad > 65) precio *= 1.2;
						if (!profesional) {
							if (plazasN <= 0){
								precio = 0;
							}
						}
						
					}
					else {
						precio = 0;
					} 

					break;
				case 3: 
					if (plazasLibres > 0) {
						if (edad < 23) precio *= 1.2;
						if (edad > 23) precio *= 1.5;
						if (!profesional) {
							if (plazasN <= 0){
								precio = 0;
							}
						}
						
					}
					else {
						precio = 0;
					} 
					break;
				case 4:
					if (plazasLibres > 0 && edad < 65) {
						if (edad < 23) precio *= 1.5;
						if (!profesional) {
							if (plazasN <= 0){
								precio = 0;
							}
						}
						
					}
					else {
						precio = 0;
					} 
					break;
			}
		}
		return precio;
	}
	
	public static int calcularPlazasNormales (int plazas, int nivel) {
		if (nivel < 2) {
			return plazas;
		}
		else if (nivel < 3) {
			plazas -= plazas *0.6;
			return plazas;
		}
		else if (nivel<4) {
			plazas -= plazas *0.8;
			return plazas;
		}
		else {
			plazas -= plazas *0.9;
			return plazas;
		}
	}
	
	public static int calcularNivel (int casos) {
		int nivel;
		if (casos < 100) {
			nivel = 0;
		}
		else if (casos < 200) {
			nivel = 1;
		}
		else if (casos<300) {
			nivel = 2;
		}
		else if (casos<500) {
			nivel = 3;
		}
		else {
			nivel = 4;
		}
		return nivel;
	}
}
