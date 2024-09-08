public class Wizard {
    private int hp;
    private int mp;
    private String wizardName;
    private Wand wand;

    public Wizard(int hp, int mp, String wizardName, String wandName, double wandPower) {
        this.setHp(hp);
        this.setMp(mp);
        this.setName(wizardName);
        this.setWand(wandName, wandPower);
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
        if (hp >= 0) {
            //OK
        } else {
            throw new IllegalArgumentException("HPはゼロ以上でなくてはならない");
        }
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return this.wizardName;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            //OK
        } else {
            throw new IllegalArgumentException("魔法使いの名前は3文字以上でなくてはならない");
        }
        this.wizardName = name;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setWand(String name, double power) {
        this.wand = new Wand(name, power);
    }
}
