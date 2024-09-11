import java.io.IOException;

public class App3 {
    public static void main(String[] args) throws IOException{
        System.out.println("プログラム開始");
        throw new IOException("I/Oエラーが発生しました");
    }
}
