/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab04ia;
import com.mycompany.lab04ia.StreamsDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Génesis Cortez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StreamsDemo streamsDemo = new StreamsDemo();
        long TInicioS, TFinS, tiempoS, TInicioP, TFinP, tiempoP;
        TInicioS = System.currentTimeMillis();
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese n");
        String num = read.nextLine();
        var listadoPrimos = streamsDemo.createRandomList(Integer.valueOf(num)).parallelStream()
            .filter(n -> streamsDemo.isPrimeNumber(n))
            .sorted()
            .collect(Collectors.toList());
        
        var listadoFibonacci = listadoPrimos.stream()
                .map(j -> streamsDemo.NFibonacci(j))
                .collect(Collectors.toList());
        
        System.out.println(listadoFibonacci);
        TFinS = System.currentTimeMillis();
        tiempoS = TFinS -TInicioS;
        System.out.println("Tiempo de ejecución en Serial: "+ tiempoS);
        TInicioP = System.currentTimeMillis();
           var listadoFibonacciParalelo = listadoPrimos.parallelStream()
                .map(j -> streamsDemo.NFibonacci(j))
                .collect(Collectors.toList());
        
        System.out.println(listadoFibonacciParalelo);
        TFinP = System.currentTimeMillis();
        tiempoP = TFinP - TInicioP;
        System.out.println("Tiempo de ejecución en Paralelo: "+ tiempoP);
        
    
    }
}
