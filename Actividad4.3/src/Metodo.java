
public class Metodo {
	
	public static int CalcularMedia(int array[]){
		int resultado = 0;
		int suma = 0;
			for (int i = 0; i < array.length; i++) {
				suma += array[i];
			}
		resultado = suma / array.length;
		System.out.println("La Media es : " + resultado);
		return resultado;
	}
public static int encontrarTres(String[]Array3) {
		
		int contador=0;
		
		for(int i=0;i<Array3.length;i++) {
			if(Array3.equals("3")) {
				contador++;
				System.out.println("El número de coincidencias con "+ Array3[1]+" son: "+contador);
			}else {
				System.out.println("No hay ninguna coincidencia");
			}
			
		}
		
		int resultado=0;
		return resultado;
	}
}