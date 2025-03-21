package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;
import java.util.LinkedList;

public class EjercicioLinkedList {
	/** INSTRUCCIONES
 	Escriba el algoritmo que resuelve el problema en esta clase.
	Debe crear un package llamado umg.edu.gt.test.EjercicioLinkedList que corresponda al Test de esta clase.
	Genere un Test por cada ejemplo y fuerce que uno de esos Test falle, puede implementar retornar un resultado
	y compararlo con el esperado.
	 */
	
	// Usando LinkedList de Java Collections, resuelva los siguientes problemas
	// Problema 1: Dada una LinkedList<Integer>, escribir un método que elimine los valores duplicados, dejando solo la primera aparición de cada número.
	
	public void eliminarDup(LinkedList<Integer> linki) {
		
        if (linki == null || linki.size() < 2) {//se verifica si hay duplicados o la lista esta vacia 
            return; 
        }

        LinkedList<Integer> listaSinDuplicados = new LinkedList<>();//Lista para guardar la primera aparición de cada numero
        
        for (Integer num : linki) {
            if (!listaSinDuplicados.contains(num)) {//verifica si num ya esta en listaSinDuplicados
                listaSinDuplicados.add(num);
            }
        }
        
        // Limpiar la lista original y copiar los elementos únicos
        linki.clear();
        linki.addAll(listaSinDuplicados);
    }
	
	// Problema 2: Implementar un método que invierta los elementos de una LinkedList<String> sin usar otra lista o ArrayList.
	
	public void invertirLista(LinkedList<String> linki) {
        if (linki == null || linki.size() < 2) {//se verifica que la lista no sea nula o este vacia
        	return;
        }
		
        int primero=0;
        int segundo=linki.size()-1;
        
        while(primero<segundo) {
        	//Intercambiar los elementos de la primera y segunda posici[on
        	String tempo= linki.get(primero);
        	linki.set(primero, linki.get(segundo));
        	
        	//Mover los indices
        	primero++;
        	segundo--;
        	
        	
        }
        
		
	}
	
		
	// Problema 3: Dadas dos listas enlazadas ordenadas de enteros, escribir un método que devuelva una nueva LinkedList<Integer> con los elementos de ambas listas intercalados en orden.

	public LinkedList<Integer> mixerListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
		
        if (lista1 == null || lista1.isEmpty()) return lista2; //si lista 1 esta vacia o es nula retorna lista 2
        if (lista2 == null || lista2.isEmpty()) return lista1; //si lista 1 esta vacia o es nula retorna lista 2

        LinkedList<Integer> resultado = new LinkedList<>();//para almacenar el resultado
        int i = 0, j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        // Agregar elementos restantes de lista1 o lista2
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }
        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }

        return resultado;
    }


}