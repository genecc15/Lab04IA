/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab04ia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.math.BigInteger;

/**
 *
 * @author Génesis Cortez
 */
public class StreamsDemo {
    //Datos
    public List<Integer> createRandomList(int qty){
    var random = new Random();
    List<Integer> numbers = new LinkedList<>();
    
    for (int i=0; i<qty; i++){
       numbers.add(random.nextInt(100));
    }
    return numbers;
} 
    public List<Integer> sortLambdaList(List<Integer> unsortedList){
    Collections.sort(unsortedList, (o1, o2) -> o2.compareTo(o1));
    return unsortedList;
    }
    
    public boolean isPrimeNumber(int n){
        if(n <= 1)
            return false;
        
        var contador = 0;
        
        for (int i = n - 1; i>1; i--){
            if(n%i == 0)
                contador++;
        }
        return contador <= 0;
    }
    
    public Integer NPrimo(int n){
        var cont = 0;
        var numero = 1;
        while (cont < n)
        {
            if(isPrimeNumber(numero)){
                cont++;
                numero++;
            }
            else
            {
                numero++;
            }
        }
        return numero-1; //Ya me dio sueñito
    }
        public List <Integer> CreateFibonacci(int n){
         List<Integer> Fibonacci = new ArrayList();
         int serie = 10, num1 = 0, num2 = 1, suma = 1;
        
        for (int i = 1; i < serie; i++) {
            Fibonacci.add(suma);
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
        }
        return Fibonacci;
        }
        
        public BigInteger NFibonacci(int n){
         int serie = n; 
         BigInteger num1 = new BigInteger("0");
         BigInteger num2 = new BigInteger("1");
         BigInteger suma = new BigInteger("1");
        for (int i = 1; i < serie; i++) {
            //primero sumamos
            suma = num1.add(num2);
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
        }
        
        return suma;
        }
        
 }
