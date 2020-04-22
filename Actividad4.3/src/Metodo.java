
public class Metodo {
	
	public static int CalcularMedia(int array[]){
		int resultado = 0;
		int suma = 0;
			for (int i = 0; i < array.length; i++) {
				suma += array[i];
			}
		resultado = suma / array.length;
		return resultado;
	}
	
	
}