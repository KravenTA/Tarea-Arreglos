package umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

class MetodoRicachon {

	@Test
	void testRicachon() {
		int [][] dinerito={
				{1,5},{7,2},{3,5}
		};
		assertEquals(9,EjercicioArrays.ricachon(dinerito));
	}
	
	@Test
	void testFalla() {
		int [][] dinerito={
				{15,5},{11,5}
		};
		
		assertEquals(16,EjercicioArrays.ricachon(dinerito));
	}

}
