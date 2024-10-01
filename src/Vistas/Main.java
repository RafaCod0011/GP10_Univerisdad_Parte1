package Vistas;

import accesoADatos.Conexion;
import accesoADatos.AlumnoData;
import com.sun.jdi.connect.spi.Connection;
import entidades.Alumno;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Alumno loco = new Alumno (228528, "Marcos", "Quiroga", LocalDate.of(2005, 11, 11), true);
        AlumnoData alu = new AlumnoData();
        
          alu.guardarAlumno(loco);
          System.out.println(loco.toString());
            
      //  alu.modificarAlumno(loco);
        
        // Primero ejecutar 1 VEZ para guardar el alumno en la base de datos y luego si se desea modificar
        // un alumno en especifico, comentar el guardado de los demas.
        
        // Ademas de modificar los datos del alumno, tambien tenemos que añadirle al principio el ID
        
        // Editar la los campos que se desea modificar y ejecutar el metodo modificarAlumno colocando este mismo en el
        // argumento del metodo.
        
        
        Alumno lauti = new Alumno (2121, "Lautaro", "Arguello", LocalDate.of(2005, 4, 1), true);
        alu.guardarAlumno(lauti);
        //alu.modificarAlumno(lauti);
        
        Alumno rafa = new Alumno (4,39396258, "Rafael", "Cuello", LocalDate.of(1996, 11, 5), true);
        alu.guardarAlumno(rafa);
        //alu.modificarAlumno(rafa);
        
        Alumno facu = new Alumno (3131, "Facundo", "Garcia", LocalDate.of(1990, 8, 18), true);
        alu.guardarAlumno(facu);
//        alu.modificarAlumno(facu);
//        
        Alumno agus = new Alumno (1414, "Agustin", "Piccardo", LocalDate.of(2000, 2, 21), true);
        alu.guardarAlumno(agus);
        //alu.modificarAlumno(agus);
    }
    
}
