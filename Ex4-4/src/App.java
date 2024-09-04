public class App {    
    public static void main(String[] args) throws Exception {
        int[] numbers = {3,4,9};
        System.out.print("1桁の数字を入力してください > ");
        int input = new java.util.Scanner(System.in).nextInt();
        boolean win = false;
        for (int value : numbers){
            if (value == input) {
                System.out.println("アタリ!");
                win = true;
                break;
            } else {
                //NOP
            }
        }
        if (win == false) {
            System.out.println("ハズレ！");
        }
    }
}
