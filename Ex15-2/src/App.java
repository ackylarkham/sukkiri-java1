public class App {
    public static void main(String[] args) throws Exception {
        String[] folderName = {"/home/user/","/home/user"};

        String fileName = "readme.txt";

        for (String name : folderName) {
            if (name.endsWith("/")) {
                //NOP
            } else {
                name += '/';
            }
            System.out.println("name: " + name + fileName);
        }
    }
}
