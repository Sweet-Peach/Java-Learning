package whileLoop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // While loop executa um bloco de comando até que o resultado volte verdadeiro

        Scanner scanner = new Scanner(System.in);

        String nome = "";

		/*while(nome.isBlank()) {
			System.out.println("Coloque seu nome: ");         //<-------Metodo com o while em cima
			nome = scanner.nextLine();
		}*/

        do {
            System.out.println("Coloque seu nome: ");         //<-------Metodo com o while em baixo
            nome = scanner.nextLine();
        }while(nome.isBlank());

        System.out.println("Olá " + nome);
    }
}
