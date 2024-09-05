public class App {
    public static void main(String[] args) throws Exception {
        Cleric c = new Cleric();
        c.name = "パウロ";        
        System.out.println("聖職者" + c.name + "誕生");

        System.out.println("現在のHP " + c.hp);
        System.out.println("現在のMP " + c.mp);

        c.hp -= 5;

        System.out.println("現在のHP " + c.hp);

        c.mp -= 3;

        System.out.println("現在のMP " + c.mp);

        c.selfAid();

        System.out.println("現在のHP " + c.hp);

        int time = 3;
        c.mp = c.pray(time);

        System.out.println("現在のMP " + c.mp);
    }
}
