package Vistas;

import accesoADatos.Conexion;
import accesoADatos.AlumnoData;
import com.sun.jdi.connect.spi.Connection;
import entidades.Alumno;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        AlumnoData movimientos = new AlumnoData();
        //CREAMOS LOS ALUMNOS

        Alumno lauti = new Alumno (2121, "Lautaro", "Arguello", LocalDate.of(2005, 4, 1), true);
        Alumno rafa = new Alumno (4,39396258, "Rafael", "Cuello", LocalDate.of(1996, 11, 5), true);
        Alumno facu = new Alumno (3131, "Facundo", "Garcia", LocalDate.of(1990, 8, 18), true);
        Alumno agus = new Alumno (1414, "Agustin", "Piccardo", LocalDate.of(2000, 2, 21), true);
        Alumno santi = new Alumno (46222, "Santino", "Fantini", LocalDate.of(2012, 11, 12), true);
      
        
        
        movimientos.guardarAlumno(lauti);
        movimientos.guardarAlumno(rafa);
        movimientos.guardarAlumno(facu);
        movimientos.guardarAlumno(agus);
        movimientos.guardarAlumno(santi);
        
        // LISTAMOS LOS ALUMNOS GUARDADOS
        System.out.println("************ Listado de Alumnos *************");
        for (Alumno alumno: movimientos.listarAlumnos()) {
            System.out.println(alumno.getApellido() + " "+ alumno.getNombre()+ " " + alumno.getDni()) ;

        }
        
//        Alumno lauti = new Alumno (1,46486356, "Lautaro ", "Arguello", LocalDate.of(2005, 4, 1), true);  
//        movimientos.modificarAlumno(lauti);
        
        
        // MODIFICAMOS DATOS DE ALUMNOS
        System.out.println("************ Modificamos datos personales de Arguello y Garcia  *************");
        lauti.setApellido("Arguello Arguello");
        facu.setNombre("Manuel Facundo");
        movimientos.modificarAlumno(lauti);
        movimientos.modificarAlumno(facu);
        
        // LISTAMOS LOS ALUMNOS GUARDADOS
        
        System.out.println("************ Listado de Alumnos *************");
        for (Alumno alumno: movimientos.listarAlumnos()) {
            System.out.println(alumno.getApellido() + " "+ alumno.getNombre()+ " " + alumno.getDni()) ;

        }   
          
        // LE DAMOS DE BAJA LOGICA A UN ALUMNO
        System.out.println("************ Baja Lógica de Arguello *************");
        movimientos.eliminarAlumno(lauti.getIdAlumno());
        
    
        // LISTAMOS LOS ALUMNOS GUARDADOS
        System.out.println("************ Listado de Alumnos *************");
        for (Alumno alumno: movimientos.listarAlumnos()) {
            System.out.println(alumno.getApellido() + " "+ alumno.getNombre()+ " " + alumno.getDni()) ;

        }   

        // BUSCAMOS UN DNI 
        System.out.println("************ Prueba para buscar un alumno por DNI *************");
        System.out.println("Buscado : " + movimientos.buscarAlumnoPorDni(39396258));
        
 
    }
    
}
