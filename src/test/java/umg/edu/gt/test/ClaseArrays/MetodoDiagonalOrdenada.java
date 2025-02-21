package umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

class MetodoDiagonalOrdenada {

    @Test
    void testOrdenamiento() {
        int[][] mat = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        int[][] esperado = {
            {1, 1, 1, 1},
            {1, 2, 2, 2},
            {1, 2, 3, 3}
        };

        assertArrayEquals(esperado, EjercicioArrays.diagonalMatriz(mat));
    }
    
    @Test
    void testMatrizPeque() {
    	int[][] mat = {
                {9, 3},
                {2, 4}
            };

            int[][] esperado = {
                {4, 3},
                {2, 9}
            };
    	
    	assertArrayEquals(esperado, EjercicioArrays.diagonalMatriz(mat));
    	}
    
    @Test
    void testFalla() {
    	int[][] mat = {
                {9, 3},
                {2, 4}
            };

            int[][] esperado = {
                {9, 3},
                {2, 9}
            };
    	
    	assertArrayEquals(esperado, EjercicioArrays.diagonalMatriz(mat));
    	}
    
    }
