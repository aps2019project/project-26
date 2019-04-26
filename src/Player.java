import java.util.Scanner;

public class Player {
    private String username;
    private String password;
    private String info;
    private int drake;
    private int totalWins;

    public Player(String info) {
        this.info = info;
        String[] check = new String[3];
        check = info.split(" ");
        getInfo(check);
    }

    public Player() {

    }

    public void getInfo(String[] check) {
        if (check[0].equals("create") && check[1].equals("account")) {
            if (check.length == 3) {
                Account account = new Account();
                account.getUser(check[2]);
                return;
            } else {
                System.out.println("No username was entered");
                return;
            }
        }
        if (check[0].equals("login")) {
            if (check.length == 2) {
                Account account = new Account();
                account.login(check[1]);
                return;
            } else {
                System.out.println("No username was entered");
                return;
            }
        }
    }

    public void settingPassword(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

