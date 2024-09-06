public class PoisonMatango extends Matango {
    int poisonAttack = 5;
    char suffix;
    int damage;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonAttack > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            this.damage = h.hp / 5;
            h.hp -= this.damage;
            System.out.println(this.damage + "ポイントのダメージ");
            this.poisonAttack -= 1;
        } else {
            //NOP
        }
    }
}
