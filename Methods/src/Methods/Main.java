package Methods;

public class Main {

    public static void main(String[] args) {

        // method = é um  bloco de códigos que é executado sempre que ele é invocado

        String nome = "Igor";
        int idade = 21;

        ola(nome, idade);

    }

    // um method sempre tem a primeira letra do method em minuscula
    static void ola(String nome, int idade) { // criação do método de invocação (void)
        System.out.println("Olá "+nome);      // que irá mostrar na tela um "olá"
        System.out.println("Você tem "+idade+ " anos");
    }
}