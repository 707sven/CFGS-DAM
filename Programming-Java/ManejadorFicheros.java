package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//esta clase manejara escritura lectura, cracion y destruccion de ficheros

public class ManejadorFicheros {

	public ManejadorFicheros() {
		// TODO Auto-generated constructor stub
	}
	
	//Este metodo crea un fichero
	//path es la ruta absoluta o relativa del fichero
	public void creaFichero(String path) {
		
		File file = new File(path);
	
	}
	
	//Este metodo crea un fichero e inserta datos en el
	
	
	//Este metodo inserta datos de un string en un fichero con el path del fichero
	//OJO INSERTA UN ESPACIO AL FINAL DE CADA DATO INSERTADO
	public void insertarDatos(String datos, String path) throws IOException {
		//abro el fichero
		
		File file = new File(path);
		
		//si consegui abrir el fichero
		if(path!=null) {
			System.out.println("Fichero creado");
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write(datos+" ");
			//cerramos el buffer para que escriba los datos
			br.close();
			fw.close();
			
		}
	}
	//Este metodo sobrescribe datos en un fichero con el path del fichero
	//OJO INSERTA UN ESPACIO AL FINAL DE CADA DATO INSERTADO
	public void insertarDatosOver(String datos, String path) throws IOException {
		//abro el fichero
		
		File file = new File(path);
		
		//si consegui abrir el fichero
		if(path!=null) {
			System.out.println("Fichero creado");
			FileWriter fw = new FileWriter(file);
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write(datos);
			//cerramos el buffer para que escriba los datos
			br.close();
			fw.close();
			
		}
	}
	
	//Lee un fichero txt entero y devuelve una lista string con los datos 
	public ArrayList<String> obtenerDatosFichero(String path) throws FileNotFoundException,IOException {
		//Creo la lista
		ArrayList<String>texto = new ArrayList<String>();
		//Abro fichero
		File file = new File(path);
		//Abro reader
		FileReader fr = new FileReader(file);
		//Abro buffer
		BufferedReader br = new BufferedReader(fr);
		
		//leo linea
		String linea=br.readLine();
		while(linea!=null) {
			texto.add(linea);
			linea=br.readLine();
		}
		br.close();
		fr.close();
	
		
		return texto;
	}
	
	//Este metodo lee todo el contenido de un fichero
	public void leeFichero(String path) throws FileNotFoundException, IOException {
		ArrayList<String> datos = obtenerDatosFichero(path);
		for(String s:datos){
			System.out.println(s);
		}
	}
	
	//Este metodo procesa un texto y devuelve una lista con las palabras del texto
	public ArrayList<String> obtenerPalabrasDeTexto(ArrayList<String> texto) {
		ArrayList<String> listaPal = new ArrayList<String>();
		for(String linea : texto) {
			//Separo las palabras
			//Paso el array a lista y lo agrego a la lista de palabras
			listaPal.addAll(Arrays.asList(linea.split(" ")));
		}
		return listaPal;
	}
	
	//Este metodo filtra un texto de palabrotas y las reemplaza por palabras buenas
	//devuelve una lista 
	//recibe por parametro el texto (una lista de palabras), un array de palabrotas y un array de palabras
	
	public ArrayList<String> filtrarTexto(ArrayList<String> texto, String[] palabrotas, String[] palabras) {
	ArrayList<String>filtrado = new ArrayList<String>();
	List<String>listaPalabrotas =  Arrays.asList(palabrotas);
	List<String>listaPalabras =  Arrays.asList(palabras);
	Random random = new Random();
	int rand;
	
		for(String palabra: texto) {
			
			if(listaPalabrotas.contains(palabra.toLowerCase())){
				//si es una palabrota
			    rand = random.nextInt(palabras.length);
				filtrado.add(palabras[rand]);
			}
			else {
				//si no lo es
				filtrado.add(palabra);
			}
			
		}
	
		return filtrado;
	}
	
	//Este metodo filtra el fichero de palabrotas
	public void filtrarFichero(String path, String[] palabrotas, String[] palabras) throws IOException {
		ArrayList<String> datos = new ArrayList<String>();
		datos= obtenerDatosFichero(path);
		datos = obtenerPalabrasDeTexto(datos);
		datos = filtrarTexto(datos, palabrotas, palabras);
		String texto= "";
		for(String palabra : datos) {
			
				texto=texto.concat(palabra.concat(" "));
				
		
		
		}
		
		//System.out.println("texto:"+texto);
	   insertarDatosOver(texto, path);
		
	}
	
	
	
}
