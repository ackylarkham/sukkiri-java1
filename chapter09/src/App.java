public class App {
    public static void main(String[] args) throws Exception {

        Sword s1 = new Sword("ピストル");
    
        Hero h1 = new Hero("イーサン・ハント");
        h1.sword =s1;

        Sword s2 = new Sword("アンパンチ");

        Hero h2 = new Hero("アンパンマン");
        h2.hp = 200;
        h2.sword =s2;

        Wizard w = new Wizard("ジニー");

        System.out.println(h1.name + "の現在の武器は" + h1.sword.name + "。HPは" + h1.hp);
        System.out.println(h2.name + "の現在の武器は" + h2.sword.name + "。HPは" + h2.hp);

        h1.attack();

        w.heal(h1);
        System.out.println(h1.name + "のHP: " + h1.hp);
        w.heal(h2);
        System.out.println(h2.name + "のHP: " + h2.hp);
        w.heal(h2);
        System.out.println(h2.name + "のHP: " + h2.hp);
    }
}
