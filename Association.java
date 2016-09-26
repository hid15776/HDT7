/**
 * @author Marlon Hernandez, Jackeline Hidalgo, Steven Rubio
 * Clase Association
 * Hace implementacion para asociar palabras en ingles y espanol
 * @version 26/09/2016
 */

public class Association<K, V> {
    K key;
    V value;
    
	// Se asocian las palabras
    public void addAsociation(K key, V value){
        this.key = key;
        this.value = value;
    }
	
	//Returna la palabra en espanol
    public V getValor(){
        return this.value;
    }
	
	//Returna la palabra en ingles
    public K getKey(){
        return this.key;
    }
	
}
