/*
 * @author Marlon Hernandez, Jackeline Hidalgo, Steven Rubio
 * Clase ReadFile
 * @version 26/09/2016
 */

import java.io.*;
import java.util.*;

public class ReadFile {

	private static Scanner input;
	private static BufferedReader buffer;
	int i = 0;
	String read;
	String[] readArray = null; 

	public String[] ReadFile() throws IOException {

		input = new Scanner(System.in);
        FileReader diccionario = new FileReader("diccionario.txt");
		buffer = new BufferedReader(diccionario);
		
        List<String> list = new ArrayList<String>();

        while( (read=buffer.readLine()) != null){
           readArray = read.split("\\)\\ \\(");
           
        }

        return readArray;
	}

}
