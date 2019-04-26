import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String info;
            info = scanner.nextLine();
            if(scanner.equals("exit")){
                return;
            }
            Player player = new Player(info);
        }
    }
}
