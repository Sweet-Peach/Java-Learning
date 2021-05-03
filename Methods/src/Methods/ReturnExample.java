package Methods;

public class ReturnExample {

    static void main(String[] args) {

        int x = 3;
        int y = 4;

        int z = add(x,y); // armazenei o return do method add em uma variavel chamada z

        System.out.println(z);

    }

    static int add(int x, int y) {// quando se tem certeza do tipo de dado que você vai retornar, você deixa explicito no method

        //int z = x + y;
        //return z;
        return x + y;
    }
}