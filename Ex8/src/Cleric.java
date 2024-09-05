public class Cleric {
    String name;
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;

    public void selfAid() {
        this.mp -= 5;
        this.hp = maxHp;
    }

    public int pray(int time) {
        int point = new java.util.Random().nextInt(3);
        System.out.println("point = " + point);
        System.out.println("現在のMP " + this.mp);
        point += time;
        this.mp += point; 
        if (this.mp > maxMp) {
            this.mp = maxMp;
        }  else {
            //NOP
        }
        return(this.mp);
    }
}