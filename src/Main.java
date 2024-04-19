import br.com.desafio.Pessoa.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Paula");
        pessoa1.setIdade(28);
        pessoa1.exibeFicha();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Adriana");
        pessoa2.setIdade(63);
        pessoa2.exibeFicha();

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Roberto");
        pessoa3.setIdade(11);
        pessoa3.exibeFicha();

        ArrayList<Pessoa> fichaDePessoas = new ArrayList<>();
        fichaDePessoas.add(pessoa1);
        fichaDePessoas.add(pessoa2);
        fichaDePessoas.add(pessoa3);

        System.out.println("Primeiro nome: " + fichaDePessoas.get(0));
        System.out.println("Tamanho da Lista: " + fichaDePessoas.size());
        System.out.println(fichaDePessoas);
    }
}