/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_teorico_ordinario_3;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EXAMEN_TEORICO_ORDINARIO_3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();
        
        if (numeroEstudiantes <= 0) {
            System.out.println("El numero de estudiantes debe ser mayor a 0");
            return;
        }
        
        double[] calificaciones = new double[numeroEstudiantes];
        
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.print("Ingrese la calificacion del estudiante " + (i + 1) + ": ");
            double calificacion = scanner.nextDouble();
            
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificacion debe estar entre 0 y 100.");
                i--; 
            } else {
                calificaciones[i] = calificacion;
            }
        }
        
        double promedio = calcularPromedio(calificaciones);
        int mayoresOIguales = contarCalificacionesMayores(calificaciones, promedio);
        double maxima = obtenerCalificacionMasAlta(calificaciones);
        double minima = obtenerCalificacionMasBaja(calificaciones);

        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Numero de calificaciones mayores o iguales al promedio: " + mayoresOIguales);
        System.out.println("Calificacion mas alta: " + maxima);
        System.out.println("Calificacion mas baja: " + minima);
        System.out.println("");

        scanner.close();
    }
    
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
    
    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }
    
    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double maxima = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > maxima) {
                maxima = calificacion;
            }
        }
        return maxima;
    }
    
    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double minima = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < minima) {
                minima = calificacion;
            }
        }
        return minima;
    }
}

