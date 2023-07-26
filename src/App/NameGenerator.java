package App;

import java.util.Collections;
import java.util.List;

public class NameGenerator {
    public StringBuilder generateName() {
        LengthSelector len = new LengthSelector();
        int length = len.length();
        List<String> vowelValues = len.obtainVowels(length);
//        int lastIndex = Integer.valueOf(vowelValues.size() - 1);
//        vowelValues.remove(lastIndex);
        CharSelector chars = new CharSelector();
        List<String> charValues = chars.character(length, vowelValues.size());

        int vArrayLastIndex = 1;
        while (vArrayLastIndex > 0) {
            vArrayLastIndex = (vowelValues.size() - 1);
            charValues.add(vowelValues.get(vArrayLastIndex));
            vowelValues.remove(vArrayLastIndex);
        }

        Collections.shuffle(charValues);
        StringBuilder name = new StringBuilder();

        while (charValues.size() != 0) {
            name.append(charValues.get(((charValues.size() - 1))));
            charValues.remove((charValues.size() - 1));
        }
        name.toString();
        return name;
    }
}
