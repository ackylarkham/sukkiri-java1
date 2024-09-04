public class EmailOverload {
    public static void main(String[] args) throws Exception {
        String title = "お食事会のお知らせ";
        String address = "hogehoge@example.com";
        String text = "標記の件につきまして以下のとおり行いますのでご参加ください。";
        makeEmail(title, address, text);
        makeEmail(address, text);
    }

    public static void makeEmail(String subject, String emailAddr, String body) {
        System.out.println(emailAddr + "に以下のメールを送信しました。");
        System.out.println("件名: " + subject);
        System.out.println("本文: " + body);
        return;
    }

    public static void makeEmail(String emailAddr, String body) {
        System.out.println(emailAddr + "に以下のメールを送信しました。");
        System.out.println("件名: 無題");
        System.out.println("本文: " + body);
        return;
    }
}