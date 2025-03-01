package umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

class MetodoRicachon {
    
    private static final Logger logger = LogManager.getLogger(MetodoRicachon.class);

    @Test
    void testRicachon() {
        logger.info("Iniciando testRicachon");
        int[][] dinerito = {
            {1, 5}, {7, 2}, {3, 5}
        };
        
        int resultado = EjercicioArrays.ricachon(dinerito);
        logger.debug("Resultado obtenido: {}", resultado);
        assertEquals(9, resultado);
    }
    
    @Test
    void testFalla() {
        logger.info("Iniciando testFalla");
        int[][] dinerito = {
            {15, 500}, {11, 5}
        };
        
        int resultado = EjercicioArrays.ricachon(dinerito);
        logger.debug("Resultado obtenido: {}", resultado);
        assertEquals(515, resultado);
    }
}
