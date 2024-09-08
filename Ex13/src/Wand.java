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
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            //OK
        } else {
            throw new IllegalArgumentException("杖の名前は3文字以上でなくてはならない");
        }
        this.name = name;
    }
}
