import App.NameGenerator;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        NameGenerator nam = new NameGenerator();
        while (x<10){
            ++x;
            System.out.println(nam.generateName().toString());
        }
    }
}
