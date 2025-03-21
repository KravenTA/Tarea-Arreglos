package umg.edu.gt.test.EjercicioLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList;

class EjercicioLinkedListTest {
	
	//Problema 1, eliminar duplicados
	@Test
	void testDupli() {
		EjercicioLinkedList linked= new EjercicioLinkedList();
		LinkedList<Integer> list= new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		
		linked.eliminarDup(list);
		
		//verificar que solo tenga 4 elementos 
	    assertTrue(list.contains(1));
	    assertTrue(list.contains(2));
	    assertTrue(list.contains(3));
	    assertTrue(list.contains(4));
	}
	
	//Problema 2, invertir
	
	@Test
	void testInve() {
		EjercicioLinkedList linked= new EjercicioLinkedList();
		LinkedList<String> list= new LinkedList<>();
		
		list.add("s");
		list.add("a");
		list.add("p");
		list.add("i");
		list.add("t");
		list.add("o");
		
		linked.invertirLista(list);
		
		//verificar que la lista no haya cambiado de tamano
		
		assertEquals(6,list.size());
		assertEquals("s",list.get(0));//Se fuerza al fallo esperando una s donde deberia ir una o
		assertEquals("a",list.get(1));
		assertEquals("p",list.get(2));
		assertEquals("i",list.get(3));
		assertEquals("t",list.get(4));
		assertEquals("o",list.get(5));
	}
	
	@Test
	void testMix() {
	    EjercicioLinkedList ejercicio = new EjercicioLinkedList();
	    LinkedList<Integer> listf = new LinkedList<>();
	    listf.add(1);
	    listf.add(3);

	    LinkedList<Integer> lists = new LinkedList<>();
	    lists.add(2);
	    lists.add(4);

	    LinkedList<Integer> resultado = ejercicio.mixerListas(listf, lists);

	    assertEquals(4, resultado.size());  
	    assertEquals((Integer) 1, resultado.get(0));
	    assertEquals((Integer) 2, resultado.get(1));
	    assertEquals((Integer) 3, resultado.get(2));
	    assertEquals((Integer) 4, resultado.get(3));
	}
}
