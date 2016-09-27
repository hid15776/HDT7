/**
 * @author Marlon Hernandez, Jackeline Hidalgo, Steven Rubio
 * Clase Lector
 * Lee y traduce el archivo de texto
 * @version 26/09/2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List; 
import java.util.*;


public class Lector {

	public static void main(String[] args) {
	    // TODO code application logic here
	
	    ArrayList<Association> comp = new ArrayList();
	    // TODO code application logic here
	    File f = new File( "src/diccionario.txt" );
	    BufferedReader input;
	    try {
	    input = new BufferedReader( new FileReader( f ) );
	    String enunciado;
	    
	    //Lee la primera pareja de palabras
	    enunciado = input.readLine();
	    //
	        while(input.ready()){
	            enunciado = input.readLine();
	            String vector[] = enunciado.split(",");
	            //Crea un objeto de la clase Association para crear una asociacion
	            Association separado = new Association();
	            separado.addAsociation( vector[0].substring(1), vector[1].substring(0,vector[1].length()-1));
	            //Lo agrega al arreglo
		        comp.add(separado);
	        }
	
	    }catch (IOException e) {
	    e.printStackTrace();
	    }
	    
        System.out.println("Las palabras del diccionario son:");
	    BinaryTree diccionario = new BinaryTree();
	    //Crea el arbol con las asociaciones 
	    for (int x = 0; x < comp.size(); x++){
	        diccionario.addNode(comp.get(x).getKey().toString(), comp.get(x).getValor().toString());
	    }
	    
	    //Recorre el arbol en in-order y imprime nos nodos en el oden con su asociacion
	    diccionario.inOrderTraverseTree(diccionario.root);
	   
	    //Lee el archivo texto
	    File f1 = new File( "src/texto.txt" );
	    BufferedReader input2;
	    try {
	        input2 = new BufferedReader( new FileReader( f1 ) );
	        String enunciado;
	        enunciado = input2.readLine();
	        enunciado = enunciado.toLowerCase();
	        //Imprime el texto leido
	        System.out.println("\nEl texto a traducir es:");
	        System.out.println(enunciado);
	        
	        //TRADUCCION DEL TEXTO
	        String[] palabras = enunciado.split(" ");
	        String cadena = "";
	        for (int x =0; x < palabras.length; x++){
	        	//Para traduccion toma la palabra en espanol de la asociacion
	            String traducir = diccionario.findName(palabras[x].toString());
	            if(palabras[x].equals("house")|| palabras[x].equals("dog")|| palabras[x].equals("homework") || palabras[x].equals("woman") || palabras[x].equals("town")
	                    || palabras[x].equals("yes")){
	                cadena += traducir + " ";
	                //Si no existe la palabra la imprimira entre asteriscos
	            }else{
	                cadena += " *"+palabras[x]+"* ";
	            }
	        }
	        //Imprime la cadena
	        System.out.println(cadena);
	        
	        
	    }catch (IOException e) {
	    e.printStackTrace();
	    }   
	    
	     
	}


}

