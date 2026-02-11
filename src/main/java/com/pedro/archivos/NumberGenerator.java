package com.pedro.archivos;

import java.io.FileWriter; // para escribir en el archivo
import java.io.PrintWriter; // igual
import java.io.FileReader; // esto lee el archivo
import java.io.BufferedReader; 
import java.util.Random; // para generar numeros

public class NumberGenerator {


    public void generateFile(String filename, int cantidad) throws Exception {
        FileWriter fw = new FileWriter(filename);
        PrintWriter writer = new PrintWriter(fw);
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(10000);
            writer.println(numero);
        }
        writer.close();
    }
    public Integer[] readFile(String filename, int cantidad) throws Exception { //esto lee el archivo :D
        Integer[] datos = new Integer[cantidad];
        FileReader fr = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fr);
        String linea;
        int i = 0;
        while ((linea = reader.readLine()) != null && i < cantidad) {
            datos[i] = Integer.parseInt(linea);
            i++;
        }
        reader.close();
        return datos;
    }
}
