package br.org;

public class TesteContato {
    public static void main(String[] args) {
        Telefone tel1 = new Telefone("22341250");
        Telefone tel2 = new Telefone("22371350");

        Contato c1 = new Contato("Roberta", new Telefone[2]);

        Estado e1 = new Estado("Rio de Janeiro"," RJ");
        Cidade cid1 = new Cidade("Petrópolis", e1);
        Endereco end1 = new Endereco("Rua do Imperador 100", "Centro", "25.610-450", cid1);

        c1.adicionarTelefone(tel1);
        c1.adicionarTelefone(tel2);

        System.out.println(c1);
        c1.imprimirTelefones();
        System.out.println(end1);

        
    }

}
