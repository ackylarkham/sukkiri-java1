public class Wizard {
    private int hp;
    private int mp;
    private String name;
    Wand wand;

    public Wizard(int hp, int mp, String name) {
        this.hp = setHp(hp);
        this.mp = setMp(mp);
        this.name = setName(name);
    }

    public void heal(Hero h) {
        int basePoint = 10; 
        int recovPoint = (int)(basePoint + this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
