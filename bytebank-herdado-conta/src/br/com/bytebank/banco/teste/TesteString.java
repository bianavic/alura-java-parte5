package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {

        // String é uma classe, o tipo,
        // nome é uma referencia, criando um objeto.

        String nome = "Alura"; // OBJECT LITERAL = uma String nao pode ser alterado
        // imutabilidade. Uma x criado nao consegue alterar mais.
        // a nao ser que vc crie uma NOVA String

        // unico momento que nao precisa usar new para criar objeto
        // String outro = new String("Alura");

        // forma de alterar a String é criando outra
        // String outra = nome.replace("A", "a");

        String outra = nome.toLowerCase();

        // nome.toLowerCase();trings na memoria
        System.out.println(nome);
        System.out.println(outra);

    }
}
