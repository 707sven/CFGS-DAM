/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelpractica3;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class HotelPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Practica 3 - Hotel [Marta Albarracin Martin, 1B DAM]
        //Creamos un hotel con la clase hotel
        ClaseHotel hotel1 = new ClaseHotel ("President", "Calle President", 10);
        
        //Creamos las personas que se van a alojar en el hotel
        ClasePersona persona1 = new ClasePersona ("Antonio", 18, "74443245D");
        ClasePersona persona2 = new ClasePersona ("Andrea", 29, "77889966A");
        ClasePersona persona3 = new ClasePersona ("Paco", 44, "33789432M");
        ClasePersona persona4 = new ClasePersona ("Aitana", 28, "88996657E");
        ClasePersona persona5 = new ClasePersona ("Fabian", 23, "99772233B");
        
        //Creamos las facturas de las personas que se alojan en el hotel
        ClaseFactura factura1 = new ClaseFactura(persona1, "18/12/2022", "Doble", 2, true, 1);
        ClaseFactura factura2 = new ClaseFactura(persona2, "30/12/2022", "Simple", 2, true, 2);
        ClaseFactura factura3 = new ClaseFactura(persona3, "12/11/2022", "Doble", 8, false, 3);
        ClaseFactura factura4 = new ClaseFactura(persona4, "05/06/2023", "Simple", 1, false, 4);
        ClaseFactura factura5 = new ClaseFactura(persona5, "19/04/2023", "Doble",4, false, 5);
        
        //Creamos las facturas del hotel (una factura por persona)
        ClaseFactura [] factura_hotel1 = new ClaseFactura[10];
        factura_hotel1 [0] = factura1;
        factura_hotel1 [1] = factura2;
        factura_hotel1 [2] = factura3;
        factura_hotel1 [3] = factura4;
        factura_hotel1 [4] = factura5;
        
        //Añadimos las facturas al hotel
        hotel1.setFactura(factura_hotel1);
        
        //Mostramos los datos del hotel
        System.out.println("====>> Datos del Hotel 1 <<====");
        System.out.println(hotel1.toString() + "\n");
        
        //Calculamos el precio total de cada factura
        System.out.println("====>> Precio total de cada factura <<====");
        System.out.println( "Precio total de la factura nº" + factura1.getNumeroFactura() + " = " + factura1.PrecioTotal() + " €.");
        System.out.println("Precio total de la factura nº"+ factura2.getNumeroFactura() + " = " + factura2.PrecioTotal() + " €.");
        System.out.println("Precio total de la factura nº"+ factura3.getNumeroFactura() + " = " + factura3.PrecioTotal() + " €.");
        System.out.println("Precio total de la factura nº"+ factura4.getNumeroFactura() + " = " + factura4.PrecioTotal() + " €.");
        System.out.println("Precio total de la factura nº"+ factura5.getNumeroFactura() + " = " + factura5.PrecioTotal() + " €. \n");
        
        Scanner leer = new Scanner(System.in);
        
        //Obtener el nombre de la persona dado el nº de factura
        System.out.println("====>> Obtener el nombre de una persona por el nº de factura <<====");
        System.out.print("Introduce el número de factura: ");
        int NumeroFactura = leer.nextInt();
        
        if (NumeroFactura == factura1.getNumeroFactura()) {
            System.out.println("Nombre del propietario de la factura: " + factura1.getPersona().getNombre() + "\n");
        } else if (NumeroFactura == factura2.getNumeroFactura()) {
            System.out.println("Nombre del propietario de la factura: " + factura2.getPersona().getNombre() + "\n");
        } else if (NumeroFactura == factura3.getNumeroFactura()) {
            System.out.println("Nombre del propietario de la factura: " + factura3.getPersona().getNombre() + "\n");
        } else if (NumeroFactura == factura4.getNumeroFactura()) {
            System.out.println("Nombre del propietario de la factura: " + factura4.getPersona().getNombre() + "\n");
        } else if (NumeroFactura == factura5.getNumeroFactura()) {
            System.out.println("Nombre del propietario de la factura: " + factura5.getPersona().getNombre() + "\n");
        } else {
            System.out.println("No existe ese número de factura. \n");
        }
        
        //Obtener los datos de una factura dado el nº de factura
        System.out.println("====>> Mostrar datos de una factura con el nº de factura <<====");
        System.out.print("Introduce el número de factura: ");
        int NumeroFacturaDatos = leer.nextInt();
        
        if (NumeroFacturaDatos == factura1.getNumeroFactura()) {
            System.out.println(factura1.toString());
        } else if (NumeroFacturaDatos == factura2.getNumeroFactura()) {
            System.out.println(factura2.toString());
        } else if (NumeroFacturaDatos == factura3.getNumeroFactura()) {
            System.out.println(factura3.toString() );
        } else if (NumeroFacturaDatos == factura4.getNumeroFactura()) {
            System.out.println(factura4.toString());
        } else if (NumeroFacturaDatos == factura5.getNumeroFactura()) {
            System.out.println(factura5.toString());
        } else {
            System.out.println("No existe ese número de factura. \n");
        }
        
        //Obtener los datos de una factura dado el nombre de la factura
        System.out.println("====>> Mostrar facturas con un nombre <<====");
        System.out.print("Introduce el nombre de la factura: ");
        String NombreFactura = leer.next();
        
        if (NombreFactura.equalsIgnoreCase(factura1.getPersona().getNombre())) {
            System.out.println(factura1.toString());
        } else if (NombreFactura.equalsIgnoreCase(factura2.getPersona().getNombre())) {
            System.out.println(factura2.toString());
        } else if (NombreFactura.equalsIgnoreCase(factura3.getPersona().getNombre())) {
            System.out.println(factura3.toString());
        } else if (NombreFactura.equalsIgnoreCase(factura4.getPersona().getNombre())) {
            System.out.println(factura4.toString());
        } else if (NombreFactura.equalsIgnoreCase(factura5.getPersona().getNombre())) {
            System.out.println(factura5.toString());
        } else {
            System.out.println("No existe ese nombre de factura. \n");
        }
        
        //Mostrar por consola las facturas con una fecha dada
        System.out.println("====>> Mostrar facturas con una fecha <<====");
        System.out.print("Introduce la fecha de la factura (DD/MM/AAAA): ");
        String FechaFactura = leer.next();
        
        if (FechaFactura.equals(factura1.getFechaDormir())) {
            System.out.println(factura1.toString());
        } else if (FechaFactura.equals(factura2.getFechaDormir())) {
            System.out.println(factura2.toString());
        } else if (FechaFactura.equals(factura3.getFechaDormir())) {
            System.out.println(factura3.toString());
        } else if (FechaFactura.equals(factura4.getFechaDormir())) {
            System.out.println(factura4.toString());
        } else if (FechaFactura.equals(factura5.getFechaDormir())) {
            System.out.println(factura5.toString());
        } else {
            System.out.println("No hay ninguna factura registrada con esa fecha. \n");
        }
        
        //Calcular el coste total de todas las facturas del hotel
        System.out.println("====>> Ganancias totales del hotel <<====");
        double CosteTotal = factura1.PrecioTotal() + factura2.PrecioTotal() + factura3.PrecioTotal() + factura4.PrecioTotal() + factura5.PrecioTotal();
        System.out.println("Precio total de las facturas actuales del hotel: " + CosteTotal + " €");
    }
}