package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nI don't know what to say \nBut i know that i love you");
            writer.append("\n(A poem by Igor)");
            writer.close(); //garanta que você feche o objeto quando terminar
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}