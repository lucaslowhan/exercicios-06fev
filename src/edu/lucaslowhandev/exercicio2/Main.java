package edu.lucaslowhandev.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "º numero:");
            int num = sc.nextInt();
            numeros.add(num);
        }
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0){
                numerosPares.add(numeros.get(i));
            }
        }
        System.out.println("Lista original: " + numeros);
        System.out.println("Numeros Pares: " + numerosPares);
    }
}
