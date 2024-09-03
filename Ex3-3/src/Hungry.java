public class Hungry {
    public static void main(String[] args) throws Exception {
        int isHungry = 1;
        String food = "しょうが焼き定食";
        System.out.println("こんにちは");
        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        }
        else {
            System.out.println("腹ぺこです");
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}
