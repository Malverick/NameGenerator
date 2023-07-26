package App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LengthSelector {

    int length;

    public int length() {
        length = new Random().nextInt(12-1) + 1;
        return length;
//        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//        try {
//            length = Integer.parseInt(br.readLine());
//            return length;
//        }
//        catch (Exception e){
//            System.out.println("Input a number, application ending.");
//            return 2;+
//        }
    }

    public List<String> obtainVowels(int length) {
        ArrayList vowels = new ArrayList();
        VowelsSelector v = new VowelsSelector();
        //Generate random number of vowels, add array length to last entry, return array.
        // (Find some mechanism to ensure too many vowels are not added)
        if (length < 3) {
            vowels.add(v.vowels());
//            vowels.add(1);
        }
        else if (length >= 3 && length < 6) {
            vowels.add(v.vowels());
            vowels.add(v.vowels());
//            vowels.add(2);
        }
        else if (length >= 6 && length < 9) {
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
//            vowels.add(3);
        }
        else if (length >= 9 && length < 12) {
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
//            vowels.add(4);
        }
        else if (length == 12) {
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
            vowels.add(v.vowels());
//            vowels.add(5);
        }
        return vowels;
    }
}
/*
Add random number of vowels
Put entire length selector inside a for loop
take in a user generated length (And optional random lengths) to determine duration of loop

 */
