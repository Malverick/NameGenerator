package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LengthSelector {


    public int length() {
        int longth = new Random().nextInt(12);
        if (longth < 2 || longth == 0) {
            length();
        }
        return longth;
    }

    public List<String> obtainVowels(int length) {
        ArrayList vowels = new ArrayList();
        VowelsSelector v = new VowelsSelector();
        if (length < 3) {
            vowels.add(v.vowels());
            vowels.add(1);
        }
        else if (length >= 3 && length < 6) {
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(2);
        }
        else if (length >= 6 && length < 9) {
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(3);
        }
        else if (length >= 9 && length < 12) {
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(4);
        }
        else if (length == 12) {
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(5);
        }
        return vowels;
    }
}
