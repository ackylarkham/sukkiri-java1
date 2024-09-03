public class Fortune {
    public static void main(String[] args) throws Exception {
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたのお名前を入力してください  ");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.print("あなたの年齢を入力してください  ");
        int age = new java.util.Scanner(System.in).nextInt();
        int randomValue = new java.util.Random().nextInt(4);
        randomValue ++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は " + randomValue + " です");
        System.out.println("(1: 大吉 2: 中吉 3: 小吉 4: 凶)");
    }
}
