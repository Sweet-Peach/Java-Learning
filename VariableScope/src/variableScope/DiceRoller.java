package variableScope;

import java.util.Random;

public class DiceRoller {

     Random random; //random e number são variáveis globais
    int number;

    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6)+1; //number é uma variável local
        System.out.println(number);
    }
}
