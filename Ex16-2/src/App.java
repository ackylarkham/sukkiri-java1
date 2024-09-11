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
        
        //練習16-3
        Map<Hero,Integer> killEnemy = new HashMap<Hero,Integer>();

        killEnemy.put(h1,3);
        killEnemy.put(h2,7);

        for (Hero key : killEnemy.keySet()) {
            int v = killEnemy.get(key);
            System.out.println(key.getName() + "が倒した敵 = " + v);
        }

    }
}
