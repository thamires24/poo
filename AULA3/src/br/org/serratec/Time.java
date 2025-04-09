package br.org.serratec;

public class Atleta {
    private String nome;
    private Integer idade;

    public Atleta(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "nome:" + nome + ", idade:" + idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }


    
}


----------------------------------

package br.org.serratec;

import java.util.Arrays;

public class Time {

    private String nome;
    private String tecnico;
    private Atleta[] atletas;

    public Time(String nome, String tecnico, Atleta[] atletas) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = atletas;
    }

    @Override
    public String toString() {
        return "Time [nome=" + nome + ", tecnico=" + tecnico + ", atletas=" + Arrays.toString(atletas) + "]";
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    public void adicionarAtleta(Atleta atleta) {
        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i] == null) {
                atletas[i] = atleta;
                break;
            }
        }
    }

    public void imprimirElenco(){
        for (Atleta atleta :atletas) {
            System.out.println(atleta);
        }
    }

        
}
