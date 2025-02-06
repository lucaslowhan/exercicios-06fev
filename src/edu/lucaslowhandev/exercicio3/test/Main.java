package edu.lucaslowhandev.exercicio3.test;

import edu.lucaslowhandev.exercicio3.dominio.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-- ARMAZENAMENTO DE LIVROS --");
            System.out.println("--(1)  ADICIONAR LIVROS    --");
            System.out.println("--(2)  REMOVER LIVROS      --");
            System.out.println("--(3)  LISTAR LIVROS       --");
            System.out.println("--(0)  SAIR                --");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o titulo do livro:");
                    String tituloLivro = sc.nextLine();

                    System.out.println("Digite o Autor do livro:");
                    String autorLivro = sc.nextLine();

                    livros.add(new Livro(tituloLivro, autorLivro));
                    System.out.println("Livro adicionado.");
                    break;
                case 2:
                    System.out.println("Digite o titulo do livro que deseja remover:");
                    String tituloLivroRemover = sc.nextLine();
                    livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(tituloLivroRemover));
                    break;
                case 3:
                    System.out.println("-- LISTA DE LIVROS --");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println("Livro " + (i+1) + " " + livros.get(i));
                    }
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    return;
                default:
                    System.out.println("OPÇÃO INCORRETA");

            }
        }
    }
}
