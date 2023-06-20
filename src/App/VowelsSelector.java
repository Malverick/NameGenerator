package App;

import java.util.Random;

public class VowelsSelector {

    public String vowels() {
        int rand = new Random().nextInt(5);
        switch (rand) {
            case 0:
                return "a";
            case 1:
                return "e";
            case 2:
                return "i";
            case 3:
                return "o";
            case 4:
                return "u";
            case 5:
                return "y";
            default:
                System.out.println("Vowel Error");
                break;
        }
        return "Error";
    }
}
