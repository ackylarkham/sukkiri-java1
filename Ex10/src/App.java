public class App {
    public static void main(String[] args) throws Exception {

        Hero h = new Hero("アンパンマン");
        PoisonMatango pm = new PoisonMatango('b');
        Matango m = new Matango('a');

        m.attack(h);
        System.out.println(h.name + "のHP: " + h.hp);

        pm.attack(h);
        System.out.println(h.name + "のHP: " + h.hp);
    }
}
