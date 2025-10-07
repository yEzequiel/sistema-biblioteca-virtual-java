
package com.mycompany.sistemadebiblioteca;

public class Usuario {

    public String nome;
    public Livro livroAlugado;

    public Usuario(String nome) {
        this.nome = nome;
        this.livroAlugado = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroAlugado() {
        return livroAlugado;
    }

    public void setLivroAlugado(Livro livroAlugado) {
        this.livroAlugado = livroAlugado;
    }

    public void alugarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livroAlugado = livro;
            livro.setDisponivel(false);
            System.out.println(nome + " alugou o livro: " + livro.getTitulo());

        } else {
            System.out.println("O livro " + livro.getTitulo() + "não está disponível.");
        }
    }

    public void devolverLivro() {
        if (livroAlugado != null) {
            livroAlugado.setDisponivel(true);
            System.out.println(nome + " Devolveu o livro: " + livroAlugado.getTitulo());
            livroAlugado = null;
        } else {
            System.out.println(nome + " Não tem nenhum livro a ser devolvido");
        }
    }
}


