package ejercicios;
/*Ordenar un arreglo de enteros de mayor a menor e 
imprimir la nueva estructura por pantalla*/
public class OrdenarArreglos {

	public static void main(String[] args) {
		//inicial
		int[]A= new int[4];
		//Final
		int[]B= new int[4];
		//Almacenar indices
	
		
	    Robot obj = new Robot();
		
	   
		int temp=0;
	    //ingresamos un bucle for para poder ingresar los valores en mi arreglo
		for (int x = 0; x < 4; x++) {
		System.out.println("Ingrese Numero");
		  A[x]=(int)obj.leer();
		
		}
		//
	    for (int  y= 0; y < 4; y++) {
	    	for (int z = y+1; z < 4; z++) {
				if (A[z]>A[y]) {
					temp=A[z];//temp le asigna el valor en A[z]
				    A[z]=A[y];//en la posicion A[z] guardo A[y]
				    A[y]= temp;// en la posicion A[y] guardo temp
				    B=A;
		  }	
	     }
	    }
		System.out.println("------------- ");
	    System.out.println("En orden de mayor a menor");
	    for (int i = 0; i < 4; i++) {
			
	    	System.out.println(B[i]);
		}

	}
	
}