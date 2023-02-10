package com.OpeBootcamp;

import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto del producto: " );
        double precioProducto = scanner.nextDouble();
        System.out.println("Ingrese el monto IVA: " );
        double montoIva = scanner.nextDouble();
        double precioConIva=obtenerIva(precioProducto,montoIva);
        System.out.println("El precio del producto es de USD: " + precioConIva);
    }
    static double obtenerIva(double precio, double iva){
        return precio+((iva*precio)/100);
    }
}
