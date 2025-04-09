package br.org;

import java.util.Arrays;

public class Contato {
    private String nome;
    private Telefone[] telefones;
    Telefone selfone;

    public Contato(String nome, Telefone[] telefones) {
        super();
        this.nome = nome;
        this.telefones = telefones;
    }


    @Override
    public String toString() {
        return "Contato Nome: " + nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

     public void imprimirTelefones() {
        for (Telefone telefone : telefones) {
            System.out.println("Telefone:" + telefone);
        }
    }

    public void adicionarTelefone(Telefone telefone){
        for (int i = 0; i < telefones.length; i++) {
            if (telefones[i] == null) {
                telefones[i] = telefone;
                break;
            } 

            }
            
        }

    
    
}
