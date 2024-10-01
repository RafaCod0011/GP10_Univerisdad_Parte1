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
      
        
        loco.setApellido("Quiroga Ramos");
        loco.setNombre("Marcos Martin");
        
        alu.modificarAlumno(loco);
        
        //Alumno lauti = new Alumno (2121, "Lautaro", "Arguello", LocalDate.of(2005, 4, 1), true);
        //alu.guardarAlumno(lauti);
        //alu.modificarAlumno(lauti);
        
        //Alumno rafa = new Alumno (1313, "Rafael", "Cuello", LocalDate.of(2001, 5, 13), true);
        //alu.guardarAlumno(rafa);
        //alu.modificarAlumno(rafa);
        
        //Alumno facu = new Alumno (3131, "Facundo", "Garcia", LocalDate.of(1990, 8, 18), true);
        //alu.guardarAlumno(facu);
        //alu.modificarAlumno(facu);
        
        //Alumno agus = new Alumno (1414, "Agustin", "Piccardo", LocalDate.of(2000, 2, 21), true);
        //alu.guardarAlumno(agus);
        //alu.modificarAlumno(agus);
    }
    
}
