
public class Main {
	
	public static void main (String[] args) {
		
		

		int plazas = 50;
		int casos = 256;
		
		Pasajero pasajero = new Pasajero(78, false, false, false, false);
		CalcularPrecio p = new CalcularPrecio();
		int nivel = p.calcularNivel(casos);
		int plazasN = p.calcularPlazasNormales(plazas, nivel);
		
		double precio = p.CalcularPrecioBillete(nivel, pasajero.getEdad(), pasajero.isProfesional(),
					pasajero.isEnfermo(), pasajero.isSintomas(), pasajero.isContactoReciente(), plazas, plazasN);
		//Imprime el resultado
		if (precio != 0) System.out.println("El precio final es "+ precio);
		else {System.out.println("No se puede vender");}
	}
}
