/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción       
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opc;

        System.out.println(" Estudiante Distancia       [1]");
        System.out.println(" Estudiante Presencial      [2]");
        opc = entrada.nextInt();

        System.out.println("Ingrese nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();

        if (opc == 1) {
            System.out.print(" Ingrese número de asignaturas: ");
            int asignaturas = entrada.nextInt();
            System.out.print(" Ingrese costo asignatura: ");
            double costoAsignatura = entrada.nextDouble();

            EstudianteDistancia estudiantes = new EstudianteDistancia();
            estudiantes.establecerNombresEstudiante(nombres);
            estudiantes.establecerApellidoEstudiante(apellidos);
            estudiantes.establecerEdadEstudiante(edad);
            estudiantes.establecerIdentificacionEstudiante(identificacion);
            estudiantes.establecerNumeroAsginaturas(asignaturas);
            estudiantes.establecerCostoAsignatura(costoAsignatura);
            estudiantes.calcularMatriculaDistancia();
        } else {
            if (opc == 2) {
                System.out.print(" Ingrese número de creditos: ");
                int creditos = entrada.nextInt();
                System.out.print(" Ingrese costo creditos: ");
                double costoCreditos = entrada.nextDouble();
                
                EstudiantePresencial estudiante = new EstudiantePresencial ();
                estudiante.establecerNombresEstudiante(nombres);
                estudiante.establecerApellidoEstudiante(apellidos);
                estudiante.establecerEdadEstudiante(edad);
                estudiante.establecerIdentificacionEstudiante(identificacion);
                estudiante.establecerNumeroCreditos(creditos);
                estudiante.establecerCostoCredito(costoCreditos);
                estudiante.calcularMatriculaPresencial();
            } else {
                System.out.println(" Solo opcion [1] [2]");
            }
        }

        /*
        System.out.println("Ingrese número de asignaturas");
        int asignaturas = entrada.nextInt();
        System.out.println("Ingrese costo asignatura");
        double costoAsignatura = entrada.nextDouble();
        EstudianteDistancia estudiante = new EstudianteDistancia();
        
        
        estudiante.establecerNumeroAsginaturas(asignaturas);
        estudiante.establecerCostoAsignatura(costoAsignatura);
        estudiante.calcularMatriculaDistancia();
        
        System.out.printf("%s\n", estudiante);*/
    }
}
