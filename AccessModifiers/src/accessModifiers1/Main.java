package accessModifiers1;
import accessModifiers2.*;

public class Main {

    protected String protectedMessage = "This is protected";

    public static void main(String[] args) {

        C c = new C(); // se a classe C não for public, você não poderá ter acesso a ela
        System.out.println(c.publicMessage);

        B b = new B();

    }
}
