package Vistas;

import accesoADatos.Conexion;
import accesoADatos.AlumnoData;
import com.sun.jdi.connect.spi.Connection;
import entidades.Alumno;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Alumno santi = new Alumno (12312312, "Fantini", "Santino", LocalDate.of(2005, 12, 11), true);
        AlumnoData alu = new AlumnoData();
    }
    
}
