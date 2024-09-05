public class Hero {
    String name;
    int hp;
    Sword sword;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    public void attack() {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
        System.err.println("敵に" + this.sword.damage + "ポイントのダメージを与えた！");
    }
}
