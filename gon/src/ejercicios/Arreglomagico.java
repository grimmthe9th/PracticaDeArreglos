package ejercicios;

public class Arreglomagico {

	public static void main(String[] args) {
		int[]A= new int[4];
		Robot obj= new Robot();
	
	    for (int i = 0; i < 4; i++) {
			System.out.println("ingrese valor");
		    A[i]=(int)obj.leer();
	    }
        A=obj.ordenarMagicamente(A);
        for (int x = 0; x < 4; x++) {
			System.out.println(A[x]);
		}
	}
}
