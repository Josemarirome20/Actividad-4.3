
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
public static int encontrarTres(int[] array) {
	 int contador = 0;
     for (int i = 0; i < array.length; i++) {
         if(array[i]%10 == 3) {
             contador++;
         }
     }
 System.out.println("Hay " + contador + " números que términan en 3");
 return contador;

	}
}