package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharSelector {

    public List<String> character(int l, int vn) {
        List<String> charList = new ArrayList<>();
        int rand;
        int length = l;
        int arrayLength = 0;
        while (arrayLength <= (length - vn)) {
            rand = new Random().nextInt(25);
            charList.add(String.valueOf((char) (new Random().nextInt(26) + 'a')));
            arrayLength++;
        }
        return charList;
    }
}
