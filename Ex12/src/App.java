public class App {
    public static void main(String[] args) throws Exception {
        X obj = new A();

        obj.a();

        Y y1 = new A();
        Y y2 = new B();

        y1.a();
        y2.a();

        Y[] ys = new Y[2];
        
        ys[0] = new A();
        ys[1] = new B();

        for (Y y3: ys) {
            y3.b();
        }
    }
}
