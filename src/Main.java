import App.NameGenerator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        launchApplication();
//        int x = 0;
//        NameGenerator nam = new NameGenerator();
//        while (x<10){
//            ++x;
//            System.out.println(nam.generateName().toString());
//        }
    }
    private static void launchApplication(){
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.println("Input the number of names to generate. \nBe aware some names may not be pronounceable");
            int count = Integer.parseInt(br.readLine());
            int x = 0;
            while (x < count){
                ++x;
                NameGenerator nam = new NameGenerator();
                System.out.println(nam.generateName().toString());
            }
        }
        catch (Exception e){
            System.out.println("Input a number, application ending.");
        }
    }
}
