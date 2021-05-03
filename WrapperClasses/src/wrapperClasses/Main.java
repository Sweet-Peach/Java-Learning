package wrapperClasses;

public class Main {

    public static void main(String[] args) {

        /* Wrapper classes = providencia um jeito de usar tipos de dados primitivos como tipos de dados referênciais
		*  e sabendo que os reference data types possuem muitos methods úteis
		   pode ser usados com uma coleção*/

        // primitives     // Wrapper
        // -------------------------
        // boolean		     Boolean
        // char  			 Character
        // int 				 Integer
        // double			 Double

        // autoboxing = a conversão automática que o compilador JAVA faz entre os tipos de dados primitivos transformando em seus correspodentes WrapperClasses
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Igor";

        // unboxing = contrario ao autoboxing, o unboxing transforma Wrapperclasses em dados primitivos

        if (a==true) {
            System.out.println("tudo ok");
        }
    }
}
