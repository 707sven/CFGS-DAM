/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelpractica3;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ClaseFactura {
    //Atributos
    private ClasePersona Persona;
    private String FechaDormir;
    private String TipoHabitacion;
    private int NumeroPersonas;
    private boolean Alojamiento;
    private int NumeroFactura;
    private double PrecioTotal;
    
    //Constructores
    public ClaseFactura () {
    }
    
    public ClaseFactura(ClasePersona Persona, String FechaDormir, String TipoHabitacion, int NumeroPersonas, boolean Alojamiento, int NumeroFactura) {
        this.Persona = Persona;
        this.FechaDormir = FechaDormir;
        this.TipoHabitacion = TipoHabitacion;
        this.NumeroPersonas = NumeroPersonas;
        this.Alojamiento = Alojamiento;
        this.NumeroFactura = NumeroFactura;
    }

    public ClasePersona getPersona() {
        return Persona;
    }

    public void setPersona(ClasePersona Persona) {
        this.Persona = Persona;
    }

    
    public String getFechaDormir() {
        return FechaDormir;
    }

    public void setFechaDormir(String FechaDormir) {
        this.FechaDormir = FechaDormir;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public int getNumeroPersonas() {
        return NumeroPersonas;
    }

    public void setNumeroPersonas(int NumeroPersonas) {
        this.NumeroPersonas = NumeroPersonas;
    }

    public boolean getAlojamiento() {
        return Alojamiento;
    }

    public void setAlojamiento(boolean Alojamiento) {
        this.Alojamiento = Alojamiento;
    }

    public int getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(int NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(int PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
    
    //Metodos
    
    @Override
    public String toString () {
        return "Factura nº" + this.NumeroFactura + ": " + this.Persona + ", " + this.FechaDormir + ", " + this.TipoHabitacion + ", " + this.NumeroPersonas + " personas, " + this.Alojamiento + "." + "\n";
    }

    public double PrecioTotal() {
        int PrecioNoche = 40;
        int PrecioPersonas = this.NumeroPersonas * 10;
        int PrecioAlojamiento;
        int PrecioHabitacion;
        if (this.Alojamiento) {
            PrecioAlojamiento = 20;
        } else {
            PrecioAlojamiento = 0;
        }
        if (this.TipoHabitacion.equals("Doble")) {
           PrecioHabitacion = 10;
        } else {
            PrecioHabitacion = 0;
        }
        double FacturaTotal = PrecioNoche + PrecioPersonas + PrecioAlojamiento + PrecioHabitacion;
        return FacturaTotal;
    }
    public void NumeroFacturaDatos() {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce el número de factura: ");
        int NumeroFacturaDatos = leer.nextInt();
        
        if (NumeroFacturaDatos == this.NumeroFactura) {
            System.out.println(toString() + "\n");
        } else {
            System.out.println("No existe ese número de factura. \n");
        }
    }
}


