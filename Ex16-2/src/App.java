import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Hero> heros = new ArrayList<Hero>();

        Hero h1 = new Hero("アンパンマン");
        Hero h2 = new Hero("カレーパンマン");

        heros.add(h1);
        heros.add(h2);

        for (Hero h : heros) {
            System.out.println("ヒーローの名前: " + h.getName());
        }
    }
}
