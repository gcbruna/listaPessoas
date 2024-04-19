package br.com.desafio.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibeFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    @Override
    public String toString() {
        return "Nome: " +this.getNome() + ". Idade:" + " (" +this.getIdade() + ")";
    }

}
