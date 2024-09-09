public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i);
            sb.append(",");
        }
        System.out.println(sb.toString());
        String a[] = sb.toString().split(",");
        sb.setLength(0);
        for (int i = 0; i < 100; i++) {
            sb.append(a[i]);
            sb.append(" ");
        }
        System.out.print(sb.toString());        
    }
}
