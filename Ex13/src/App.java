public class App {
    public static void main(String[] args) throws Exception {
        String wizardName = "ジニー";
        int hp = 100;
        int mp = 100;
        String wandName = "青い杖";
        double wandPower = 1.5;

        Wizard w = new Wizard(hp, mp, wizardName, wandName, wandPower);

        System.out.println("魔法使い: " + w.getName());
        System.out.println("HP: " + w.getHp());
        System.out.println("MP: " + w.getMp());
        System.out.println("杖: " + w.getWand().getName());
        System.out.println("杖の魔力: " + w.getWand().getPower());
    }
}
