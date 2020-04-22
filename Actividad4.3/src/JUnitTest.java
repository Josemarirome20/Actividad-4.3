import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
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
