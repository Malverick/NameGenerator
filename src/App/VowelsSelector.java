package App;

import java.util.Random;

public class VowelsSelector {

    public String vowels() {
        try {
            int rand = new Random().nextInt(5);
            String[] vowelArray = {"a", "e", "i", "o", "u", "y"};
            return vowelArray[rand];
        } catch (Exception e){
            return "vowel selection failed";
        }

    }
}