public class App {
    public static void main(String[] args) throws Exception {

        String text1 = "z1@P2@3=#";
        String text2 = "A4";
        String text3 = "A56";
        String text4 = "UMSQ";
        String text5 = "k34R";

        if(text1.matches(".*")) {
            System.out.println("match!");
        } else {
            System.out.println("unmatch!");
        }

        if(text2.matches("A\\d{1,2}")) {
            System.out.println("match!");
        } else {
            System.out.println("unmatch!");
        }

        if(text3.matches("A\\d{1,2}")) {
            System.out.println("match!");
        } else {
            System.out.println("unmatch!");
        }

        if(text4.matches("U[A-Z]{3}")) {
            System.out.println("match!");
        } else {
            System.out.println("unmatch!");
        }
    }
}
