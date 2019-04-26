import java.io.FileNotFoundException;
import java.util.ArrayList;
import  java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Account {
    private ArrayList<Player> playersInfo = new ArrayList<Player>();
    File file = new File("accountFile.txt");

    public void createAccount(String username){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password;
        password = scanner.nextLine();
        if(password.equals(null)){
            System.out.println("No password was entered !!!!");
            createAccount(username);
        }
        Player player = new Player();
        player.settingPassword(player, username, password);
        playersInfo.add(player);
        command();
    }
    public void login(String username){
        System.out.println("Please enter your password:");
        Scanner scanner = new Scanner(System.in);
        String password;
        password = scanner.nextLine();
        command();
    }
    public void logout(){

    }
    public void saveGame(){

    }
    public void command(){
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        if(cmd.equals("logout")){
            logout();
        }
        if(cmd.equals("save")){
            saveGame();
        }
        if(cmd.equals("show leaderboard")){
            showLeaderboard();
        }
    }
    public void showLeaderboard(){

    }
    public void getUser(String username){
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String inpUser = scanner.nextLine();
                if(inpUser == username){
                    System.out.println("This username is used before");
                    return;
                }

            }
            createAccount(username);

        }catch (FileNotFoundException e){

        }
    }
}
