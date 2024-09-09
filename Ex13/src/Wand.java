public class Wand {
    private String name;
    private double power;

    public Wand(String name, double power) {
        this.setName(name);
        this.setPower(power);
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        if (0.5 <= power && power <= 100) {
            //OK
        } else {
            throw new IllegalArgumentException("杖の魔力は0.5以上、100以下でなくてはならない");
        }
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("魔法の杖の名前が設定されていない");
        } else {
            if (name.length() >= 3) {
                //OK
            } else {
                throw new IllegalArgumentException("杖の名前は3文字以上でなくてはならない");
            }    
        }
        this.name = name;
    }
}
