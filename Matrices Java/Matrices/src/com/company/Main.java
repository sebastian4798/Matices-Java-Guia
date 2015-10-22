package com.company;


import javax.swing.*;

public class Main {
    public static void main (String  args []){
        double calificaciones [][]= new double[5][10]; ///Se declara en (filas)[columnas]
        llenarSalones(calificaciones);
        imprimirCalificaciones(calificaciones);
    }

    public static void llenarSalones(double calificaciones[][]){
        for(int filas=0;filas<calificaciones.length;filas++){
            for(int columnas=0;columnas<calificaciones[filas].length;columnas++){
                calificaciones[filas][columnas]=Math.round((Math.random()*5)+5);

            }
        }
    }
    public static void imprimirCalificaciones(double calificaciones[][]){
        String x ="";
        for(int filas=0;filas<calificaciones.length;filas++){
            double promedio=0;

            for(int columnas=0;columnas<calificaciones[filas].length;columnas++){
                x += calificaciones[filas][columnas]+ "   ";

                promedio+=calificaciones[filas][columnas];

            }
            x += "Salon "+filas+" ="+" "+ " Promedio: "+" "+(promedio/calificaciones[filas].length)+"    ";
            x += "\n";
        }
        JOptionPane.showMessageDialog(null, "La matriz es: \n" + x);

    }
}


