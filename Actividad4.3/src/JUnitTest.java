import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {
	@Test
	/**
	 * int array un array con los números en los que encontrara los que terminan en 3
	 * int resultado el resultado que da dicho metodo
	 */
	void TestEncontrar() {
        int [] array = {3, 13, 22, 4, 32, 14, 23};
        int resultado = Metodo.encontrarTres(array); 
        assertEquals(3, resultado);
    }
	
	  @Test
	    void TestMedia() {
	        int [] array = {3, 13, 22, 4, 32, 14, 23};
	        int resultado = Metodo.CalcularMedia(array);
	        assertEquals(15, resultado);
	    }

}
