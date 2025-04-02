package umg.edu.gt.test.EjercicioTree;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.TreeMap;
import java.util.TreeSet;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioTreeSetAndMap;

import org.junit.jupiter.api.Test;

class EjercicioTreeSetAndMapTest {

	//Ejercicio 1
    @Test
    public void testContarFrecuenciaPalabras() {
        String archivo = "src/test/resources/TestMensaje.txt";
        
        TreeMap<String, Integer> resultado = EjercicioTreeSetAndMap.contarFrecuenciaPalabras(archivo);
        assertEquals(1, resultado.get("hola"));//aca falla porque la palabra hola aparece dos vecees
        assertEquals(1, resultado.get("que"));
        assertEquals(2, resultado.get("hace"));
    }
    
    
    //Ejercicio 2
    @Test
    public void testRastreadorVersiones() {
        EjercicioTreeSetAndMap.RastreadorVersiones rastreador = new EjercicioTreeSetAndMap.RastreadorVersiones();
        rastreador.agregarVersion("System.out.println(\"Hola Mundo\");");
        rastreador.agregarVersion("System.out.println(\"Hola Java\");");
        
        assertEquals("System.out.println(\"Hola Mundo\");", rastreador.obtenerVersion(1));
        assertEquals("System.out.println(\"Hola Java\");", rastreador.obtenerUltimaVersion());
        
        rastreador.eliminarVersion(1);
        assertEquals("Versión no encontrada", rastreador.obtenerVersion(1));
    }
    
    //Ejercicio 3
    @Test
    public void testGestionarEventos() {
        TreeSet<EjercicioTreeSetAndMap.Evento> eventos = new TreeSet<>();
        eventos.add(new EjercicioTreeSetAndMap.Evento(LocalDateTime.of(2025, 4, 15, 14, 0), "Taller ML", "Sala 3"));
        eventos.add(new EjercicioTreeSetAndMap.Evento(LocalDateTime.of(2025, 5, 10, 10, 0), "Conferencia Java", "Auditorio A"));

        assertEquals("Taller ML", eventos.first().getNombre());

        eventos.remove(eventos.first());
        assertEquals("Conferencia Java", eventos.first().getNombre());
    }
}
