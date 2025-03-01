package umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

class MetodoDiagonalOrdenada {
    
    private static final Logger logger = LogManager.getLogger(MetodoDiagonalOrdenada.class);

    @Test
    void testOrdenamiento() {
        logger.info("Iniciando testOrdenamiento");
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

        int[][] resultado = EjercicioArrays.diagonalMatriz(mat);
        logger.debug("Resultado obtenido: {}", (Object) resultado);
        assertArrayEquals(esperado, resultado);
    }
    
    @Test
    void testMatrizPeque() {
        logger.info("Iniciando testMatrizPeque");
        int[][] mat = {
            {9, 3},
            {2, 4}
        };

        int[][] esperado = {
            {4, 3},
            {2, 9}
        };
        
        int[][] resultado = EjercicioArrays.diagonalMatriz(mat);
        logger.debug("Resultado obtenido: {}", (Object) resultado);
        assertArrayEquals(esperado, resultado);
    }
    
    @Test
    void testFalla() {
        logger.info("Iniciando testFalla");
        int[][] mat = {
            {9, 3},
            {2, 4}
        };

        int[][] esperado = {
            {9, 3},
            {2, 9}
        };
        
        int[][] resultado = EjercicioArrays.diagonalMatriz(mat);
        logger.debug("Resultado obtenido: {}", (Object) resultado);
        assertArrayEquals(esperado, resultado);
    }
}
