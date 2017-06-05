package ejercicios;
/*dado un nombre y una edad igresado por teclado indicarlo al usuario
 * si es una persona
 * (niño 0-9)
 * adolecente(10-17)
 * adulto(18-60)
 * viejido(61-100)
 * valido que la edad no sea un num negativo, y la edad no 
 * supere los 100 años
 */
public class persona {
	public static void main(String[] args) {
		String nombre= " ";
		int edad = 0;
		String etapaDeVida =" ";
		Robot obj = new Robot();
		
		while (obj.pedirNuevamente) {
			
			System.out.println("Ingrese el Nombre");
			nombre =  obj.leertexto();
		}
		
		obj.pedirNuevamente=true;
		
		while (obj.pedirNuevamente) {
			
			System.out.println("Ingrese la edad");
			edad = (int) obj.leer();
		}
		
		if ( edad < 0 || edad > 100) {

			   System.out.println("Disculpe no se permiten valores negativos, ni personas mayores de 100 anios");
		}
		
		if ( edad >= 0 && edad <=9) {
			etapaDeVida="Niño";
			
		}
		
		if ( edad>=10 && edad <= 17) {
			etapaDeVida="Adolescente";
		}
		
		if (edad >=18 && edad <= 60) {
			etapaDeVida="Adulto";
		}
		
		if (edad>=61 && edad <= 100) {
			etapaDeVida="Adulto anciano";
		}
		
		System.out.println("Nombre: "+nombre+" "+"Edad: "+edad+" "+"Condicion de vida: "+ etapaDeVida);
	   
    
	
	
	
	
	}
	
}
