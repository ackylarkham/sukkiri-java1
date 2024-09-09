public class App {
    public static void main(String[] args) throws Exception {

        BankAccount a1 = new BankAccount("1234", 1000);
        BankAccount a2 = new BankAccount("7654321", 3000);
        BankAccount a3 = a1;
        BankAccount a4 = new BankAccount("  1234", 1000);
        BankAccount a5 = new BankAccount("1234  ", 1000);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        if (a4.equals(a5)) {
            System.out.println("同じ口座");
        } else {
            System.out.println("違う口座");
        }
    }
}
