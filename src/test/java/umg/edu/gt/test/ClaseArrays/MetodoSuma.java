package umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

class MetodoSuma {
    
    private static final Logger logger = LogManager.getLogger(MetodoSuma.class);

    @Test
    void testSuma() {
        logger.info("Iniciando testSuma");
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        int resultado = EjercicioArrays.suma(mat);
        logger.debug("Resultado obtenido: {}", resultado);
        assertEquals(45, resultado);
    }

    @Test
    void testFalla() {
        logger.info("Iniciando testFalla");
        int[][] mat = {{10, 20}, {30, 40}};
        
        int resultado = EjercicioArrays.suma(mat);
        logger.debug("Resultado obtenido: {}", resultado);
        assertEquals(10, resultado);
    }
}