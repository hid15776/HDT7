/**
 * @author Marlon Hernandez, Jackeline Hidalgo, Steven Rubio
 * Clase Association
 * Hace implementacion para asociar palabras en ingles y espanol
 * @version 26/09/2016
 */

public class Association<K, V> {
    K key;
    V valor;
    
    //Agrega ambas palabras y crea asociacion
    public void addAsociation(K key, V valor){
        this.key = key;
        this.valor = valor;
    }
    //Returna palabra en ingles
    public K getKey(){
        return this.key;
    }
    //Returna palabra en espanol
    public V getValor(){
        return this.valor;
    }
}
