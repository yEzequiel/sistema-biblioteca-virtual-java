package com.mycompany.sistemadebiblioteca;

import java.util.Scanner;

public class Main {

    private static Object usuario;

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        biblioteca.adicionarLivro(new Livro("4Effective Java 2001" , "Joshua Bloch"));
        biblioteca.adicionarLivro(new Livro("Head First Java 2003" , "Kathy Sierra e Bert Bates"));
        biblioteca.adicionarLivro(new Livro("Java: The Complete Reference 1997" , "Herbert Schildt"));
        biblioteca.adicionarUsuario(new Usuario("Mazzy Menezes"));
        biblioteca.adicionarUsuario(new Usuario("Kaique Menezes"));

        while (true) {
            System.out.println("1 - ALugar Livro");
            System.out.println("2 - Devolver Livro");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do usuario: ");
                String nomeUsuario = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null) {
                    System.out.println("Digite o titulo do livro: ");
                    String tituloLivro = scanner.nextLine();
                    Livro livro = biblioteca.buscarLivro(tituloLivro);

                    if (livro != null) {
                        usuario.alugarLivro(livro);

                    } else {
                        System.out.println("Esse Livro não está disponivel");
                    }

                } else {
                    System.out.println("Usuario não encontrado");
                }
            } else if (opcao == 2) {
                System.out.println("Digite o nome do usuário: ");
                String nomeUsuario = scanner.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null) {
                    usuario.devolverLivro();
                } else {
                    System.out. println("Usuario não encontrado.");
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do Sistema... \nObrigado por usar nossa a Biblioteca Virtual, Até a próxima.");
                break;
            } else {
                System.out.println("Opção Inválida.");
            }

        }
        scanner.close();
    }
}
