package com.pedro.archivos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        NumberGenerator generator = new NumberGenerator();
        SortImplementation sorter = new SortImplementation();

        System.out.println("ingrese cantidad de numeros");
        int n = teclado.nextInt();
        if (n > 3000) {
            System.out.println("no puede ser mayor a 3000");
            return;
        }
        String archivo = "numeros.txt";
        generator.generateFile(archivo, n);
        Integer[] datos = generator.readFile(archivo, n);
        System.out.println("Seleccione que quiere:");
        System.out.println("1-gnome");
        System.out.println("2-quick");
        System.out.println("3-merge");
        System.out.println("4-radix");
        int opcion = teclado.nextInt();
        long inicio = System.nanoTime();
        if (opcion == 1) {
            System.out.println("ejecutando");
            sorter.sort(datos);
        }
        else if (opcion == 2) {
            System.out.println("ejecutando");
            sorter.sort(datos);
        }
        else if (opcion == 3) {
            System.out.println("ejecutando");
            sorter.sort(datos);
        }
        else if (opcion == 4) {
            System.out.println("ejecutando");
            sorter.sort(datos);
        }
        else {
            System.out.println("opcion no valida");
            return;
        }
        long fin = System.nanoTime();
        long tiempo = fin - inicio;
        System.out.println("tiempo: " + tiempo);
        teclado.close();
    }
}
