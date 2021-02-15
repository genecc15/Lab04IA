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
        StreamsDemo Intento = new StreamsDemo();
        /*var randomNumbers = Intento.createRandomList(10);
        System.out.println(randomNumbers);
        Intento.sortLambdaList(randomNumbers);
        System.out.println(randomNumbers);*/
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese n");
        String num = read.nextLine();
//        var listadoPrimos = Intento.createRandomList(Integer.valueOf(num)).parallelStream()
//            .filter(n -> Intento.isPrimeNumber(n))
//            .sorted()
//            .peek(System.out::println)
//            .collect(Collectors.toList());
//        
//        System.out.println("Calculo Finalizado");
//        
//        System.out.println("Primer primo " + listadoPrimos.get(0));
            
        System.out.println(Intento.NPrimo(Integer.valueOf(num)));

 
        //System.out.println(Fibonacci.get(5));
    }
}
