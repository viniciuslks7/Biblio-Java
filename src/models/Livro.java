package models;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" não estava emprestado.");
        }
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | Autor: " + autor + " | " + (emprestado ? "Emprestado" : "Disponível");
    }
}