package proyecto;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Inicio");	
		String path ="test.txt";
		ManejadorFicheros mf = new ManejadorFicheros();
		ArrayList<String> datos = new ArrayList<String>();
		
		String[] palabrotas = {"insulto1","insulto2","insulto3", "insulto4", "insulto5"};
		String[] palabras = {"dios","genio","mastodonte"};
	
		try {
			//mf.creaFichero(path);
			//mf.insertarDatos("Hola", path);
			//mf.leeFichero(path);
		/*	datos=mf.obtenerDatosFichero(path);
			datos=mf.obtenerPalabrasDeTexto(datos);
			System.out.println(datos.toString());
			datos=mf.filtrarTexto(datos, palabrotas, palabras);*/
			mf.filtrarFichero(path, palabrotas, palabras);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(datos.toString());
		System.out.println("FIN");
	}

}
