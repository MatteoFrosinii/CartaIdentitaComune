import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        sportello s = new sportello();
        List<persona> codaPersone = new ArrayList<>();
        codaPersone.add(new persona("Erika",s));
        codaPersone.add(new persona("Paolo",s));
        codaPersone.add(new persona("Giorgio",s));
        codaPersone.add(new persona("Sara",s));
        codaPersone.add(new persona("Alice",s));
        codaPersone.add(new persona("Giovanna",s));

        for (persona p : codaPersone) {
            p.start();
        }
    }
}
