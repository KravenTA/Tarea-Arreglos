package umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

class MetodoSuma {


    @Test
    void testSuma() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(45, EjercicioArrays.suma(mat));
    }

    @Test
    void testFalla() {
        int[][] mat = {{10, 20}, {30, 40}};
        assertEquals(10,EjercicioArrays.suma(mat));
    }
}
