public class App2 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("三");
        } catch (Exception e) {
            System.out.println("例外が発生しました");
            e.printStackTrace();
        }
        
    }
}
