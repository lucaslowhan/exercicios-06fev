package edu.lucaslowhandev.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        while (true) {
            System.out.println("-- GERENCIADOR DE TAREFAS --");
            System.out.println("--(1) - ADICIONAR TAREFAS --");
            System.out.println("--(2) - REMOVER TAREFAS   --");
            System.out.println("--(3) - LISTAR TAREFAS    --");
            System.out.println("--(0) - SAIR              --");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite a tarefa:");
                    String tarefa = sc.next();
                    tarefas.add(tarefa);
                    break;
                case 2:
                    System.out.println("Digite o numero da tarefa a remover:");
                    int numeroTarefa = sc.nextInt();
                    tarefas.remove(numeroTarefa-1);
                    break;
                case 3:
                    System.out.println("-- LISTA DE TAREFAS --");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("TAREFA " + (i+1) + ": " + tarefas.get(i));
                    }
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    return;
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }


        }
    }
}
