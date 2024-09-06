public class App {
    public static void main(String[] args) throws Exception {
        String bookName = "スッキリわかるJava入門第4版";
        int bookPrice = 2911;
        String bookColor = "";
        String bookIsbn = "4295017930";

        String computerName = "Macbook Air";
        int computerPrice = 289000;
        String computerColor = "スペースグレー";
        String computerMakerName = "Apple";

        Book b = new Book(bookName, bookPrice, bookColor, bookIsbn);
        b.setWeight(0.5);

        Computer c = new Computer(computerName, computerPrice, computerColor, computerMakerName);
        c. setWeight(1.8);

        System.out.println("書籍名: " + b.getName() 
        + " 価格: " + b.getPrice() + "円 " 
        + " ISBN: " + b.getIsbn() 
        + " 重量: " + b.getWeight() + "Kg");
        System.out.println("コンピューター名: " + c.getName()
        + " 価格: " + c.getPrice() + "円 " 
        + " 色: " + c.getColor() 
        + " 重量: " + c.getWeight() + "Kg"
        );
    }
}
